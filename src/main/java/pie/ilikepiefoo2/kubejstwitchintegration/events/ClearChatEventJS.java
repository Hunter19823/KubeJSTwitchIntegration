package pie.ilikepiefoo2.kubejstwitchintegration.events;

import com.github.twitch4j.chat.events.channel.ClearChatEvent;
import pie.ilikepiefoo2.kubejstwitchintegration.util.CommonEventJS;

public class ClearChatEventJS extends CommonEventJS {
    public final ClearChatEvent event;

    public ClearChatEventJS( ClearChatEvent event )
    {
        this.event = event;
    }
}
