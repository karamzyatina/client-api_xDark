package dev.xdark.clientapi.render;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.util.*;
import dev.xdark.clientapi.particle.*;

@SidedApi(Side.SERVER)
public interface RenderGlobal
{
    void loadRenderers();
    
    Particle spawnParticle(final ParticleType type, final boolean isLongDistance, final double x, final double y, final double z, final double motionX, final double motionY, final double motionZ, final int... data);
}
