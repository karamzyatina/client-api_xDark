package dev.xdark.clientapi.block.material;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.util.*;

@SidedApi(Side.SERVER)
public interface MapColor
{
    default MapColor of(final int color) {
        throw CompileStub.create();
    }
    
    int getColor(final int type);
}
