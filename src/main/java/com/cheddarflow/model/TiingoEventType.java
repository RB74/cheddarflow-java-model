package com.cheddarflow.model;

import java.util.stream.Stream;

public enum TiingoEventType {

    LAST_TRADE('T'), TOP_OF_BOOK('Q'), TRADE_BREAK('B');

    private final char messageType;

    TiingoEventType(char messageType) {
        this.messageType = messageType;
    }

    public static TiingoEventType fromMessageType(char type) {
        return Stream.of(values()).filter(t -> t.messageType == type).findFirst().orElse(null);
    }
}
