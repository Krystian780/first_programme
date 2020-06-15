package service;
import com.company.Asset;
import com.company.Product;
import org.springframework.stereotype.Service;
import java.util.ArrayList;


@Service
public class ProductService {

        ArrayList<Product> products = new ArrayList<>();
        int id = 0;


        public ArrayList<Product> getProducts() {
            return products;
        }

        public int genereateId() {
            return id++;
        }


        public void addProduct(Product p) {
            if (!products.contains(p)) {
                products.add(p);
            }
        }

        public void removeProduct(Product p){
            if (!products.contains(p)){
                products.remove(p);
            }
        }

        public Asset getProducts(long id) {     // jeśli Asset ma 2 atrybuty swoje oraz 3 atrybuty od AbstractContent to jak mogę przeszukać tabelę po ID
            int index = products.indexOf(new Asset(id));
            return (index != -1) ? products.get(index) : null;
        }
    }
}
