package pie.ilikepiefoo2.kubejstwitchintegration;

import com.github.twitch4j.chat.events.CommandEvent;
import com.github.twitch4j.chat.events.TwitchEvent;
import com.github.twitch4j.chat.events.channel.*;
import com.github.twitch4j.chat.events.roomstate.*;
import dev.latvian.kubejs.script.BindingsEvent;
import net.minecraftforge.fml.event.server.FMLServerStartedEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pie.ilikepiefoo2.kubejstwitchintegration.events.*;
import pie.ilikepiefoo2.kubejstwitchintegration.util.CommonEventJS;
import pie.ilikepiefoo2.kubejstwitchintegration.util.TwitchWrapper;
import pie.ilikepiefoo2.twitchintegration.TwitchConfigHandler;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import static pie.ilikepiefoo2.kubejstwitchintegration.KubeJSEvents.*;

/**
 * @author ILIKEPIEFOO2
 */
public class EventHandler {
    private static final Logger LOGGER = LogManager.getLogger(EventHandler.class);

    public static void onKubeJSBindingsEvent( BindingsEvent event)
    {
        LOGGER.info("Registering Twitch Bindings.");
        TwitchWrapper wrapper = new TwitchWrapper();
        event.add("twitch", wrapper);
        event.add("Twitch", wrapper);
        event.add("twitch4j", wrapper);
        event.add("Twitch4j", wrapper);
    }
    // TODO replace with TwitchClientInitEvent
    public static void onClientCreation( FMLServerStartedEvent event )
    {
        LOGGER.info("Reloading Twitch Event Manager.");
        registerEventManager(BITS_BADGE_EARNED_EVENT,BitsBadgeEarnedEvent.class,BitsBadgeEarnedEventJS.class);
        registerEventManager(BROADCASTER_LANGUAGE_EVENT, BroadcasterLanguageEvent.class, BroadcasterLanguageEventJS.class);
        registerEventManager(CHANNEL_JOIN_EVENT, ChannelJoinEvent.class, ChannelJoinEventJS.class);
        registerEventManager(CHANNEL_LEAVE_EVENT, ChannelLeaveEvent.class, ChannelLeaveEventJS.class);
        registerEventManager(CHANNEL_MESSAGE_ACTION_EVENT, ChannelMessageActionEvent.class, ChannelMessageActionEventJS.class);
        registerEventManager(CHANNEL_MESSAGE_EVENT, ChannelMessageEvent.class,ChannelMessageEventJS.class);
        registerEventManager(CHANNEL_MOD_EVENT,ChannelModEvent.class,ChannelModEventJS.class);
        registerEventManager(CHANNEL_NOTICE_EVENT,ChannelNoticeEvent.class,ChannelNoticeEventJS.class);
        registerEventManager(CHANNEL_STATE_EVENT,ChannelStateEvent.class,ChannelStateEventJS.class);
        registerEventManager(CHEER_EVENT,CheerEvent.class,CheerEventJS.class);
        registerEventManager(CLEAR_CHAT_EVENT,ClearChatEvent.class,ClearChatEventJS.class);
        registerEventManager(COMMAND_EVENT, CommandEvent.class,CommandEventJS.class);
        registerEventManager(DONATION_EVENT,DonationEvent.class,DonationEventJS.class);
        registerEventManager(EMOTE_ONLY_EVENT, EmoteOnlyEvent.class,EmoteOnlyEventJS.class);
        registerEventManager(EXTEND_SUBSCRIPTION_EVENT,ExtendSubscriptionEvent.class,ExtendSubscriptionEventJS.class);
        registerEventManager(FOLLOWERS_ONLY_EVENT, FollowersOnlyEvent.class,FollowersOnlyEventJS.class);
        registerEventManager(FOLLOW_EVENT,FollowEvent.class,FollowEventJS.class);
        registerEventManager(GIFT_SUBSCRIPTION_EVENT,GiftSubscriptionsEvent.class,GiftSubscriptionsEventJS.class);
        registerEventManager(GIFT_SUBSCRIPTION_UPGRADE_EVENT,GiftSubUpgradeEvent.class,GiftSubUpgradeEventJS.class);
        registerEventManager(HOST_OFF_EVENT,HostOffEvent.class,HostOffEventJS.class);
        registerEventManager(HOST_ON_EVENT,HostOnEvent.class,HostOnEventJS.class);
        registerEventManager(IRC_MESSAGE_EVENT,IRCMessageEvent.class,IRCMessageEventJS.class);
        registerEventManager(LIST_MODS_EVENT,ListModsEvent.class,ListModsEventJS.class);
        registerEventManager(LIST_VIPS_EVENT,ListVipsEvent.class,ListVipsEventJS.class);
        registerEventManager(MESSAGE_DELETE_ERROR_EVENT,MessageDeleteError.class,MessageDeleteErrorEventJS.class);
        registerEventManager(MESSAGE_DELETE_SUCCESS_EVENT,MessageDeleteSuccess.class,MessageDeleteSuccessEventJS.class);
        registerEventManager(PAY_FORWARD_EVENT,PayForwardEvent.class,PayForwardEventJS.class);
        registerEventManager(PRIME_GIFT_SUBSCRIPTION_EVENT,PrimeGiftReceivedEvent.class,PrimeGiftReceivedEventJS.class);
        registerEventManager(PRIME_GIFT_SUBSCRIPTION_UPGRADE_EVENT,PrimeSubUpgradeEvent.class,PrimeSubUpgradeEventJS.class);
        registerEventManager(RAID_CANCELLATION_EVENT,RaidCancellationEvent.class,RaidCancellationEventJS.class);
        registerEventManager(RAID_EVENT,RaidEvent.class,RaidEventJS.class);
        registerEventManager(REWARD_GIFT_EVENT, RewardGiftEvent.class, RewardGiftEventJS.class);
        registerEventManager(RITUAL_EVENT, RitualEvent.class, RitualEventJS.class);
        registerEventManager(ROBOT_9000_EVENT, Robot9000Event.class,Robot9000EventJS.class);
        registerEventManager(SLOW_MODE_EVENT,SlowModeEvent.class,SlowModeEventJS.class);
        registerEventManager(SUBSCRIPTION_ONLY_EVENT,SubscribersOnlyEvent.class,SubscribersOnlyEventJS.class);
        registerEventManager(SUBSCRIPTION_EVENT,SubscriptionEvent.class,SubscriptionEventJS.class);
        registerEventManager(USER_BAN_EVENT,UserBanEvent.class,UserBanEventJS.class);
        registerEventManager(USER_STATE_EVENT,UserStateEvent.class,UserStateEventJS.class);
        registerEventManager(USER_TIMEOUT_EVENT,UserTimeoutEvent.class,UserTimeoutEventJS.class);

    }

    private static void registerEventManager( String id, Class<? extends TwitchEvent> eventClass, Class<? extends CommonEventJS> eventJSClass)
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
}
