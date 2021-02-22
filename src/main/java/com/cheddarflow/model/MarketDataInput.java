package com.cheddarflow.model;

import java.util.Date;

public class MarketDataInput {
    public Date timestamp;
    public int tradeid;
    public String sentiment;
    public int size;
    public String symbol;
    public String expiry;
    public double strike;
    public String type;
    public double price;
    public String pc;
    public int side;
    public String exch;
    public int volume;
    public String condition;
    public boolean thirdfriday;
    public double ivol;
    public double ivolchg;
    public double ivolchgpct;
    public double delta;
    public double deltadollar;
    public double spot;
    public double spotchg;
//    public double close;
    public double vega;
    public double vegadollar;
    public double theta;
    public double bidprice;
    public double bidsize;
    public double askprice;
    public double asksize;
    public double notional;
    public int oi;
    public boolean otm;
    public String events;
    public String section;

    public double getRoundedPrice() {
        final long rounded = Math.round((this.price * 1000d) / 10d);
        return rounded / 100d;
    }

    public boolean isUnusual() {
        return this.ivol > 0.2d && this.oi > 0;
    }

    public boolean isHighlyUnusual() {
        return this.size >= 5000 && this.otm && !this.thirdfriday;
    }

    @Override
    public String toString() {
        return "MarketDataInput{" +
          "timestamp=" + timestamp +
          ", tradeid=" + tradeid +
          ", sentiment='" + sentiment + '\'' +
          ", size=" + size +
          ", symbol='" + symbol + '\'' +
          ", expiry='" + expiry + '\'' +
          ", strike=" + strike +
          ", type='" + type + '\'' +
          ", price=" + price +
          ", pc='" + pc + '\'' +
          ", side=" + side +
          ", exch='" + exch + '\'' +
          ", volume=" + volume +
          ", condition='" + condition + '\'' +
          ", thirdfriday=" + thirdfriday +
          ", ivol=" + ivol +
          ", ivolchg=" + ivolchg +
          ", ivolchgpct=" + ivolchgpct +
          ", delta=" + delta +
          ", deltadollar=" + deltadollar +
          ", spot=" + spot +
          ", spotchg=" + spotchg +
          ", vega=" + vega +
          ", vegadollar=" + vegadollar +
          ", theta=" + theta +
          ", bidprice=" + bidprice +
          ", bidsize=" + bidsize +
          ", askprice=" + askprice +
          ", asksize=" + asksize +
          ", notional=" + notional +
          ", oi=" + oi +
          ", otm=" + otm +
          ", unusual=" + isUnusual() +
          ", highlyunusual=" + isHighlyUnusual() +
          ", events='" + events + '\'' +
          ", section='" + section + '\'' +
          '}';
    }
}
