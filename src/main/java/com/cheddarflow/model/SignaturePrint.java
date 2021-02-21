package com.cheddarflow.model;

import java.util.Date;

public class SignaturePrint {

    private final Date date;
    private final String symbol;
    private final int occurrence;

    public SignaturePrint(Date date, String symbol, int occurrence) {
        this.date = date;
        this.symbol = symbol;
        this.occurrence = occurrence;
    }

    private SignaturePrint(Builder builder) {
        date = builder.date;
        symbol = builder.symbol;
        occurrence = builder.occurrence;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(SignaturePrint copy) {
        Builder builder = new Builder();
        builder.date = copy.getDate();
        builder.symbol = copy.getSymbol();
        builder.occurrence = copy.getOccurrence();
        return builder;
    }

    public Date getDate() {
        return this.date;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public int getOccurrence() {
        return this.occurrence;
    }


    public static final class Builder {
        private Date date;
        private String symbol;
        private int occurrence;

        private Builder() {
        }

        public Builder withDate(Date date) {
            this.date = date;
            return this;
        }

        public Builder withSymbol(String symbol) {
            this.symbol = symbol;
            return this;
        }

        public Builder withOccurrence(int occurrence) {
            this.occurrence = occurrence;
            return this;
        }

        public SignaturePrint build() {
            return new SignaturePrint(this);
        }
    }
}
