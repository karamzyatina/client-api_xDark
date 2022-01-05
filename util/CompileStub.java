package dev.xdark.clientapi.util;

public final class CompileStub extends RuntimeException
{
    private static final boolean DEBUGGING = true;
    private static final CompileStub INSTANCE;
    
    private CompileStub(final int unused) {
        super(null, null, false, false);
    }
    
    private CompileStub() {
    }
    
    public static CompileStub create() {
        return new CompileStub();
    }
    
    static {
        INSTANCE = new CompileStub(0);
    }
}
