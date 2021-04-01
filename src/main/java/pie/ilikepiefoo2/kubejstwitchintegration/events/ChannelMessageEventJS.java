package pie.ilikepiefoo2.kubejstwitchintegration.events;

import com.github.twitch4j.chat.events.channel.ChannelMessageEvent;
import pie.ilikepiefoo2.kubejstwitchintegration.util.CommonEventJS;

public class ChannelMessageEventJS extends CommonEventJS {
    public final ChannelMessageEvent event;

    public ChannelMessageEventJS( ChannelMessageEvent event )
    {
        this.event = event;
    }
}
