package pie.ilikepiefoo2.kubejstwitchintegration.events;

import com.github.twitch4j.chat.events.channel.DonationEvent;
import pie.ilikepiefoo2.kubejstwitchintegration.util.CommonEventJS;

public class DonationEventJS extends CommonEventJS {
    public final DonationEvent event;

    public DonationEventJS( DonationEvent event )
    {
        this.event = event;
    }
}
