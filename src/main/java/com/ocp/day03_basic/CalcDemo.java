package com.ocp.day03_basic;

public class CalcDemo {
    public static void main(String[] args) {
        int    area  = Calc.rect(10, 20); // 可以得到正方形的面積(10, 20) -> (長, 寬)
        double area2 = Calc.circle(5); // 可以得到圓形的面積(5) -> (半徑)
        double bmiValue = Calc.bmi(170.0, 60.0); // 可以得到BMI的值(170.0, 60.0) -> (身高, 體重)
        
        System.out.println(area);
        System.out.println(area2);
        System.out.println(bmiValue);
    }
}
