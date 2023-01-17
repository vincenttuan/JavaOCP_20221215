package com.ocp.day09_oop;

public class PetStore {
    public static void main(String[] args) {
        Dog dog1 = new Shiba();
        Dog dog2 = new Chihuahua();
        System.out.println(Dog.legs);
        dog1.eat();
        dog1.skill();
        dog2.eat();
        dog2.skill();
        
        Dog[] dogs = {dog1 , dog2};
        for(Dog dog : dogs) {
            dog.eat();
            dog.skill();
        }
        
    }
}
