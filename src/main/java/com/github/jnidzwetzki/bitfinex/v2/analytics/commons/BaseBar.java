package com.github.jnidzwetzki.bitfinex.v2.analytics.commons;

import java.time.Duration;
import java.time.ZonedDateTime;

public class BaseBar
{
    private static final long serialVersionUID = 8038383777467488147L;
    /** Time period (e.g. 1 day, 15 min, etc.) of the bar */
    private Duration timePeriod;
    /** End time of the bar */
    private ZonedDateTime endTime;
    /** Begin time of the bar */
    private ZonedDateTime beginTime;
    /** Open price of the period */
    private Double openPrice = null;
    /** Close price of the period */
    private Double closePrice = null;
    /** High price of the period */
    private Double highPrice = null;
    /** Low price of the period */
    private Double lowPrice = null;
    /** Traded amount during the period */
    private Double amount;
    /** Volume of the period */
    private Double volume;
    /** Trade count */
    private long trades = 0;

    public BaseBar(Duration timePeriod, ZonedDateTime endTime, ZonedDateTime beginTime, Double openPrice, Double closePrice, Double highPrice, Double lowPrice, Double amount, Double volume, long trades) {
        this.timePeriod = timePeriod;
        this.endTime = endTime;
        this.beginTime = beginTime;
        this.openPrice = openPrice;
        this.closePrice = closePrice;
        this.highPrice = highPrice;
        this.lowPrice = lowPrice;
        this.amount = amount;
        this.volume = volume;
        this.trades = trades;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Duration getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(Duration timePeriod) {
        this.timePeriod = timePeriod;
    }

    public ZonedDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(ZonedDateTime endTime) {
        this.endTime = endTime;
    }

    public ZonedDateTime getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(ZonedDateTime beginTime) {
        this.beginTime = beginTime;
    }

    public Double getOpenPrice() {
        return openPrice;
    }

    public void setOpenPrice(Double openPrice) {
        this.openPrice = openPrice;
    }

    public Double getClosePrice() {
        return closePrice;
    }

    public void setClosePrice(Double closePrice) {
        this.closePrice = closePrice;
    }

    public Double getHighPrice() {
        return highPrice;
    }

    public void setHighPrice(Double highPrice) {
        this.highPrice = highPrice;
    }

    public Double getLowPrice() {
        return lowPrice;
    }

    public void setLowPrice(Double lowPrice) {
        this.lowPrice = lowPrice;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public long getTrades() {
        return trades;
    }

    public void setTrades(long trades) {
        this.trades = trades;
    }
}
