package pie.ilikepiefoo2.kubejstwitchintegration.events;

import com.github.twitch4j.chat.events.roomstate.SlowModeEvent;
import pie.ilikepiefoo2.kubejstwitchintegration.util.CommonEventJS;

public class SlowModeEventJS extends CommonEventJS {
    public final SlowModeEvent event;

    public SlowModeEventJS( SlowModeEvent event )
    {
        this.event = event;
    }
}
