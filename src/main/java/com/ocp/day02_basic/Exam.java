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
        if(sum == 0) {
            calcSum();
        }
        avg = sum / 3.0;
    }

    @Override
    public String toString() {
        return "Exam{" + "chinese=" + chinese + ", english=" + english + ", math=" + math + ", sum=" + sum + ", avg=" + avg + '}';
    }
    
}
