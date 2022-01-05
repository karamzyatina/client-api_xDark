package dev.xdark.clientapi.block.properties;

import dev.xdark.clientapi.*;
import it.unimi.dsi.fastutil.ints.*;
import dev.xdark.clientapi.util.*;

@SidedApi(Side.SERVER)
public interface IntegerProperty extends Property<Integer>
{
    default IntegerProperty create(final String name, final IntSet set) {
        throw CompileStub.create();
    }
    
    default IntegerProperty create(final String name, final int from, final int to) {
        throw CompileStub.create();
    }
}
