package pie.ilikepiefoo2.kubejstwitchintegration;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author ILIKEPIEFOO2
 */
@Mod("kubejstwitchintegration")
public class KubeJSTwitchIntegration {
    public static final String MOD_ID = "kubejstwitchintegration";
    public static final String MOD_NAME = "KubeJSTwitchIntegration";
    private static final Logger LOGGER = LogManager.getLogger(KubeJSTwitchIntegration.class);

    public KubeJSTwitchIntegration()
    {
        LOGGER.info("KubeJS Twitch Integration Initializing");
        MinecraftForge.EVENT_BUS.addListener(EventHandler::onKubeJSBindingsEvent);
        EventHandler.hookTwitchEvents();
    }

}
