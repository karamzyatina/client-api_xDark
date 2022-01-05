package dev.xdark.clientapi.resource.data;

import dev.xdark.clientapi.*;
import it.unimi.dsi.fastutil.ints.*;

@SidedApi(Side.SERVER)
public interface AnimationMetadataSection extends MetadataSection
{
    int getFrameHeight();
    
    int getFrameWidth();
    
    int getFrameCount();
    
    int getFrameTime();
    
    boolean isInterpolate();
    
    int getFrameTimeSingle(final int idx);
    
    boolean frameHasTime(final int idx);
    
    int getFrameIndex(final int idx);
    
    IntSet getFrameIndexSet();
}
