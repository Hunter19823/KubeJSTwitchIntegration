package pie.ilikepiefoo2.kubejstwitchintegration.events;

import com.github.twitch4j.chat.events.channel.GiftSubUpgradeEvent;
import pie.ilikepiefoo2.kubejstwitchintegration.util.CommonEventJS;

public class GiftSubUpgradeEventJS extends CommonEventJS {
    public final GiftSubUpgradeEvent event;

    public GiftSubUpgradeEventJS( GiftSubUpgradeEvent event )
    {
        this.event = event;
    }
}
