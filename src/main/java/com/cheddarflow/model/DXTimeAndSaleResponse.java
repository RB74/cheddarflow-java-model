package com.cheddarflow.model;

import java.util.List;

public class DXTimeAndSaleResponse extends CreatedMarketDataResponse<DXTimeAndSaleDto> {

    public DXTimeAndSaleResponse(List<DXTimeAndSaleDto> data) {
        super(data);
    }
}
