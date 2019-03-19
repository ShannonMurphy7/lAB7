/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Shannon
 */
public class QA_Lab9 {

    
    public static char[][]board;
    public static char player;
    /**
     * @param args the command line arguments
     */
    public static char[][] CreateBoard(){
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                if(i % 2!=0){
                    board[i][j] = '|';
                }if(j%2 != 0){
                    board[i][j] = '_';
                }else{
                    board[i][j] = '-';
                }
            }
        }
        return board;
    }
    public static void printBoard() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
    public static void CurrentPlayer(){
        MakeMove();
    }
    public static void ChangePlayer(){
        if (player == 'X'){
            player = 'O';
        }else{
            player = 'X';
        }
    }
    public static void MakeMove(){
        System.out.println("Enter a number that corresponds to a space below: ");
        String[] boardd = {"00|01|02", "______", "23|24|25", "______", "46|47|48"};
        for(String x: boardd){
            System.out.println(x);
        }
        Scanner move = new Scanner(System.in);
        int m = move.nextInt();
        int row = m / 10;
        int column = m % 10;
        if(board[row][column]=='-'){ 
            board[row][column] = player;
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
            
        
    }
    public static void main(String[] args) {
        //CreateBoard();
        System.out.println("Enter \"X\" or \"O\" to begin");
        Scanner play = new Scanner(System.in);
        String p1 = play.nextLine();
        char p = p1.toUpperCase().charAt(0);
        player=p;
        CurrentPlayer();
        ChangePlayer();
        
    }
    
}
