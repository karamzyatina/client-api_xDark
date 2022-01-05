package dev.xdark.clientapi.text;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.util.*;

@SidedApi(Side.BOTH)
public final class TextJSON
{
    private TextJSON() {
    }
    
    public static String textToJson(final Text text) {
        throw CompileStub.create();
    }
    
    public static Text jsonToText(final String json) {
        throw CompileStub.create();
    }
    
    public static Text fromJsonLenient(final String json) {
        throw CompileStub.create();
    }
}
