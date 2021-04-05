package pie.ilikepiefoo2.kubejstwitchintegration.events.chat;

import com.github.twitch4j.chat.events.channel.PayForwardEvent;
import pie.ilikepiefoo2.kubejstwitchintegration.util.CommonEventJS;
/**
 * @author ILIKEPIEFOO2
 */
public class PayForwardEventJS extends CommonEventJS {
    public final PayForwardEvent event;

    public PayForwardEventJS( PayForwardEvent event )
    {
        this.event = event;
    }
}
