package com.ocp.day01_basic;

// 計算 BMI
public class BMITest1 {
    
    public static void main(String[] args) {
        String name = "John"; // 人名
        double height = 170.0; // 身高
        double weight = 60.0; // 體重
        double bmi = getBMI(height, weight);
        System.out.printf("%s BMI: %.2f\n", name, bmi);
        
        String name2 = "Mary";
        double height2 = 160;
        double weight2 = 55;
        double bmi2 = getBMI(height2, weight2);
        System.out.printf("%s BMI: %.2f\n", name2, bmi2);
    }
    
    // 建立一個計算 bmi 值的方法並且在計算完畢後會回傳(return) bmi 值
    public static double getBMI(double h, double w) {
        double bmi = w / Math.pow(h/100, 2);
        return bmi;
    }
    
    
}
