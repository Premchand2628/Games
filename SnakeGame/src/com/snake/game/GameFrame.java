package com.snake.game;

import java.awt.Dimension;
import javax.swing.JFrame;

public class GameFrame extends JFrame {
    public static void Frame() {
        GameFrame gm = new GameFrame();
        SnakePanel gp = new SnakePanel();
        gm.setTitle("SnakeLadder");
        gm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gm.setResizable(false);

        gp.setPreferredSize(new Dimension(SnakePanel.panelwidth, SnakePanel.panelheight)); // Correct dimensions
        gm.add(gp);
        gm.pack();
        gm.setVisible(true);
        gm.setLocationRelativeTo(null);
    }
}

