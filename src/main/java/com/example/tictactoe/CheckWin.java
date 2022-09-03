package com.example.tictactoe;

public class CheckWin {

    public static boolean checkLines(char[][] board, char currentSymbol) {
        int size = board.length;
        for(int line = 0; line < size; line++) {
            boolean win = true;
            for(int column = 0; column < size; column++) {
                if(board[line][column] != currentSymbol) {
                    win = false;
                    break;
                }
            }
            if(win) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkColumns(char[][] board, char currentSymbol) {
        int size = board.length;
        for(int column = 0 ; column < size; column++) {
            boolean win = true;
            for(int line = 0; line < size; line++) {
                if(board[line][column] != currentSymbol) {
                    win = false;
                    break;
                }
            }
            if(win) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkSlant1(char[][] board, char currentSymbol) {
        int size = board.length;
        for(int i = 0; i < size; i++) {
            if(board[i][i] != currentSymbol){
                return false;
            }
        }
        return true;
    }

    public static boolean checkSlant2(char[][] board, char currentSymbol) {
        int size = board.length;
        int j = size;
        for (int i = 0; i < size; i++){

            j--;
            if(board[i][j] != currentSymbol){
                return false;
            }
        }
        return true;
    }
}