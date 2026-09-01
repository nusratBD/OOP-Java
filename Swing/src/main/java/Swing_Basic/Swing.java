package Swing_Basic;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Swing extends JPanel{

    public static void main(String[] args) {        
    JFrame frame=new JFrame();
    Swing panel=new Swing();
    frame.add(panel);
    frame.setSize(400, 600);
    frame.setVisible(true);
    }
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawLine(20, 20, 200, 200);
    }
}

