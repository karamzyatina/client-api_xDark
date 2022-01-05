package dev.xdark.clientapi.thread;

import dev.xdark.clientapi.*;
import java.util.concurrent.*;

@SidedApi(Side.BOTH)
public interface ThreadManagement
{
    Thread newThread(final Runnable runnable);
    
    Thread newThread(final String name, final int priority, final Runnable runnable);
    
    ExecutorService newSingleThreadedExecutor();
    
    ScheduledExecutorService newSingleThreadedScheduledExecutor();
    
    ScheduledExecutorService newScheduledThreadPool(final int coreThreads);
    
    boolean inMainThread();
}
