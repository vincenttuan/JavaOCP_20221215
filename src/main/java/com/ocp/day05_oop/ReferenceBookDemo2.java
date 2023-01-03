package com.ocp.day05_oop;

public class ReferenceBookDemo2 {
    public static void main(String[] args) {
        Author author = new Author("Mary", 40);
        System.out.println(author);
        
        ReferenceBook book1 = new ReferenceBook("Python", 350, 250, author);
        book1.getAuthor().setAge(42);
        System.out.println(book1);
        
        ReferenceBook book2 = new ReferenceBook("VB", 250, 200, new Author("Bob", 28));
        System.out.println(book2);
        
        ReferenceBook book3 = new ReferenceBook("C#", 450, 600, new Author("Jack", 46));
        System.out.println(book3);
        
        //ReferenceBook book4 = new ReferenceBook("Java", 550, 620, new Author("Mary", 40));
        //ReferenceBook book4 = new ReferenceBook("Java", 550, 620, book1.getAuthor());
        ReferenceBook book4 = new ReferenceBook("Java", 550, 620, author);
        System.out.println(book4);
        
    }
}
