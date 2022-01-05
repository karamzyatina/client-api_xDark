package dev.xdark.clientapi.block.handler;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.block.state.*;
import dev.xdark.clientapi.world.*;
import dev.xdark.clientapi.math.*;

@SidedApi(Side.SERVER)
public interface SelectedBoundingBoxHandler
{
    AxisAlignedBB getSelectedBoundingBox(final BlockState blockState, final World world, final int x, final int y, final int z);
}
