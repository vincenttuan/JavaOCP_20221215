package com.ocp.day20_thread;

public class LuckyNumberTest {
    public static void main(String[] args) {
        LuckyNumber luckyNumber1 = new LuckyNumber();
        LuckyNumber luckyNumber2 = new LuckyNumber();
        luckyNumber1.setName("小明");
        luckyNumber2.setName("小華");
        luckyNumber1.start();
        luckyNumber2.start();
        
    }
}
