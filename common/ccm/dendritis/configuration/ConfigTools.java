package ccm.dendritis.configuration;

import net.minecraftforge.common.Configuration;
import ccm.dendritis.Dendritis;
import ccm.nucleum_omnium.handler.Handler;

final class ConfigTools extends Config {

    /**
     * Loads or creates the Usable Items in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    protected static void configUsable(final Configuration config) {
        Handler.log(Dendritis.instance, "Loading Tools Configs");
        }
}