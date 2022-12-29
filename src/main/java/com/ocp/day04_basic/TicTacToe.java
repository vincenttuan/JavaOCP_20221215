package com.ocp.day04_basic;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    
    static char [] ttt = {'-', '-', '-', '-', '-', '-', '-', '-', '-'};
    
    public static void main(String[] args) {
        while (true) {            
            printTTT();
            Scanner scanner = new Scanner(System.in);
            System.out.print("請選擇(0~8): ");
            int index = scanner.nextInt();
            ttt[index] = 'O';
            pcPlay();
        }
    }
    
    public static void pcPlay() {
        Random random = new Random();
        while (true) {            
            int index = random.nextInt(ttt.length); // 0~8
            if(ttt[index] == '-') {
                ttt[index] = 'X';
                break;
            }
        }
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
