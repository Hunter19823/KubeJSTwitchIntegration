package pie.ilikepiefoo2.kubejstwitchintegration.events;

import com.github.twitch4j.chat.events.channel.RitualEvent;
import pie.ilikepiefoo2.kubejstwitchintegration.util.CommonEventJS;

public class RitualEventJS extends CommonEventJS {
    public final RitualEvent event;

    public RitualEventJS( RitualEvent event )
    {
        this.event = event;
    }
}
