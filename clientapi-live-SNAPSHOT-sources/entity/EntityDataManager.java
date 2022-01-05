package dev.xdark.clientapi.entity;

import dev.xdark.clientapi.*;

@SidedApi(Side.SERVER)
public interface EntityDataManager
{
     <T> void register(final DataParameter<T> parameter, final T value);
    
     <T> T get(final DataParameter<T> parameter);
    
     <T> void set(final DataParameter<T> parameter, final T value);
    
    boolean isDirty();
}
