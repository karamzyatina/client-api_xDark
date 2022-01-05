package dev.xdark.clientapi.render;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.item.*;

@SidedApi(Side.BOTH)
public interface OverlayRenderer
{
    void drawHorizontalLine(final int startX, final int endX, final int y, final int color);
    
    void drawVerticalLine(final int x, final int startY, final int endY, final int color);
    
    void drawRect(final int left, final int top, final int right, final int bottom, final int color);
    
    void drawTexturedModalRect(final int x, final int y, final int textureX, final int textureY, final int width, final int height);
    
    void drawTexturedModalRect(final float xCoord, final float yCoord, final int minU, final int minV, final int maxU, final int maxV);
    
    void drawModalRectWithCustomSizedTexture(final int x, final int y, final float u, final float v, final int width, final int height, final float textureWidth, final float textureHeight);
    
    void drawScaledCustomSizeModalRect(final int x, final int y, final float u, final float v, final int uWidth, final int vHeight, final int width, final int height, final float tileWidth, final float tileHeight);
    
    void displayItemActivation(final ItemStack stack);
}
