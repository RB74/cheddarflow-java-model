package com.cheddarflow.model;

import java.util.Date;

public class LatestDataTimestamps {

    private Date options;
    private Date darkPool;

    public Date getOptions() {
        return this.options;
    }
    public void setOptions(Date options) {
        this.options = options;
    }

    public Date getDarkPool() {
        return this.darkPool;
    }
    public void setDarkPool(Date darkPool) {
        this.darkPool = darkPool;
    }
}
