package pie.ilikepiefoo2.kubejstwitchintegration.events;

import com.github.twitch4j.chat.events.channel.MessageDeleteError;
import pie.ilikepiefoo2.kubejstwitchintegration.util.CommonEventJS;

public class MessageDeleteErrorEventJS extends CommonEventJS {
    public final MessageDeleteError error;

    public MessageDeleteErrorEventJS( MessageDeleteError error )
    {
        this.error = error;
    }
}
