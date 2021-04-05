package pie.ilikepiefoo2.kubejstwitchintegration.events.chat;

import com.github.twitch4j.chat.events.channel.RaidEvent;
import pie.ilikepiefoo2.kubejstwitchintegration.util.CommonEventJS;
/**
 * @author ILIKEPIEFOO2
 */
public class RaidEventJS extends CommonEventJS {
    public final RaidEvent event;

    public RaidEventJS( RaidEvent event )
    {
        this.event = event;
    }
}
