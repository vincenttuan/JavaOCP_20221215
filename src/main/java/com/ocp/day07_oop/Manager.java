package com.ocp.day07_oop;

public class Manager extends Employee {
    @Override // 覆寫註解(檢查覆寫是否合法)
    public void job() {
        System.out.println("管理");
    }
    
    public void report() { // 一般方法
        System.out.println("寫報告");
    }
    
}
