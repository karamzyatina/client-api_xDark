package dev.xdark.clientapi.text;

public interface TextProvider
{
    Style newStyle();
    
    TextLiteral of(final String text);
    
    TextKeybinding keybinding(final String keybinding);
    
    Text parse(final String json);
    
    String toJson(final Text text);
    
    ClickEvent clickEvent(final ClickEvent.Action action, final String value);
    
    HoverEvent hoverEvent(final HoverEvent.Action action, final Text value);
}
