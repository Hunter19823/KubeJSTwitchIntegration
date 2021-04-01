package pie.ilikepiefoo2.kubejstwitchintegration.events;

import com.github.twitch4j.chat.events.roomstate.Robot9000Event;
import pie.ilikepiefoo2.kubejstwitchintegration.util.CommonEventJS;

public class Robot9000EventJS extends CommonEventJS {
    public final Robot9000Event event;

    public Robot9000EventJS( Robot9000Event event )
    {
        this.event = event;
    }
}
