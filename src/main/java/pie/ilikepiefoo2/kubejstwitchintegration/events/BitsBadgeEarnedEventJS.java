package pie.ilikepiefoo2.kubejstwitchintegration.events;

import com.github.twitch4j.chat.events.channel.BitsBadgeEarnedEvent;
import pie.ilikepiefoo2.kubejstwitchintegration.util.CommonEventJS;

public class BitsBadgeEarnedEventJS extends CommonEventJS {
    public final BitsBadgeEarnedEvent event;
    public BitsBadgeEarnedEventJS( BitsBadgeEarnedEvent event )
    {
        this.event = event;
    }

}
