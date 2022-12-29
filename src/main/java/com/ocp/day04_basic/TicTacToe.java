package com.ocp.day04_basic;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    
    static char [] ttt = {'-', '-', '-', '-', '-', '-', '-', '-', '-'};
    
    public static void main(String[] args) {
        printTTT();
        while (true) {            
            userPlay();
            pcPlay();
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
