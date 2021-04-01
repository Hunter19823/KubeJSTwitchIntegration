package pie.ilikepiefoo2.kubejstwitchintegration.events;

import com.github.twitch4j.chat.events.channel.ListVipsEvent;
import pie.ilikepiefoo2.kubejstwitchintegration.util.CommonEventJS;

public class ListVipsEventJS extends CommonEventJS {
    public final ListVipsEvent event;

    public ListVipsEventJS( ListVipsEvent event )
    {
        this.event = event;
    }
}
