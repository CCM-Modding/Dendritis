package ccm.dendritis.configuration;

import net.minecraftforge.common.Configuration;
import ccm.dendritis.Dendritis;
import ccm.dendritis.utils.lib.Properties;
import ccm.nucleum_omnium.handler.Handler;

final class ConfigWorldGen extends Config {

    final static String gen = "World Generation";

    final static String ame = " of Amethyst (End)";

    final static String bdi = " of BlackDiamond (Neather)";

    final static String cit = " of Citrine (Surface)";

    final static String czi = " of CubicZirconia (Neather)";

    final static String fuc = " of Fuchsia (Surface)";

    final static String jet = " of Jet (End)";

    final static String oli = " of Olivine (Surface)";

    final static String opal = " of Opal (Surface)";

    final static String ruby = " of Ruby (Surface)";

    final static String sap = " of Sapphire (Surface)";

    final static String squ = " of SmokyQuartz (Neather)";

    final static String sun = " of Sun (Surface)";

    final static String top = " of Topaz (Surface)";

    final static String tur = " of Turquoise (Surface)";

    final static String wal = " of WhiteAlibaster (End)";

    /**
     * Loads or creates the World Generation Section in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    protected static void configWorldGen(final Configuration config) {

        genAmethyst(config);
        genBDiamond(config);
        genCitrine(config);
        genCZirconia(config);
        genFuchsia(config);
        genJet(config);
        genOlivine(config);
        genOpal(config);
        genRuby(config);
        genSapphire(config);
        genSQuartz(config);
        genSun(config);
        genTopaz(config);
        genTurquoise(config);
        genWAlabaster(config);
    }

    /**
     * Loads or creates the Amethyst World Generation in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    private static void genAmethyst(final Configuration config) {
        if (Properties.enableWorldGenAmethyst = config.get(gen + ame, "Enable Generation of Amethyst", true).getBoolean(true)) {
            Handler.log(Dendritis.instance, "Loading Amethyst Configs");

            Properties.ameMaxHeight = config.get(gen + ame, "Maximum Height", 65).getInt();
            Properties.ameMinHeight = config.get(gen + ame, "Minimum Height", 15).getInt();
            Properties.ameSize = config.get(gen + ame, "Max size of the Vein", 4).getInt();
            Properties.ameDensity = config.get(gen + ame, "Max veins per chunk", 10).getInt();
        }
    }

    /**
     * Loads or creates the BlackDiamond World Generation in the Configuration
     * file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    private static void genBDiamond(final Configuration config) {
        if (Properties.enableWorldGenBDiamond = config.get(gen + bdi, "Enable Generation of BlackDiamond", true).getBoolean(true)) {
            Handler.log(Dendritis.instance, "Loading BlackDiamond Configs");

            Properties.bdiMaxHeight = config.get(gen + bdi, "Maximum Height", 128).getInt();
            Properties.bdiMinHeight = config.get(gen + bdi, "Minimum Height", 0).getInt();
            Properties.bdiSize = config.get(gen + bdi, "Max size of the Vein", 4).getInt();
            Properties.bdiDensity = config.get(gen + bdi, "Max veins per chunk", 10).getInt();
        }
    }

    /**
     * Loads or creates the Citrine World Generation in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    private static void genCitrine(final Configuration config) {
        if (Properties.enableWorldGenCitrine = config.get(gen + cit, "Enable Generation of Citrine", true).getBoolean(true)) {
            Handler.log(Dendritis.instance, "Loading Citrine Configs");

            Properties.citMaxHeight = config.get(gen + cit, "Maximum Height", 50).getInt();
            Properties.citMinHeight = config.get(gen + cit, "Minimum Height", 25).getInt();
            Properties.citSize = config.get(gen + cit, "Max size of the Vein", 4).getInt();
            Properties.citDensity = config.get(gen + cit, "Max veins per chunk", 10).getInt();
        }
    }

    /**
     * Loads or creates the CubickZirconia World Generation in the Configuration
     * file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    private static void genCZirconia(final Configuration config) {
        if (Properties.enableWorldGenCZirconia = config.get(gen + czi, "Enable Generation of CubicZirconia", true).getBoolean(true)) {
            Handler.log(Dendritis.instance, "Loading CubicZirconia Configs");

            Properties.cziMaxHeight = config.get(gen + czi, "Maximum Height", 128).getInt();
            Properties.cziMinHeight = config.get(gen + czi, "Minimum Height", 0).getInt();
            Properties.cziSize = config.get(gen + czi, "Max size of the Vein", 4).getInt();
            Properties.cziDensity = config.get(gen + czi, "Max veins per chunk", 10).getInt();
        }
    }

    /**
     * Loads or creates the Fuchsia World Generation in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    private static void genFuchsia(final Configuration config) {
        if (Properties.enableWorldGenFuchsia = config.get(gen + fuc, "Enable Generation of Fuchsia", true).getBoolean(true)) {
            Handler.log(Dendritis.instance, "Loading Fuchsia Configs");

            Properties.fucMaxHeight = config.get(gen + fuc, "Maximum Height", 50).getInt();
            Properties.fucMinHeight = config.get(gen + fuc, "Minimum Height", 25).getInt();
            Properties.fucSize = config.get(gen + fuc, "Max size of the Vein", 4).getInt();
            Properties.fucDensity = config.get(gen + fuc, "Max veins per chunk", 10).getInt();
        }
    }

    /**
     * Loads or creates the Jet World Generation in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    private static void genJet(final Configuration config) {
        if (Properties.enableWorldGenJet = config.get(gen + jet, "Enable Generation of Jet", true).getBoolean(true)) {
            Handler.log(Dendritis.instance, "Loading Jet Configs");

            Properties.jetMaxHeight = config.get(gen + jet, "Maximum Height", 65).getInt();
            Properties.jetMinHeight = config.get(gen + jet, "Minimum Height", 15).getInt();
            Properties.jetSize = config.get(gen + jet, "Max size of the Vein", 4).getInt();
            Properties.jetDensity = config.get(gen + jet, "Max veins per chunk", 10).getInt();
        }
    }

    /**
     * Loads or creates the Olivine World Generation in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    private static void genOlivine(final Configuration config) {
        if (Properties.enableWorldGenOlivine = config.get(gen + oli, "Enable Generation of Olivine", true).getBoolean(true)) {
            Handler.log(Dendritis.instance, "Loading Olivine Configs");

            Properties.oliMaxHeight = config.get(gen + oli, "Maximum Height", 50).getInt();
            Properties.oliMinHeight = config.get(gen + oli, "Minimum Height", 25).getInt();
            Properties.oliSize = config.get(gen + oli, "Max size of the Vein", 4).getInt();
            Properties.oliDensity = config.get(gen + oli, "Max veins per chunk", 10).getInt();
        }
    }

    /**
     * Loads or creates the Opal World Generation in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    private static void genOpal(final Configuration config) {
        if (Properties.enableWorldGenOpal = config.get(gen + opal, "Enable Generation of Opal", true).getBoolean(true)) {
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
    private static void genRuby(final Configuration config) {
        if (Properties.enableWorldGenRuby = config.get(gen + ruby, "Enable Generation of Ruby", true).getBoolean(true)) {
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
    private static void genSapphire(final Configuration config) {
        if (Properties.enableWorldGenSapphire = config.get(gen + sap, "Enable Generation of Sapphire", true).getBoolean(true)) {
            Handler.log(Dendritis.instance, "Loading Sapphire Configs");

            Properties.sapMaxHeight = config.get(gen + sap, "Maximum Height", 50).getInt();
            Properties.sapMinHeight = config.get(gen + sap, "Minimum Height", 25).getInt();
            Properties.sapSize = config.get(gen + sap, "Max size of the Vein", 4).getInt();
            Properties.sapDensity = config.get(gen + sap, "Max veins per chunk", 10).getInt();
        }
    }

    /**
     * Loads or creates the SmokyQuartz World Generation in the Configuration
     * file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    private static void genSQuartz(final Configuration config) {
        if (Properties.enableWorldGenSQuartz = config.get(gen + squ, "Enable Generation of SmokyQuartz", true).getBoolean(true)) {
            Handler.log(Dendritis.instance, "Loading SmokyQuartz Configs");

            Properties.squMaxHeight = config.get(gen + squ, "Maximum Height", 128).getInt();
            Properties.squMinHeight = config.get(gen + squ, "Minimum Height", 0).getInt();
            Properties.squSize = config.get(gen + squ, "Max size of the Vein", 4).getInt();
            Properties.squDensity = config.get(gen + squ, "Max veins per chunk", 10).getInt();
        }
    }

    /**
     * Loads or creates the Sun World Generation in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    private static void genSun(final Configuration config) {
        if (Properties.enableWorldGenSun = config.get(gen + sun, "Enable Generation of Sun", true).getBoolean(true)) {
            Handler.log(Dendritis.instance, "Loading Sun Configs");

            Properties.sunMaxHeight = config.get(gen + sun, "Maximum Height", 50).getInt();
            Properties.sunMinHeight = config.get(gen + sun, "Minimum Height", 25).getInt();
            Properties.sunSize = config.get(gen + sun, "Max size of the Vein", 4).getInt();
            Properties.sunDensity = config.get(gen + sun, "Max veins per chunk", 10).getInt();
        }
    }

    /**
     * Loads or creates the Topaz World Generation in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    private static void genTopaz(final Configuration config) {
        if (Properties.enableWorldGenTopaz = config.get(gen + top, "Enable Generation of Topaz", true).getBoolean(true)) {
            Handler.log(Dendritis.instance, "Loading Topaz Configs");

            Properties.topMaxHeight = config.get(gen + top, "Maximum Height", 50).getInt();
            Properties.topMinHeight = config.get(gen + top, "Minimum Height", 25).getInt();
            Properties.topSize = config.get(gen + top, "Max size of the Vein", 4).getInt();
            Properties.topDensity = config.get(gen + top, "Max veins per chunk", 10).getInt();
        }
    }

    /**
     * Loads or creates the Turquoise World Generation in the Configuration
     * file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    private static void genTurquoise(final Configuration config) {
        if (Properties.enableWorldGenTurquoise = config.get(gen + tur, "Enable Generation of Turquoise", true).getBoolean(true)) {
            Handler.log(Dendritis.instance, "Loading Turquoise Configs");

            Properties.turMaxHeight = config.get(gen + tur, "Maximum Height", 50).getInt();
            Properties.turMinHeight = config.get(gen + tur, "Minimum Height", 25).getInt();
            Properties.turSize = config.get(gen + tur, "Max size of the Vein", 4).getInt();
            Properties.turDensity = config.get(gen + tur, "Max veins per chunk", 10).getInt();
        }
    }

    /**
     * Loads or creates the WhiteAlabaster World Generation in the Configuration
     * file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    private static void genWAlabaster(final Configuration config) {
        if (Properties.enableWorldGenWAlabaster = config.get(gen + wal, "Enable Generation of WhiteAlabaster", true).getBoolean(true)) {
            Handler.log(Dendritis.instance, "Loading WhiteAlabaster Configs");

            Properties.walMaxHeight = config.get(gen + wal, "Maximum Height", 65).getInt();
            Properties.walMinHeight = config.get(gen + wal, "Minimum Height", 15).getInt();
            Properties.walSize = config.get(gen + wal, "Max size of the Vein", 4).getInt();
            Properties.walDensity = config.get(gen + wal, "Max veins per chunk", 10).getInt();
        }
    }
}