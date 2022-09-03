package com.example.tictactoe;

import java.util.Random;

public class Computer {

    public static void movementOfTheComputer(char[][] board, char currentSymbol) {

        int size = board.length;
        Random r = new Random();
        int line;
        int column;
        boolean correctMovement;
        int a = size--;

        do {
            line = r.nextInt(a);
            column = r.nextInt(a);
            correctMovement = board[line][column] == 0;
        }
        while (!correctMovement);

        board[line][column] = currentSymbol;
    }
}
