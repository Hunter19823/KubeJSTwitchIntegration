package pie.ilikepiefoo2.kubejstwitchintegration.events.chat;

import com.github.twitch4j.chat.events.channel.UserTimeoutEvent;
import pie.ilikepiefoo2.kubejstwitchintegration.util.CommonEventJS;
/**
 * @author ILIKEPIEFOO2
 */
public class UserTimeoutEventJS extends CommonEventJS {
    public final UserTimeoutEvent event;

    public UserTimeoutEventJS( UserTimeoutEvent event )
    {
        this.event = event;
    }
}
