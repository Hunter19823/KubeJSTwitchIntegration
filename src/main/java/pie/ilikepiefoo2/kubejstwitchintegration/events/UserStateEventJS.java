package pie.ilikepiefoo2.kubejstwitchintegration.events;

import com.github.twitch4j.chat.events.channel.UserStateEvent;
import pie.ilikepiefoo2.kubejstwitchintegration.util.CommonEventJS;

public class UserStateEventJS extends CommonEventJS {
    public final UserStateEvent event;

    public UserStateEventJS( UserStateEvent event )
    {
        this.event = event;
    }
}
