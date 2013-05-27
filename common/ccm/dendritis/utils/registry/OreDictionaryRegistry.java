package ccm.dendritis.utils.registry;

import net.minecraftforge.oredict.OreDictionary;
import ccm.dendritis.Dendritis;
import ccm.dendritis.core.handlers.EHandler;
import ccm.dendritis.enums.EnumBlocks;
import ccm.dendritis.enums.EnumGems;
import ccm.dendritis.enums.EnumOres;
import ccm.nucleum_omnium.handler.Handler;

final class OreDictionaryRegistry {

    /**
     * Registers all the Entries to the Ore Dictionary.
     */
    protected static void oreDictionary() {
        Handler.log(Dendritis.instance, "Adding Ore Dictionary Entries");

        OreDictionary.registerOre("gemAmethyst", EHandler.getItem(EnumGems.gemAmethyst));
        OreDictionary.registerOre("gemBDiamond", EHandler.getItem(EnumGems.gemBDiamond));
        OreDictionary.registerOre("gemCitrine", EHandler.getItem(EnumGems.gemCitrine));
        OreDictionary.registerOre("gemCZirconia", EHandler.getItem(EnumGems.gemCZirconia));
        OreDictionary.registerOre("gemFuchsia", EHandler.getItem(EnumGems.gemFuchsia));
        OreDictionary.registerOre("gemJet", EHandler.getItem(EnumGems.gemJet));
        OreDictionary.registerOre("gemOlivine", EHandler.getItem(EnumGems.gemOlivine));
        OreDictionary.registerOre("gemOpal", EHandler.getItem(EnumGems.gemOpal));
        OreDictionary.registerOre("gemRuby", EHandler.getItem(EnumGems.gemRuby));
        OreDictionary.registerOre("gemSapphire", EHandler.getItem(EnumGems.gemSapphire));
        OreDictionary.registerOre("gemSQuartz", EHandler.getItem(EnumGems.gemSQuartz));
        OreDictionary.registerOre("gemSun", EHandler.getItem(EnumGems.gemSun));
        OreDictionary.registerOre("gemTopaz", EHandler.getItem(EnumGems.gemTopaz));
        OreDictionary.registerOre("gemTurquoise", EHandler.getItem(EnumGems.gemTurquoise));
        OreDictionary.registerOre("gemWAlabaster", EHandler.getItem(EnumGems.gemWAlabaster));

        OreDictionary.registerOre("oreAmethyst", EHandler.getItem(EnumOres.oreAmethyst));
        OreDictionary.registerOre("oreBDiamond", EHandler.getItem(EnumOres.oreBDiamond));
        OreDictionary.registerOre("oreCitrine", EHandler.getItem(EnumOres.oreCitrine));
        OreDictionary.registerOre("oreCZirconia", EHandler.getItem(EnumOres.oreCZirconia));
        OreDictionary.registerOre("oreFuchsia", EHandler.getItem(EnumOres.oreFuchsia));
        OreDictionary.registerOre("oreJet", EHandler.getItem(EnumOres.oreJet));
        OreDictionary.registerOre("oreOlivine", EHandler.getItem(EnumOres.oreOlivine));
        OreDictionary.registerOre("oreOpal", EHandler.getItem(EnumOres.oreOpal));
        OreDictionary.registerOre("oreRuby", EHandler.getItem(EnumOres.oreRuby));
        OreDictionary.registerOre("oreSapphire", EHandler.getItem(EnumOres.oreSapphire));
        OreDictionary.registerOre("oreSQuartz", EHandler.getItem(EnumOres.oreSQuartz));
        OreDictionary.registerOre("oreSun", EHandler.getItem(EnumOres.oreSun));
        OreDictionary.registerOre("oreTopaz", EHandler.getItem(EnumOres.oreTopaz));
        OreDictionary.registerOre("oreTurquoise", EHandler.getItem(EnumOres.oreTurquoise));
        OreDictionary.registerOre("oreWAlabaster", EHandler.getItem(EnumOres.oreWAlabaster));

        OreDictionary.registerOre("blockAmethyst", EHandler.getItem(EnumBlocks.blockAmethyst));
        OreDictionary.registerOre("blockBDiamond", EHandler.getItem(EnumBlocks.blockBDiamond));
        OreDictionary.registerOre("blockCitrine", EHandler.getItem(EnumBlocks.blockCitrine));
        OreDictionary.registerOre("blockCZirconia", EHandler.getItem(EnumBlocks.blockCZirconia));
        OreDictionary.registerOre("blockFuchsia", EHandler.getItem(EnumBlocks.blockFuchsia));
        OreDictionary.registerOre("blockJet", EHandler.getItem(EnumBlocks.blockJet));
        OreDictionary.registerOre("blockOlivine", EHandler.getItem(EnumBlocks.blockOlivine));
        OreDictionary.registerOre("blockOpal", EHandler.getItem(EnumBlocks.blockOpal));
        OreDictionary.registerOre("blockRuby", EHandler.getItem(EnumBlocks.blockRuby));
        OreDictionary.registerOre("blockSapphire", EHandler.getItem(EnumBlocks.blockSapphire));
        OreDictionary.registerOre("blockSQuartz", EHandler.getItem(EnumBlocks.blockSQuartz));
        OreDictionary.registerOre("blockSun", EHandler.getItem(EnumBlocks.blockSun));
        OreDictionary.registerOre("blockTopaz", EHandler.getItem(EnumBlocks.blockTopaz));
        OreDictionary.registerOre("blockTurquoise", EHandler.getItem(EnumBlocks.blockTurquoise));
        OreDictionary.registerOre("blockWAlabaster", EHandler.getItem(EnumBlocks.blockWAlabaster));
    }
}