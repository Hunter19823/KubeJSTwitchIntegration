package pie.ilikepiefoo2.kubejstwitchintegration.events;

import com.github.twitch4j.chat.events.channel.UserBanEvent;
import pie.ilikepiefoo2.kubejstwitchintegration.util.CommonEventJS;

public class UserBanEventJS extends CommonEventJS {
    public final UserBanEvent event;

    public UserBanEventJS( UserBanEvent event )
    {
        this.event = event;
    }
}
