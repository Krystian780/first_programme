package com.TradingPlatform.Repository;
import com.TradingPlatform.model.Asset;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class AssetR {
    ArrayList<Asset> assets = new ArrayList<>();

    public ArrayList<Asset> getAssets() {
        return assets;
    }

    public void addAsset(Asset a) {
        boolean valid = true;
        for(Asset x: assets) {
            if(x.getId() == a.getId()){
                valid = false;
            }
        }
        if(valid){
            assets.add(a);
        }

    }

    public void removeAsset(Asset a){
        boolean valid = true;
        for(Asset x: assets) {
            if(x.getId() == a.getId()){
                valid = false;
            }
        }
        if(valid){
            assets.remove(a);
        }
    }

    public Asset getAsset(String id) {
        int index = assets.indexOf(new Asset(id));
        return (index != -1) ? assets.get(index) : null;
    }
}

