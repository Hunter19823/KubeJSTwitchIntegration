package pie.ilikepiefoo2.kubejstwitchintegration.events;

import com.github.twitch4j.chat.events.channel.ChannelLeaveEvent;
import pie.ilikepiefoo2.kubejstwitchintegration.util.CommonEventJS;

public class ChannelLeaveEventJS extends CommonEventJS {
    public final ChannelLeaveEvent event;

    public ChannelLeaveEventJS( ChannelLeaveEvent event )
    {
        this.event = event;
    }
}
