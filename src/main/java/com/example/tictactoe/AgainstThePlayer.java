package com.example.tictactoe;

public class AgainstThePlayer {

    public static void playersMovements(char[][] board, char currentSymbol) {
        while (true) {
            Board.printBoard(board);

            boolean correctMovement = MakingTheMove.followTheMove(board, currentSymbol);
            if (!correctMovement) {
                continue;
            } else {
                boolean winLines = CheckWin.checkLines(board, currentSymbol);
                boolean winColumns = CheckWin.checkColumns(board, currentSymbol);
                boolean winSlant1 = CheckWin.checkSlant1(board, currentSymbol);
                boolean winSlant2 = CheckWin.checkSlant2(board, currentSymbol);

                if (winLines || winColumns || winSlant1 || winSlant2) {
                    System.out.println("Congratulations, won: " + currentSymbol);
                    break;
                }

                if (currentSymbol == 'x') {
                    currentSymbol = 'o';
                } else {
                    currentSymbol = 'x';
                }
            }
        }
    }
}
