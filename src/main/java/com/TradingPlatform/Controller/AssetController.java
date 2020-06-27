package com.TradingPlatform.Controller;
import com.TradingPlatform.Repository.AssetR;
import com.TradingPlatform.model.Asset;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class AssetController {

    @Autowired
    private AssetR assetR;

    @GetMapping(path = "assets", produces = "application/json")
    public List<Asset> getAssets(){
        return assetR.getAssets();
    }

    @PostMapping(path = "asset", consumes = "application/json")
    public void addAsset(@RequestBody Asset a) {
        assetR.addAsset(a);
    }

    @GetMapping(path = "asset/{id}", produces = "application/json")
    public Asset getAsset(@PathVariable("id") String id) {
        return assetR.getAsset(id);
    }

    @DeleteMapping(path = "asset/{id}", produces = "application/json")
    public void removeAsset(@PathVariable("id") Asset a) {
        assetR.removeAsset(a);
    }

}

