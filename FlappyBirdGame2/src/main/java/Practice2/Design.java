package Practice2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;

public class Design extends JPanel{
    //Variables
    //1) Panel Variable
    private final int WIDTH=400;
    private final int HEIGHT=600;
    //2) Bird Variable
    private int birdX=100;
    private int birdY=250;
    private final int bird_HEIGHT=24;
    private final int bird_WIDTH=34;
    private final int move_speed=8;//x-axis spedd
    private final int verticle_spedd=12;//up-down(y-axis speed)
    //Game Variable
    private boolean gameOver=false;
    private boolean gameStarted=false;
    private int score=0;
    //3) Pipe Variable
    Design(){
        setFocusable(true);//JPanel takes input
        addKeyListener(new KeyAdapter(){
        public void keyPressed(KeyEvent e){
            int code=e.getKeyCode();
        }
        });
}
    //Design
    @Override
    public void paintComponent(Graphics g){
    super.paintComponent(g);
    //Sky
    g.setColor(new Color(173, 216, 230));
    g.fillRect(0, 0, WIDTH, HEIGHT);
    //Ground
    g.setColor(new Color(222, 184, 135));
    g.fillRect(0, HEIGHT-50, WIDTH, 50);
    //Bird
    //1) Bird Body
    g.setColor(Color.yellow);
    g.fillOval(birdX, birdY, bird_WIDTH, bird_HEIGHT);
    //2) Bird Eyes
    g.setColor(Color.BLACK);
    g.fillOval(birdX+bird_WIDTH-12, birdY+5, 5, 5);
    //3) Bird Thot
    g.setColor(Color.BLUE);
    g.fillOval(birdX+bird_WIDTH-5, birdY+7, 9, 9);
    }
    //Game Reset
    private void resetGame(){
    birdX=100;
    birdY=250;
    score=0;
    gameOver=false;
    gameStarted=false;
    }
}
