package com.ktxdev;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var gameBoard = new GameBoard();
            gameBoard.setVisible(true);
        });
    }
}