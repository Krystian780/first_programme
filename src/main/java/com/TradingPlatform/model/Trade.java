package com.TradingPlatform.model;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.Date;


@Getter @Setter @ToString
public class Trade  extends AbstractContent {
    private Double national;
    private String state;
    private String clientName;

    @Builder
    public Trade(String id, Date createDTime, Date lastUpdateTime, Double national, String state, String clientName) {
        super(id, createDTime, lastUpdateTime);
        this.national = national;
        this.state = state;
        this.clientName = clientName;
    }

}