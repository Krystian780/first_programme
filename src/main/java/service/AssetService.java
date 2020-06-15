package service;
import com.company.Asset;
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
        if (!assets.contains(a)) {
            assets.add(a);
        }
    }

    public void removeAsset(Asset a){
        if (!assets.contains(a)){
            assets.remove(a);
        }
    }

    public Asset getAssets(long id) {     // jeśli Asset ma 2 atrybuty swoje oraz 3 atrybuty od AbstractContent to jak mogę przeszukać tabelę po ID
        int index = assets.indexOf(new Asset(id));
        return (index != -1) ? assets.get(index) : null;
    }
}

