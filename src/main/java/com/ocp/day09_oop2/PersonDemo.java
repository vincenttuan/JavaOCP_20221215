package com.ocp.day09_oop2;

public class PersonDemo {
    public static void main(String[] args) {
        Student s1 = new Student(90, "John", 18);
        Student s2 = new Student(80, "Mary", 17);
        SchoolPerson[] schoolPersons = {s1, s2};
        printSchoolPerson(schoolPersons);
    }
    
    public static void printSchoolPerson(SchoolPerson[] schoolPersons) {
        for(SchoolPerson p : schoolPersons) {
            System.out.printf("%s %d %d\n", 
                    p.getName(), p.getScore(), p.getAge());
        }
    }
    
    
}
