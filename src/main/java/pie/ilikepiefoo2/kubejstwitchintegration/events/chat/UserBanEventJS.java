package pie.ilikepiefoo2.kubejstwitchintegration.events.chat;

import com.github.twitch4j.chat.events.channel.UserBanEvent;
import pie.ilikepiefoo2.kubejstwitchintegration.util.CommonEventJS;
/**
 * @author ILIKEPIEFOO2
 */
public class UserBanEventJS extends CommonEventJS {
    public final UserBanEvent event;

    public UserBanEventJS( UserBanEvent event )
    {
        this.event = event;
    }
}
