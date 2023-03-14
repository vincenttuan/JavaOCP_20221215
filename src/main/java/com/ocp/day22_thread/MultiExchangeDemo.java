package com.ocp.day22_thread;

import java.util.Map;
import java.util.concurrent.FutureTask;
import yahoofinance.Stock;

public class MultiExchangeDemo {
    public static void main(String[] args) throws Exception {
        double cash = 1000;
        String[] symbols = {"JPY", "USD", "CNY", "EUR"};
        FutureTask<Map<String, Stock>> task = new FutureTask<>(new MultiExchange(symbols));
        new Thread(task).start();
        Map<String, Stock> map = task.get();
        map.entrySet().forEach(s -> {
            double ex = s.getValue().getQuote().getPrice().doubleValue();
            System.out.printf("$%.1f TWD 可以兌換 %s $%.1f\n", 
                    cash, 
                    s.getKey().substring(3, 6), // TWDJPA=X 取index在 3~<6 的資料
                    (cash * ex));
        });
    }
}
