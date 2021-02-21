package com.cheddarflow.model;

import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class CreatedMarketDataResponse<T extends Created> {

    private final Date returnFrom;
    private final Date returnTo;
    private final List<T> data;

    public CreatedMarketDataResponse(final List<T> data) {
        this.data = data.stream()
          .sorted(Comparator.comparing(Created::getCreatedOn).reversed())
          .collect(Collectors.toList());
        if (this.data.isEmpty()) {
            this.returnFrom = null;
            this.returnTo = null;
        } else {
            this.returnFrom = this.data.get(this.data.size() - 1).getCreatedOn();
            this.returnTo = this.data.get(0).getCreatedOn();
        }
    }

    public Date getReturnFrom() {
        return this.returnFrom;
    }

    public Date getReturnTo() {
        return this.returnTo;
    }

    public List<T> getData() {
        return this.data;
    }
}
