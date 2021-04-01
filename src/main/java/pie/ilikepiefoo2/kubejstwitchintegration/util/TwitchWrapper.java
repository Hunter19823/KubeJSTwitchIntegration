package pie.ilikepiefoo2.kubejstwitchintegration.util;

import com.github.philippheuer.events4j.core.EventManager;
import com.github.twitch4j.TwitchClient;
import pie.ilikepiefoo2.twitchintegration.TwitchConfigHandler;

public class TwitchWrapper {
    public TwitchWrapper()
    {}

    public TwitchClient getClient()
    {
        return TwitchConfigHandler.getClient();
    }

    public boolean hasTwitchChat()
    {
        return TwitchConfigHandler.COMMON.twitchChat.get();
    }

    public boolean hasTwitchHelix()
    {
        return TwitchConfigHandler.COMMON.twitchHelix.get();
    }

    @Deprecated
    public boolean hasTwitchKraken()
    {
        return TwitchConfigHandler.COMMON.twitchKraken.get();
    }

    public boolean hasPubSub()
    {
        return TwitchConfigHandler.COMMON.twitchPubSub.get();
    }

    public boolean hasGraphQL()
    {
        return TwitchConfigHandler.COMMON.graphQL.get();
    }

    public boolean hasExtensions()
    {
        return TwitchConfigHandler.COMMON.extensions.get();
    }

    public boolean hasTMI()
    {
        return TwitchConfigHandler.COMMON.tmi.get();
    }

    public EventManager getEventManager()
    {
        return getClient().getEventManager();
    }
}
