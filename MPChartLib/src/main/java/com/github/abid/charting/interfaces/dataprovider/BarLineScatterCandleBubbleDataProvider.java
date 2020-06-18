package com.github.abid.charting.interfaces.dataprovider;

import com.github.abid.charting.components.YAxis.AxisDependency;
import com.github.abid.charting.data.BarLineScatterCandleBubbleData;
import com.github.abid.charting.utils.Transformer;

public interface BarLineScatterCandleBubbleDataProvider extends ChartInterface {

    Transformer getTransformer(AxisDependency axis);
    boolean isInverted(AxisDependency axis);
    
    float getLowestVisibleX();
    float getHighestVisibleX();

    BarLineScatterCandleBubbleData getData();
}
