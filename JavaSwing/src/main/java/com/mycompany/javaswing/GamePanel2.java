package com.mycompany.javaswing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel2 extends JPanel implements KeyListener,
        ActionListener{
    private int birdX=100;
    private int birdY=100;
    private int speedX=5;
    private int speedY=5;
    GamePanel2(){
    setFocusable(true);
    addKeyListener(this);
    Timer timer = new Timer(1000, this);
    timer.start();
    
    }
    //Template
    @Override
    protected void paintComponent(Graphics g){
    super.paintComponent(g);
    g.setColor(Color.YELLOW);
    
g.fillOval(birdX, birdY, 60, 60);   // Face

g.setColor(Color.BLACK);
g.fillOval(birdX+15, birdY+20, 8, 8);     // Left eye
g.fillOval(birdX+37, birdY+20, 8, 8);     // Right eye

g.setColor(Color.ORANGE);
g.fillPolygon(
    new int[]{birdX+60, birdX+75, birdX+60, birdX+40},
    new int[]{birdY+30, birdY+35, birdY+40, birdY+50},
    4
); 
g.fillRect(20, 20, 120, 60);
g.setColor(Color.BLUE);
g.fillRoundRect(10, 20, 30, 40, 50, 60);
g.setColor(Color.black);
g.drawLine(20, 120, 150, 120);
g.setColor(Color.blue);
g.setFont(new Font("Arial", Font.BOLD|Font.ITALIC, 24));
g.drawString("Nusrat Hurain", 50, 200);
g.setColor(Color.red);
g.fillOval(150, 200, 50, 50);
g.setColor(Color.red);
g.fillOval(150, 250, 50, 50);
    }
    @Override
    public void keyReleased(KeyEvent e){
    }
    @Override
    public void keyTyped(KeyEvent e){
    
    }
    @Override
    public void actionPerformed(ActionEvent e){
        // Automatic Movement
        birdX += speedX;
        birdY += speedY;
        // Left & Right Bounce
        if (birdX <= 0 || birdX >= getWidth() - 60) {
            speedX = -speedX;
        }
        // Top & Bottom Bounce
        if (birdY <= 0 || birdY >= getHeight() - 60) {
            speedY = -speedY;
        }
        
        repaint();
    }
    @Override
    /*KeyListener Interface Implemented. 
     And all the methods of interfaces are 
    always public.*/
    public void keyPressed(KeyEvent e){
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if(birdX<=getWidth()-60) speedX = 10;
        }

        else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            if(birdX>0) speedX = -10;
        }

        else if (e.getKeyCode() == KeyEvent.VK_UP) {
            if(birdY<=getHeight()-60) speedY = -10;
        }

        else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            if(birdY>0) speedY = 10;
        }

        else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            speedY=0;
        }
        
    }
}
