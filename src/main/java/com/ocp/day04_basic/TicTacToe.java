package com.ocp.day04_basic;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    
    static char [] ttt = {'-', '-', '-', '-', '-', '-', '-', '-', '-'};
    
    public static void main(String[] args) {
        printTTT();
        while (true) {            
            userPlay();
            checkWinner();
            pcPlay();
            checkWinner();
        }
    }
    
    public static void checkWinner() {
        int[][] wins = {
            {0, 1, 2}, {3, 4, 5}, {6, 7, 8}, 
            {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, 
            {0, 4, 8}, {2, 4, 6}, 
        };
        for(int i=0;i<wins.length;i++) {
            int sum = ttt[wins[i][0]] + ttt[wins[i][1]] + ttt[wins[i][2]];
            if(sum == 237) {
                System.out.println("User win!");
                break;
            } else if(sum == 264) {
                System.out.println("PC win!");
            }
        }
    }
    
    public static void userPlay() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("User 請選擇(0~8): ");
        int index = scanner.nextInt();
        ttt[index] = 'O';
        printTTT();
    }
    
    public static void pcPlay() {
        Random random = new Random();
        while (true) {            
            int index = random.nextInt(ttt.length); // 0~8
            if(ttt[index] == '-') {
                System.out.println("PC 請選擇(0~8): " + index);
                ttt[index] = 'X';
                break;
            }
        }
        printTTT();
    }
    
    public static void printTTT() {
        for(int i=0;i<ttt.length;i++) {
            System.out.printf(" %c ", ttt[i]);
            if(i % 3 == 2) {
                System.out.println();
            }
        }
    }
}
