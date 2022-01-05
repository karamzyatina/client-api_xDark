package dev.xdark.clientapi.text;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.util.*;

@SidedApi(Side.BOTH)
public interface HoverEvent
{
    default HoverEvent of(final Action action, final Text value) {
        throw CompileStub.create();
    }
    
    Action getAction();
    
    Text getValue();
    
    @SidedApi(Side.BOTH)
    public interface Action
    {
        public static final Action SHOW_TEXT = SideEffects.objectValue();
        public static final Action SHOW_ITEM = SideEffects.objectValue();
        public static final Action SHOW_ENTITY = SideEffects.objectValue();
    }
}
