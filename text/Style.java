package dev.xdark.clientapi.text;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.util.*;

@SidedApi(Side.BOTH)
public interface Style
{
    public static final int BOLD = 1;
    public static final int ITALIC = 2;
    public static final int STRIKETHROUGH = 4;
    public static final int UNDERLINED = 8;
    public static final int OBFUSCATED = 16;
    
    default Style of(final int caps, final Object... parameters) {
        throw CompileStub.create();
    }
    
    default Style of(final Object... parameters) {
        throw CompileStub.create();
    }
    
    default Style create() {
        throw CompileStub.create();
    }
    
    TextFormatting getColor();
    
    boolean isBold();
    
    boolean isItalic();
    
    boolean isStrikethrough();
    
    boolean isUnderlined();
    
    boolean isObfuscated();
    
    String getInsertion();
    
    boolean isEmpty();
    
    Style setColor(final TextFormatting formatting);
    
    Style setBold(final boolean bold);
    
    Style setItalic(final boolean italic);
    
    Style setStrikethrough(final boolean strikethrough);
    
    Style setUnderlined(final boolean underlined);
    
    Style setObfuscated(final boolean obfuscated);
    
    Style setClickEvent(final ClickEvent event);
    
    Style setHoverEvent(final HoverEvent event);
    
    Style setInsertion(final String insertion);
    
    Style deepCopy();
    
    Style shallowCopy();
}
