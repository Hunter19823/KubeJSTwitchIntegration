package pie.ilikepiefoo2.kubejstwitchintegration.events.chat;

import com.github.twitch4j.chat.events.channel.ChannelLeaveEvent;
import pie.ilikepiefoo2.kubejstwitchintegration.util.CommonEventJS;
/**
 * @author ILIKEPIEFOO2
 */
public class ChannelLeaveEventJS extends CommonEventJS {
    public final ChannelLeaveEvent event;

    public ChannelLeaveEventJS( ChannelLeaveEvent event )
    {
        this.event = event;
    }
}