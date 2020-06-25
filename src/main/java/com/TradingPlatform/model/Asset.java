package com.TradingPlatform.model;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.Date;

@Getter @Setter @ToString
public class Asset extends AbstractContent {
    private String name;
    private String category;

    @Builder
    public Asset(String id, Date createDTime, Date lastUpdateTime, String name, String category) {
        super(id, createDTime, lastUpdateTime);
        this.name = name;
        this.category = category;
    }


    public Asset(String id) {
        super(id);
    }
}
