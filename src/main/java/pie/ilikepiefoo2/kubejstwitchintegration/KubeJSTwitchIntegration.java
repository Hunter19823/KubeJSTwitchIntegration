package pie.ilikepiefoo2.kubejstwitchintegration;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pie.ilikepiefoo2.kubejstwitchintegration.util.TwitchWrapper;
import pie.ilikepiefoo2.twitchintegration.TwitchConfigHandler;

/**
 * @author ILIKEPIEFOO2
 */
@Mod("kubejstwitchintegration")
public class KubeJSTwitchIntegration {
    public static final String MOD_ID = "kubejstwitchintegration";
    public static final String MOD_NAME = "KubeJSTwitchIntegration";
    private static final Logger LOGGER = LogManager.getLogger();

    public KubeJSTwitchIntegration()
    {
        LOGGER.info("KubeJS Twitch Integration Initializing");
        MinecraftForge.EVENT_BUS.addListener(EventHandler::onKubeJSBindingsEvent);
        FMLJavaModLoadingContext.get().getModEventBus().addListener((ModConfig.Loading e) -> EventHandler.onConfigLoad(e));
        FMLJavaModLoadingContext.get().getModEventBus().addListener((ModConfig.Reloading e) -> EventHandler.onConfigLoad(e));
    }

}
