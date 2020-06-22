package com.TradingPlatform;
import com.TradingPlatform.model.Trade;

import java.util.ArrayList;

public class TradeService {
    ArrayList<Trade> trades = new ArrayList<>();


    public void addTrade(Trade t) {
        if (!trades.contains(t)) {
            trades.add(t);
        }
    }

    public void removeTrade(Trade t){
        if (!trades.contains(t)){
            trades.remove(t);
        }
    }

    public Trade getProducts(long id) {     // nie ma atrybutu id wiec po czym sukamy ?
        int index = products.indexOf(new Asset(id));
        return (index != -1) ? products.get(index) : null;
    }
}



}
