package ccm.dendritis.configuration;

import ccm.nucleum_omnium.configuration.AdvConfiguration;

import ccm.dendritis.utils.lib.Properties;

final class ConfigWorldGen extends Config
{

    final static String gen  = "World Generation ";

    final static String ame  = "of Amethyst (End)";

    final static String bdi  = "of BlackDiamond (Neather)";

    final static String cit  = "of Citrine (Surface)";

    final static String czi  = "of CubicZirconia (Neather)";

    final static String fuc  = "of Fuchsia (Surface)";

    final static String jet  = "of Jet (End)";

    final static String oli  = "of Olivine (Surface)";

    final static String opal = "of Opal (Surface)";

    final static String ruby = "of Ruby (Surface)";

    final static String sap  = "of Sapphire (Surface)";

    final static String squ  = " of SmokyQuartz (Neather)";

    final static String sun  = " of Sun (Surface)";

    final static String top  = " of Topaz (Surface)";

    final static String tur  = " of Turquoise (Surface)";

    final static String wal  = " of WhiteAlibaster (End)";

    /**
     * Loads or creates the World Generation Section in the Configuration file.
     * 
     * @param config
     *            The {@link AdvConfiguration} file that is being edited.
     */
    protected static void configWorldGen(final AdvConfiguration config)
    {

        Properties.enableWorldGenAmethyst = config.get(gen + ame, "EnableAmethyst", true).getBoolean(true);
        Properties.enableWorldGenBDiamond = config.get(gen + bdi, "EnableBlackDiamond", true).getBoolean(true);
        Properties.enableWorldGenCitrine = config.get(gen + cit, "EnableCitrine", true).getBoolean(true);
        Properties.enableWorldGenCZirconia = config.get(gen + czi, "EnableCubicZirconia", true).getBoolean(true);
        Properties.enableWorldGenFuchsia = config.get(gen + fuc, "EnableFuchsia", true).getBoolean(true);
        Properties.enableWorldGenJet = config.get(gen + jet, "EnableJet", true).getBoolean(true);
        Properties.enableWorldGenOlivine = config.get(gen + oli, "EnableOlivine", true).getBoolean(true);
        Properties.enableWorldGenOpal = config.get(gen + opal, "EnableOpal", true).getBoolean(true);
        Properties.enableWorldGenRuby = config.get(gen + ruby, "EnableRuby", true).getBoolean(true);
        Properties.enableWorldGenSapphire = config.get(gen + sap, "EnableSapphire", true).getBoolean(true);
        Properties.enableWorldGenSQuartz = config.get(gen + squ, "EnableSmokyQuartz", true).getBoolean(true);
        Properties.enableWorldGenSun = config.get(gen + sun, "EnableSunJewl", true).getBoolean(true);
        Properties.enableWorldGenTopaz = config.get(gen + top, "EnableTopaz", true).getBoolean(true);
        Properties.enableWorldGenTurquoise = config.get(gen + tur, "EnableTurquoise", true).getBoolean(true);
        Properties.enableWorldGenWAlabaster = config.get(gen + wal, "EnableWhiteAlabaster", true).getBoolean(true);
    }
}