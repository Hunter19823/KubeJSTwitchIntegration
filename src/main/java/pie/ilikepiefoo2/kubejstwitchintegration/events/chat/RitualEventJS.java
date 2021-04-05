package pie.ilikepiefoo2.kubejstwitchintegration.events.chat;

import com.github.twitch4j.chat.events.channel.RitualEvent;
import pie.ilikepiefoo2.kubejstwitchintegration.util.CommonEventJS;
/**
 * @author ILIKEPIEFOO2
 */
public class RitualEventJS extends CommonEventJS {
    public final RitualEvent event;

    public RitualEventJS( RitualEvent event )
    {
        this.event = event;
    }
}
