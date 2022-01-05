package dev.xdark.clientapi.block.handler;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.world.*;
import dev.xdark.clientapi.util.*;
import dev.xdark.clientapi.block.state.*;

@SidedApi(Side.SERVER)
public interface FaceShapeHandler
{
    BlockFaceShape getBlockFaceShape(final BlockAccess blockAccess, final BlockState state, final int x, final int y, final int z, final EnumFacing facing);
}
