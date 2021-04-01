package pie.ilikepiefoo2.kubejstwitchintegration.events;

import com.github.twitch4j.chat.events.channel.GiftSubscriptionsEvent;
import pie.ilikepiefoo2.kubejstwitchintegration.util.CommonEventJS;

public class GiftSubscriptionsEventJS extends CommonEventJS {
    public final GiftSubscriptionsEvent event;

    public GiftSubscriptionsEventJS( GiftSubscriptionsEvent event )
    {
        this.event = event;
    }
}
