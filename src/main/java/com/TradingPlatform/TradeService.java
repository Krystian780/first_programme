package com.TradingPlatform;
import com.TradingPlatform.model.Trade;

import java.util.ArrayList;

public class TradeService {
    ArrayList<Trade> trades = new ArrayList<>();


    public void addTrade(Trade t) {
        for(Trade x : trades){
            if (!trades.contains(x.getId())) {
                trades.add(t);
            }
        }
    }

    public void removeTrade(Trade t){
        for(Trade x : trades) {
            if (!trades.contains(x.getId())) {
                trades.remove(t);
            }
        }
    }

    public Trade getProducts(String id) {
        int index = trades.indexOf(new Trade(id));
        return (index != -1) ? trades.get(index) : null;
    }
}




