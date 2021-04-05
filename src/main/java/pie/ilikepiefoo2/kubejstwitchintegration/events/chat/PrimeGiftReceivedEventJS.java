package pie.ilikepiefoo2.kubejstwitchintegration.events.chat;

import com.github.twitch4j.chat.events.channel.PrimeGiftReceivedEvent;
import pie.ilikepiefoo2.kubejstwitchintegration.util.CommonEventJS;
/**
 * @author ILIKEPIEFOO2
 */
public class PrimeGiftReceivedEventJS extends CommonEventJS {
    public final PrimeGiftReceivedEvent event;

    public PrimeGiftReceivedEventJS( PrimeGiftReceivedEvent event )
    {
        this.event = event;
    }
}
