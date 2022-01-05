package dev.xdark.clientapi.renderer.block.statemap;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.block.state.*;
import dev.xdark.clientapi.renderer.block.model.*;

@SidedApi(Side.SERVER)
public interface StateMapper
{
    ModelResourceLocation getModelResourceLocation(final BlockState state);
}
