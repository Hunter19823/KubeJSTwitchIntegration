package pie.ilikepiefoo2.kubejstwitchintegration.events.chat;

import com.github.twitch4j.chat.events.channel.ExtendSubscriptionEvent;
import pie.ilikepiefoo2.kubejstwitchintegration.util.CommonEventJS;
/**
 * @author ILIKEPIEFOO2
 */
public class ExtendSubscriptionEventJS extends CommonEventJS {
    public final ExtendSubscriptionEvent event;

    public ExtendSubscriptionEventJS( ExtendSubscriptionEvent event )
    {
        this.event = event;
    }
}
