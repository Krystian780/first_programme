package com.TradingPlatform.Controller;
import com.TradingPlatform.Repository.TradeR;
import com.TradingPlatform.model.Product;
import com.TradingPlatform.model.Trade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class TraderController {

    @Autowired
    private TradeR TradeR;

    @GetMapping(path = "trades", produces = "application/json")
    public List<Trade> getTrades(){
        return TradeR.getTrades();
    }

    @PostMapping(path = "trade", consumes = "application/json")
    public void addProduct(@RequestBody Trade t) {
        TradeR.addTrade(t);
    }

    @GetMapping(path = "trade/{id}", produces = "application/json")
    public Trade getTrade(@PathVariable("id") String id) {
        return TradeR.getTrade(id);
    }

    @DeleteMapping(path = "trade/{id}", produces = "application/json")
    public void removeProduct(@PathVariable("id") Trade t) {
        TradeR.removeTrade(t);
    }
}
