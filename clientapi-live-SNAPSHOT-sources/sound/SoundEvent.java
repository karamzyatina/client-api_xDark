package dev.xdark.clientapi.sound;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.resource.*;
import dev.xdark.clientapi.util.*;

@SidedApi(Side.SERVER)
public interface SoundEvent
{
    default SoundEvent of(final ResourceLocation location) {
        throw CompileStub.create();
    }
    
    ResourceLocation getName();
}
