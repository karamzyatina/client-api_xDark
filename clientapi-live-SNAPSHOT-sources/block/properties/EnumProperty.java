package dev.xdark.clientapi.block.properties;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.util.*;
import java.util.function.*;
import java.util.*;

@SidedApi(Side.SERVER)
public interface EnumProperty<E extends Enum> extends Property<E>
{
    default <E extends java.lang.Enum> EnumProperty<E> create(final String name, final Class<E> type) {
        throw CompileStub.create();
    }
    
    default <E extends java.lang.Enum> EnumProperty<E> create(final String name, final Class<E> type, final Predicate<E> predicate) {
        throw CompileStub.create();
    }
    
    default <E extends java.lang.Enum> EnumProperty<E> create(final String name, final Class<E> type, final Predicate<E> predicate, final E... values) {
        throw CompileStub.create();
    }
    
    default <E extends java.lang.Enum> EnumProperty<E> create(final String name, final Class<E> type, final E... values) {
        throw CompileStub.create();
    }
    
    default <E extends java.lang.Enum> EnumProperty<E> create(final String name, final Class<E> type, final Collection<E> values) {
        throw CompileStub.create();
    }
}
