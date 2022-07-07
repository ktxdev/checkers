package com.ktxdev;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

import static com.ktxdev.GameBoard.*;
import static java.awt.Color.BLACK;
import static java.awt.Color.WHITE;

public class Grid extends JComponent {
    @Override
    protected void paintComponent(Graphics g) {
        var graphics2D = (Graphics2D) g;
        for (int r = 0; r < NO_OF_GRIDS; r++) {
            for (int c = 0; c < NO_OF_GRIDS; c++) {
                int posX = r * GRID_WIDTH;
                int poxY = c * GRID_HEIGHT;

                if ((r % 2 == 0 && c % 2 == 0) || (r  % 2 == 1 && c  % 2 == 1)) {
                    graphics2D.setPaint(BLACK);
                } else {
                    graphics2D.setPaint(WHITE);
                }

                graphics2D.fillRect(posX, poxY, GRID_WIDTH, GRID_HEIGHT);
            }
        }
    }
}
