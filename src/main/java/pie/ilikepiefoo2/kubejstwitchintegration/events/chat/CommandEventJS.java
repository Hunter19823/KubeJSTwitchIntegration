package pie.ilikepiefoo2.kubejstwitchintegration.events.chat;

import com.github.twitch4j.chat.events.CommandEvent;
import pie.ilikepiefoo2.kubejstwitchintegration.util.CommonEventJS;
/**
 * @author ILIKEPIEFOO2
 */
public class CommandEventJS extends CommonEventJS {
    public final CommandEvent event;

    public CommandEventJS( CommandEvent event )
    {
        this.event = event;
    }
}
