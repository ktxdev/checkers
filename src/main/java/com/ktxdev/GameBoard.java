package com.ktxdev;

import javax.swing.*;
import java.awt.*;

public class GameBoard extends JFrame {
    public final static int NO_OF_GRIDS = 8;
    public final static int GRID_WIDTH = 100;
    public final static int GRID_HEIGHT = 100;

    private final static int WINDOW_SIZE = NO_OF_GRIDS * GRID_WIDTH;
    public GameBoard() throws HeadlessException {
        add(new Grid());
        setResizable(false);
        setTitle("Checkers Board");
        setSize(WINDOW_SIZE, WINDOW_SIZE + 35);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((int) (dimension.getWidth() / 2 - this.getWidth() / 2), (int) (dimension.getHeight() / 2 - this.getHeight() / 2));
    }
}
