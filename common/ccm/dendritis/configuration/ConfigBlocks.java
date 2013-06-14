package ccm.dendritis.configuration;

import ccm.dendritis.Dendritis;
import ccm.dendritis.utils.lib.Properties;
import ccm.nucleum_omnium.configuration.AdvConfiguration;
import ccm.nucleum_omnium.handler.Handler;

final class ConfigBlocks extends Config {

    /**
     * Loads or creates the Blocks in the Configuration file.
     * 
     * @param config
     *            The {@link AdvConfiguration} file that is being edited.
     */
    protected static void configBlocks(final AdvConfiguration config) {
        Handler.log(Dendritis.instance, "Loading Blocks Configs");
        Properties.oreID = config.getBlock("Ores", Properties.blockID).getInt();
        Properties.blocksID = config.getBlock("Blocks", Properties.blockID).getInt();
    }
}