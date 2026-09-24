package Practice3;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Design extends JPanel implements ActionListener {

    // Variable
    // 1) Screen Variable
    private final int HEIGHT = 600;
    private final int WIDTH = 400;

    // 2) Bird Variable
    // 2.1) Bird's Initial Position
    private int birdX = 100;
    private int birdY = 250;
    // 2.2) Bird's Size
    private final int birdWIDTH = 34;
    private final int birdHEIGHT = 24;
    // 2.3) Bird's Moving Speed
    private final int MOVE_SPEED = 8;
    private final int VERTICAL_SPEED = 12;

    // 3) Game Variable
    private boolean gameOver = false;
    private boolean gameStarted = false;
    private int score = 0;
    private Timer timer;

    // 4) Pipe Variable
    private ArrayList<Rectangle> pipes;
    private final int PIPE_WIDTH = 60;
    private final int PIPE_GAP = 180;
    private final int PIPE_SPEED = 3;
    private Random random;

    // Constructor
    public Design() {
        setFocusable(true);
        random = new Random();
        pipes = new ArrayList<>();

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int code = e.getKeyCode();

                if (gameOver && code == KeyEvent.VK_SPACE) {
                    resetGame();
                    return;
                }

                if (!gameOver) {
                    gameStarted = true;

                    switch (code) {
                        case KeyEvent.VK_SPACE:
                            birdX += MOVE_SPEED;
                            break;
                        case KeyEvent.VK_UP:
                            birdY -= VERTICAL_SPEED;
                            break;
                        case KeyEvent.VK_DOWN:
                            birdY += VERTICAL_SPEED;
                            break;
                        case KeyEvent.VK_RIGHT:
                            birdX += MOVE_SPEED;
                            birdY -= VERTICAL_SPEED / 2;
                            break;
                        case KeyEvent.VK_LEFT:
                            birdX += MOVE_SPEED;
                            birdY += VERTICAL_SPEED / 2;
                            break;
                    }
                }
            }
        });

        timer = new Timer(16, this);
        timer.start();
        addPipe(true);
        addPipe(true);
    }

    // Pipe Handling
    private void addPipe(boolean start) {
        int minHeight = 50;
        int maxHeight = HEIGHT - PIPE_GAP - 100; // Max height: 320
        int topHeight = minHeight + random.nextInt(maxHeight - minHeight);

        if (start) {
            int startX = WIDTH + pipes.size() * 150 + 200;
            pipes.add(new Rectangle(startX, 0, PIPE_WIDTH, topHeight));
            pipes.add(new Rectangle(startX, topHeight + PIPE_GAP, PIPE_WIDTH, HEIGHT - topHeight - PIPE_GAP));
        } else {
            int lastPipeX = pipes.get(pipes.size() - 1).x;
            pipes.add(new Rectangle(lastPipeX + 300, 0, PIPE_WIDTH, topHeight));
            pipes.add(new Rectangle(lastPipeX + 300, topHeight + PIPE_GAP, PIPE_WIDTH, HEIGHT - topHeight - PIPE_GAP));
        }
    }

    // Game Loop & Logic
    @Override
    public void actionPerformed(ActionEvent e) {
        if (gameStarted && !gameOver) {

            // Pipes Movement
            for (int i = 0; i < pipes.size(); i++) {
                Rectangle pipe = pipes.get(i);
                pipe.x -= PIPE_SPEED;
            }

            // Score Tracking & Pipe Removal
            for (int i = 0; i < pipes.size(); i += 2) {
                Rectangle topPipe = pipes.get(i);

                if (topPipe.x + PIPE_WIDTH < birdX && topPipe.x + PIPE_WIDTH >= birdX - PIPE_SPEED) {
                    score++;
                }

                if (topPipe.x + PIPE_WIDTH < 0) {
                    pipes.remove(i);   // Top pipe
                    pipes.remove(i);   // Bottom pipe
                    addPipe(false);
                }
            }

            // Bird's Collision Check
            Rectangle birdBounds = new Rectangle(birdX, birdY, birdWIDTH, birdHEIGHT);

            // 3.1) Pipe Collision
            for (int i = 0; i < pipes.size(); i++) {
                Rectangle pipe = pipes.get(i);
                if (pipe.intersects(birdBounds)) {
                    gameOver = true;
                    break;
                }
            }

            // 3.2) Screen Collision
            /*
             1) If bird touches ground
             2) If exits the sky
             3) If touches the left screen
             4) If touches the right screen
             */
            if (birdY > HEIGHT - 70 || birdY < 0 || birdX < 0 || birdX > WIDTH - birdWIDTH) {
                gameOver = true;
            }
        }

        repaint();
    }

    // Reset Game
    private void resetGame() {
        birdX = 100;
        birdY = 250;
        score = 0;
        gameOver = false;
        gameStarted = false;
        pipes.clear();
        addPipe(true);
        addPipe(true);
    }

    // Design & Rendering
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // 1) Sky Background
        g.setColor(new Color(173, 216, 230));
        g.fillRect(0, 0, WIDTH, HEIGHT);

        // 2) Ground
        g.setColor(new Color(222, 184, 135));
        g.fillRect(0, HEIGHT - 50, WIDTH, 50);

        // 3) Pipes
        g.setColor(new Color(46, 139, 87));
        for (Rectangle pipe : pipes) {
            g.fillRect(pipe.x, pipe.y, pipe.width, pipe.height);
            g.setColor(Color.DARK_GRAY);
            g.drawRect(pipe.x, pipe.y, pipe.width, pipe.height);
            g.setColor(new Color(46, 139, 87));
        }

        // 4) Bird
        // 4.1) Bird's Body
        g.setColor(Color.YELLOW);
        g.fillOval(birdX, birdY, birdWIDTH, birdHEIGHT);

        // 4.2) Bird's Eye
        g.setColor(Color.BLACK);
        g.fillOval(birdX + birdWIDTH - 12, birdY + 5, 5, 5);

        // 4.3) Bird's Thot (Beak)
        g.setColor(Color.BLUE);
        g.fillOval(birdX + birdWIDTH - 6, birdY + 7, 9, 9);

        // 5) UI Text & Information
        g.setFont(new Font("Arial", Font.BOLD, 16));

        if (!gameStarted) {
            g.setColor(Color.WHITE);
            g.drawString("SPACE: Jump | Arrows: Control Direction", 20, HEIGHT / 2);
        }

        if (gameOver) {
            g.setColor(new Color(220, 20, 60));
            g.setFont(new Font("Arial", Font.BOLD, 22));
            g.drawString("GAME OVER", WIDTH / 2 - 65, HEIGHT / 2 - 20);
            g.setFont(new Font("Arial", Font.BOLD, 16));
            g.setColor(Color.WHITE);
            g.drawString("Press SPACE to Restart", WIDTH / 2 - 90, HEIGHT / 2 + 20);
        }

        // Score Display
        g.setColor(Color.DARK_GRAY);
        g.setFont(new Font("Arial", Font.BOLD, 18));
        g.drawString("Score: " + score, 20, 40);
    }
}
