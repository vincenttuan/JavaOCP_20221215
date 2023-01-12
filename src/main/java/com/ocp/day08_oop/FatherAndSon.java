package com.ocp.day08_oop;

class Father {

    Father() {
        System.out.println("A"); 
    }

}

class Son extends Father {

    Son() {
        System.out.println("B");
    }
    
    Son(int x) {
        this();
        System.out.println("C");
    }
    
}


public class FatherAndSon {
    public static void main(String[] args) {
        Son son = new Son(100);
    }
}
