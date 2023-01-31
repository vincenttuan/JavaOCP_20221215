package com.ocp.day11_inner.anonymous;

public class DogTest {
    public static void main(String[] args) {
        
        Dog dog = new Dog() {
            @Override
            public void eat() {
                System.out.println("牛肉罐頭");
            }
        };
        dog.eat();
        
        Dog dog2 = new Dog() {
            @Override
            public void eat() {
                System.out.println("豬骨頭");
            }
        };
        dog2.eat();
        
        Dog dog3 = () -> System.out.println("吃青菜");
        dog3.eat();
        
    }
}
