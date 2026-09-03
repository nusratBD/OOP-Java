package Swing_Basic3;

import javax.swing.JFrame;

public class Main {
    public static void main(String [] args){
        JFrame frame = new JFrame();
        Design design = new Design();
        frame.add(design);
        frame.setSize(600, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
