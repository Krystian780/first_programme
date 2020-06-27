package com.TradingPlatform.Controller;
import com.TradingPlatform.Repository.ProductR;
import com.TradingPlatform.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductR productR;

    @GetMapping(path = "products", produces = "application/json")
    public List<Product> getProducts(){
        return productR.getProducts();
    }

    @PostMapping(path = "product", consumes = "application/json")
    public void addProduct(@RequestBody Product a) {
        productR.addProduct(a);
    }

    @GetMapping(path = "product/{id}", produces = "application/json")
    public Product getProduct(@PathVariable("id") String id) {
        return productR.getProduct(id);
    }

    @DeleteMapping(path = "product/{id}", produces = "application/json")
    public void removeProduct(@PathVariable("id") Product p) {
        productR.removeProduct(p);
    }
}
