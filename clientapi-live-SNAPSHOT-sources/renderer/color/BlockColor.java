package dev.xdark.clientapi.renderer.color;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.block.state.*;
import dev.xdark.clientapi.world.*;
import dev.xdark.clientapi.math.*;

@SidedApi(Side.SERVER)
public interface BlockColor
{
    int colorMultiplier(final BlockState state, final BlockAccess blockAccess, final BlockPos pos, final int tintIndex);
}
