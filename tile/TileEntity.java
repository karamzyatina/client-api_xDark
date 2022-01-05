package dev.xdark.clientapi.tile;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.world.*;
import dev.xdark.clientapi.nbt.*;
import dev.xdark.clientapi.block.*;
import dev.xdark.clientapi.text.*;

@SidedApi(Side.SERVER)
public interface TileEntity
{
    World getWorld();
    
    boolean hasWorld();
    
    void readFromNBT(final NBTTagCompound compound);
    
    NBTTagCompound writeToNBT(final NBTTagCompound compound);
    
    int getBlockMetadata();
    
    void markDirty();
    
    double getDistanceSq(final double x, final double y, final double z);
    
    double getMaxRenderDistanceSquared();
    
    Block getBlockType();
    
    boolean isInvalid();
    
    void invalidate();
    
    void validate();
    
    void updateContainingBlockInfo();
    
    Text getDisplayName();
}
