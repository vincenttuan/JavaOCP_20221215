package com.ocp.java11_lambda;

public class BMITest {
    public static void main(String[] args) {
        // 1. 匿名內部類別
        BMI bmi1 = new BMI() {
            @Override
            public double getValue(double h, double w) {
                double bmi = w / Math.pow(h/100, 2);
                return bmi;
            }
        };
        System.out.println(bmi1.getValue(170, 60));    
        
        // 2. 透過 Lambda I
        BMI bmi2 = (double h, double w) -> {
            double bmi = w / Math.pow(h/100, 2);
            return bmi;
        };
        System.out.println(bmi2.getValue(170, 60));    
        
        // 3. 透過 Lambda II
        BMI bmi3 = (h, w) -> {
            double bmi = w / Math.pow(h/100, 2);
            return bmi;
        };
        System.out.println(bmi3.getValue(170, 60));
        
        // 3. 透過 Lambda III
        BMI bmi4 = (h, w) -> w / Math.pow(h/100, 2);
        System.out.println(bmi4.getValue(170, 60));
        
    }
}
