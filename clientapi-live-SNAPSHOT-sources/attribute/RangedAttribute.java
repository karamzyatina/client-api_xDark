package dev.xdark.clientapi.attribute;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.util.*;

@SidedApi(Side.SERVER)
public interface RangedAttribute extends Attribute
{
    double getMinValue();
    
    double getMaxValue();
    
    String getDescription();
    
    @SidedApi(Side.SERVER)
    public interface Builder
    {
        default Builder builder() {
            throw CompileStub.create();
        }
        
        Builder minValue(final double minValue);
        
        Builder maxValue(final double maxValue);
        
        Builder description(final String description);
        
        RangedAttribute build();
    }
}
