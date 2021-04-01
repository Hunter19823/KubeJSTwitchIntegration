package pie.ilikepiefoo2.kubejstwitchintegration.events;

import com.github.twitch4j.chat.events.channel.ChannelStateEvent;
import pie.ilikepiefoo2.kubejstwitchintegration.util.CommonEventJS;

public class ChannelStateEventJS extends CommonEventJS {
    public final ChannelStateEvent event;

    public ChannelStateEventJS( ChannelStateEvent event )
    {
        this.event = event;
    }
}
