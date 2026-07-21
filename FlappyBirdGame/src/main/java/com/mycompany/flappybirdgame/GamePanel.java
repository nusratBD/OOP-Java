package com.mycompany.flappybirdgame;

import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener {

    //screen height & width
    private final int WIDTH = 400;
    private final int HEIGHT = 600;

    private Timer timer;
    private boolean gameOver = false;
    private boolean gameStarted = false;
    private int score = 0;

    // Bird Position Coordinates
    private int birdX = 100;
    private int birdY = 250;
    //Bird Size
    private final int BIRD_WIDTH = 34;
    private final int BIRD_HEIGHT = 24;

    // Bird speed
    private final int MOVE_SPEED = 8;//x axis speed
    private final int VERTICAL_SPEED = 12; // Up/Down(y axis) er speed barano holo (Ager ta 8 chhilo)

    private ArrayList<Rectangle> pipes;
    private final int PIPE_WIDTH = 60;
    private final int PIPE_GAP = 180;//up & down pipe 
    private final int PIPE_SPEED = 3;
    private Random random;

    public GamePanel() {
        /*JPanel template. JPanel jeno input nite pare*/
        setFocusable(true);
        random = new Random();
        pipes = new ArrayList<>();

        // Multi-Directional Keyboard Input
        /*Built in method of JPanel to listen 
        Keyboard action. Component class er method.*/
        addKeyListener(new KeyAdapter() {
            /*KeyAdapter()->Abstratct Class where there are
            several concrete methods to catch keyboard input */
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
                            // Soja X-axis borabor shamne jabe
                            birdX += MOVE_SPEED;
                            break;
                        case KeyEvent.VK_UP:
                            // Onek druto upore uthbe
                            birdY -= VERTICAL_SPEED;
                            break;
                        case KeyEvent.VK_DOWN:
                            // Onek druto niche nambe
                            birdY += VERTICAL_SPEED;
                            break;
                        case KeyEvent.VK_RIGHT:
                            // Diagonally Up-Right
                            birdX += MOVE_SPEED;
                            birdY -= MOVE_SPEED / 2;
                            break;
                        case KeyEvent.VK_LEFT:
                            // Diagonally Down-Right / Backward escape
                            birdX -= MOVE_SPEED;
                            birdY += MOVE_SPEED / 2;
                            break;
                    }
                }
            }
        });

        timer = new Timer(16, this);
        timer.start();
        /*to mention 2 pair of pipe at a time on the screen*/
        addPipe(true);//
        addPipe(true);
    }

    private void addPipe(boolean start) {
        int minHeight = 50;
        int maxHeight = HEIGHT - PIPE_GAP - 100;//Max: 320
        //Initial Top Pipe Height(Random height)
        int topPipeHeight = minHeight + random.nextInt(maxHeight - minHeight);

        if (start) {
            //Initial postion of Pipe(Out of the screen)
            //Initial size=0
            int startX = WIDTH + pipes.size() * 150 + 200;
            //pipe: x-axis, y-axis, width, height(Upper Pipe)
            pipes.add(new Rectangle(startX, 0, PIPE_WIDTH, topPipeHeight));
            //Lower Pipe
            pipes.add(new Rectangle(startX, topPipeHeight + PIPE_GAP, PIPE_WIDTH, HEIGHT - topPipeHeight - PIPE_GAP));
        } else {
            //distance of last index from the origin(x-axis)
            int lastPipeX = pipes.get(pipes.size() - 1).x;
            pipes.add(new Rectangle(lastPipeX + 300, 0, PIPE_WIDTH, topPipeHeight));
            pipes.add(new Rectangle(lastPipeX + 300, topPipeHeight + PIPE_GAP, PIPE_WIDTH, HEIGHT - topPipeHeight - PIPE_GAP));
        }
    }

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
    //Method of ActionListener interface
    @Override
    public void actionPerformed(ActionEvent e) {
        if (gameStarted && !gameOver) {

            // ১. Pipes movement
            for (int i = 0; i < pipes.size(); i++) {
                Rectangle pipe = pipes.get(i);
                pipe.x -= PIPE_SPEED; // Move pipe to the left
            }

            // ২. Score tracking & Pipe removal
            for (int i = 0; i < pipes.size(); i += 2) {
                Rectangle topPipe = pipes.get(i);

                /* if bird pass one pipe the score will be incremented
            before repaint(). And after repaint, this score 
            can't be updated again*/
                if (topPipe.x + PIPE_WIDTH < birdX && topPipe.x + PIPE_WIDTH >= birdX - PIPE_SPEED) {
                    score++;
                }

                // Remove the pipes
                if (topPipe.x + PIPE_WIDTH < 0) {
                    pipes.remove(i);//top pipe removed
                    pipes.remove(i);//bottom pipe removed
                    addPipe(false);
                }
            }

            // ৩. Collision Check
            /*Imaginary boundary of bird to track collison*/
            Rectangle birdBounds = new Rectangle(birdX, birdY, BIRD_WIDTH, BIRD_HEIGHT);

            for (int i = 0; i < pipes.size(); i++) {
                Rectangle pipe = pipes.get(i);

                if (pipe.intersects(birdBounds)) { 
                    /*if birdBounds touuched pipe*/
                    gameOver = true;
                    break; //stop the whole action of the program
                }
            }
            //Screen touch check
            /*If the bird touches the ground, exits the sky, or
            touches the left or right wall*/
            if (birdY > HEIGHT - 70 || birdY < 0 || birdX < 0 || birdX > WIDTH - BIRD_WIDTH) {
                gameOver = true;
            }
        }

        repaint();
    }
    //Method of JPanel for Design
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Background
        g.setColor(new Color(173, 216, 230));
        g.fillRect(0, 0, WIDTH, HEIGHT);

        // Ground
        g.setColor(new Color(222, 184, 135));
        g.fillRect(0, HEIGHT - 50, WIDTH, 50);

        // Draw Pipes (Modern Forest Gray/Green Borders)
        g.setColor(new Color(46, 139, 87));
        for (Rectangle pipe : pipes) {
            g.fillRect(pipe.x, pipe.y, pipe.width, pipe.height);
            g.setColor(Color.DARK_GRAY);
            g.drawRect(pipe.x, pipe.y, pipe.width, pipe.height);
            g.setColor(new Color(46, 139, 87));
        }

        // 4. Draw Parrot Shape (Green Body)
        g.setColor(Color.YELLOW); // Yellow body
        g.fillOval(birdX, birdY, BIRD_WIDTH, BIRD_HEIGHT);

        // Black Eye
        g.setColor(Color.BLACK);
        g.fillOval(birdX + BIRD_WIDTH - 12, birdY + 5, 5, 5);

        // Red Beak (Parrot Thot)
        g.setColor(Color.BLUE); // Bright Crimson Red
        g.fillOval(birdX + BIRD_WIDTH - 6, birdY + 7, 9, 9);

        // UI Layout
        g.setFont(new Font("Arial", Font.BOLD, 18));
        if (!gameStarted) {
            g.setColor(Color.WHITE);
            g.drawString("SPACE: Straight | Arrows: Fast Vertical", 25, HEIGHT / 2);
        }

        if (gameOver) {
            g.setColor(new Color(220, 20, 60));
            g.drawString("GAME OVER", WIDTH / 2 - 60, HEIGHT / 2 - 30);
            g.setColor(Color.WHITE);
            g.drawString("Press SPACE to Restart", WIDTH / 2 - 110, HEIGHT / 2 + 10);
        }

        g.setColor(Color.DARK_GRAY);
        g.drawString("Score: " + score, 20, 40);
    }
}
