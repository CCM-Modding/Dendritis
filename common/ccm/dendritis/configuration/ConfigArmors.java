package ccm.dendritis.configuration;

import net.minecraftforge.common.Configuration;
import ccm.dendritis.Dendritis;
import ccm.dendritis.utils.lib.Properties;
import ccm.nucleum_omnium.handler.Handler;

final class ConfigArmors extends Config {

    /**
     * Loads or creates the Usable Items in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    protected static void configArmors(final Configuration config) {
        Handler.log(Dendritis.instance, "Loading Tools Configs");

        Properties.headAmethystID = property.getNextUsableItemID(config, "Amethyst Head").getInt();
        Properties.chestAmethystID = property.getNextUsableItemID(config, "Amethyst Chest").getInt();
        Properties.legsAmethystID = property.getNextUsableItemID(config, "Amethyst Legs").getInt();
        Properties.bootsAmethystID = property.getNextUsableItemID(config, "Amethyst Boots").getInt();

        Properties.headBDiamondID = property.getNextUsableItemID(config, "BDiamond Head").getInt();
        Properties.chestBDiamondID = property.getNextUsableItemID(config, "BDiamond Chest").getInt();
        Properties.legsBDiamondID = property.getNextUsableItemID(config, "BDiamond Legs").getInt();
        Properties.bootsBDiamondID = property.getNextUsableItemID(config, "BDiamond Boots").getInt();

        Properties.headCitrineID = property.getNextUsableItemID(config, "Citrine Head").getInt();
        Properties.chestCitrineID = property.getNextUsableItemID(config, "Citrine Chest").getInt();
        Properties.legsCitrineID = property.getNextUsableItemID(config, "Citrine Legs").getInt();
        Properties.bootsCitrineID = property.getNextUsableItemID(config, "Citrine Boots").getInt();

        Properties.headCZirconiaID = property.getNextUsableItemID(config, "CZirconia Head").getInt();
        Properties.chestCZirconiaID = property.getNextUsableItemID(config, "CZirconia Chest").getInt();
        Properties.legsCZirconiaID = property.getNextUsableItemID(config, "CZirconia Legs").getInt();
        Properties.bootsCZirconiaID = property.getNextUsableItemID(config, "CZirconia Boots").getInt();

        Properties.headEmeraldID = property.getNextUsableItemID(config, "Emerald Head").getInt();
        Properties.chestEmeraldID = property.getNextUsableItemID(config, "Emerald Chest").getInt();
        Properties.legsEmeraldID = property.getNextUsableItemID(config, "Emerald Legs").getInt();
        Properties.bootsEmeraldID = property.getNextUsableItemID(config, "Emerald Boots").getInt();

        Properties.headFuchsiaID = property.getNextUsableItemID(config, "Fuchsia Head").getInt();
        Properties.chestFuchsiaID = property.getNextUsableItemID(config, "Fuchsia Chest").getInt();
        Properties.legsFuchsiaID = property.getNextUsableItemID(config, "Fuchsia Legs").getInt();
        Properties.bootsFuchsiaID = property.getNextUsableItemID(config, "Fuchsia Boots").getInt();

        Properties.headJetID = property.getNextUsableItemID(config, "Jet Head").getInt();
        Properties.chestJetID = property.getNextUsableItemID(config, "Jet Chest").getInt();
        Properties.legsJetID = property.getNextUsableItemID(config, "Jet Legs").getInt();
        Properties.bootsJetID = property.getNextUsableItemID(config, "Jet Boots").getInt();

        Properties.headOlivineID = property.getNextUsableItemID(config, "Olivine Head").getInt();
        Properties.chestOlivineID = property.getNextUsableItemID(config, "Olivine Chest").getInt();
        Properties.legsOlivineID = property.getNextUsableItemID(config, "Olivine Legs").getInt();
        Properties.bootsOlivineID = property.getNextUsableItemID(config, "Olivine Boots").getInt();

        Properties.headOpalID = property.getNextUsableItemID(config, "Opal Head").getInt();
        Properties.chestOpalID = property.getNextUsableItemID(config, "Opal Chest").getInt();
        Properties.legsOpalID = property.getNextUsableItemID(config, "Opal Legs").getInt();
        Properties.bootsOpalID = property.getNextUsableItemID(config, "Opal Boots").getInt();

        Properties.headQuartzID = property.getNextUsableItemID(config, "Quartz Head").getInt();
        Properties.chestQuartzID = property.getNextUsableItemID(config, "Quartz Chest").getInt();
        Properties.legsQuartzID = property.getNextUsableItemID(config, "Quartz Legs").getInt();
        Properties.bootsQuartzID = property.getNextUsableItemID(config, "Quartz Boots").getInt();

        Properties.headRubyID = property.getNextUsableItemID(config, "Ruby Head").getInt();
        Properties.chestRubyID = property.getNextUsableItemID(config, "Ruby Chest").getInt();
        Properties.legsRubyID = property.getNextUsableItemID(config, "Ruby Legs").getInt();
        Properties.bootsRubyID = property.getNextUsableItemID(config, "Ruby Boots").getInt();

        Properties.headSapphireID = property.getNextUsableItemID(config, "Sapphire Head").getInt();
        Properties.chestSapphireID = property.getNextUsableItemID(config, "Sapphire Chest").getInt();
        Properties.legsSapphireID = property.getNextUsableItemID(config, "Sapphire Legs").getInt();
        Properties.bootsSapphireID = property.getNextUsableItemID(config, "Sapphire Boots").getInt();

        Properties.headSQuartzID = property.getNextUsableItemID(config, "SQuartz Head").getInt();
        Properties.chestSQuartzID = property.getNextUsableItemID(config, "SQuartz Chest").getInt();
        Properties.legsSQuartzID = property.getNextUsableItemID(config, "SQuartz Legs").getInt();
        Properties.bootsSQuartzID = property.getNextUsableItemID(config, "SQuartz Boots").getInt();

        Properties.headSunID = property.getNextUsableItemID(config, "Sun Head").getInt();
        Properties.chestSunID = property.getNextUsableItemID(config, "Sun Chest").getInt();
        Properties.legsSunID = property.getNextUsableItemID(config, "Sun Legs").getInt();
        Properties.bootsSunID = property.getNextUsableItemID(config, "Sun Boots").getInt();

        Properties.headTopazID = property.getNextUsableItemID(config, "Topaz Head").getInt();
        Properties.chestTopazID = property.getNextUsableItemID(config, "Topaz Chest").getInt();
        Properties.legsTopazID = property.getNextUsableItemID(config, "Topaz Legs").getInt();
        Properties.bootsTopazID = property.getNextUsableItemID(config, "Topaz Boots").getInt();

        Properties.headTurquoiseID = property.getNextUsableItemID(config, "Turquoise Head").getInt();
        Properties.chestTurquoiseID = property.getNextUsableItemID(config, "Turquoise Chest").getInt();
        Properties.legsTurquoiseID = property.getNextUsableItemID(config, "Turquoise Legs").getInt();
        Properties.bootsTurquoiseID = property.getNextUsableItemID(config, "Turquoise Boots").getInt();

        Properties.headWAlabasterID = property.getNextUsableItemID(config, "WAlabaster Head").getInt();
        Properties.chestWAlabasterID = property.getNextUsableItemID(config, "WAlabaster Chest").getInt();
        Properties.legsWAlabasterID = property.getNextUsableItemID(config, "WAlabaster Legs").getInt();
        Properties.bootsWAlabasterID = property.getNextUsableItemID(config, "WAlabaster Boots").getInt();
    }
}