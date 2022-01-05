package dev.xdark.clientapi.text;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.util.*;
import java.util.*;

@SidedApi(Side.BOTH)
public interface Text extends Iterable<Text>
{
    default Text of(final String literal) {
        throw CompileStub.create();
    }
    
    default TextKeybinding keybinding(final String keybinding) {
        throw CompileStub.create();
    }
    
    default Text of(final Object... parameters) {
        throw CompileStub.create();
    }
    
    Text setStyle(final Style style);
    
    Style getStyle();
    
    Text append(final Text text);
    
    String getUnformattedPart();
    
    String getUnformattedText();
    
    String getFormattedText();
    
    List<Text> getParts();
    
    Text copy();
}
