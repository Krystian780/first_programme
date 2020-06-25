package com.TradingPlatform.model;
import lombok.*;

import java.util.Date;

    @Getter @Setter @ToString
    public class AbstractContent {
        String id;
        Date createDTime;
        Date lastUpdateTime;

        public AbstractContent(String id, Date createDTime, Date lastUpdateTime) {
            this.id = id;
            this.createDTime = createDTime;
            this.lastUpdateTime = lastUpdateTime;
        }

        public AbstractContent(String id) {
            this.id = id;
        }
    }
