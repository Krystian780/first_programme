package com.company;
import java.util.Date;
public class AbstractContent {
    String id;  // String ?
    Date createDTime;
    Date lastUpdateTime;

    public AbstractContent(String id, Date createDTime, Date lastUpdateTime) { //how many constructors ?
        this.id = id;
        this.createDTime = createDTime;
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getId() {
        return id;
    }

    public Date getCreateDTime() {
        return createDTime;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    @Override
    public String toString() {
        return "AbstractContent{" +
                "id='" + id + '\'' +
                ", createDTime=" + createDTime +
                ", lastUpdateTime=" + lastUpdateTime +
                '}';
    }
}
