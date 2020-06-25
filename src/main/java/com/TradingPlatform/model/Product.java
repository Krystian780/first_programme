package com.TradingPlatform.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.Objects;

@Getter @Setter @ToString
public class Product extends AbstractContent {

    private String type;
    private String isin;
    private Double price;

    @Builder
    public Product(String id, Date createDTime, Date lastUpdateTime, String type, String isin, Double price) {
        super(id, createDTime, lastUpdateTime);
        this.type = type;
        this.isin = isin;
        this.price = price;
    }

}
