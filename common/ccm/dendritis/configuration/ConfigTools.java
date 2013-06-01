package ccm.dendritis.configuration;

import net.minecraftforge.common.Configuration;

import ccm.dendritis.Dendritis;
import ccm.dendritis.utils.lib.Properties;
import ccm.nucleum_omnium.handler.Handler;

final class ConfigTools extends Config
{

    /**
     * Loads or creates the Usable Items in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    protected static void configUsable(final Configuration config)
    {
        Handler.log(Dendritis.instance, "Loading Tools Configs");

        Properties.axeAmethystID = property.getNextUsableItemID(config, "Amethyst Axe").getInt();
        Properties.hoeAmethystID = property.getNextUsableItemID(config, "Amethyst Hoe").getInt();
        Properties.spadeAmethystID = property.getNextUsableItemID(config, "Amethyst Spade").getInt();
        Properties.pickAmethystID = property.getNextUsableItemID(config, "Amethyst Pick").getInt();
        Properties.swordAmethystID = property.getNextUsableItemID(config, "Amethyst Sword").getInt();

        Properties.axeBDiamondID = property.getNextUsableItemID(config, "BDiamond Axe").getInt();
        Properties.hoeBDiamondID = property.getNextUsableItemID(config, "BDiamond Hoe").getInt();
        Properties.spadeBDiamondID = property.getNextUsableItemID(config, "BDiamond Spade").getInt();
        Properties.pickBDiamondID = property.getNextUsableItemID(config, "BDiamond Pick").getInt();
        Properties.swordBDiamondID = property.getNextUsableItemID(config, "BDiamond Sword").getInt();

        Properties.axeCitrineID = property.getNextUsableItemID(config, "Citrine Axe").getInt();
        Properties.hoeCitrineID = property.getNextUsableItemID(config, "Citrine Hoe").getInt();
        Properties.spadeCitrineID = property.getNextUsableItemID(config, "Citrine Spade").getInt();
        Properties.pickCitrineID = property.getNextUsableItemID(config, "Citrine Pick").getInt();
        Properties.swordCitrineID = property.getNextUsableItemID(config, "Citrine Sword").getInt();

        Properties.axeCZirconiaID = property.getNextUsableItemID(config, "CZirconia Axe").getInt();
        Properties.hoeCZirconiaID = property.getNextUsableItemID(config, "CZirconia Hoe").getInt();
        Properties.spadeCZirconiaID = property.getNextUsableItemID(config, "CZirconia Spade").getInt();
        Properties.pickCZirconiaID = property.getNextUsableItemID(config, "CZirconia Pick").getInt();
        Properties.swordCZirconiaID = property.getNextUsableItemID(config, "CZirconia Sword").getInt();

        Properties.axeEmeraldID = property.getNextUsableItemID(config, "Emerald Axe").getInt();
        Properties.hoeEmeraldID = property.getNextUsableItemID(config, "Emerald Hoe").getInt();
        Properties.spadeEmeraldID = property.getNextUsableItemID(config, "Emerald Spade").getInt();
        Properties.pickEmeraldID = property.getNextUsableItemID(config, "Emerald Pick").getInt();
        Properties.swordEmeraldID = property.getNextUsableItemID(config, "Emerald Sword").getInt();

        Properties.axeFuchsiaID = property.getNextUsableItemID(config, "Fuchsia Axe").getInt();
        Properties.hoeFuchsiaID = property.getNextUsableItemID(config, "Fuchsia Hoe").getInt();
        Properties.spadeFuchsiaID = property.getNextUsableItemID(config, "Fuchsia Spade").getInt();
        Properties.pickFuchsiaID = property.getNextUsableItemID(config, "Fuchsia Pick").getInt();
        Properties.swordFuchsiaID = property.getNextUsableItemID(config, "Fuchsia Sword").getInt();

        Properties.axeJetID = property.getNextUsableItemID(config, "Jet Axe").getInt();
        Properties.hoeJetID = property.getNextUsableItemID(config, "Jet Hoe").getInt();
        Properties.spadeJetID = property.getNextUsableItemID(config, "Jet Spade").getInt();
        Properties.pickJetID = property.getNextUsableItemID(config, "Jet Pick").getInt();
        Properties.swordJetID = property.getNextUsableItemID(config, "Jet Sword").getInt();

        Properties.axeOlivineID = property.getNextUsableItemID(config, "Olivine Axe").getInt();
        Properties.hoeOlivineID = property.getNextUsableItemID(config, "Olivine Hoe").getInt();
        Properties.spadeOlivineID = property.getNextUsableItemID(config, "Olivine Spade").getInt();
        Properties.pickOlivineID = property.getNextUsableItemID(config, "Olivine Pick").getInt();
        Properties.swordOlivineID = property.getNextUsableItemID(config, "Olivine Sword").getInt();

        Properties.axeOpalID = property.getNextUsableItemID(config, "Opal Axe").getInt();
        Properties.hoeOpalID = property.getNextUsableItemID(config, "Opal Hoe").getInt();
        Properties.spadeOpalID = property.getNextUsableItemID(config, "Opal Spade").getInt();
        Properties.pickOpalID = property.getNextUsableItemID(config, "Opal Pick").getInt();
        Properties.swordOpalID = property.getNextUsableItemID(config, "Opal Sword").getInt();

        Properties.axeQuartzID = property.getNextUsableItemID(config, "Quartz Axe").getInt();
        Properties.hoeQuartzID = property.getNextUsableItemID(config, "Quartz Hoe").getInt();
        Properties.spadeQuartzID = property.getNextUsableItemID(config, "Quartz Spade").getInt();
        Properties.pickQuartzID = property.getNextUsableItemID(config, "Quartz Pick").getInt();
        Properties.swordQuartzID = property.getNextUsableItemID(config, "Quartz Sword").getInt();

        Properties.axeRubyID = property.getNextUsableItemID(config, "Ruby Axe").getInt();
        Properties.hoeRubyID = property.getNextUsableItemID(config, "Ruby Hoe").getInt();
        Properties.spadeRubyID = property.getNextUsableItemID(config, "Ruby Spade").getInt();
        Properties.pickRubyID = property.getNextUsableItemID(config, "Ruby Pick").getInt();
        Properties.swordRubyID = property.getNextUsableItemID(config, "Ruby Sword").getInt();

        Properties.axeSapphireID = property.getNextUsableItemID(config, "Sapphire Axe").getInt();
        Properties.hoeSapphireID = property.getNextUsableItemID(config, "Sapphire Hoe").getInt();
        Properties.spadeSapphireID = property.getNextUsableItemID(config, "Sapphire Spade").getInt();
        Properties.pickSapphireID = property.getNextUsableItemID(config, "Sapphire Pick").getInt();
        Properties.swordSapphireID = property.getNextUsableItemID(config, "Sapphire Sword").getInt();

        Properties.axeSQuartzID = property.getNextUsableItemID(config, "SQuartz Axe").getInt();
        Properties.hoeSQuartzID = property.getNextUsableItemID(config, "SQuartz Hoe").getInt();
        Properties.spadeSQuartzID = property.getNextUsableItemID(config, "SQuartz Spade").getInt();
        Properties.pickSQuartzID = property.getNextUsableItemID(config, "SQuartz Pick").getInt();
        Properties.swordSQuartzID = property.getNextUsableItemID(config, "SQuartz Sword").getInt();

        Properties.axeSunID = property.getNextUsableItemID(config, "Sun Axe").getInt();
        Properties.hoeSunID = property.getNextUsableItemID(config, "Sun Hoe").getInt();
        Properties.spadeSunID = property.getNextUsableItemID(config, "Sun Spade").getInt();
        Properties.pickSunID = property.getNextUsableItemID(config, "Sun Pick").getInt();
        Properties.swordSunID = property.getNextUsableItemID(config, "Sun Sword").getInt();

        Properties.axeTopazID = property.getNextUsableItemID(config, "Topaz Axe").getInt();
        Properties.hoeTopazID = property.getNextUsableItemID(config, "Topaz Hoe").getInt();
        Properties.spadeTopazID = property.getNextUsableItemID(config, "Topaz Spade").getInt();
        Properties.pickTopazID = property.getNextUsableItemID(config, "Topaz Pick").getInt();
        Properties.swordTopazID = property.getNextUsableItemID(config, "Topaz Sword").getInt();

        Properties.axeTurquoiseID = property.getNextUsableItemID(config, "Turquoise Axe").getInt();
        Properties.hoeTurquoiseID = property.getNextUsableItemID(config, "Turquoise Hoe").getInt();
        Properties.spadeTurquoiseID = property.getNextUsableItemID(config, "Turquoise Spade").getInt();
        Properties.pickTurquoiseID = property.getNextUsableItemID(config, "Turquoise Pick").getInt();
        Properties.swordTurquoiseID = property.getNextUsableItemID(config, "Turquoise Sword").getInt();

        Properties.axeWAlabasterID = property.getNextUsableItemID(config, "WAlabaster Axe").getInt();
        Properties.hoeWAlabasterID = property.getNextUsableItemID(config, "WAlabaster Hoe").getInt();
        Properties.spadeWAlabasterID = property.getNextUsableItemID(config, "WAlabaster Spade").getInt();
        Properties.pickWAlabasterID = property.getNextUsableItemID(config, "WAlabaster Pick").getInt();
        Properties.swordWAlabasterID = property.getNextUsableItemID(config, "WAlabaster Sword").getInt();
    }
}