package com.ocp.day22_synchronized;

public class Account {
    private int balance; // 帳戶餘額
    
    public Account(int balance) { // 設定帳戶餘額
        this.balance = balance;
    }
    
    public void setBalance(int balance) { // 更新帳戶餘額
        this.balance = balance;
    }
    
    public synchronized void withdraw(int amount) { // 提款方法
        String tName = Thread.currentThread().getName();
        System.out.printf("%s 進來提款 $%d, 帳戶餘額: $%d\n", tName, amount, balance);
        // 判斷帳戶餘額是否足夠 ?
        if(balance >= amount) {
            // 進行提款
            for(int x=0;x<Integer.MAX_VALUE;x++); // 模擬提款所花費的時間
            // 帳戶餘額扣除
            setBalance(balance - amount);
            // 提款成功
            System.out.printf("%s 提款 $%d 成功, 帳戶餘額: $%d\n", tName, amount, balance);
        } else {
            System.out.printf("%s 提款 $%d 失敗, 帳戶餘額: $%d\n", tName, amount, balance);
        }
        System.out.printf("%s 離開提款程序\n", tName);
    }
    
}
