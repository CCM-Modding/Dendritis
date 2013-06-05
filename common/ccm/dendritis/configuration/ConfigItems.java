package ccm.dendritis.configuration;

import net.minecraftforge.common.Configuration;

import ccm.nucleum_omnium.handler.Handler;

import ccm.dendritis.Dendritis;
import ccm.dendritis.utils.lib.Properties;

final class ConfigItems extends Config
{

    /**
     * Loads or creates the Items in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    protected static void configItems(final Configuration config)
    {
        Handler.log(Dendritis.instance, "Loading Items Configs");
        Properties.itemMainID = property.getNextUsableItemID(config, "All the Other Items").getInt();
        Properties.itemGemsID = property.getNextUsableItemID(config, "All the Gems").getInt();
    }
}
