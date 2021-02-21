package com.cheddarflow.model;

import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class MarketDataResponse {

    private final Date returnFrom;
    private final Date returnTo;
    private final int puts;
    private final int calls;
    private final List<MarketData> data;

    public MarketDataResponse(final List<MarketData> data, boolean aggregate) {
        this.data = data.stream()
          .sorted(Comparator.comparing(MarketData::getTimestamp).reversed())
          .collect(Collectors.toList());
        if (this.data.isEmpty()) {
            this.puts = 0;
            this.calls = 0;
            this.returnFrom = null;
            this.returnTo = null;
        } else {
            this.returnFrom = this.data.get(this.data.size() - 1).getTimestamp();
            this.returnTo = this.data.get(0).getTimestamp();
            if (aggregate) {
                this.puts = this.data.stream().filter(md -> "P".equals(md.getOptionType()) && md.getSide() > 0)
                  .mapToInt(MarketData::getSize)
                  .sum();
                this.calls = this.data.stream().filter(md -> "C".equals(md.getOptionType()) && md.getSide() > 0)
                  .mapToInt(MarketData::getSize)
                  .sum();
            } else {
                this.puts = 0;
                this.calls = 0;
            }
        }
    }

    public int getPuts() {
        return this.puts;
    }

    public int getCalls() {
        return this.calls;
    }

    public Date getReturnFrom() {
        return this.returnFrom;
    }

    public Date getReturnTo() {
        return this.returnTo;
    }

    public List<MarketData> getData() {
        return this.data;
    }
}
