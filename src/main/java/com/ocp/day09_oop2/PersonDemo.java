package com.ocp.day09_oop2;

public class PersonDemo {
    public static void main(String[] args) {
        Student s1 = new Student(90, "John", 18);
        Student s2 = new Student(80, "Mary", 17);
        Student[] students = {s1, s2};
        printSchoolPerson(students);
        printPerson(students);
    }
    
    public static void printSchoolPerson(SchoolPerson[] schoolPersons) {
        for(SchoolPerson p : schoolPersons) {
            System.out.printf("%s %d %d\n", 
                    p.getName(), p.getScore(), p.getAge());
        }
    }
    
    public static void printPerson(Person[] persons) {
        for(Person p : persons) {
            System.out.printf("%s %d\n", 
                    p.getName(), p.getAge());
        }
    }
    
    
}
