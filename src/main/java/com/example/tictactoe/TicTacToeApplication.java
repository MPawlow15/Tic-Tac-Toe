package com.example.tictactoe;

import java.util.Scanner;

public class TicTacToeApplication {

	public static void main(String[] args) {

        System.out.println("Enter the size of the board");
        int size = new Scanner(System.in).nextInt();

        System.out.println("If you want to play with another player, type \"player\",if with a computer then skip");
        boolean typeOfGame = new Scanner(System.in).hasNext("player");

        char currentSymbol = 'x';

        char[][] board = new char[size][size];

        if (typeOfGame){
            AgainstThePlayer.playersMovements(board, currentSymbol);
        } else
            AgainstTheComputer.computerMovement(board, currentSymbol);
    }
}
