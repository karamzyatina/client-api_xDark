package dev.xdark.clientapi.block.handler;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.block.state.*;
import dev.xdark.clientapi.util.*;

@SidedApi(Side.SERVER)
public interface MirrorHandler
{
    BlockState withMirror(final BlockState state, final Mirror mirror);
}
