package com.cheddarflow.model;

import java.util.Date;

public class TiingoIEXEvent implements Created, SymbolSpecific {

    private final long id;
    private final String symbol;
    private final TiingoEventType tiingoEventType;
    private final Date createdOn;
    private final Integer bidSize;
    private final Float bidPrice;
    private final Float midPrice;
    private final Float askPrice;
    private final Integer askSize;
    private final Float lastPrice;
    private final Integer lastSize;
    private final boolean halted;
    private final boolean afterHours;
    private final boolean intermarketSweepOrder;
    private final boolean oddLot;
    private final boolean subjectToNMSRule611;

    private TiingoIEXEvent(TiingoIEXEventBuilder builder) {
        this.bidPrice = builder.bidPrice;
        this.bidSize = builder.bidSize;
        this.oddLot = builder.oddLot;
        this.id = builder.id;
        this.tiingoEventType = builder.tiingoEventType;
        this.subjectToNMSRule611 = builder.subjectToNMSRule611;
        this.askSize = builder.askSize;
        this.askPrice = builder.askPrice;
        this.symbol = builder.symbol;
        this.halted = builder.halted;
        this.lastSize = builder.lastSize;
        this.midPrice = builder.midPrice;
        this.intermarketSweepOrder = builder.intermarketSweepOrder;
        this.createdOn = builder.createdOn;
        this.afterHours = builder.afterHours;
        this.lastPrice = builder.lastPrice;
    }

    public long getId() {
        return this.id;
    }

    @Override
    public String getSymbol() {
        return this.symbol;
    }

    public TiingoEventType getTiingoEventType() {
        return this.tiingoEventType;
    }

    @Override
    public Date getCreatedOn() {
        return this.createdOn;
    }

    public Integer getBidSize() {
        return this.bidSize;
    }

    public Float getBidPrice() {
        return this.bidPrice;
    }

    public Float getMidPrice() {
        return this.midPrice;
    }

    public Float getAskPrice() {
        return this.askPrice;
    }

    public Integer getAskSize() {
        return this.askSize;
    }

    public Float getLastPrice() {
        return this.lastPrice;
    }

    public Integer getLastSize() {
        return this.lastSize;
    }

    public boolean isHalted() {
        return this.halted;
    }

    public boolean isAfterHours() {
        return this.afterHours;
    }

    public boolean isIntermarketSweepOrder() {
        return this.intermarketSweepOrder;
    }

    public boolean isOddLot() {
        return this.oddLot;
    }

    public boolean isSubjectToNMSRule611() {
        return this.subjectToNMSRule611;
    }

    public static TiingoIEXEventBuilder newBuilder() {
        return new TiingoIEXEventBuilder();
    }

    public static final class TiingoIEXEventBuilder {

        private long id;
        private String symbol;
        private TiingoEventType tiingoEventType;
        private Date createdOn;
        private Integer bidSize;
        private Float bidPrice;
        private Float midPrice;
        private Float askPrice;
        private Integer askSize;
        private Float lastPrice;
        private Integer lastSize;
        private boolean halted;
        private boolean afterHours;
        private boolean intermarketSweepOrder;
        private boolean oddLot;
        private boolean subjectToNMSRule611;

        private TiingoIEXEventBuilder() {
        }

        public TiingoIEXEventBuilder withId(long id) {
            this.id = id;
            return this;
        }

        public TiingoIEXEventBuilder withSymbol(String symbol) {
            this.symbol = symbol;
            return this;
        }

        public TiingoIEXEventBuilder withTiingoEventType(TiingoEventType tiingoEventType) {
            this.tiingoEventType = tiingoEventType;
            return this;
        }

        public TiingoIEXEventBuilder withCreatedOn(Date createdOn) {
            this.createdOn = createdOn;
            return this;
        }

        public TiingoIEXEventBuilder withBidSize(Integer bidSize) {
            this.bidSize = bidSize;
            return this;
        }

        public TiingoIEXEventBuilder withBidPrice(Float bidPrice) {
            this.bidPrice = bidPrice;
            return this;
        }

        public TiingoIEXEventBuilder withMidPrice(Float midPrice) {
            this.midPrice = midPrice;
            return this;
        }

        public TiingoIEXEventBuilder withAskPrice(Float askPrice) {
            this.askPrice = askPrice;
            return this;
        }

        public TiingoIEXEventBuilder withAskSize(Integer askSize) {
            this.askSize = askSize;
            return this;
        }

        public TiingoIEXEventBuilder withLastPrice(Float lastPrice) {
            this.lastPrice = lastPrice;
            return this;
        }

        public TiingoIEXEventBuilder withLastSize(Integer lastSize) {
            this.lastSize = lastSize;
            return this;
        }

        public TiingoIEXEventBuilder withHalted(boolean halted) {
            this.halted = halted;
            return this;
        }

        public TiingoIEXEventBuilder withAfterHours(boolean afterHours) {
            this.afterHours = afterHours;
            return this;
        }

        public TiingoIEXEventBuilder withIntermarketSweepOrder(boolean intermarketSweepOrder) {
            this.intermarketSweepOrder = intermarketSweepOrder;
            return this;
        }

        public TiingoIEXEventBuilder withOddLot(boolean oddLot) {
            this.oddLot = oddLot;
            return this;
        }

        public TiingoIEXEventBuilder withSubjectToNMSRule611(boolean subjectToNMSRule611) {
            this.subjectToNMSRule611 = subjectToNMSRule611;
            return this;
        }

        public TiingoIEXEvent build() {
            return new TiingoIEXEvent(this);
        }
    }
}
