package com.company;
import java.util.Date;
import java.util.Objects;
public class Product extends AbstractContent {

    private String type;
    private String isin;
    private Double price;

    public Product(String id, Date createDTime, Date lastUpdateTime, String type, String isin, Double price) {
        super(id, createDTime, lastUpdateTime);
        this.type = type;
        this.isin = isin;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public String getIsin() {
        return isin;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "type='" + type + '\'' +
                ", isin='" + isin + '\'' +
                ", price=" + price +
                ", id='" + id + '\'' +
                ", createDTime=" + createDTime +
                ", lastUpdateTime=" + lastUpdateTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(type, product.type) &&
                Objects.equals(isin, product.isin) &&
                Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, isin, price);
    }
}
