package com.TradingPlatform;
import com.TradingPlatform.model.Product;
import org.springframework.stereotype.Service;
import java.util.ArrayList;


@Service
public class ProductService {

        ArrayList<Product> products = new ArrayList<>();
        int id = 0;

        public ArrayList<Product> getProducts() {
            return products;
        }

        public void addProduct(Product p) {
            for(Product x: products) {
                if (!products.contains(x.getId())) {
                    products.add(p);
                }
            }
        }

        public void removeProduct(Product p){
            for(Product x: products) {
                if (!products.contains(x.getId())){
                    products.remove(p);
                }
            }
        }

        public Product getProducts(String id) {
            int index = products.indexOf(new Product(id));
            return (index != -1) ? products.get(index) : null;
        }
    }

