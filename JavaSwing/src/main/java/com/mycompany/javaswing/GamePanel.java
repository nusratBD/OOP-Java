
package com.mycompany.javaswing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

public class GamePanel extends JPanel{
    public GamePanel(){
    setPreferredSize(new Dimension(400, 100));
}
    @Override
    protected void paintComponent(Graphics g){
    super.paintComponent(g);
    g.setColor(Color.GREEN);
    g.fillOval(100, 20, 50, 50);
    
    }
}
