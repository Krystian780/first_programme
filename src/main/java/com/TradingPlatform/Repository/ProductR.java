package com.TradingPlatform.Repository;
import com.TradingPlatform.model.Product;
import org.springframework.stereotype.Service;
import java.util.ArrayList;


@Service
public class ProductR {

        ArrayList<Product> products = new ArrayList<>();

        public ArrayList<Product> getProducts() {
            return products;
        }

        public void addProduct(Product p) {
            boolean valid = true;
            for(Product x: products) {
                if(x.getId() == p.getId()){
                    valid = false;
                }
            }
            if(valid){
                products.add(p);
            }
        }

        public void removeProduct(Product p){
            boolean valid = true;
            for(Product x: products) {
                if(x.getId() == p.getId()){
                    valid = false;
                }
            }
            if(valid){
                products.remove(p);
            }
        }

        public Product getProduct(String id) {
            int index = products.indexOf(new Product(id));
            return (index != -1) ? products.get(index) : null;
        }
    }

