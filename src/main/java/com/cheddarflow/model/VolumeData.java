package com.cheddarflow.model;

import com.cheddarflow.util.DateUtils;

import java.util.Date;

public class VolumeData implements SymbolSpecific {
    private int id;
    private String symbol;
    private Date date;
    private int optionVolume;
    private int puts;
    private int calls;
    private double pctAdv;
    private double twPctAdv;
    private int adv;
    private int optionOpenInt;
    private double volumeOiPct;
    private String comments;
    private double spot;
    private double spotChg;
    private double bullishPct;
    private double neutralPct;
    private double bearishPct;
    private double putBidPct;
    private double putMidPct;
    private double putAskPct;
    private double callBidPct;
    private double callMidPct;
    private double callAskPct;
    private double atmIvol;
    private double atmIvolChg;
    private int oiPuts;
    private int oiCalls;
    private int avgTotalPuts;
    private int avgTotalCalls;
    private double timeWeight;
    private double volume;
    private double avgVolume;
    private double close;
    private double chg;
    private double atm1;
    private double atm2;
    private int oiPutsChg;
    private int oiCallsChg;
    private int putTrades;
    private int callTrades;
    private double putPrem;
    private double callPrem;
    private double bullishCPrem;
    private double bearishCPrem;
    private double bearishPPrem;
    private double bullishPPrem;
    private double netDelta;
    private double netVega;
    private double bullishOnAsk;
    private double bearishOnAsk;
    private double volatility20Day;
    private double volatility60Day;
    private double volatility120Day;
    private double splitAdjClose;
    private double splitAdjMult;
    private int amex;
    private int arca;
    private int bxo;
    private int bzx;
    private int box;
    private int cboe;
    private int c2;
    private int edgx;
    private int gem;
    private int ise;
    private int merc;
    private int miax;
    private int nom;
    private int pearl;
    private int phlx;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDateString() {
        if (date == null) return null;
        return DateUtils.getInputDateFormat().format(date);
    }

    public boolean similarTo(VolumeData d) {
        if (!getSymbol().equals(d.getSymbol())) return false;
        if (!getDate().equals(d.getDate())) return false;
        if (getOptionVolume() != d.getOptionVolume()) return false;
        if (getPuts() != d.getPuts()) return false;
        if (getCalls() != d.getCalls()) return false;
        if (!NumberUtilities.compareDoubles(getAvgVolume(), d.getAvgVolume())) return false;
        if (getOptionOpenInt() != d.getOptionOpenInt()) return false;
        if (!getComments().equals(d.getComments())) return false;
        if (!NumberUtilities.compareDoubles(getSpot(), d.getSpot())) return false;
        if (!NumberUtilities.compareDoubles(getSpotChg(), d.getSpotChg())) return false;
        if (!NumberUtilities.compareDoubles(getBullishPct(), d.getBullishPct())) return false;
        if (!NumberUtilities.compareDoubles(getBearishPct(), d.getBearishPct())) return false;
        if (!NumberUtilities.compareDoubles(getPutBidPct(), d.getPutBidPct())) return false;
        if (!NumberUtilities.compareDoubles(getPutMidPct(), d.getPutMidPct())) return false;
        if (!NumberUtilities.compareDoubles(getPutAskPct(), d.getPutAskPct())) return false;
        if (!NumberUtilities.compareDoubles(getCallBidPct(), d.getCallBidPct())) return false;
        if (!NumberUtilities.compareDoubles(getCallMidPct(), d.getCallMidPct())) return false;
        if (!NumberUtilities.compareDoubles(getCallAskPct(), d.getCallAskPct())) return false;
        if (!NumberUtilities.compareDoubles(getVolatility20Day(), d.getVolatility20Day())) return false;
        if (!NumberUtilities.compareDoubles(getVolatility60Day(), d.getVolatility60Day())) return false;
        return NumberUtilities.compareDoubles(getVolatility120Day(), d.getVolatility120Day());
    }

    public int getOptionVolume() {
        return optionVolume;
    }

    public void setOptionVolume(int optionVolume) {
        this.optionVolume = optionVolume;
    }

    public int getPuts() {
        return puts;
    }

    public void setPuts(int puts) {
        this.puts = puts;
    }

    public int getCalls() {
        return calls;
    }

    public void setCalls(int calls) {
        this.calls = calls;
    }

    public double getPctAdv() {
        return pctAdv;
    }

    public void setPctAdv(double pctAdv) {
        this.pctAdv = pctAdv;
    }

    public double getTwPctAdv() {
        return twPctAdv;
    }

    public void setTwPctAdv(double twPctAdv) {
        this.twPctAdv = twPctAdv;
    }

    public int getAdv() {
        return adv;
    }

    public void setAdv(int adv) {
        this.adv = adv;
    }

    public int getOptionOpenInt() {
        return optionOpenInt;
    }

    public void setOptionOpenInt(int optionOpenInt) {
        this.optionOpenInt = optionOpenInt;
    }

    public double getVolumeOiPct() {
        return volumeOiPct;
    }

    public void setVolumeOiPct(double volumeOiPct) {
        this.volumeOiPct = volumeOiPct;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
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

    public double getBullishPct() {
        return bullishPct;
    }

    public void setBullishPct(double bullishPct) {
        this.bullishPct = bullishPct;
    }

    public double getNeutralPct() {
        return neutralPct;
    }

    public void setNeutralPct(double neutralPct) {
        this.neutralPct = neutralPct;
    }

    public double getBearishPct() {
        return bearishPct;
    }

    public void setBearishPct(double bearishPct) {
        this.bearishPct = bearishPct;
    }

    public double getPutBidPct() {
        return putBidPct;
    }

    public void setPutBidPct(double putBidPct) {
        this.putBidPct = putBidPct;
    }

    public double getPutMidPct() {
        return putMidPct;
    }

    public void setPutMidPct(double putMidPct) {
        this.putMidPct = putMidPct;
    }

    public double getPutAskPct() {
        return putAskPct;
    }

    public void setPutAskPct(double putAskPct) {
        this.putAskPct = putAskPct;
    }

    public double getCallBidPct() {
        return callBidPct;
    }

    public void setCallBidPct(double callBidPct) {
        this.callBidPct = callBidPct;
    }

    public double getCallMidPct() {
        return callMidPct;
    }

    public void setCallMidPct(double callMidPct) {
        this.callMidPct = callMidPct;
    }

    public double getCallAskPct() {
        return callAskPct;
    }

    public void setCallAskPct(double callAskPct) {
        this.callAskPct = callAskPct;
    }

    public double getAtmIvol() {
        return atmIvol;
    }

    public void setAtmIvol(double atmIvol) {
        this.atmIvol = atmIvol;
    }

    public double getAtmIvolChg() {
        return atmIvolChg;
    }

    public void setAtmIvolChg(double atmIvolChg) {
        this.atmIvolChg = atmIvolChg;
    }

    public int getOiPuts() {
        return oiPuts;
    }

    public void setOiPuts(int oiPuts) {
        this.oiPuts = oiPuts;
    }

    public int getOiCalls() {
        return oiCalls;
    }

    public void setOiCalls(int oiCalls) {
        this.oiCalls = oiCalls;
    }

    public int getAvgTotalPuts() {
        return avgTotalPuts;
    }

    public void setAvgTotalPuts(int avgTotalPuts) {
        this.avgTotalPuts = avgTotalPuts;
    }

    public int getAvgTotalCalls() {
        return avgTotalCalls;
    }

    public void setAvgTotalCalls(int avgTotalCalls) {
        this.avgTotalCalls = avgTotalCalls;
    }

    public double getTimeWeight() {
        return timeWeight;
    }

    public void setTimeWeight(double timeWeight) {
        this.timeWeight = timeWeight;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getAvgVolume() {
        return avgVolume;
    }

    public void setAvgVolume(double avgVolume) {
        this.avgVolume = avgVolume;
    }

    public double getClose() {
        return close;
    }

    public void setClose(double close) {
        this.close = close;
    }

    public double getChg() {
        return chg;
    }

    public void setChg(double chg) {
        this.chg = chg;
    }

    public double getAtm1() {
        return atm1;
    }

    public void setAtm1(double atm1) {
        this.atm1 = atm1;
    }

    public double getAtm2() {
        return atm2;
    }

    public void setAtm2(double atm2) {
        this.atm2 = atm2;
    }

    public int getOiPutsChg() {
        return oiPutsChg;
    }

    public void setOiPutsChg(int oiPutsChg) {
        this.oiPutsChg = oiPutsChg;
    }

    public int getOiCallsChg() {
        return oiCallsChg;
    }

    public void setOiCallsChg(int oiCallsChg) {
        this.oiCallsChg = oiCallsChg;
    }

    public int getPutTrades() {
        return putTrades;
    }

    public void setPutTrades(int putTrades) {
        this.putTrades = putTrades;
    }

    public int getCallTrades() {
        return callTrades;
    }

    public void setCallTrades(int callTrades) {
        this.callTrades = callTrades;
    }

    public double getPutPrem() {
        return putPrem;
    }

    public void setPutPrem(double putPrem) {
        this.putPrem = putPrem;
    }

    public double getCallPrem() {
        return callPrem;
    }

    public void setCallPrem(double callPrem) {
        this.callPrem = callPrem;
    }

    public double getBullishCPrem() {
        return bullishCPrem;
    }

    public void setBullishCPrem(double bullishCPrem) {
        this.bullishCPrem = bullishCPrem;
    }

    public double getBearishCPrem() {
        return bearishCPrem;
    }

    public void setBearishCPrem(double bearishCPrem) {
        this.bearishCPrem = bearishCPrem;
    }

    public double getBearishPPrem() {
        return bearishPPrem;
    }

    public void setBearishPPrem(double bearishPPrem) {
        this.bearishPPrem = bearishPPrem;
    }

    public double getBullishPPrem() {
        return bullishPPrem;
    }

    public void setBullishPPrem(double bullishPPrem) {
        this.bullishPPrem = bullishPPrem;
    }

    public double getNetDelta() {
        return netDelta;
    }

    public void setNetDelta(double netDelta) {
        this.netDelta = netDelta;
    }

    public double getNetVega() {
        return netVega;
    }

    public void setNetVega(double netVega) {
        this.netVega = netVega;
    }

    public double getBullishOnAsk() {
        return bullishOnAsk;
    }

    public void setBullishOnAsk(double bullishOnAsk) {
        this.bullishOnAsk = bullishOnAsk;
    }

    public double getBearishOnAsk() {
        return bearishOnAsk;
    }

    public void setBearishOnAsk(double bearishOnAsk) {
        this.bearishOnAsk = bearishOnAsk;
    }

    public double getVolatility20Day() {
        return volatility20Day;
    }

    public void setVolatility20Day(double volatility20Day) {
        this.volatility20Day = volatility20Day;
    }

    public double getVolatility60Day() {
        return volatility60Day;
    }

    public void setVolatility60Day(double volatility60Day) {
        this.volatility60Day = volatility60Day;
    }

    public double getVolatility120Day() {
        return volatility120Day;
    }

    public void setVolatility120Day(double volatility120Day) {
        this.volatility120Day = volatility120Day;
    }

    public double getSplitAdjClose() {
        return splitAdjClose;
    }

    public void setSplitAdjClose(double splitAdjClose) {
        this.splitAdjClose = splitAdjClose;
    }

    public double getSplitAdjMult() {
        return splitAdjMult;
    }

    public void setSplitAdjMult(double splitAdjMult) {
        this.splitAdjMult = splitAdjMult;
    }

    public int getAmex() {
        return amex;
    }

    public void setAmex(int amex) {
        this.amex = amex;
    }

    public int getArca() {
        return arca;
    }

    public void setArca(int arca) {
        this.arca = arca;
    }

    public int getBxo() {
        return bxo;
    }

    public void setBxo(int bxo) {
        this.bxo = bxo;
    }

    public int getBzx() {
        return bzx;
    }

    public void setBzx(int bzx) {
        this.bzx = bzx;
    }

    public int getBox() {
        return box;
    }

    public void setBox(int box) {
        this.box = box;
    }

    public int getCboe() {
        return cboe;
    }

    public void setCboe(int cboe) {
        this.cboe = cboe;
    }

    public int getC2() {
        return c2;
    }

    public void setC2(int c2) {
        this.c2 = c2;
    }

    public int getEdgx() {
        return edgx;
    }

    public void setEdgx(int edgx) {
        this.edgx = edgx;
    }

    public int getGem() {
        return gem;
    }

    public void setGem(int gem) {
        this.gem = gem;
    }

    public int getIse() {
        return ise;
    }

    public void setIse(int ise) {
        this.ise = ise;
    }

    public int getMerc() {
        return merc;
    }

    public void setMerc(int merc) {
        this.merc = merc;
    }

    public int getMiax() {
        return miax;
    }

    public void setMiax(int miax) {
        this.miax = miax;
    }

    public int getNom() {
        return nom;
    }

    public void setNom(int nom) {
        this.nom = nom;
    }

    public int getPearl() {
        return pearl;
    }

    public void setPearl(int pearl) {
        this.pearl = pearl;
    }

    public int getPhlx() {
        return phlx;
    }

    public void setPhlx(int phlx) {
        this.phlx = phlx;
    }

    @Override
    public String toString() {
        return "VolumeData{" +
          "id=" + id +
          ", symbol='" + symbol + '\'' +
          ", date=" + date +
          ", optionVolume=" + optionVolume +
          ", puts=" + puts +
          ", calls=" + calls +
          ", pctAdv=" + pctAdv +
          ", twPctAdv=" + twPctAdv +
          ", adv=" + adv +
          ", optionOpenInt=" + optionOpenInt +
          ", volumeOiPct=" + volumeOiPct +
          ", comments='" + comments + '\'' +
          ", spot=" + spot +
          ", spotChg=" + spotChg +
          ", bullishPct=" + bullishPct +
          ", neutralPct=" + neutralPct +
          ", bearishPct=" + bearishPct +
          ", putBidPct=" + putBidPct +
          ", putMidPct=" + putMidPct +
          ", putAskPct=" + putAskPct +
          ", callBidPct=" + callBidPct +
          ", callMidPct=" + callMidPct +
          ", callAskPct=" + callAskPct +
          ", atmIvol=" + atmIvol +
          ", atmIvolChg=" + atmIvolChg +
          ", oiPuts=" + oiPuts +
          ", oiCalls=" + oiCalls +
          ", avgTotalPuts=" + avgTotalPuts +
          ", avgTotalCalls=" + avgTotalCalls +
          ", timeWeight=" + timeWeight +
          ", volume=" + volume +
          ", avgVolume=" + avgVolume +
          ", close=" + close +
          ", chg=" + chg +
          ", atm1=" + atm1 +
          ", atm2=" + atm2 +
          ", oiPutsChg=" + oiPutsChg +
          ", oiCallsChg=" + oiCallsChg +
          ", putTrades=" + putTrades +
          ", callTrades=" + callTrades +
          ", putPrem=" + putPrem +
          ", callPrem=" + callPrem +
          ", bullishCPrem=" + bullishCPrem +
          ", bearishCPrem=" + bearishCPrem +
          ", bearishPPrem=" + bearishPPrem +
          ", bullishPPrem=" + bullishPPrem +
          ", netDelta=" + netDelta +
          ", netVega=" + netVega +
          ", bullishOnAsk=" + bullishOnAsk +
          ", bearishOnAsk=" + bearishOnAsk +
          ", volatility20Day=" + volatility20Day +
          ", volatility60Day=" + volatility60Day +
          ", volatility120Day=" + volatility120Day +
          ", splitAdjClose=" + splitAdjClose +
          ", splitAdjMult=" + splitAdjMult +
          ", amex=" + amex +
          ", arca=" + arca +
          ", bxo=" + bxo +
          ", bzx=" + bzx +
          ", box=" + box +
          ", cboe=" + cboe +
          ", c2=" + c2 +
          ", edgx=" + edgx +
          ", gem=" + gem +
          ", ise=" + ise +
          ", merc=" + merc +
          ", miax=" + miax +
          ", nom=" + nom +
          ", pearl=" + pearl +
          ", phlx=" + phlx +
          '}';
    }
}
