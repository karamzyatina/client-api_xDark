package dev.xdark.clientapi.block.state;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.util.*;
import dev.xdark.clientapi.block.*;
import dev.xdark.clientapi.block.properties.*;
import java.util.*;

@SidedApi(Side.SERVER)
public interface BlockState extends BlockProperties
{
    default BlockState of(final int id) {
        throw CompileStub.create();
    }
    
    int getId();
    
    Block getBlock();
    
    Collection<Property<?>> getPropertyKeys();
    
     <T extends Comparable<T>> T getValue(final Property<T> property);
    
     <T extends Comparable<T>, V extends T> BlockState withProperty(final Property<T> property, final V value);
    
     <T extends Comparable<T>> BlockState cycleProperty(final Property<T> property);
    
    Map<Property<?>, Comparable<?>> getProperties();
}
