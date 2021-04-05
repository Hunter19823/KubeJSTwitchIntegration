package pie.ilikepiefoo2.kubejstwitchintegration.events.chat;

import com.github.twitch4j.chat.events.channel.ClearChatEvent;
import pie.ilikepiefoo2.kubejstwitchintegration.util.CommonEventJS;
/**
 * @author ILIKEPIEFOO2
 */
public class ClearChatEventJS extends CommonEventJS {
    public final ClearChatEvent event;

    public ClearChatEventJS( ClearChatEvent event )
    {
        this.event = event;
    }
}
