package com.ocp.day05_oop;

public class AuthorDemo {
    public static void main(String[] args) {
        Author author = new Author();
        author.setName("John");
        author.setAge(35);
        System.out.println(author);
        System.out.println(author.getName());
        System.out.println(author.getAge());
        //-------------------------------------
        Author author2 = new Author("Mary", 40);
        System.out.println(author2);
        
    }
}
