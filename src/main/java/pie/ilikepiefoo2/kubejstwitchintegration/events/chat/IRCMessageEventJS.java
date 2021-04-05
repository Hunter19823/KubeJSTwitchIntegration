package pie.ilikepiefoo2.kubejstwitchintegration.events.chat;

import com.github.twitch4j.chat.events.channel.IRCMessageEvent;
import pie.ilikepiefoo2.kubejstwitchintegration.util.CommonEventJS;
/**
 * @author ILIKEPIEFOO2
 */
public class IRCMessageEventJS  extends CommonEventJS {
    public final IRCMessageEvent event;

    public IRCMessageEventJS( IRCMessageEvent event )
    {
        this.event = event;
    }
}
