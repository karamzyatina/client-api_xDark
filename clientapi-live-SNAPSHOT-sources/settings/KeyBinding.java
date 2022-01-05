package dev.xdark.clientapi.settings;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.util.*;

@SidedApi(Side.BOTH)
public interface KeyBinding extends Comparable<KeyBinding>
{
    boolean isKeyDown();
    
    String getCategory();
    
    boolean isPressed();
    
    String getDescription();
    
    int getKeyCodeDefault();
    
    int getKeyCode();
    
    @SidedApi(Side.SERVER)
    public interface Builder
    {
        default Builder builder() {
            throw CompileStub.create();
        }
        
        Builder description(final String description);
        
        Builder category(final String category);
        
        Builder keyCode(final int keyCode);
        
        KeyBinding build();
    }
}
