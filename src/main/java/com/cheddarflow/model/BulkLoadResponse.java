package com.cheddarflow.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@JsonSerialize
public class BulkLoadResponse {

    private final List<TiingoIEXEvent> data;

    public BulkLoadResponse(List<TiingoIEXEvent> data) {
        this.data = data.stream().sorted(Comparator.comparing(TiingoIEXEvent::getCreatedOn)).collect(Collectors.toList());
    }

    public String getMessageType() {
        return "L";
    }

    public String getService() {
        return "cheddarflow-tiingo-proxy";
    }

    public List<TiingoIEXEvent> getData() {
        return this.data;
    }
}
