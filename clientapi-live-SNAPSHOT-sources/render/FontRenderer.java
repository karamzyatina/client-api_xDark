package dev.xdark.clientapi.render;

import dev.xdark.clientapi.*;
import java.util.*;

@SidedApi(Side.BOTH)
public interface FontRenderer
{
    int drawStringWithShadow(final String str, final float x, final float y, final int color);
    
    int drawString(final String str, final float x, final float y, final int color, final boolean dropShadow);
    
    int getStringWidth(final String str);
    
    int getCharWidth(final char c);
    
    String trimStringToWidth(final String str, final int width, final boolean reverse);
    
    void drawSplitString(final String str, final int x, final int y, final int wrapWidth, final int color);
    
    int getWordWrappedHeight(final String str, final int maxLength);
    
    boolean getUnicodeFlag();
    
    List<String> listFormattedStringToWidth(final String str, final int wrapWidth);
}
