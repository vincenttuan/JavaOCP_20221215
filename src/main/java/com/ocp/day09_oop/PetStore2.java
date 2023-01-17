package com.ocp.day09_oop;

import com.ocp.day09_oop.real.Chihuahua;
import com.ocp.day09_oop.real.Shiba;
import com.ocp.day09_oop.spec.ADog;
import com.ocp.day09_oop.spec.Dog;
import com.ocp.day09_oop.spec.TDog;
import com.ocp.day09_oop.virtual.EDog;
import com.ocp.day09_oop.virtual.GPSDog;
import com.ocp.day09_oop.virtual.PaperDog;

public class PetStore2 {
    public static void main(String[] args) {
        Shiba shiba = new Shiba();
        Chihuahua chihuahua = new Chihuahua();
        PaperDog paperDog = new PaperDog();
        EDog eDog = new EDog();
        GPSDog gpsDog = new GPSDog();
        
        Dog[] dogs = {shiba, chihuahua, paperDog, eDog, gpsDog};
        ADog[] aDogs = {shiba, chihuahua};
        TDog[] tDogs = {paperDog, eDog, gpsDog};
        
        //printDogSkill(dogs);
        //printDogSkill(aDogs);
        printDogSkill(tDogs);
    }
    
    public static void printDogSkill(Dog[] dogs) {
        for(Dog dog : dogs) {
            dog.skill();
        }
    }
}
