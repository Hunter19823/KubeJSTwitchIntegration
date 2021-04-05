package pie.ilikepiefoo2.kubejstwitchintegration.events.chat;

import com.github.twitch4j.chat.events.roomstate.SlowModeEvent;
import pie.ilikepiefoo2.kubejstwitchintegration.util.CommonEventJS;
/**
 * @author ILIKEPIEFOO2
 */
public class SlowModeEventJS extends CommonEventJS {
    public final SlowModeEvent event;

    public SlowModeEventJS( SlowModeEvent event )
    {
        this.event = event;
    }
}
