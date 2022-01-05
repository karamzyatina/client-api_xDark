package dev.xdark.clientapi.text;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.util.*;

@SidedApi(Side.BOTH)
public interface ClickEvent
{
    default ClickEvent of(final Action action, final String value) {
        throw CompileStub.create();
    }
    
    Action getAction();
    
    String getValue();
    
    @SidedApi(Side.BOTH)
    public interface Action
    {
        public static final Action OPEN_URL = SideEffects.objectValue();
        public static final Action OPEN_FILE = SideEffects.objectValue();
        public static final Action RUN_COMMAND = SideEffects.objectValue();
        public static final Action SUGGEST_COMMAND = SideEffects.objectValue();
        public static final Action CHANGE_PAGE = SideEffects.objectValue();
    }
}
