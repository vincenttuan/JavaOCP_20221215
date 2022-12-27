package com.ocp.day03_basic;

public class AccountDemo {
    public static void main(String[] args) {
        Account act1 = new Account();
        Account act2 = new Account();
        act1.deposit(1000);
        act2.deposit(800);
        
        System.out.printf("act1 cash: $%d\n", act1.cash);
        System.out.printf("act2 cash: $%d\n", act2.cash);
        
    }
}
