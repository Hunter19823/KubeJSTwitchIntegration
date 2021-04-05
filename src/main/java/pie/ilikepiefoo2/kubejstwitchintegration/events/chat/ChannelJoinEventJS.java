package pie.ilikepiefoo2.kubejstwitchintegration.events.chat;

import com.github.twitch4j.chat.events.channel.ChannelJoinEvent;
import pie.ilikepiefoo2.kubejstwitchintegration.util.CommonEventJS;
/**
 * @author ILIKEPIEFOO2
 */
public class ChannelJoinEventJS extends CommonEventJS {
    public final ChannelJoinEvent event;

    public ChannelJoinEventJS( ChannelJoinEvent event )
    {
        this.event = event;
    }
}
