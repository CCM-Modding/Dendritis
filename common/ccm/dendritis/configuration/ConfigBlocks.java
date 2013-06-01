package ccm.dendritis.configuration;

import net.minecraftforge.common.Configuration;

import ccm.dendritis.Dendritis;
import ccm.dendritis.utils.lib.Properties;
import ccm.nucleum_omnium.handler.Handler;

final class ConfigBlocks extends Config
{

    /**
     * Loads or creates the Blocks in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    protected static void configBlocks(final Configuration config)
    {
        Handler.log(Dendritis.instance, "Loading Blocks Configs");
        Properties.oreID = property.getNextUsableBlockID(config, "Ores").getInt();
        Properties.blocksID = property.getNextUsableBlockID(config, "Blocks").getInt();
    }
}