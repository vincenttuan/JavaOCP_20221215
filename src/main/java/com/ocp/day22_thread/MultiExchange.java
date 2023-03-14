package com.ocp.day22_thread;

import java.util.Map;
import java.util.concurrent.Callable;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;

public class MultiExchange implements Callable<Map<String, Stock>>{
    private String[] symbols;
    
    public MultiExchange(String[] symbols) {
        for(int i=0;i<symbols.length;i++) {
            symbols[i] = "TWD" + symbols[i] + "=X";
        }
        this.symbols = symbols;
    }
    
    @Override
    public Map<String, Stock> call() throws Exception {
        Map<String, Stock> stocks = YahooFinance.get(symbols);
        return stocks;
    }
    
}
