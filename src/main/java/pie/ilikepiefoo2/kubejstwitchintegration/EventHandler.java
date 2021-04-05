package pie.ilikepiefoo2.kubejstwitchintegration;



import dev.latvian.kubejs.script.BindingsEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pie.ilikepiefoo2.kubejstwitchintegration.events.chat.BitsBadgeEarnedEventJS;
import pie.ilikepiefoo2.kubejstwitchintegration.events.chat.BroadcasterLanguageEventJS;
import pie.ilikepiefoo2.kubejstwitchintegration.events.chat.ChannelJoinEventJS;
import pie.ilikepiefoo2.kubejstwitchintegration.events.chat.ChannelLeaveEventJS;
import pie.ilikepiefoo2.kubejstwitchintegration.events.chat.ChannelMessageActionEventJS;
import pie.ilikepiefoo2.kubejstwitchintegration.events.chat.ChannelMessageEventJS;
import pie.ilikepiefoo2.kubejstwitchintegration.events.chat.ChannelModEventJS;
import pie.ilikepiefoo2.kubejstwitchintegration.events.chat.ChannelNoticeEventJS;
import pie.ilikepiefoo2.kubejstwitchintegration.events.chat.ChannelStateEventJS;
import pie.ilikepiefoo2.kubejstwitchintegration.events.chat.CheerEventJS;
import pie.ilikepiefoo2.kubejstwitchintegration.events.chat.ClearChatEventJS;
import pie.ilikepiefoo2.kubejstwitchintegration.events.chat.CommandEventJS;
import pie.ilikepiefoo2.kubejstwitchintegration.events.chat.DonationEventJS;
import pie.ilikepiefoo2.kubejstwitchintegration.events.chat.EmoteOnlyEventJS;
import pie.ilikepiefoo2.kubejstwitchintegration.events.chat.ExtendSubscriptionEventJS;
import pie.ilikepiefoo2.kubejstwitchintegration.events.chat.FollowEventJS;
import pie.ilikepiefoo2.kubejstwitchintegration.events.chat.FollowersOnlyEventJS;
import pie.ilikepiefoo2.kubejstwitchintegration.events.chat.GiftSubUpgradeEventJS;
import pie.ilikepiefoo2.kubejstwitchintegration.events.chat.GiftSubscriptionsEventJS;
import pie.ilikepiefoo2.kubejstwitchintegration.events.chat.HostOffEventJS;
import pie.ilikepiefoo2.kubejstwitchintegration.events.chat.HostOnEventJS;
import pie.ilikepiefoo2.kubejstwitchintegration.events.chat.IRCMessageEventJS;
import pie.ilikepiefoo2.kubejstwitchintegration.events.chat.ListModsEventJS;
import pie.ilikepiefoo2.kubejstwitchintegration.events.chat.ListVipsEventJS;
import pie.ilikepiefoo2.kubejstwitchintegration.events.chat.MessageDeleteErrorEventJS;
import pie.ilikepiefoo2.kubejstwitchintegration.events.chat.MessageDeleteSuccessEventJS;
import pie.ilikepiefoo2.kubejstwitchintegration.events.chat.PayForwardEventJS;
import pie.ilikepiefoo2.kubejstwitchintegration.events.chat.PrimeGiftReceivedEventJS;
import pie.ilikepiefoo2.kubejstwitchintegration.events.chat.PrimeSubUpgradeEventJS;
import pie.ilikepiefoo2.kubejstwitchintegration.events.chat.RaidCancellationEventJS;
import pie.ilikepiefoo2.kubejstwitchintegration.events.chat.RaidEventJS;
import pie.ilikepiefoo2.kubejstwitchintegration.events.chat.RewardGiftEventJS;
import pie.ilikepiefoo2.kubejstwitchintegration.events.chat.RitualEventJS;
import pie.ilikepiefoo2.kubejstwitchintegration.events.chat.Robot9000EventJS;
import pie.ilikepiefoo2.kubejstwitchintegration.events.chat.SlowModeEventJS;
import pie.ilikepiefoo2.kubejstwitchintegration.events.chat.SubscribersOnlyEventJS;
import pie.ilikepiefoo2.kubejstwitchintegration.events.chat.SubscriptionEventJS;
import pie.ilikepiefoo2.kubejstwitchintegration.events.chat.UserBanEventJS;
import pie.ilikepiefoo2.kubejstwitchintegration.events.chat.UserStateEventJS;
import pie.ilikepiefoo2.kubejstwitchintegration.events.chat.UserTimeoutEventJS;
import pie.ilikepiefoo2.kubejstwitchintegration.util.CommonEventJS;
import pie.ilikepiefoo2.kubejstwitchintegration.util.TwitchWrapper;
import pie.ilikepiefoo2.twitchintegration.TwitchClientInitEvent;
import pie.ilikepiefoo2.twitchintegration.TwitchConfigHandler;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import static pie.ilikepiefoo2.kubejstwitchintegration.KubeJSEvents.*;

/**
 * @author ILIKEPIEFOO2
 */
public class EventHandler {
    private static final Logger LOGGER = LogManager.getLogger(EventHandler.class);
    private static boolean clientBound = false;

    public static void onKubeJSBindingsEvent( BindingsEvent event)
    {
        LOGGER.info("Registering Twitch Bindings.");
        TwitchWrapper wrapper = new TwitchWrapper();
        event.add("twitch", wrapper);
        event.add("Twitch", wrapper);
        event.add("twitch4j", wrapper);
        event.add("Twitch4j", wrapper);
    }

    public static void onCommonSetup( FMLCommonSetupEvent event ){
        LOGGER.info("Common setup.");
        if(!clientBound) {
            onClientCreation(null);
        }
    }

    public static void onClientCreation( TwitchClientInitEvent event )
    {
        clientBound = true;
        LOGGER.info("Reloading Twitch Event Manager.");
        registerTwitchChatEvents(event);
    }

    private static void loadRequired() {
        try{
            Class.forName("com.neovisionaries.ws.client.WebSocket");
            Class.forName("com.neovisionaries.ws.client.WebSocketError");
        }catch (Exception e){
            LOGGER.error("Unable To load Required Websocket Classes for some twitch Events... {}",e);
        }
    }

    private static void registerTwitchChatEvents( TwitchClientInitEvent event )
    {
        LOGGER.info("Registering Twitch Chat Event Manager.");
        loadRequired();
        registerEventManager(BITS_BADGE_EARNED_EVENT, "com.github.twitch4j.chat.events.channel.BitsBadgeEarnedEvent", BitsBadgeEarnedEventJS.class);
        registerEventManager(BROADCASTER_LANGUAGE_EVENT, "com.github.twitch4j.chat.events.roomstate.BroadcasterLanguageEvent", BroadcasterLanguageEventJS.class);
        registerEventManager(CHANNEL_JOIN_EVENT, "com.github.twitch4j.chat.events.channel.ChannelJoinEvent", ChannelJoinEventJS.class);
        registerEventManager(CHANNEL_LEAVE_EVENT, "com.github.twitch4j.chat.events.channel.ChannelLeaveEvent", ChannelLeaveEventJS.class);
        registerEventManager(CHANNEL_MESSAGE_ACTION_EVENT, "com.github.twitch4j.chat.events.channel.ChannelMessageActionEvent", ChannelMessageActionEventJS.class);
        registerEventManager(CHANNEL_MESSAGE_EVENT, "com.github.twitch4j.chat.events.channel.ChannelMessageEvent", ChannelMessageEventJS.class);
        registerEventManager(CHANNEL_MOD_EVENT, "com.github.twitch4j.chat.events.channel.ChannelModEvent", ChannelModEventJS.class);
        registerEventManager(CHANNEL_NOTICE_EVENT, "com.github.twitch4j.chat.events.channel.ChannelNoticeEvent", ChannelNoticeEventJS.class);
        registerEventManager(CHANNEL_STATE_EVENT, "com.github.twitch4j.chat.events.channel.ChannelStateEvent", ChannelStateEventJS.class);
        registerEventManager(CHEER_EVENT, "com.github.twitch4j.chat.events.channel.CheerEvent", CheerEventJS.class);
        registerEventManager(CLEAR_CHAT_EVENT, "com.github.twitch4j.chat.events.channel.ClearChatEvent", ClearChatEventJS.class);
        registerEventManager(COMMAND_EVENT, "com.github.twitch4j.chat.events.CommandEvent", CommandEventJS.class);
        registerEventManager(DONATION_EVENT, "com.github.twitch4j.chat.events.channel.DonationEvent", DonationEventJS.class);
        registerEventManager(EMOTE_ONLY_EVENT, "com.github.twitch4j.chat.events.roomstate.EmoteOnlyEvent", EmoteOnlyEventJS.class);
        registerEventManager(EXTEND_SUBSCRIPTION_EVENT, "com.github.twitch4j.chat.events.channel.ExtendSubscriptionEvent", ExtendSubscriptionEventJS.class);
        registerEventManager(FOLLOWERS_ONLY_EVENT, "com.github.twitch4j.chat.events.roomstate.FollowersOnlyEvent", FollowersOnlyEventJS.class);
        registerEventManager(FOLLOW_EVENT, "com.github.twitch4j.chat.events.channel.FollowEvent", FollowEventJS.class);
        registerEventManager(GIFT_SUBSCRIPTION_EVENT, "com.github.twitch4j.chat.events.channel.GiftSubscriptionsEvent", GiftSubscriptionsEventJS.class);
        registerEventManager(GIFT_SUBSCRIPTION_UPGRADE_EVENT, "com.github.twitch4j.chat.events.channel.GiftSubUpgradeEvent", GiftSubUpgradeEventJS.class);
        registerEventManager(HOST_OFF_EVENT, "com.github.twitch4j.chat.events.channel.HostOffEvent", HostOffEventJS.class);
        registerEventManager(HOST_ON_EVENT, "com.github.twitch4j.chat.events.channel.HostOnEvent", HostOnEventJS.class);
        registerEventManager(IRC_MESSAGE_EVENT, "com.github.twitch4j.chat.events.channel.IRCMessageEvent", IRCMessageEventJS.class);
        registerEventManager(LIST_MODS_EVENT, "com.github.twitch4j.chat.events.channel.ListModsEvent", ListModsEventJS.class);
        registerEventManager(LIST_VIPS_EVENT, "com.github.twitch4j.chat.events.channel.ListVipsEvent", ListVipsEventJS.class);
        registerEventManager(MESSAGE_DELETE_ERROR_EVENT, "com.github.twitch4j.chat.events.channel.MessageDeleteError", MessageDeleteErrorEventJS.class);
        registerEventManager(MESSAGE_DELETE_SUCCESS_EVENT, "com.github.twitch4j.chat.events.channel.MessageDeleteSuccess", MessageDeleteSuccessEventJS.class);
        registerEventManager(PAY_FORWARD_EVENT, "com.github.twitch4j.chat.events.channel.PayForwardEvent", PayForwardEventJS.class);
        registerEventManager(PRIME_GIFT_SUBSCRIPTION_EVENT, "com.github.twitch4j.chat.events.channel.PrimeGiftReceivedEvent", PrimeGiftReceivedEventJS.class);
        registerEventManager(PRIME_GIFT_SUBSCRIPTION_UPGRADE_EVENT, "com.github.twitch4j.chat.events.channel.PrimeSubUpgradeEvent", PrimeSubUpgradeEventJS.class);
        registerEventManager(RAID_CANCELLATION_EVENT, "com.github.twitch4j.chat.events.channel.RaidCancellationEvent", RaidCancellationEventJS.class);
        registerEventManager(RAID_EVENT, "com.github.twitch4j.chat.events.channel.RaidEvent", RaidEventJS.class);
        registerEventManager(REWARD_GIFT_EVENT, "com.github.twitch4j.chat.events.channel.RewardGiftEvent", RewardGiftEventJS.class);
        registerEventManager(RITUAL_EVENT, "com.github.twitch4j.chat.events.channel.RitualEvent", RitualEventJS.class);
        registerEventManager(ROBOT_9000_EVENT, "com.github.twitch4j.chat.events.roomstate.Robot9000Event", Robot9000EventJS.class);
        registerEventManager(SLOW_MODE_EVENT, "com.github.twitch4j.chat.events.roomstate.SlowModeEvent", SlowModeEventJS.class);
        registerEventManager(SUBSCRIPTION_ONLY_EVENT, "com.github.twitch4j.chat.events.roomstate.SubscribersOnlyEvent", SubscribersOnlyEventJS.class);
        registerEventManager(SUBSCRIPTION_EVENT, "com.github.twitch4j.chat.events.channel.SubscriptionEvent", SubscriptionEventJS.class);
        registerEventManager(USER_BAN_EVENT, "com.github.twitch4j.chat.events.channel.UserBanEvent", UserBanEventJS.class);
        registerEventManager(USER_STATE_EVENT, "com.github.twitch4j.chat.events.channel.UserStateEvent", UserStateEventJS.class);
        registerEventManager(USER_TIMEOUT_EVENT, "com.github.twitch4j.chat.events.channel.UserTimeoutEvent", UserTimeoutEventJS.class);
        LOGGER.info("Finished Reloading Twitch Chat Event Manager.");
    }

    private static void registerEventManager( String id, Class<?> eventClass, Class<? extends CommonEventJS> eventJSClass)
    {
        LOGGER.info("Registering Twitch Event {}",id);
        final Constructor<? extends CommonEventJS> constructor;
        try {
            constructor = eventJSClass.getConstructor(eventClass);
            TwitchConfigHandler.getClient().getEventManager().onEvent(eventClass,
                    event -> {
                        try {
                            constructor.newInstance(event).postCommon(id);
                        } catch (InstantiationException e) {
                            LOGGER.error("Error Instantiating KubeJS Twitch Integration Event Handler id {} >> {}",id,e);
                        } catch (IllegalAccessException e) {
                            LOGGER.error("Error Instantiating KubeJS Twitch Integration Event Handler id {} >> {}",id,e);
                        } catch (InvocationTargetException e) {
                            LOGGER.error("Error Instantiating KubeJS Twitch Integration Event Handler id {} >> {}",id,e);
                        } catch (NoClassDefFoundError e) {
                            LOGGER.error("Error Instantiating KubeJS Twitch Integration Event Handler id {} >> {}",id,e);
                        }
                    }
            );
        } catch (NoSuchMethodException e) {
            LOGGER.error("Error Instantiating KubeJS Twitch Integration Event Handler id {} >> {}",id,e);
        } catch (NoClassDefFoundError e) {
            LOGGER.error("Error Instantiating KubeJS Twitch Integration Event Handler id {} >> {}",id,e);
        }
    }
    private static void registerEventManager( String id, String twitchClass, Class<? extends CommonEventJS> eventJSClass)
    {
        Class<?> eventClass = null;
        try {
            eventClass = Class.forName(twitchClass);
            registerEventManager(id, eventClass,eventJSClass);
        } catch (ClassNotFoundException e) {
            LOGGER.error("Error Instantiating KubeJS Twitch Integration Event Handler id {} >> \"{}\" >> {}",id, twitchClass, e);
            //e.printStackTrace();
        }
    }
}
