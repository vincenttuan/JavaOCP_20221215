package com.ocp.day22_synchronized;

public class WithdrawDemo {
    
    public static void main(String[] args) {
        // 資源
        Account account = new Account(10000); // 帳戶有 10000 元
        // 執行緒待執行的工作
        Withdraw withdraw1 = new Withdraw(account, 5000); // 提款 5000 的工作
        Withdraw withdraw2 = new Withdraw(account, 4000); // 提款 4000 的工作
        Withdraw withdraw3 = new Withdraw(account, 3000); // 提款 3000 的工作
        // 建立執行緒
        Thread t1 = new Thread(withdraw1, "甲");
        //Thread t2 = new Thread(withdraw2, "乙");
        //Thread t3 = new Thread(withdraw3, "丙");
        // 開始作業
        t1.start();
        //t2.start();
        //t3.start();
        
        
    }
    
}
