package com.ocp.day22_thread;

import java.util.concurrent.FutureTask;

public class ExchangeDemo {
    public static void main(String[] args) throws Exception {
        double cash = 1000; // 台幣現金
        String currency = "JPY"; // 要換匯的幣別
        FutureTask<Double> task = new FutureTask<>(new Exchange(currency));
        new Thread(task).start(); // 啟動一條執行緒去執行
        double ex = task.get();
        System.out.printf("TWD 兌換 %s 的匯率: %.4f\n", currency, ex);
        System.out.printf("TWD $%.1f 元可以兌換 %s %.1f 元\n", cash, currency, (cash * ex));
    }
}
