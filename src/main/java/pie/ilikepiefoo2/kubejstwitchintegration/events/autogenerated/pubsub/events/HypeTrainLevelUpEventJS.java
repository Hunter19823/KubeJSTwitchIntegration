package pie.ilikepiefoo2.kubejstwitchintegration.events.autogenerated.pubsub.events;


public class HypeTrainLevelUpEventJS extends pie.ilikepiefoo2.kubejstwitchintegration.util.CommonEventJS {
    public final pie.ilikepiefoo2.twitchintegration.events.autogenerated.com.github.twitch4j.pubsub.events.HypeTrainLevelUpEventFE event;

    public HypeTrainLevelUpEventJS( pie.ilikepiefoo2.twitchintegration.events.autogenerated.com.github.twitch4j.pubsub.events.HypeTrainLevelUpEventFE event )
    {
        this.event = event;
    }

    public boolean equals( java.lang.Object arg0 ) // Declaring Class: pie.ilikepiefoo2.twitchintegration.events.autogenerated.com.github.twitch4j.pubsub.events.HypeTrainLevelUpEventFE
    {
        return this.event.equals( arg0 );
    }
    public java.lang.String toString( ) // Declaring Class: pie.ilikepiefoo2.twitchintegration.events.autogenerated.com.github.twitch4j.pubsub.events.HypeTrainLevelUpEventFE
    {
        return this.event.toString(  );
    }
    public int hashCode( ) // Declaring Class: pie.ilikepiefoo2.twitchintegration.events.autogenerated.com.github.twitch4j.pubsub.events.HypeTrainLevelUpEventFE
    {
        return this.event.hashCode(  );
    }
    public com.github.twitch4j.pubsub.domain.HypeLevelUp getData( ) // Declaring Class: pie.ilikepiefoo2.twitchintegration.events.autogenerated.com.github.twitch4j.pubsub.events.HypeTrainLevelUpEventFE
    {
        return this.event.getData(  );
    }
    public java.time.Instant getFiredAtInstant( ) // Declaring Class: pie.ilikepiefoo2.twitchintegration.events.autogenerated.com.github.twitch4j.pubsub.events.HypeTrainLevelUpEventFE
    {
        return this.event.getFiredAtInstant(  );
    }
    public void setServiceMediator( com.github.philippheuer.events4j.api.service.IServiceMediator arg0 ) // Declaring Class: pie.ilikepiefoo2.twitchintegration.events.autogenerated.com.github.twitch4j.pubsub.events.HypeTrainLevelUpEventFE
    {
        this.event.setServiceMediator( arg0 );
    }
    public void setEventId( java.lang.String arg0 ) // Declaring Class: pie.ilikepiefoo2.twitchintegration.events.autogenerated.com.github.twitch4j.pubsub.events.HypeTrainLevelUpEventFE
    {
        this.event.setEventId( arg0 );
    }
    public void setFiredAtInstant( java.time.Instant arg0 ) // Declaring Class: pie.ilikepiefoo2.twitchintegration.events.autogenerated.com.github.twitch4j.pubsub.events.HypeTrainLevelUpEventFE
    {
        this.event.setFiredAtInstant( arg0 );
    }
    public java.lang.String getEventId( ) // Declaring Class: pie.ilikepiefoo2.twitchintegration.events.autogenerated.com.github.twitch4j.pubsub.events.HypeTrainLevelUpEventFE
    {
        return this.event.getEventId(  );
    }
    public void setFiredAt( java.util.Calendar arg0 ) // Declaring Class: pie.ilikepiefoo2.twitchintegration.events.autogenerated.com.github.twitch4j.pubsub.events.HypeTrainLevelUpEventFE
    {
        this.event.setFiredAt( arg0 );
    }
    public java.util.Calendar getFiredAt( ) // Declaring Class: pie.ilikepiefoo2.twitchintegration.events.autogenerated.com.github.twitch4j.pubsub.events.HypeTrainLevelUpEventFE
    {
        return this.event.getFiredAt(  );
    }
    public com.github.philippheuer.events4j.api.service.IServiceMediator getServiceMediator( ) // Declaring Class: pie.ilikepiefoo2.twitchintegration.events.autogenerated.com.github.twitch4j.pubsub.events.HypeTrainLevelUpEventFE
    {
        return this.event.getServiceMediator(  );
    }
    public java.lang.String getChannelId( ) // Declaring Class: pie.ilikepiefoo2.twitchintegration.events.autogenerated.com.github.twitch4j.pubsub.events.HypeTrainLevelUpEventFE
    {
        return this.event.getChannelId(  );
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
