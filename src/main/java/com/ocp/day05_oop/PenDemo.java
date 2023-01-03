package com.ocp.day05_oop;

public class PenDemo {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("red");
        p1.setPrice(12);
        System.out.println("筆的顏色 = " + p1.getColor());
        System.out.println("筆的價格 $ " + p1.getPrice());
    }
}
