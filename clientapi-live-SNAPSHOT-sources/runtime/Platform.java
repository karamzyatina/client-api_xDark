package dev.xdark.clientapi.runtime;

import dev.xdark.clientapi.*;

@SidedApi(Side.BOTH)
public final class Platform
{
    private final String name;
    private final String version;
    private final String arch;
    
    public Platform(final String name, final String version, final String arch) {
        this.name = name;
        this.version = version;
        this.arch = arch;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getVersion() {
        return this.version;
    }
    
    public String getArch() {
        return this.arch;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final Platform platform = (Platform)o;
        return this.name.equals(platform.name) && this.version.equals(platform.version) && this.arch.equals(platform.arch);
    }
    
    @Override
    public int hashCode() {
        int result = this.name.hashCode();
        result = 31 * result + this.version.hashCode();
        result = 31 * result + this.arch.hashCode();
        return result;
    }
    
    @Override
    public String toString() {
        return "Platform{name='" + this.name + '\'' + ", version='" + this.version + '\'' + ", arch='" + this.arch + '\'' + '}';
    }
}
