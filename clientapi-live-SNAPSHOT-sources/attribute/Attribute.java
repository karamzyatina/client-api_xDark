package dev.xdark.clientapi.attribute;

import dev.xdark.clientapi.*;

@SidedApi(Side.SERVER)
public interface Attribute
{
    String getName();
    
    double clampValue(final double value);
    
    double getDefaultValue();
    
    boolean shouldWatch();
    
    Attribute getParent();
}
