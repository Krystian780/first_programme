package com.TradingPlatform.model;
import lombok.*;

import java.util.Date;

    @Getter @Setter @ToString @AllArgsConstructor
    public class AbstractContent {
        String id;
        Date createDTime;
        Date lastUpdateTime;
    }
