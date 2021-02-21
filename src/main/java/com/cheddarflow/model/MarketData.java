package com.cheddarflow.model;

import com.cheddarflow.util.DateUtils;

import java.util.Date;

public class MarketData implements SymbolSpecific {
    private int id;
    private String sentiment;
    private int size;
    private String symbol;
    private Date expiry;
    private double strike;
    private String type;
    private double price;
    private String optionType;
    private int side;
    private String exch;
    private Date timestamp;
    private int volume;
    private String condition;
    private Boolean thirdFriday;
    private double ivol;
    private double ivolChg;
    private double ivolChgPct;
    private double delta;
    private double deltaDollar;
    private double spot;
    private double spotChg;
    private double close;
    private double vega;
    private double vegaDollar;
    private double theta;
    private String events;
    private double bidPrice;
    private double bidSize;
    private double askPrice;
    private double askSize;
    private double notional;
    private int oi;
    private double nextDayOi;
    private double nextDayOiChg;
    private String sector;
    private String subsector;
    private Boolean otm;
    private String section;
    private String timeZone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSentiment() { return sentiment; }

    public void setSentiment(String sent) { sentiment = sent; }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPremium() {
        return size * 100 * price;
    }

    public String getPremiumString() {
        double p = getPremium();

        if (p >= 1000000) {
            return "$" +
                    ((int) (p / 1000000)) + "." +
                    ((int) ((p % 1000000) / 100000)) +
                    "M";
        } else if (p >= 1000) {
            return "$" + ((int) (p / 1000)) + "K";
        } else {
            return "$" + ((int) p);
        }
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Date getExpiry() {
        return expiry;
    }

    public void setExpiry(Date expiry) {
        this.expiry = expiry;
    }

    public String getExpiryString() {
        if (expiry == null) return null;
        return DateUtils.getInputDateFormat().format(expiry);
    }

    public double getStrike() {
        return strike;
    }

    public void setStrike(double strike) {
        this.strike = strike;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPriceString() {
        return "$" + this.getRoundedPrice();
    }

    public String getOptionType() { return optionType; }

    public void setOptionType(String type) { optionType = type; }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public String getExch() {
        return exch;
    }

    public void setExch(String exch) {
        this.exch = exch;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date date) {
        this.timestamp = date;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public Boolean getThirdFriday() { return thirdFriday; }

    public void setThirdFriday(Boolean thirdFriday) { this.thirdFriday = thirdFriday; }

    public double getIvol() {
        return ivol;
    }

    public void setIvol(double ivol) {
        this.ivol = ivol;
    }

    public double getIvolChgPct() {
        return ivolChgPct;
    }

    public void setIvolChgPct(double ivolChgPct) {
        this.ivolChgPct = ivolChgPct;
    }

    public double getIvolChg() {
        return ivolChg;
    }

    public void setIvolChg(double ivolChg) {
        this.ivolChg = ivolChg;
    }

    public double getDelta() {
        return delta;
    }

    public void setDelta(double delta) {
        this.delta = delta;
    }

    public double getDeltaDollar() {
        return deltaDollar;
    }

    public void setDeltaDollar(double deltaDollar) {
        this.deltaDollar = deltaDollar;
    }

    public double getSpot() {
        return spot;
    }

    public void setSpot(double spot) {
        this.spot = spot;
    }

    public double getSpotChg() {
        return spotChg;
    }

    public void setSpotChg(double spotChg) {
        this.spotChg = spotChg;
    }

    public double getClose() {
        return close;
    }

    public void setClose(double close) {
        this.close = close;
    }

    public double getVega() { return vega; }

    public void setVega(double vega) { this.vega = vega; }

    public double getVegaDollar() {
        return vegaDollar;
    }

    public void setVegaDollar(double vegaDollar) {
        this.vegaDollar = vegaDollar;
    }

    public double getTheta() { return theta; }

    public void setTheta(double theta) { this.theta = theta; }

    public String getEvents() {
        return events;
    }

    public void setEvents(String events) {
        this.events = events;
    }

    public double getBidPrice() {
        return bidPrice;
    }

    public void setBidPrice(double bidPrice) {
        this.bidPrice = bidPrice;
    }

    public double getBidSize() {
        return bidSize;
    }

    public void setBidSize(double bidSize) {
        this.bidSize = bidSize;
    }

    public double getAskPrice() {
        return askPrice;
    }

    public void setAskPrice(double askPrice) {
        this.askPrice = askPrice;
    }

    public double getAskSize() {
        return askSize;
    }

    public void setAskSize(double askSize) {
        this.askSize = askSize;
    }

    public double getNotional() {
        return notional;
    }

    public void setNotional(double notional) {
        this.notional = notional;
    }

    public double getOi() {
        return oi;
    }

    public void setOi(double oi) {
        this.oi = (int) oi;
    }

    public double getNextDayOi() {
        return nextDayOi;
    }

    public void setNextDayOi(double nextDayOi) {
        this.nextDayOi = nextDayOi;
    }

    public double getNextDayOiChg() {
        return nextDayOiChg;
    }

    public void setNextDayOiChg(double nextDayOiChg) {
        this.nextDayOiChg = nextDayOiChg;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getSubsector() {
        return subsector;
    }

    public void setSubsector(String subsector) {
        this.subsector = subsector;
    }

    public Boolean isOutOfMoney() { return otm; }

    public void setOutOfMoney(Boolean otm) { this.otm = otm; }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getTimeZone() {
        return this.timeZone;
    }
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getDateString() {
        return DateUtils.getInputDateFormat(this.timeZone).format(this.timestamp);
    }

    public String getTimeString() {
        return DateUtils.getTimeFormat(this.timeZone).format(this.timestamp);
    }

    public double getRoundedPrice() {
        final long rounded = Math.round((this.getPrice() * 1000d) / 10d);
        return rounded / 100d;
    }

    @Override
    public String toString() {
        return "MarketData{" +
          "id=" + id +
          ", sentiment='" + sentiment + '\'' +
          ", size=" + size +
          ", symbol='" + symbol + '\'' +
          ", expiry=" + expiry +
          ", strike=" + strike +
          ", type='" + type + '\'' +
          ", price=" + price +
          ", optionType='" + optionType + '\'' +
          ", side=" + side +
          ", exch='" + exch + '\'' +
          ", timestamp=" + timestamp +
          ", volume=" + volume +
          ", condition='" + condition + '\'' +
          ", thirdFriday=" + thirdFriday +
          ", ivol=" + ivol +
          ", ivolChg=" + ivolChg +
          ", ivolChgPct=" + ivolChgPct +
          ", delta=" + delta +
          ", deltaDollar=" + deltaDollar +
          ", spot=" + spot +
          ", spotChg=" + spotChg +
          ", close=" + close +
          ", vega=" + vega +
          ", vegaDollar=" + vegaDollar +
          ", theta=" + theta +
          ", events='" + events + '\'' +
          ", bidPrice=" + bidPrice +
          ", bidSize=" + bidSize +
          ", askPrice=" + askPrice +
          ", askSize=" + askSize +
          ", notional=" + notional +
          ", oi=" + oi +
          ", nextDayOi=" + nextDayOi +
          ", nextDayOiChg=" + nextDayOiChg +
          ", sector='" + sector + '\'' +
          ", subsector='" + subsector + '\'' +
          ", otm=" + otm +
          ", section='" + section + '\'' +
          ", timeZone=" + timeZone +
          '}';
    }
}
