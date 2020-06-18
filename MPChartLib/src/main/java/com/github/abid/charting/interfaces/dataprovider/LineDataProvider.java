package com.github.abid.charting.interfaces.dataprovider;

import com.github.abid.charting.components.YAxis;
import com.github.abid.charting.data.LineData;

public interface LineDataProvider extends BarLineScatterCandleBubbleDataProvider {

    LineData getLineData();

    YAxis getAxis(YAxis.AxisDependency dependency);
}
