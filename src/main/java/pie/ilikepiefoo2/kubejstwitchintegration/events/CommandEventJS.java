package pie.ilikepiefoo2.kubejstwitchintegration.events;

import com.github.twitch4j.chat.events.CommandEvent;
import pie.ilikepiefoo2.kubejstwitchintegration.util.CommonEventJS;

public class CommandEventJS extends CommonEventJS {
    public final CommandEvent event;

    public CommandEventJS( CommandEvent event )
    {
        this.event = event;
    }
}
