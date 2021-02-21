package com.cheddarflow.model;

public class SentimentUtilities {
    public static Sentiment computeSentiment(MarketDataInput in) {
        OptionType opt = OptionType.forString(in.pc);

        if (opt == OptionType.CALL) {
            if (in.side >= 2) {
                return Sentiment.BULLISH;
            } else if (in.side <= -2) {
                return Sentiment.BEARISH;
            } else {
                return null;
            }
        } else if (opt == OptionType.PUT) {
            if (in.side >= 2) {
                return Sentiment.BEARISH;
            } else if (in.side <= -2) {
                return Sentiment.BULLISH;
            } else {
                return null;
            }
        } else {
            return null;
        }
    }
}
