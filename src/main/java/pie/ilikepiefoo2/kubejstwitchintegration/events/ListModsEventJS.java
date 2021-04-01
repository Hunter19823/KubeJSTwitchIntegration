package pie.ilikepiefoo2.kubejstwitchintegration.events;

import com.github.twitch4j.chat.events.channel.ListModsEvent;
import pie.ilikepiefoo2.kubejstwitchintegration.util.CommonEventJS;

public class ListModsEventJS extends CommonEventJS {
    public final ListModsEvent event;

    public ListModsEventJS( ListModsEvent event )
    {
        this.event = event;
    }
}
