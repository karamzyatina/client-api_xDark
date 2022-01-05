package dev.xdark.clientapi.block.handler;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.block.state.*;
import dev.xdark.clientapi.world.*;
import dev.xdark.clientapi.math.*;
import java.util.*;
import dev.xdark.clientapi.entity.*;

@SidedApi(Side.SERVER)
public interface CollisionBoxListHandler
{
    void addCollisionBoxToList(final BlockState state, final World world, final int x, final int y, final int z, final AxisAlignedBB entityBox, final List<AxisAlignedBB> collidingBoxes, final Entity entity, final boolean isActualState);
}
