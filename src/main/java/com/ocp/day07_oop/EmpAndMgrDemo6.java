package com.ocp.day07_oop;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class EmpAndMgrDemo6 {
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee(30000),
            new Employee(40000),
            new Manager(80000),
            new Employee(45000),
            new Manager(90000),
            new Employee(50000),
        };
        
        // 總金額, 平均, 員工總人數, 最高薪資, 最低薪資 (利用 Java Stream)
        IntSummaryStatistics stat = Arrays.stream(employees)
                                          .mapToInt(emp -> emp.getSalary()) // [30000, 40000, 80000 , 45000, 90000, 50000
                                          .summaryStatistics();
        
        System.out.println(stat);
        System.out.printf("員工總人數: %,d\n", stat.getCount());
        System.out.printf("員工總薪資: %,d\n", stat.getSum());
        System.out.printf("最低薪資: %,d\n", stat.getMin());
        System.out.printf("最高薪資: %,d\n", stat.getMax());
        System.out.printf("平均薪資: %,.1f\n", stat.getAverage());
        
    }
}
