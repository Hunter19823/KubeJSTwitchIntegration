package pie.ilikepiefoo2.kubejstwitchintegration.events.chat;

import com.github.twitch4j.chat.events.roomstate.SubscribersOnlyEvent;
import pie.ilikepiefoo2.kubejstwitchintegration.util.CommonEventJS;
/**
 * @author ILIKEPIEFOO2
 */
public class SubscribersOnlyEventJS extends CommonEventJS {
    public final SubscribersOnlyEvent event;

    public SubscribersOnlyEventJS( SubscribersOnlyEvent event )
    {
        this.event = event;
    }
}
