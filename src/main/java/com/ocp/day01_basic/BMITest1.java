package com.ocp.day01_basic;

// 計算 BMI
public class BMITest1 {
    
    public static void main(String[] args) {
        String name = "John"; // 人名
        double height = 170.0; // 身高
        double weight = 60.0; // 體重
        double bmi = weight / Math.pow(height/100, 2);
        System.out.printf("%s BMI: %.2f\n", name, bmi);
        
        String name2 = "Mary";
        double height2 = 160;
        double weight2 = 55;
        double bmi2 = weight2 / Math.pow(height2/100, 2);
        System.out.printf("%s BMI: %.2f\n", name2, bmi2);
    }
    
}
