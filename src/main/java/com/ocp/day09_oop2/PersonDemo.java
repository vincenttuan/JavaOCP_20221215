package com.ocp.day09_oop2;

public class PersonDemo {
    public static void main(String[] args) {
        Student s1 = new Student(90, "John", 18);
        Student s2 = new Student(80, "Mary", 17);
        Student[] students = {s1, s2};
        printSchoolPerson(students);
        printPerson(students);
        
        Teacher t1 = new Teacher(70000, "Jo", 35);
        Teacher t2 = new Teacher(80000, "Bob", 46);
        Employee e1 = new Employee(35000, "Alice", 22);
        Employee e2 = new Employee(55000, "Candy", 28);
        
        BusinessPerson[] businessPersons = {t1, t2, e1, e2};
        printBusinessPerson(businessPersons);
        printPerson(businessPersons);
    }
    
    public static void printBusinessPerson(BusinessPerson[] businessPersons) {
        for(BusinessPerson p : businessPersons) {
            System.out.printf("%s %d %d\n", 
                    p.getName(), p.getSalary(), p.getAge());
        }
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
