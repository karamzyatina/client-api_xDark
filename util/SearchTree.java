package dev.xdark.clientapi.util;

import dev.xdark.clientapi.*;
import java.util.function.*;
import java.util.*;

@SidedApi(Side.BOTH)
public interface SearchTree<T>
{
    default <T> SearchTree<T> of(final Function<T, Iterable<String>> nameFunc) {
        throw CompileStub.create();
    }
    
    void recalculate();
    
    void add(final T value);
    
    List<T> search(final String input);
}
