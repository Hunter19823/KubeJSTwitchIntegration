package pie.ilikepiefoo2.kubejstwitchintegration.events;

import com.github.twitch4j.chat.events.channel.PrimeSubUpgradeEvent;
import pie.ilikepiefoo2.kubejstwitchintegration.util.CommonEventJS;

public class PrimeSubUpgradeEventJS extends CommonEventJS {
    public final PrimeSubUpgradeEvent event;

    public PrimeSubUpgradeEventJS( PrimeSubUpgradeEvent event )
    {
        this.event = event;
    }
}
