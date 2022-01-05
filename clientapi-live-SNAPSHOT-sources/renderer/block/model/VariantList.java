package dev.xdark.clientapi.renderer.block.model;

import dev.xdark.clientapi.*;
import java.util.*;

@SidedApi(Side.SERVER)
public interface VariantList
{
    List<Variant> getVariants();
}
