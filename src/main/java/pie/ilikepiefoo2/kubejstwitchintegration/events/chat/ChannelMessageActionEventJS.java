package pie.ilikepiefoo2.kubejstwitchintegration.events.chat;

import com.github.twitch4j.chat.events.channel.ChannelMessageActionEvent;
import pie.ilikepiefoo2.kubejstwitchintegration.util.CommonEventJS;
/**
 * @author ILIKEPIEFOO2
 */
public class ChannelMessageActionEventJS extends CommonEventJS {
    public final ChannelMessageActionEvent event;

    public ChannelMessageActionEventJS( ChannelMessageActionEvent event )
    {
        this.event = event;
    }
}
