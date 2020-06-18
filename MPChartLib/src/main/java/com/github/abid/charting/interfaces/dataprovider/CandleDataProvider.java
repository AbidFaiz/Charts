package com.github.abid.charting.interfaces.dataprovider;

import com.github.abid.charting.data.CandleData;

public interface CandleDataProvider extends BarLineScatterCandleBubbleDataProvider {

    CandleData getCandleData();
}
