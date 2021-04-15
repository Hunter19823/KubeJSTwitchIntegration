package pie.ilikepiefoo2.kubejstwitchintegration.events.autogenerated.chat.events.channel;


public class ChannelMessageEventJS extends pie.ilikepiefoo2.kubejstwitchintegration.util.CommonEventJS {
    public final pie.ilikepiefoo2.twitchintegration.events.autogenerated.com.github.twitch4j.chat.events.channel.ChannelMessageEventFE event;

    public ChannelMessageEventJS( pie.ilikepiefoo2.twitchintegration.events.autogenerated.com.github.twitch4j.chat.events.channel.ChannelMessageEventFE event )
    {
        this.event = event;
    }

    public boolean equals( java.lang.Object arg0 ) // Declaring Class: pie.ilikepiefoo2.twitchintegration.events.autogenerated.com.github.twitch4j.chat.events.channel.ChannelMessageEventFE
    {
        return this.event.equals( arg0 );
    }
    public java.lang.String toString( ) // Declaring Class: pie.ilikepiefoo2.twitchintegration.events.autogenerated.com.github.twitch4j.chat.events.channel.ChannelMessageEventFE
    {
        return this.event.toString(  );
    }
    public int hashCode( ) // Declaring Class: pie.ilikepiefoo2.twitchintegration.events.autogenerated.com.github.twitch4j.chat.events.channel.ChannelMessageEventFE
    {
        return this.event.hashCode(  );
    }
    public java.lang.String getMessage( ) // Declaring Class: pie.ilikepiefoo2.twitchintegration.events.autogenerated.com.github.twitch4j.chat.events.channel.ChannelMessageEventFE
    {
        return this.event.getMessage(  );
    }
    public java.util.Set getPermissions( ) // Declaring Class: pie.ilikepiefoo2.twitchintegration.events.autogenerated.com.github.twitch4j.chat.events.channel.ChannelMessageEventFE
    {
        return this.event.getPermissions(  );
    }
    public void timeout( java.lang.String arg0, java.time.Duration arg1, java.lang.String arg2 ) // Declaring Class: pie.ilikepiefoo2.twitchintegration.events.autogenerated.com.github.twitch4j.chat.events.channel.ChannelMessageEventFE
    {
        this.event.timeout( arg0,arg1,arg2 );
    }
    public com.github.twitch4j.common.events.domain.EventChannel getChannel( ) // Declaring Class: pie.ilikepiefoo2.twitchintegration.events.autogenerated.com.github.twitch4j.chat.events.channel.ChannelMessageEventFE
    {
        return this.event.getChannel(  );
    }
    public java.util.List getFlags( ) // Declaring Class: pie.ilikepiefoo2.twitchintegration.events.autogenerated.com.github.twitch4j.chat.events.channel.ChannelMessageEventFE
    {
        return this.event.getFlags(  );
    }
    public int getSubscriberMonths( ) // Declaring Class: pie.ilikepiefoo2.twitchintegration.events.autogenerated.com.github.twitch4j.chat.events.channel.ChannelMessageEventFE
    {
        return this.event.getSubscriberMonths(  );
    }
    public boolean isSkipSubsModeMessage( ) // Declaring Class: pie.ilikepiefoo2.twitchintegration.events.autogenerated.com.github.twitch4j.chat.events.channel.ChannelMessageEventFE
    {
        return this.event.isSkipSubsModeMessage(  );
    }
    public boolean isHighlightedMessage( ) // Declaring Class: pie.ilikepiefoo2.twitchintegration.events.autogenerated.com.github.twitch4j.chat.events.channel.ChannelMessageEventFE
    {
        return this.event.isHighlightedMessage(  );
    }
    public int getSubscriptionTier( ) // Declaring Class: pie.ilikepiefoo2.twitchintegration.events.autogenerated.com.github.twitch4j.chat.events.channel.ChannelMessageEventFE
    {
        return this.event.getSubscriptionTier(  );
    }
    public com.github.twitch4j.common.util.ChatReply getReplyInfo( ) // Declaring Class: pie.ilikepiefoo2.twitchintegration.events.autogenerated.com.github.twitch4j.chat.events.channel.ChannelMessageEventFE
    {
        return this.event.getReplyInfo(  );
    }
    public com.github.twitch4j.chat.events.channel.IRCMessageEvent getMessageEvent( ) // Declaring Class: pie.ilikepiefoo2.twitchintegration.events.autogenerated.com.github.twitch4j.chat.events.channel.ChannelMessageEventFE
    {
        return this.event.getMessageEvent(  );
    }
    public java.util.Optional getCustomRewardId( ) // Declaring Class: pie.ilikepiefoo2.twitchintegration.events.autogenerated.com.github.twitch4j.chat.events.channel.ChannelMessageEventFE
    {
        return this.event.getCustomRewardId(  );
    }
    public java.time.Instant getFiredAtInstant( ) // Declaring Class: pie.ilikepiefoo2.twitchintegration.events.autogenerated.com.github.twitch4j.chat.events.channel.ChannelMessageEventFE
    {
        return this.event.getFiredAtInstant(  );
    }
    public void setServiceMediator( com.github.philippheuer.events4j.api.service.IServiceMediator arg0 ) // Declaring Class: pie.ilikepiefoo2.twitchintegration.events.autogenerated.com.github.twitch4j.chat.events.channel.ChannelMessageEventFE
    {
        this.event.setServiceMediator( arg0 );
    }
    public void setEventId( java.lang.String arg0 ) // Declaring Class: pie.ilikepiefoo2.twitchintegration.events.autogenerated.com.github.twitch4j.chat.events.channel.ChannelMessageEventFE
    {
        this.event.setEventId( arg0 );
    }
    public void setFiredAtInstant( java.time.Instant arg0 ) // Declaring Class: pie.ilikepiefoo2.twitchintegration.events.autogenerated.com.github.twitch4j.chat.events.channel.ChannelMessageEventFE
    {
        this.event.setFiredAtInstant( arg0 );
    }
    public java.lang.String getEventId( ) // Declaring Class: pie.ilikepiefoo2.twitchintegration.events.autogenerated.com.github.twitch4j.chat.events.channel.ChannelMessageEventFE
    {
        return this.event.getEventId(  );
    }
    public void setFiredAt( java.util.Calendar arg0 ) // Declaring Class: pie.ilikepiefoo2.twitchintegration.events.autogenerated.com.github.twitch4j.chat.events.channel.ChannelMessageEventFE
    {
        this.event.setFiredAt( arg0 );
    }
    public java.util.Calendar getFiredAt( ) // Declaring Class: pie.ilikepiefoo2.twitchintegration.events.autogenerated.com.github.twitch4j.chat.events.channel.ChannelMessageEventFE
    {
        return this.event.getFiredAt(  );
    }
    public com.github.philippheuer.events4j.api.service.IServiceMediator getServiceMediator( ) // Declaring Class: pie.ilikepiefoo2.twitchintegration.events.autogenerated.com.github.twitch4j.chat.events.channel.ChannelMessageEventFE
    {
        return this.event.getServiceMediator(  );
    }
    public void ban( java.lang.String arg0, java.lang.String arg1 ) // Declaring Class: pie.ilikepiefoo2.twitchintegration.events.autogenerated.com.github.twitch4j.chat.events.channel.ChannelMessageEventFE
    {
        this.event.ban( arg0,arg1 );
    }
    public com.github.twitch4j.common.events.domain.EventUser getUser( ) // Declaring Class: pie.ilikepiefoo2.twitchintegration.events.autogenerated.com.github.twitch4j.chat.events.channel.ChannelMessageEventFE
    {
        return this.event.getUser(  );
    }
    public com.github.twitch4j.chat.TwitchChat getTwitchChat( ) // Declaring Class: pie.ilikepiefoo2.twitchintegration.events.autogenerated.com.github.twitch4j.chat.events.channel.ChannelMessageEventFE
    {
        return this.event.getTwitchChat(  );
    }
    public void unban( java.lang.String arg0 ) // Declaring Class: pie.ilikepiefoo2.twitchintegration.events.autogenerated.com.github.twitch4j.chat.events.channel.ChannelMessageEventFE
    {
        this.event.unban( arg0 );
    }
    public java.lang.String getNonce( ) // Declaring Class: pie.ilikepiefoo2.twitchintegration.events.autogenerated.com.github.twitch4j.chat.events.channel.ChannelMessageEventFE
    {
        return this.event.getNonce(  );
    }
    public void setResult( net.minecraftforge.eventbus.api.Event.Result arg0 ) // Declaring Class: net.minecraftforge.eventbus.api.Event
    {
        this.event.setResult( arg0 );
    }
    public net.minecraftforge.eventbus.api.Event.Result getResult( ) // Declaring Class: net.minecraftforge.eventbus.api.Event
    {
        return this.event.getResult(  );
    }
    public boolean isCanceled( ) // Declaring Class: net.minecraftforge.eventbus.api.Event
    {
        return this.event.isCanceled(  );
    }
    public boolean isCancelable( ) // Declaring Class: net.minecraftforge.eventbus.api.Event
    {
        return this.event.isCancelable(  );
    }
    public void setPhase( net.minecraftforge.eventbus.api.EventPriority arg0 ) // Declaring Class: net.minecraftforge.eventbus.api.Event
    {
        this.event.setPhase( arg0 );
    }
    public net.minecraftforge.eventbus.ListenerList getListenerList( ) // Declaring Class: net.minecraftforge.eventbus.api.Event
    {
        return this.event.getListenerList(  );
    }
    public boolean hasResult( ) // Declaring Class: net.minecraftforge.eventbus.api.Event
    {
        return this.event.hasResult(  );
    }
    public net.minecraftforge.eventbus.api.EventPriority getPhase( ) // Declaring Class: net.minecraftforge.eventbus.api.Event
    {
        return this.event.getPhase(  );
    }
    public void setCanceled( boolean arg0 ) // Declaring Class: net.minecraftforge.eventbus.api.Event
    {
        this.event.setCanceled( arg0 );
    }

}
