package com.ocp.day22_synchronized;

// 提款執行緒
public class Withdraw implements Runnable {
    private int amount; // 提款金額
    private Account account; // 提款帳戶
    
    public Withdraw(Account account, int amount) {
        this.account = account;
        this.amount = amount;
    }
    
    @Override
    public void run() {
        account.withdraw(amount); // 對帳戶進行提款
    }
    
}
