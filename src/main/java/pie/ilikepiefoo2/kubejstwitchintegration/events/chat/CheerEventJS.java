package pie.ilikepiefoo2.kubejstwitchintegration.events.chat;

import com.github.twitch4j.chat.events.channel.CheerEvent;
import pie.ilikepiefoo2.kubejstwitchintegration.util.CommonEventJS;
/**
 * @author ILIKEPIEFOO2
 */
public class CheerEventJS extends CommonEventJS {
    public final CheerEvent event;

    public CheerEventJS( CheerEvent event )
    {
        this.event = event;
    }
}
