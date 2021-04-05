package pie.ilikepiefoo2.kubejstwitchintegration.events.chat;

import com.github.twitch4j.chat.events.channel.RewardGiftEvent;
import pie.ilikepiefoo2.kubejstwitchintegration.util.CommonEventJS;
/**
 * @author ILIKEPIEFOO2
 */
public class RewardGiftEventJS extends CommonEventJS {
    public final RewardGiftEvent event;

    public RewardGiftEventJS( RewardGiftEvent event )
    {
        this.event = event;
    }
}
