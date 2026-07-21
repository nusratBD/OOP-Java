package com.mycompany.javaswing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JavaSwing {

    public static void main(String[] args) {
        //JFrame
        JFrame frame = new JFrame();
        frame.setSize(400,600);
        frame.setTitle("Practice Swing Java");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Close the full program
        frame.setLocationRelativeTo(null);
        //Set frame on the middle of the screen
        frame.setResizable(false);//frame can not be maximize
        
        //JPanel
//        JPanel panel = new JPanel();
//        panel.setBackground(Color.magenta);
//        frame.add(panel);
        //Use GamePanel
//        GamePanel g=new GamePanel();
//        frame.add(g, BorderLayout.PAGE_START);
//        frame.setVisible(true);
        //Use GamePanel2
        GamePanel2 panel2=new GamePanel2();
        frame.add(panel2);
        panel2.setBackground(Color.CYAN);
        frame.setVisible(true);
        panel2.requestFocusInWindow();/*Panel2 ke focus
        deya jate se keyboard input nite pare. Jodi Button
        e focus deya thake, tahole keyboard input kintu 
        JButton e pabe, JPanel pabe na.
        Eta mainly focus request.
        */
    }
}
