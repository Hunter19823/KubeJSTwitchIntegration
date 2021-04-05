package pie.ilikepiefoo2.kubejstwitchintegration.events.chat;

import com.github.twitch4j.chat.events.channel.HostOnEvent;
import pie.ilikepiefoo2.kubejstwitchintegration.util.CommonEventJS;
/**
 * @author ILIKEPIEFOO2
 */
public class HostOnEventJS extends CommonEventJS {
    public final HostOnEvent event;

    public HostOnEventJS( HostOnEvent event )
    {
        this.event = event;
    }
}
