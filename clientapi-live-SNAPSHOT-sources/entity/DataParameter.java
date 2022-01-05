package dev.xdark.clientapi.entity;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.util.*;

@SidedApi(Side.SERVER)
public interface DataParameter<T>
{
    default <T> DataParameter<T> of(final int id, final DataSerializer<T> serializer) {
        throw CompileStub.create();
    }
    
    int getId();
    
    DataSerializer<T> getSerializer();
}
