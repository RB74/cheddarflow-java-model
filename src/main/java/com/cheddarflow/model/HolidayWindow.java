package com.cheddarflow.model;

import java.util.Date;

/**
 * This class represents 'market closed' holiday time windows
 */
public class HolidayWindow {
    private long id;
    private String name;
    private Date year;
    private Date startTime;
    private Date endTime;

    private HolidayWindow(Builder builder) {
        id = builder.id;
        name = builder.name;
        year = builder.year;
        startTime = builder.startTime;
        endTime = builder.endTime;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static final class Builder {
        private long id;
        private String name;
        private Date year;
        private Date startTime;
        private Date endTime;

        private Builder() {
        }

        public Builder withId(long val) {
            id = val;
            return this;
        }

        public Builder withName(String val) {
            name = val;
            return this;
        }

        public Builder withYear(Date val) {
            year = val;
            return this;
        }

        public Builder withStartTime(Date val) {
            startTime = val;
            return this;
        }

        public Builder withEndTime(Date val) {
            endTime = val;
            return this;
        }

        public HolidayWindow build() {
            return new HolidayWindow(this);
        }
    }
}
