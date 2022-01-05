package dev.xdark.clientapi.entity;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.item.*;
import dev.xdark.clientapi.util.*;

@SidedApi(Side.SERVER)
public interface EntityItem extends Entity
{
    public static final DataParameter<ItemStack> ITEM = SideEffects.objectValue();
    
    ItemStack getStack();
    
    void setStack(final ItemStack stack);
    
    int getAge();
    
    void setDefaultPickupDelay();
    
    void setNoPickupDelay();
    
    void setInfinitePickupDelay();
    
    void setPickupDelay(final int pickupDelay);
    
    boolean cannotPickup();
    
    void setNoDespawn();
    
    void markAsFake();
}
