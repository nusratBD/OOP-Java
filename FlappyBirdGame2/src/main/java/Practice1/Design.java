package Practice1;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Design extends JPanel{
    //Constant Variables
    private final int HEIGHT=600;
    private final int WIDTH=400;
    private final int birdX=120;
    private final int birdY=250;
    private final int bird_HEIGHT=24;
    private final int bird_WIDTH=34;
    //Design Part
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
        //01) Bird Body
        g.setColor(Color.YELLOW);
        g.fillOval(birdX, birdY, bird_WIDTH, bird_HEIGHT);
        //02) Bird Eyes
        g.setColor(Color.BLACK);
        g.fillOval(birdX+bird_WIDTH-12, birdY+5, 5, 5);
        //03) Bird's Thot
        g.setColor(Color.BLUE);
        g.fillOval(birdX+bird_WIDTH-6, birdY+7, 9, 9);
        
    }
}
