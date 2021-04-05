package pie.ilikepiefoo2.kubejstwitchintegration.events.chat;

import com.github.twitch4j.chat.events.roomstate.BroadcasterLanguageEvent;
import pie.ilikepiefoo2.kubejstwitchintegration.util.CommonEventJS;
/**
 * @author ILIKEPIEFOO2
 */
@Deprecated
public class BroadcasterLanguageEventJS extends CommonEventJS {
    @Deprecated
    public final BroadcasterLanguageEvent event;

    public BroadcasterLanguageEventJS( BroadcasterLanguageEvent event )
    {
        this.event = event;
    }
}
