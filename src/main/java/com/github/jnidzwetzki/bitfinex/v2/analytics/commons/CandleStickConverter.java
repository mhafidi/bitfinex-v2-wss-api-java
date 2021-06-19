package com.github.jnidzwetzki.bitfinex.v2.analytics.commons;

import com.github.jnidzwetzki.bitfinex.v2.entity.BitfinexCandle;

import org.ta4j.core.BaseBar;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Optional;

public class CandleStickConverter extends Converter<BaseBar, BitfinexCandle>
{
    public CandleStickConverter()
    {
        super(CandleStickConverter::convertToEntity, CandleStickConverter::convertToDto);
    }

    private static BaseBar convertToDto(BitfinexCandle bitfinexCandle) {
        Instant i = Instant.ofEpochSecond(bitfinexCandle.getTimestamp());
        ZonedDateTime z = ZonedDateTime.ofInstant(i, ZoneId.of("GMT"));
        return new BaseBar(Duration.ofMillis(bitfinexCandle.getDuration()),z,bitfinexCandle.getOpen().doubleValue(), bitfinexCandle.getHigh().doubleValue(),
                bitfinexCandle.getLow().doubleValue(), bitfinexCandle.getClose().doubleValue(),bitfinexCandle.getVolume().get().doubleValue());
    }

    private static BitfinexCandle convertToEntity(BaseBar baseBar) {
        return  new BitfinexCandle(baseBar.getEndTime().toInstant().toEpochMilli(),BigDecimal.valueOf(baseBar.getOpenPrice().doubleValue()),
                BigDecimal.valueOf(baseBar.getClosePrice().doubleValue()), BigDecimal.valueOf(baseBar.getHighPrice().doubleValue()),
                BigDecimal.valueOf(baseBar.getLowPrice().doubleValue()),
                Optional.of(BigDecimal.valueOf(baseBar.getVolume().doubleValue())));
    }

}
