package ccm.dendritis.configuration;

import java.util.logging.Level;


import ccm.dendritis.Dendritis;
import ccm.dendritis.utils.lib.Archive;
import ccm.nucleum.configuration.AdvConfiguration;
import ccm.nucleum.handler.Handler;

public class Config
{

    /**
     * Initializes the Configuration file.
     * 
     * @param event
     *            The FMLPreInitializationEvent that is used to get the
     *            ModConfigurationDirectory.
     */
    public static void init(final AdvConfiguration config)
    {
        try{
            Handler.log(Dendritis.instance, "Loading configuration");
            // Loads a pre-existing Configuration file.
            config.load();
            ConfigItems.configItems(config);
            ConfigTools.configTools(config);
            ConfigArmors.configArmors(config);
            ConfigWorldGen.configWorldGen(config);
            ConfigBlocks.configBlocks(config);
        }catch(final Exception e){
            Handler.log(Dendritis.instance, Level.SEVERE, Archive.MOD_NAME + " has had a problem loading its configuration");
            e.printStackTrace();
        }finally{
            config.save();
        }
    }
}