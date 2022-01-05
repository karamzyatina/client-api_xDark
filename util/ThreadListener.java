package dev.xdark.clientapi.util;

import dev.xdark.clientapi.*;
import java.util.concurrent.*;

@SidedApi(Side.BOTH)
public interface ThreadListener
{
    Future<?> addScheduledTask(final Runnable command);
    
    boolean isCallingFromMainThread();
}
