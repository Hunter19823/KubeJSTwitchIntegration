package pie.ilikepiefoo2.kubejstwitchintegration.events;

import com.github.twitch4j.chat.events.channel.PayForwardEvent;
import pie.ilikepiefoo2.kubejstwitchintegration.util.CommonEventJS;

public class PayForwardEventJS extends CommonEventJS {
    public final PayForwardEvent event;

    public PayForwardEventJS( PayForwardEvent event )
    {
        this.event = event;
    }
}
