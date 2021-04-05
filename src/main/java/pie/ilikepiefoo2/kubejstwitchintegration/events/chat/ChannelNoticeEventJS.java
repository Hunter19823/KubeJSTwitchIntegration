package pie.ilikepiefoo2.kubejstwitchintegration.events.chat;

import com.github.twitch4j.chat.events.channel.ChannelNoticeEvent;
import pie.ilikepiefoo2.kubejstwitchintegration.util.CommonEventJS;
/**
 * @author ILIKEPIEFOO2
 */
public class ChannelNoticeEventJS extends CommonEventJS {
    public final ChannelNoticeEvent event;

    public ChannelNoticeEventJS( ChannelNoticeEvent event )
    {
        this.event = event;
    }
}
