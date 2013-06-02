package ccm.dendritis;

import java.util.logging.Level;

import lib.org.modstats.ModstatInfo;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.FingerprintWarning;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLFingerprintViolationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

import ccm.dendritis.block.ModBlocks;
import ccm.dendritis.configuration.Config;
import ccm.dendritis.core.proxy.CommonProxy;
import ccm.dendritis.creativetab.DendritisTabs;
import ccm.dendritis.item.ModItems;
import ccm.dendritis.network.PacketHandler;
import ccm.dendritis.utils.lib.Archive;
import ccm.dendritis.utils.lib.Locations;
import ccm.dendritis.utils.registry.Registry;
import ccm.nucleum_omnium.BaseMod;
import ccm.nucleum_omnium.IMod;
import ccm.nucleum_omnium.handler.Handler;
import ccm.nucleum_omnium.handler.LanguageHandler;

@Mod(modid = Archive.MOD_ID,
     name = Archive.MOD_NAME,
     version = Archive.MOD_VERSION,
     dependencies = Archive.MOD_DEPENDANCIES,
     certificateFingerprint = Archive.MOD_FIGERPRINT)
@NetworkMod(clientSideRequired = true,
            serverSideRequired = false,
            channels = Archive.MOD_CHANNEL,
            packetHandler = PacketHandler.class)
@ModstatInfo(prefix = Archive.MOD_PREFIX)
public class Dendritis extends BaseMod implements IMod
{

    /**
     * The MoreOres Instance
     */
    @Instance(Archive.MOD_ID)
    public static Dendritis   instance;

    /**
     * The MoreOres proxy
     */
    @SidedProxy(serverSide = Locations.SERVER_PROXY,
                clientSide = Locations.CLIENT_PROXY)
    public static CommonProxy proxy;

    @FingerprintWarning
    public void invalidFingerprint(final FMLFingerprintViolationEvent event)
    {
        /*
         * Report (log) to the user that the version of Harvestry they are using
         * has been changed/tampered with
         */
        Handler.log(this, Level.SEVERE, Archive.INVALID_FINGERPRINT_MSG);
    }

    @PreInit
    public void preInit(final FMLPreInitializationEvent evt)
    {
        if (!Handler.isModLoaded(this)){

            Handler.initLog(this);

            Config.init(this.initializeConfig(evt));

            DendritisTabs.initTabs();

            ModItems.init();

            ModBlocks.init();

            DendritisTabs.initTabIcons();
        }
    }

    @Init
    public void init(final FMLInitializationEvent event)
    {
        Registry.register();
        new LanguageHandler(Locations.LANGUAGE_FILE, Archive.LANGUAGE_FILES);
    }

    @PostInit
    public void PostInit(final FMLPostInitializationEvent event)
    {
        Handler.loadMod(this);
    }
}