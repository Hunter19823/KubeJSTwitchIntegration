package pie.ilikepiefoo2.kubejstwitchintegration.events;

import com.github.twitch4j.chat.events.channel.ExtendSubscriptionEvent;
import pie.ilikepiefoo2.kubejstwitchintegration.util.CommonEventJS;

public class ExtendSubscriptionEventJS extends CommonEventJS {
    public final ExtendSubscriptionEvent event;

    public ExtendSubscriptionEventJS( ExtendSubscriptionEvent event )
    {
        this.event = event;
    }
}
