package com.ocp.day03_basic;

public class DonateDemo {
    public static void main(String[] args) {
        Donate d1 = new Donate();
        d1.name = "John";
        d1.submit(500);
        
        Donate d2 = new Donate();
        d2.name = "Mary";
        d2.submit(800);
        
        System.out.printf("%s 捐了 $%d\n", d1.name, d1.cash);
        System.out.printf("%s 捐了 $%d\n", d2.name, d2.cash);
        System.out.printf("捐款總金額: $%,d\n", Donate.total);
        
    }
}
