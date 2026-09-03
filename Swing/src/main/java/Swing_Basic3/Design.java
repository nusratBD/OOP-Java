package Swing_Basic3;

import java.awt.Graphics;
import javax.swing.JPanel;

public class Design extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawLine(10, 10, 100, 100);
        g.drawOval(50, 10, 50, 30);
        g.draw3DRect(100, 20, 50, 30, true);
    }
}
