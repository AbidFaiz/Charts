package com.github.abid.charting.interfaces.dataprovider;

import com.github.abid.charting.data.BubbleData;

public interface BubbleDataProvider extends BarLineScatterCandleBubbleDataProvider {

    BubbleData getBubbleData();
}
