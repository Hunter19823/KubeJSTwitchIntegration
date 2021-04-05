package pie.ilikepiefoo2.kubejstwitchintegration.events.chat;

import com.github.twitch4j.chat.events.channel.GiftSubUpgradeEvent;
import pie.ilikepiefoo2.kubejstwitchintegration.util.CommonEventJS;
/**
 * @author ILIKEPIEFOO2
 */
public class GiftSubUpgradeEventJS extends CommonEventJS {
    public final GiftSubUpgradeEvent event;

    public GiftSubUpgradeEventJS( GiftSubUpgradeEvent event )
    {
        this.event = event;
    }
}
