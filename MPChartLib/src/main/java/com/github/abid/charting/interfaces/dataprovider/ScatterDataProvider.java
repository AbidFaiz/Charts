package com.github.abid.charting.interfaces.dataprovider;

import com.github.abid.charting.data.ScatterData;

public interface ScatterDataProvider extends BarLineScatterCandleBubbleDataProvider {

    ScatterData getScatterData();
}
