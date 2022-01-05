package dev.xdark.clientapi.block.handler;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.world.*;
import dev.xdark.clientapi.block.state.*;
import dev.xdark.clientapi.entity.*;
import dev.xdark.clientapi.util.*;

@SidedApi(Side.SERVER)
public interface BlockActivationHandler
{
    boolean onBlockActivated(final World world, final int x, final int y, final int z, final BlockState state, final EntityPlayer player, final EnumHand hand, final EnumFacing side, final float hitX, final float hitY, final float hitZ);
}
