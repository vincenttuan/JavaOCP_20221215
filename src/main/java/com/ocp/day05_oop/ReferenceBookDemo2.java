package com.ocp.day05_oop;

public class ReferenceBookDemo2 {
    public static void main(String[] args) {
        Author author = new Author("Mary", 40);
        System.out.println(author);
        ReferenceBook book = new ReferenceBook("Python", 350, 250, author);
        System.out.println(book);
        
        ReferenceBook book2 = new ReferenceBook("VB", 250, 200, new Author("Bob", 28));
        System.out.println(book2);
        
    }
}
