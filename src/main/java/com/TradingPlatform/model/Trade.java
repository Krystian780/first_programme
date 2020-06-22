package com.TradingPlatform.model;

import java.util.Date;
import java.util.Objects;

public class Trade  extends AbstractContent {
    private Double national;
    private String state;
    private String clientName;

    public Trade(String id, Date createDTime, Date lastUpdateTime, Double national, String state, String clientName) {
        super(id, createDTime, lastUpdateTime);
        this.national = national;
        this.state = state;
        this.clientName = clientName;
    }

    public Double getNational() {
        return national;
    }

    public String getState() {
        return state;
    }

    public String getClientName() {
        return clientName;
    }

    @Override
    public String toString() {
        return "Trade{" +
                "national=" + national +
                ", state='" + state + '\'' +
                ", clientName='" + clientName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trade trade = (Trade) o;
        return Objects.equals(national, trade.national) &&
                Objects.equals(state, trade.state) &&
                Objects.equals(clientName, trade.clientName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(national, state, clientName);
    }
}
