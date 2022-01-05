package dev.xdark.clientapi.util;

import dev.xdark.clientapi.*;

@SidedApi(Side.SERVER)
public interface ProceedActionResult<V>
{
    default <V> ProceedActionResult<V> of(final ActionResult result, final V value) {
        throw CompileStub.create();
    }
    
    ActionResult getResult();
    
    V getValue();
}
