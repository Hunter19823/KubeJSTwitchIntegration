package pie.ilikepiefoo2.kubejstwitchintegration.events;

import com.github.twitch4j.chat.events.channel.RewardGiftEvent;
import pie.ilikepiefoo2.kubejstwitchintegration.util.CommonEventJS;

public class RewardGiftEventJS extends CommonEventJS {
    public final RewardGiftEvent event;

    public RewardGiftEventJS( RewardGiftEvent event )
    {
        this.event = event;
    }
}
