package pie.ilikepiefoo2.kubejstwitchintegration.events;

import com.github.twitch4j.chat.events.channel.ChannelModEvent;
import pie.ilikepiefoo2.kubejstwitchintegration.util.CommonEventJS;

public class ChannelModEventJS extends CommonEventJS {
    public final ChannelModEvent event;

    public ChannelModEventJS( ChannelModEvent event )
    {
        this.event = event;
    }
}