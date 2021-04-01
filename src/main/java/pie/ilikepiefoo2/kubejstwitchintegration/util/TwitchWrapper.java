package pie.ilikepiefoo2.kubejstwitchintegration.util;

import com.github.philippheuer.events4j.core.EventManager;
import com.github.twitch4j.TwitchClient;
import com.github.twitch4j.chat.TwitchChat;
import com.github.twitch4j.extensions.TwitchExtensions;
import com.github.twitch4j.graphql.TwitchGraphQL;
import com.github.twitch4j.helix.TwitchHelix;
import com.github.twitch4j.kraken.TwitchKraken;
import com.github.twitch4j.pubsub.TwitchPubSub;
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
    public TwitchChat getTwitchChat(){
        if(hasTwitchChat())
            return getClient().getChat();
        return null;
    }

    public boolean hasTwitchHelix()
    {
        return TwitchConfigHandler.COMMON.twitchHelix.get();
    }
    public TwitchHelix getHelix(){
        if(hasTwitchHelix())
            return getClient().getHelix();
        return null;
    }

    @Deprecated
    public boolean hasTwitchKraken()
    {
        return TwitchConfigHandler.COMMON.twitchKraken.get();
    }
    @Deprecated
    public TwitchKraken getKraken(){
        if(hasTwitchHelix())
            return getClient().getKraken();
        return null;
    }

    public boolean hasPubSub()
    {
        return TwitchConfigHandler.COMMON.twitchPubSub.get();
    }
    public TwitchPubSub getPubSub(){
        if(hasPubSub())
            return getClient().getPubSub();
        return null;
    }

    public boolean hasGraphQL()
    {
        return TwitchConfigHandler.COMMON.graphQL.get();
    }
    public TwitchGraphQL getGraphQL(){
        if(hasGraphQL())
            return getClient().getGraphQL();
        return null;
    }

    public boolean hasExtensions()
    {
        return TwitchConfigHandler.COMMON.extensions.get();
    }
    public TwitchExtensions getExtensions(){
        if(hasExtensions())
            return getClient().getExtensions();
        return null;
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
