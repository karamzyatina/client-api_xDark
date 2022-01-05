package dev.xdark.clientapi.render;

import dev.xdark.clientapi.*;

@SidedApi(Side.BOTH)
public interface ScaledResolution
{
    int getScaledWidth();
    
    int getScaledHeight();
    
    double getScaledWidth_double();
    
    double getScaledHeight_double();
    
    int getScaleFactor();
}
