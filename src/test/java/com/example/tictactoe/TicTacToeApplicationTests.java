package com.example.tictactoe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

class TicTacToeApplicationTests {

    @Test
    void testCheckLines() {
        //Given
        char[][] board = new char[3][3];
        char currentSymbol = 'x';
        CheckWin checkWin = new CheckWin();

        board[0][0] = currentSymbol;
        board[0][1] = currentSymbol;
        board[0][2] = currentSymbol;

        //when
        boolean result = checkWin.checkLines(board,currentSymbol);

        //Then
        Assertions.assertTrue(result);
    }

    @Test
    void testCheckColumns() {
        //Given
        char[][] board = new char[3][3];
        char currentSymbol = 'x';
        CheckWin checkWin = new CheckWin();

        board[0][0] = currentSymbol;
        board[1][0] = currentSymbol;
        board[2][0] = currentSymbol;

        //When
        boolean result = checkWin.checkColumns(board,currentSymbol);

        //Then
        Assertions.assertTrue(result);
    }

    @Test
    void testCheckSlant1() {
        //Given
        char[][] board = new char[3][3];
        char currentSymbol = 'x';
        CheckWin checkWin = new CheckWin();

        board[0][0] = currentSymbol;
        board[1][1] = currentSymbol;
        board[2][2] = currentSymbol;

        //When
        boolean result = checkWin.checkSlant1(board,currentSymbol);

        //Then
        Assertions.assertTrue(result);
    }

    @Test
    void testCheckSlant2() {
        //Given
        char[][] board = new char[3][3];
        char currentSymbol = 'x';
        CheckWin checkWin = new CheckWin();

        board[0][2] = currentSymbol;
        board[1][1] = currentSymbol;
        board[2][0] = currentSymbol;

        boolean result = checkWin.checkSlant2(board,currentSymbol);

        //Then
        Assertions.assertTrue(result);
    }
}
