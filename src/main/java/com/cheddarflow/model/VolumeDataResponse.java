package com.cheddarflow.model;

import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class VolumeDataResponse {

    private final Date returnFrom;
    private final Date returnTo;
    private final List<VolumeData> data;

    public VolumeDataResponse(final List<VolumeData> data) {
        this.data = data.stream()
          .sorted(Comparator.comparing(VolumeData::getDate).reversed())
          .collect(Collectors.toList());
        if (this.data.isEmpty()) {
            this.returnFrom = null;
            this.returnTo = null;
        } else {
            this.returnFrom = this.data.get(this.data.size() - 1).getDate();
            this.returnTo = this.data.get(0).getDate();
        }
    }

    public Date getReturnFrom() {
        return this.returnFrom;
    }

    public Date getReturnTo() {
        return this.returnTo;
    }

    public List<VolumeData> getData() {
        return this.data;
    }
}
