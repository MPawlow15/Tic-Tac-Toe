package com.example.tictactoe;

import java.util.Scanner;

public class MakingTheMove {
    public static boolean followTheMove(char[][] board, char currentSymbol ){
        System.out.println(currentSymbol + "your move");
        System.out.println("Enter the index of the line");

        int line = new Scanner(System.in).nextInt();

        System.out.println("Enter the index of the column");
        int column = new Scanner(System.in).nextInt();

        boolean correctMovement = board[line][column] == 0;

        if(!correctMovement) {
            System.out.println("Invalid movement");

            return false;
        }
        board[line][column] = currentSymbol;

        return true;
    }

}
