package com.ocp.day03_basic;

public class AccountDemo {
    public static void main(String[] args) {
        Account act1 = new Account();
        Account act2 = new Account();
        act1.deposit(1000);
        act2.deposit(800);
        System.out.printf("act1 cash: $%d\n", act1.cash);
        System.out.printf("act2 cash: $%d\n", act2.cash);
        //---------------------------------------------------------
        act1.withdraw(300);
        act2.withdraw(200);
        System.out.printf("act1 cash: $%d\n", act1.cash);
        System.out.printf("act2 cash: $%d\n", act2.cash);
        //---------------------------------------------------------
        act1.transfer(500, act2);
        System.out.printf("act1 cash: $%d\n", act1.cash);
        System.out.printf("act2 cash: $%d\n", act2.cash);
        //---------------------------------------------------------
        act2.transfer(400, act1);
        System.out.printf("act1 cash: $%d\n", act1.cash);
        System.out.printf("act2 cash: $%d\n", act2.cash);
        
    }
}
