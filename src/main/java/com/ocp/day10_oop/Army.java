package com.ocp.day10_oop;

public class Army {
    public static void main(String[] args) {
        Fighter fighter = new Fighter();
        Tank tank = new Tank();
        Truck truck = new Truck();
        
        Car[] cars = {tank, truck};
        Airplane[] airplanes = {fighter};
        Weapon[] weapons = {fighter, tank};
        
        shootWeapon(weapons);
        moveCar(cars);
        speedAirplace(airplanes);
    }
    
    public static void shootWeapon(Weapon[] weapons) {
        for(Weapon weapon : weapons) {
            weapon.shoot();
        }
    }
    
    public static void moveCar(Car[] cars) {
        for(Car car : cars) {
            car.move();
        }
    }
    
    public static void speedAirplace(Airplane[] airplanes) {
        for(Airplane airplane : airplanes) {
            airplane.speed();
        }
    }
}
