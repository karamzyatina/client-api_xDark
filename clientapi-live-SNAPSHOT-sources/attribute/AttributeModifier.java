package dev.xdark.clientapi.attribute;

import dev.xdark.clientapi.*;
import java.util.*;
import dev.xdark.clientapi.util.*;

@SidedApi(Side.SERVER)
public interface AttributeModifier
{
    UUID getId();
    
    String getName();
    
    int getOperation();
    
    double getAmount();
    
    @SidedApi(Side.SERVER)
    public interface Builder
    {
        default Builder builder() {
            throw CompileStub.create();
        }
        
        Builder id(final UUID id);
        
        Builder name(final String name);
        
        Builder operation(final int operation);
        
        Builder amount(final double amount);
        
        AttributeModifier build();
    }
}
