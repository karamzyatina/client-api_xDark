package dev.xdark.clientapi.block.handler;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.block.state.*;
import dev.xdark.clientapi.world.*;
import java.util.*;

@SidedApi(Side.SERVER)
public interface DisplayTickHandler
{
    void randomDisplayTick(final BlockState blockState, final World world, final int x, final int y, final int z, final Random random);
}
