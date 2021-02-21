package com.cheddarflow.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import com.cheddarflow.util.CostFormatter;
import com.cheddarflow.util.DateUtils;
import com.cheddarflow.util.VolumeFormatter;

import java.util.Date;

public class DXTimeAndSale implements Created {

    private final long id;
    private final String symbol;
    private final long index;
    private final Date createdOn;
    private final Date receivedOn;
    private final double size;
    private final String exchangeCode;
    private final double price;
    private final double bidPrice;
    private final double askPrice;
    private final String exchangeSaleConditions;
    private final String aggressorSide;
    private final boolean spreadLeg;
    private final boolean extendedTradingHours;
    private final boolean validTick;
    private final String type;
    private final boolean lateSignature;
    private final String tradeThroughExempt;
    private final Integer signaturePrint;

    private String timeZone;

    private DXTimeAndSale(Builder builder) {
        id = builder.id;
        symbol = builder.symbol;
        index = builder.index;
        createdOn = builder.createdOn;
        receivedOn = builder.receivedOn;
        size = builder.size;
        exchangeCode = builder.exchangeCode;
        price = builder.price;
        bidPrice = builder.bidPrice;
        askPrice = builder.askPrice;
        exchangeSaleConditions = builder.exchangeSaleConditions;
        aggressorSide = builder.aggressorSide;
        spreadLeg = builder.spreadLeg;
        extendedTradingHours = builder.extendedTradingHours;
        validTick = builder.validTick;
        type = builder.type;
        lateSignature = builder.lateSignature;
        tradeThroughExempt = builder.tradeThroughExempt;
        signaturePrint = builder.signaturePrint;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getDataset() {
        return "dark_pool";
    }

    public long getId() {
        return this.id;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public long getIndex() {
        return this.index;
    }

    @Override
    @JsonProperty("createdAt")
    public Date getCreatedOn() {
        return this.createdOn;
    }

    public double getSize() {
        return this.size;
    }

    public String getExchangeCode() {
        return this.exchangeCode;
    }

    public double getPrice() {
        return this.price;
    }

    public double getRoundedPrice() {
        final long rounded = Math.round((this.getPrice() * 1000d) / 10d);
        return rounded / 100d;
    }

    public double getBidPrice() {
        return this.bidPrice;
    }

    public double getAskPrice() {
        return this.askPrice;
    }

    public String getExchangeSaleConditions() {
        return this.exchangeSaleConditions;
    }

    public String getAggressorSide() {
        return this.aggressorSide;
    }

    public boolean isSpreadLeg() {
        return this.spreadLeg;
    }

    public boolean isExtendedTradingHours() {
        return this.extendedTradingHours;
    }

    public boolean isValidTick() {
        return this.validTick;
    }

    public String getType() {
        return this.type;
    }

    public Date getReceivedOn() {
        return this.receivedOn;
    }

    public String getTimeZone() {
        return this.timeZone;
    }
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public boolean isLateSignature() {
        return this.lateSignature;
    }

    public String getTradeThroughExempt() {
        return this.tradeThroughExempt;
    }

    public Integer getSignaturePrint() {
        return this.signaturePrint;
    }

    public String getDateString() {
        return DateUtils.getInputDateFormat(this.timeZone).format(this.receivedOn);
    }

    public String getTimeString() {
        return DateUtils.getTimeFormat(this.timeZone).format(this.receivedOn);
    }

    public String getVolumeFormatted() {
        return new VolumeFormatter(true).apply((int)this.getSize());
    }

    public double getTotalShareCost() {
        return this.getPrice() * this.getSize();
    }

    public String getTotalShareCostFormatted() {
        return new CostFormatter(true).apply(this.getTotalShareCost(), "$");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DXTimeAndSale that = (DXTimeAndSale)o;

        if (id != that.id) return false;
        if (index != that.index) return false;
        return symbol.equals(that.symbol);
    }

    @Override
    public int hashCode() {
        int result = (int)(id ^ (id >>> 32));
        result = 31 * result + symbol.hashCode();
        result = 31 * result + (int)(index ^ (index >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "DXTimeAndSale{" +
          "id=" + id +
          ", symbol='" + symbol + '\'' +
          ", index=" + index +
          ", createdOn=" + createdOn +
          ", receivedOn=" + receivedOn +
          ", size=" + size +
          ", exchangeCode='" + exchangeCode + '\'' +
          ", price=" + price +
          ", bidPrice=" + bidPrice +
          ", askPrice=" + askPrice +
          ", exchangeSaleConditions='" + exchangeSaleConditions + '\'' +
          ", aggressorSide='" + aggressorSide + '\'' +
          ", spreadLeg=" + spreadLeg +
          ", extendedTradingHours=" + extendedTradingHours +
          ", validTick=" + validTick +
          ", timeZone=" + timeZone +
          ", type='" + type + '\'' +
          ", lateSignature=" + lateSignature +
          ", tradeThroughExempt=" + tradeThroughExempt +
          ", signaturePrint=" + signaturePrint +
          '}';
    }

    public static final class Builder {

        private long id;
        private String symbol;
        private long index;
        private Date createdOn;
        private Date receivedOn;
        private double size;
        private String exchangeCode;
        private double price;
        private double bidPrice;
        private double askPrice;
        private String exchangeSaleConditions;
        private String aggressorSide;
        private boolean spreadLeg;
        private boolean extendedTradingHours;
        private boolean validTick;
        private String type;
        private boolean lateSignature;
        private String tradeThroughExempt;
        private Integer signaturePrint;

        private Builder() {
        }

        public Builder withId(long val) {
            id = val;
            return this;
        }

        public Builder withSymbol(String val) {
            symbol = val;
            return this;
        }

        public Builder withIndex(long val) {
            index = val;
            return this;
        }

        public Builder withCreatedOn(Date val) {
            createdOn = val;
            return this;
        }

        public Builder withReceivedOn(Date val) {
            receivedOn = val;
            return this;
        }

        public Builder withSize(double val) {
            size = val;
            return this;
        }

        public Builder withExchangeCode(String val) {
            exchangeCode = val;
            return this;
        }

        public Builder withPrice(double val) {
            price = val;
            return this;
        }

        public Builder withBidPrice(double val) {
            bidPrice = val;
            return this;
        }

        public Builder withAskPrice(double val) {
            askPrice = val;
            return this;
        }

        public Builder withExchangeSaleConditions(String val) {
            exchangeSaleConditions = val;
            return this;
        }

        public Builder withAggressorSide(String val) {
            aggressorSide = val;
            return this;
        }

        public Builder withSpreadLeg(boolean val) {
            spreadLeg = val;
            return this;
        }

        public Builder withExtendedTradingHours(boolean val) {
            extendedTradingHours = val;
            return this;
        }

        public Builder withValidTick(boolean val) {
            validTick = val;
            return this;
        }

        public Builder withType(String val) {
            type = val;
            return this;
        }

        public Builder withLateSignature(boolean val) {
            this.lateSignature = val;
            return this;
        }

        public Builder withTradeThroughExempt(String val) {
            this.tradeThroughExempt = val;
            return this;
        }

        public Builder withSignaturePrint(Integer val) {
            this.signaturePrint = val;
            return this;
        }

        public DXTimeAndSale build() {
            return new DXTimeAndSale(this);
        }
    }
}
