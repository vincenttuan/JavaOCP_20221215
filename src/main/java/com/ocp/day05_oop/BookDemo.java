package com.ocp.day05_oop;

public class BookDemo {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.title = "Java";
        b1.price = 500;
        b1.pages = 1200;
        b1.authorName = "John";
        b1.authorAge = 35;
        System.out.println(b1);
    }
}
