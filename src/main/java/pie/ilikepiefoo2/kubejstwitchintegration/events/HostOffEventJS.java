package pie.ilikepiefoo2.kubejstwitchintegration.events;

import com.github.twitch4j.chat.events.channel.HostOffEvent;
import pie.ilikepiefoo2.kubejstwitchintegration.util.CommonEventJS;

public class HostOffEventJS  extends CommonEventJS {
    public final HostOffEvent event;

    public HostOffEventJS( HostOffEvent event )
    {
        this.event = event;
    }
}
