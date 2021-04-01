package pie.ilikepiefoo2.kubejstwitchintegration.events;

import com.github.twitch4j.chat.events.roomstate.FollowersOnlyEvent;
import pie.ilikepiefoo2.kubejstwitchintegration.util.CommonEventJS;

public class FollowersOnlyEventJS extends CommonEventJS {
    public final FollowersOnlyEvent event;

    public FollowersOnlyEventJS( FollowersOnlyEvent event )
    {
        this.event = event;
    }
}
