package pie.ilikepiefoo2.kubejstwitchintegration.events;

import com.github.twitch4j.chat.events.channel.ChannelNoticeEvent;
import pie.ilikepiefoo2.kubejstwitchintegration.util.CommonEventJS;

public class ChannelNoticeEventJS extends CommonEventJS {
    public final ChannelNoticeEvent event;

    public ChannelNoticeEventJS( ChannelNoticeEvent event )
    {
        this.event = event;
    }
}
