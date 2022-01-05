package dev.xdark.clientapi.chat;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.text.*;

@SidedApi(Side.BOTH)
public interface Chat
{
    @SidedApi(Side.SERVER)
    void sendChatMessage(final String message);
    
    void printChatMessage(final Text message);
    
    void printChatMessage(final String message);
    
    void clearReceivedMessages();
    
    void clearSentHistory();
}
