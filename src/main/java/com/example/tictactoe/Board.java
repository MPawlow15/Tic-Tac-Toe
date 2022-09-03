package com.example.tictactoe;

public class Board {

    public static void printBoard(char[][] board){
        int size = board.length;
        for(int i = 0; i < size; i++){
            System.out.print("\t"+ i);
        }
        System.out.println();

        for(int line = 0; line < board.length; line++) {
            System.out.print(line + ":\t");
            for(int column = 0; column < board[line].length;column++){
                System.out.print(board[line][column] + "\t");
            }
            System.out.println();
        }
    }
}
