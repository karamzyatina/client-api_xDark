package dev.xdark.clientapi.entity;

import dev.xdark.clientapi.*;
import com.google.common.base.*;
import dev.xdark.clientapi.math.*;
import dev.xdark.clientapi.util.*;

@SidedApi(Side.SERVER)
public interface EntityEnderCrystal extends Entity
{
    public static final DataParameter<Optional<BlockPos>> BEAM_TARGET = SideEffects.objectValue();
    public static final DataParameter<Boolean> SHOW_BOTTOM = SideEffects.objectValue();
    
    void setBeamTarget(final BlockPos pos);
    
    BlockPos getBeamTarget();
    
    void setShowBottom(final boolean showBottom);
    
    boolean shouldShowBottom();
}
