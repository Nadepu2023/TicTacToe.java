package com.tictactoe;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char player1 = 'X';
        char player2 = 'O';
        char current = player1;

        char[][] board = new char[3][3];
        for (int r = 0; r < board.length; r++)
            for (int c = 0; c < board.length; c++)
                board[r][c] = ' ';

        displayBoard(board);

        while(true){
            System.out.print("Player " + current + ", choose row: ");
            int row = scanner.nextInt();  

            System.out.print("Player " + current + ", choose col: ");
            int col = scanner.nextInt();    

            if (!validateChoice(board, row, col)) {
                System.out.println("Invalid Choice");
                continue; 
            }

            board[row][col] = current;

            displayBoard(board);

            if (checkWinner(board, current)) {
                System.out.println("Player " + current + ", wins!");
                break;
            }

            if (checkDraw(board)) {
                System.out.println("It's a draw!");
                break;
            }            

            if (current == player1) {
                current = player2;   
            } else {
                current = player1;   
            }

        }
    }

    public static boolean validateChoice(char[][] board, int row, int col){
        return board[row][col] == ' '; 
    }

    public static void displayBoard (char[][] board){
        for (int i = 0; i < board.length; i++) {
            System.out.print("| ");  
            for (int j = 0; j < board[i].length; j++) {
                char place = board[i][j];
                System.out.print(place + " | ");
            }  
            System.out.println(); 
        }
        System.out.println(); 
    }

    public static boolean checkWinner(char[][] board, char player) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player){ 
                return true;
            }
        }
        for (int j = 0; j < board.length; j++) {
            if (board[0][j] == player && board[1][j] == player && board[2][j] == player) {
                return true;
            }
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) { 
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) { 
            return true;
        }
        return false;
    }

    public static boolean checkDraw(char[][] board) {
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board.length; j++){
                if (board[i][j] == ' '){
                    return false;
                }
            }
        }
        return true;
    }
}