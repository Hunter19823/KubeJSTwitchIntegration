package pie.ilikepiefoo2.kubejstwitchintegration.events.chat;

import com.github.twitch4j.chat.events.channel.SubscriptionEvent;
import pie.ilikepiefoo2.kubejstwitchintegration.util.CommonEventJS;
/**
 * @author ILIKEPIEFOO2
 */
public class SubscriptionEventJS extends CommonEventJS {
    public final SubscriptionEvent event;

    public SubscriptionEventJS( SubscriptionEvent event )
    {
        this.event = event;
    }
}
