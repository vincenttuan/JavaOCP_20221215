package com.ocp.day22_thread;

import java.util.concurrent.Callable;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;

public class Exchange implements Callable<Double>{
    private String symbol;
    public Exchange(String currency) {
        this.symbol = currency + "TWD=X";
    }
    
    @Override
    public Double call() throws Exception {
        Stock stock = YahooFinance.get(symbol);
        return stock.getQuote().getPrice().doubleValue();
    }
    
}
