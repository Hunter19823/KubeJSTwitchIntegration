package pie.ilikepiefoo2.kubejstwitchintegration.events.chat;

import com.github.twitch4j.chat.events.channel.ChannelMessageEvent;
import pie.ilikepiefoo2.kubejstwitchintegration.util.CommonEventJS;
/**
 * @author ILIKEPIEFOO2
 */
public class ChannelMessageEventJS extends CommonEventJS {
    public final ChannelMessageEvent event;

    public ChannelMessageEventJS( ChannelMessageEvent event )
    {
        this.event = event;
    }
}