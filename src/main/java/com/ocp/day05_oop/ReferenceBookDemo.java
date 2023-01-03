package com.ocp.day05_oop;

public class ReferenceBookDemo {
    public static void main(String[] args) {
        Author author = new Author();
        author.setName("John");
        author.setAge(35);
        
        ReferenceBook book = new ReferenceBook();
        book.setTitle("Java");
        book.setPrice(500);
        book.setPages(450);
        book.setAuthor(author);
        
        System.out.println(book);
        System.out.println(book.getTitle());
        System.out.println(book.getPrice());
        System.out.println(book.getPages());
        System.out.println(book.getAuthor());
        System.out.println(book.getAuthor().getName());
        System.out.println(book.getAuthor().getAge());
    }
}
