package pie.ilikepiefoo2.kubejstwitchintegration.util;

import dev.latvian.kubejs.event.EventJS;
import dev.latvian.kubejs.script.ScriptType;

public abstract class CommonEventJS extends EventJS {
    public final void postCommon(String id)
    {
        post(ScriptType.SERVER,id);
        post(ScriptType.CLIENT,id);
    }
}
