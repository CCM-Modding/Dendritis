package ccm.dendritis.configuration;

import net.minecraftforge.common.Configuration;
import ccm.dendritis.Dendritis;
import ccm.dendritis.utils.lib.Properties;
import ccm.nucleum_omnium.handler.Handler;

final class ConfigWorldGen extends Config {

    final static String gen = "World Generation";

    final static String ame  = " of Amethyst";

    final static String opal  = " of Opal";

    final static String ruby  = " of Ruby";

    final static String sap  = " of Sapphire";

    /**
     * Loads or creates the World Generation Section in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    protected static void configWorldGen(final Configuration config) {

        genAmethyst(config);
        genOpal(config);
        genRuby(config);
        genSapphire(config);
    }

    /**
     * Loads or creates the Amethyst World Generation in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    private static void genAmethyst(final Configuration config)
    {
        if (Properties.enableWorldGenAmethyst = config.get(gen + ame, "Enable Generation of Amethyst", true).getBoolean(true)){
            Handler.log(Dendritis.instance, "Loading Amethyst Configs");

            Properties.ameMaxHeight = config.get(gen + ame, "Maximum Height", 50).getInt();
            Properties.ameMinHeight = config.get(gen + ame, "Minimum Height", 25).getInt();
            Properties.ameSize = config.get(gen + ame, "Max size of the Vein", 4).getInt();
            Properties.ameDensity = config.get(gen + ame, "Max veins per chunk", 10).getInt();
        }
    }

    /**
     * Loads or creates the Opal World Generation in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    private static void genOpal(final Configuration config)
    {
        if (Properties.enableWorldGenOpal = config.get(gen + opal, "Enable Generation of Opal", true).getBoolean(true)){
            Handler.log(Dendritis.instance, "Loading Opal Configs");

            Properties.opalMaxHeight = config.get(gen + opal, "Maximum Height", 50).getInt();
            Properties.opalMinHeight = config.get(gen + opal, "Minimum Height", 25).getInt();
            Properties.opalSize = config.get(gen + opal, "Max size of the Vein", 4).getInt();
            Properties.opalDensity = config.get(gen + opal, "Max veins per chunk", 10).getInt();
        }
    }

    /**
     * Loads or creates the Ruby World Generation in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    private static void genRuby(final Configuration config)
    {
        if (Properties.enableWorldGenRuby = config.get(gen + ruby, "Enable Generation of Ruby", true).getBoolean(true)){
            Handler.log(Dendritis.instance, "Loading Ruby Configs");

            Properties.rubyMaxHeight = config.get(gen + ruby, "Maximum Height", 50).getInt();
            Properties.rubyMinHeight = config.get(gen + ruby, "Minimum Height", 25).getInt();
            Properties.rubySize = config.get(gen + ruby, "Max size of the Vein", 4).getInt();
            Properties.rubyDensity = config.get(gen + ruby, "Max veins per chunk", 10).getInt();
        }
    }

    /**
     * Loads or creates the Sapphire World Generation in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    private static void genSapphire(final Configuration config)
    {
        if (Properties.enableWorldGenSapphire = config.get(gen + sap, "Enable Generation of Sapphire", true).getBoolean(true)){
            Handler.log(Dendritis.instance, "Loading Sapphire Configs");

            Properties.sapMaxHeight = config.get(gen + sap, "Maximum Height", 50).getInt();
            Properties.sapMinHeight = config.get(gen + sap, "Minimum Height", 25).getInt();
            Properties.sapSize = config.get(gen + sap, "Max size of the Vein", 4).getInt();
            Properties.sapDensity = config.get(gen + sap, "Max veins per chunk", 10).getInt();
        }
    }
}