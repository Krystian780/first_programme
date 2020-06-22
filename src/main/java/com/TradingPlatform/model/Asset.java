package com.TradingPlatform.model;

import java.util.Date;
import java.util.Objects;
public class Asset extends AbstractContent {
    private String name;
    private String category;

    public Asset(String id, Date createDTime, Date lastUpdateTime, String name, String category) {
        super(id, createDTime, lastUpdateTime);
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    @Override  //for all properties ? what if I put only name and Category ?
    public String toString() {
        return "Asset{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", id='" + id + '\'' +
                ", createDTime=" + createDTime +
                ", lastUpdateTime=" + lastUpdateTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Asset asset = (Asset) o;
        return Objects.equals(name, asset.name) &&
                Objects.equals(category, asset.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, category);
    }
}
