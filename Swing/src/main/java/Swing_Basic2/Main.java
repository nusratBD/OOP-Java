package Swing_Basic2;
import javax.swing.JFrame;

public class Main {
    public static void main(String [] args){
        JFrame frame = new JFrame();
        JPanel_Drawing jDrawing = new JPanel_Drawing();
        frame.add(jDrawing);
        frame.setSize(400, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
