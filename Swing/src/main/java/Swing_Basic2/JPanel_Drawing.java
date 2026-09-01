package Swing_Basic2;

import java.awt.Graphics;
import javax.swing.JPanel;

public class JPanel_Drawing extends JPanel{
    protected void paintComponent(Graphics g){
    super.paintComponent(g);
    g.drawLine(10, 10, 100, 100);
    }
}
