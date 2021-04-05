package pie.ilikepiefoo2.kubejstwitchintegration.events.chat;

import com.github.twitch4j.chat.events.channel.FollowEvent;
import pie.ilikepiefoo2.kubejstwitchintegration.util.CommonEventJS;
/**
 * @author ILIKEPIEFOO2
 */
public class FollowEventJS extends CommonEventJS {
    public final FollowEvent event;

    public FollowEventJS( FollowEvent event )
    {
        this.event = event;
    }
}
