package pie.ilikepiefoo2.kubejstwitchintegration.events.chat;

import com.github.twitch4j.chat.events.channel.RaidCancellationEvent;
import pie.ilikepiefoo2.kubejstwitchintegration.util.CommonEventJS;
/**
 * @author ILIKEPIEFOO2
 */
public class RaidCancellationEventJS extends CommonEventJS {
    public final RaidCancellationEvent event;

    public RaidCancellationEventJS( RaidCancellationEvent event )
    {
        this.event = event;
    }
}
