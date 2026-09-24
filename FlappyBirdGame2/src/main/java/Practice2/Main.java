package Practice2;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        Design design = new Design();
        frame.add(design);
        frame.setSize(400, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
