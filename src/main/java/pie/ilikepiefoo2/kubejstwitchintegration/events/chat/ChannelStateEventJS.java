package pie.ilikepiefoo2.kubejstwitchintegration.events.chat;

import com.github.twitch4j.chat.events.channel.ChannelStateEvent;
import pie.ilikepiefoo2.kubejstwitchintegration.util.CommonEventJS;
/**
 * @author ILIKEPIEFOO2
 */
public class ChannelStateEventJS extends CommonEventJS {
    public final ChannelStateEvent event;

    public ChannelStateEventJS( ChannelStateEvent event )
    {
        this.event = event;
    }
}