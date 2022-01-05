package dev.xdark.clientapi.discord;

import dev.xdark.clientapi.*;

@SidedApi(Side.BOTH)
public interface DiscordRPC
{
    void hide();
    
    void show();
    
    void updateState(final String state);
}
