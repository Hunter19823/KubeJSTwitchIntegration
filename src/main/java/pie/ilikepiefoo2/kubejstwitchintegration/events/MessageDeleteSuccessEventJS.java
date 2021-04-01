package pie.ilikepiefoo2.kubejstwitchintegration.events;

import com.github.twitch4j.chat.events.channel.MessageDeleteSuccess;
import pie.ilikepiefoo2.kubejstwitchintegration.util.CommonEventJS;

public class MessageDeleteSuccessEventJS extends CommonEventJS {
    public final MessageDeleteSuccess event;

    public MessageDeleteSuccessEventJS( MessageDeleteSuccess event )
    {
        this.event = event;
    }
}
