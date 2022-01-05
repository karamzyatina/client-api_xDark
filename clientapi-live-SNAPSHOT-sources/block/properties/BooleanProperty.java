package dev.xdark.clientapi.block.properties;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.util.*;

@SidedApi(Side.SERVER)
public interface BooleanProperty extends Property<Boolean>
{
    default BooleanProperty create(final String name) {
        throw CompileStub.create();
    }
}
