package pie.ilikepiefoo2.kubejstwitchintegration.events.chat;

import com.github.twitch4j.chat.events.channel.MessageDeleteError;
import pie.ilikepiefoo2.kubejstwitchintegration.util.CommonEventJS;
/**
 * @author ILIKEPIEFOO2
 */
public class MessageDeleteErrorEventJS extends CommonEventJS {
    public final MessageDeleteError error;

    public MessageDeleteErrorEventJS( MessageDeleteError error )
    {
        this.error = error;
    }
}
