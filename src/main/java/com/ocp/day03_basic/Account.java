package com.ocp.day03_basic;

// 帳戶
public class Account {
    int cash;
    void withdraw(int amount) { // 提款
        cash = cash - amount;
    }
    void deposit(int amount) { // 存款
        cash = cash + amount;
    }
    void transfer(int amount, Account act) { // 轉帳
        this.withdraw(amount); // 自己是提款
        act.deposit(amount); // 對方是存款
    }
    
}
