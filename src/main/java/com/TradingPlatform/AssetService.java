package com.TradingPlatform;
import com.TradingPlatform.model.Asset;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class AssetService {
    ArrayList<Asset> assets = new ArrayList<>();
    int id = 0;


    public ArrayList<Asset> getProducts() {
        return assets;
    }

    public int genereateId() {
        return id++;
    }


    public void addAsset(Asset a) {
        for(Asset id: assets){
            if(!assets.contains(id)){
                assets.add(a);
            }
        }

    }

    public void removeAsset(Asset a){
        for(Asset id: assets) {
            if (!assets.contains(a)) {
                assets.remove(a);
            }
        }
    }

    public Asset getAssets(String id) {
        int index = assets.indexOf(new Asset(id));
        return (index != -1) ? assets.get(index) : null;
    }
}

