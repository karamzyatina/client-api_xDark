package dev.xdark.clientapi.text;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.util.*;

@SidedApi(Side.BOTH)
public interface TextFormatting
{
    public static final TextFormatting BLACK = SideEffects.objectValue();
    public static final TextFormatting DARK_BLUE = SideEffects.objectValue();
    public static final TextFormatting DARK_GREEN = SideEffects.objectValue();
    public static final TextFormatting DARK_AQUA = SideEffects.objectValue();
    public static final TextFormatting DARK_RED = SideEffects.objectValue();
    public static final TextFormatting DARK_PURPLE = SideEffects.objectValue();
    public static final TextFormatting GOLD = SideEffects.objectValue();
    public static final TextFormatting GRAY = SideEffects.objectValue();
    public static final TextFormatting DARK_GRAY = SideEffects.objectValue();
    public static final TextFormatting BLUE = SideEffects.objectValue();
    public static final TextFormatting GREEN = SideEffects.objectValue();
    public static final TextFormatting AQUA = SideEffects.objectValue();
    public static final TextFormatting RED = SideEffects.objectValue();
    public static final TextFormatting LIGHT_PURPLE = SideEffects.objectValue();
    public static final TextFormatting YELLOW = SideEffects.objectValue();
    public static final TextFormatting WHITE = SideEffects.objectValue();
    public static final TextFormatting OBFUSCATED = SideEffects.objectValue();
    public static final TextFormatting BOLD = SideEffects.objectValue();
    public static final TextFormatting STRIKETHROUGH = SideEffects.objectValue();
    public static final TextFormatting UNDERLINE = SideEffects.objectValue();
    public static final TextFormatting ITALIC = SideEffects.objectValue();
    public static final TextFormatting RESET = SideEffects.objectValue();
    
    int getColorIndex();
    
    boolean isFancyStyling();
    
    boolean isColor();
    
    String getFriendlyName();
}
