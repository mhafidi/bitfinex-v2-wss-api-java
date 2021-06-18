package com.github.jnidzwetzki.bitfinex.v2.analytics.commons;

import com.github.jnidzwetzki.bitfinex.v2.entity.BitfinexCandle;

import org.ta4j.core.BaseBar;

public class CandleStickConverter extends Converter<BaseBar, BitfinexCandle>
{
    public CandleStickConverter()
    {
        super(CandleStickConverter::convertToEntity, CandleStickConverter::convertToDto);
    }

    private static BaseBar convertToDto(BitfinexCandle bitfinexCandle) {
        return null; //new BaseBar(bitfinexCandle.time(), bitfinexCandle.high(), bitfinexCandle.low(), bitfinexCandle.close());
    }

    private static BitfinexCandle convertToEntity(BaseBar baseBar) {
        return null;// new BitfinexCandle(baseBar.time(), baseBar.high(), baseBar.low(), baseBar.close());
    }

}
