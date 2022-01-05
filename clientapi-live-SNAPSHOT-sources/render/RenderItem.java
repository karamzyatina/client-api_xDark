package dev.xdark.clientapi.render;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.render.model.*;
import dev.xdark.clientapi.item.*;
import dev.xdark.clientapi.block.*;

@SidedApi(Side.BOTH)
public interface RenderItem
{
    void renderItemIntoGUI(final ItemStack stack, final int x, final int y);
    
    void renderItemAndEffectIntoGUI(final ItemStack stack, final int x, final int y);
    
    void renderItemOverlayIntoGUI(final FontRenderer fr, final ItemStack stack, final int x, final int y, final String text);
    
    void renderItem(final ItemStack stack, final ItemCameraTransforms.Type type);
    
    void registerItem(final Item item, final int meta, final String name);
    
    void registerBlock(final Block block, final int meta, final String name);
    
    void registerBlock(final Block block, final String name);
    
    void registerItem(final Item item, final String name);
    
    @SidedApi(Side.INTERNAL)
    void unregisterItem(final Item item);
    
    @SidedApi(Side.INTERNAL)
    void unregisterItem(final Item item, final int meta);
    
    @SidedApi(Side.INTERNAL)
    void unregisterItem(final int idx);
}
