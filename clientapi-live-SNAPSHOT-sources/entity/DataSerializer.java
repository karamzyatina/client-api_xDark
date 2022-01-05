package dev.xdark.clientapi.entity;

import dev.xdark.clientapi.*;
import io.netty.buffer.*;

@SidedApi(Side.SERVER)
public interface DataSerializer<T>
{
    void write(final ByteBuf buf, final T value);
    
    T read(final ByteBuf buf);
    
    DataParameter<T> createKey(final int id);
    
    T copyValue(final T value);
}
