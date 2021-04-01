package pie.ilikepiefoo2.kubejstwitchintegration.events;

import com.github.twitch4j.chat.events.channel.FollowEvent;
import pie.ilikepiefoo2.kubejstwitchintegration.util.CommonEventJS;

public class FollowEventJS extends CommonEventJS {
    public final FollowEvent event;

    public FollowEventJS( FollowEvent event )
    {
        this.event = event;
    }
}
