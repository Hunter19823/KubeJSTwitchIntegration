package pie.ilikepiefoo2.kubejstwitchintegration.events.chat;

import com.github.twitch4j.chat.events.channel.ListModsEvent;
import pie.ilikepiefoo2.kubejstwitchintegration.util.CommonEventJS;
/**
 * @author ILIKEPIEFOO2
 */
public class ListModsEventJS extends CommonEventJS {
    public final ListModsEvent event;

    public ListModsEventJS( ListModsEvent event )
    {
        this.event = event;
    }
}
