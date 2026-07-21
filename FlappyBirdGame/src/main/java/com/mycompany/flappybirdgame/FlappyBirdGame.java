package com.mycompany.flappybirdgame;
import javax.swing.JFrame;

public class FlappyBirdGame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Flappy Bird");
        GamePanel gamePanel = new GamePanel();
        
        frame.add(gamePanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 600);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null); //screen on the middle of the screen
        frame.setVisible(true);
    }
}