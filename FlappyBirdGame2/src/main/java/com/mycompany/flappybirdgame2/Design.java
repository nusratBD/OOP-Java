package com.mycompany.flappybirdgame2;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Design extends JPanel{
    private final int HEIGHT = 600;
    private final int WIDTH = 400;
    private final int birdX = 100;
    private final int birdY = 250;
    private final int BIRD_HEIGHT = 24;
    private final int BIRD_WIDTH = 34;
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        //Background Color
        g.setColor(new Color(173, 216, 230));
        g.fillRect(0, 0, WIDTH, HEIGHT);
        //Ground Color
        g.setColor(new Color(222, 184, 135));
        g.fillRect(0, HEIGHT-50, WIDTH, 50);
        //Bird
        //01. Body
        g.setColor(Color.YELLOW);
        g.fillOval(birdX, birdY, BIRD_WIDTH, BIRD_HEIGHT);
        //02.Eyes
        g.setColor(Color.black);
        g.fillOval(birdX+BIRD_WIDTH-12, birdY+5, 5, 5);
    }
}
