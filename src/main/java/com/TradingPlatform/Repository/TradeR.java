package com.TradingPlatform.Repository;
import com.TradingPlatform.model.Trade;

import java.util.ArrayList;

public class TradeR {
    ArrayList<Trade> trades = new ArrayList<>();
   
    public ArrayList<Trade> getTrades() {
        return trades;
    }

    public void addTrade(Trade t) {
        boolean valid = true;
        for(Trade x: trades) {
            if(x.getId() == t.getId()){
                valid = false;
            }
        }
        if(valid){
            trades.add(t);
        }
    }

    public void removeTrade(Trade t){
        boolean valid = true;
        for(Trade x: trades) {
            if(x.getId() == t.getId()){
                valid = false;
            }
        }
        if(valid){
            trades.add(t);
        }
    }

    public Trade getTrade(String id) {
        int index = trades.indexOf(new Trade(id));
        return (index != -1) ? trades.get(index) : null;
    }
}




