package pie.ilikepiefoo2.kubejstwitchintegration.events.chat;

import com.github.twitch4j.chat.events.roomstate.EmoteOnlyEvent;
import pie.ilikepiefoo2.kubejstwitchintegration.util.CommonEventJS;
/**
 * @author ILIKEPIEFOO2
 */
public class EmoteOnlyEventJS extends CommonEventJS {
    public final EmoteOnlyEvent event;

    public EmoteOnlyEventJS( EmoteOnlyEvent event )
    {
        this.event = event;
    }
}
