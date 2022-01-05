package dev.xdark.clientapi.block.properties;

import dev.xdark.clientapi.*;
import java.util.*;

@SidedApi(Side.SERVER)
public interface Property<T extends Comparable<T>>
{
    String getName();
    
    Collection<T> getAllowedValues();
    
    Class<T> getValueClass();
    
    Optional<T> parseValue(final String input);
    
    String getName(final T value);
}
