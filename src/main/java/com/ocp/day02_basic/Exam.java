package com.ocp.day02_basic;

public class Exam {
    int chinese;
    int english;
    int math;
    int sum;
    double avg;
    
    void calcSum() {
        sum = chinese + english + math;
    }
    
    void calcAvg() {
        avg = sum / 3.0;
    }
    
}
