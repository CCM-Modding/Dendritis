package ccm.dendritis.utils.registry;

import net.minecraftforge.oredict.OreDictionary;
import ccm.dendritis.Dendritis;
import ccm.dendritis.enums.EnumBlocks;
import ccm.dendritis.enums.EnumGems;
import ccm.dendritis.enums.EnumOres;
import ccm.nucleum_omnium.handler.Handler;
import ccm.nucleum_omnium.helper.enums.EnumHelper;

final class OreDictionaryRegistry {

    /**
     * Registers all the Entries to the Ore Dictionary.
     */
    protected static void oreDictionary() {
        Handler.log(Dendritis.instance, "Adding Ore Dictionary Entries");

        OreDictionary.registerOre("gemAmethyst", EnumHelper.getItemIS(EnumGems.gemAmethyst));
        OreDictionary.registerOre("gemBDiamond", EnumHelper.getItemIS(EnumGems.gemBDiamond));
        OreDictionary.registerOre("gemCitrine", EnumHelper.getItemIS(EnumGems.gemCitrine));
        OreDictionary.registerOre("gemCZirconia", EnumHelper.getItemIS(EnumGems.gemCZirconia));
        OreDictionary.registerOre("gemFuchsia", EnumHelper.getItemIS(EnumGems.gemFuchsia));
        OreDictionary.registerOre("gemJet", EnumHelper.getItemIS(EnumGems.gemJet));
        OreDictionary.registerOre("gemOlivine", EnumHelper.getItemIS(EnumGems.gemOlivine));
        OreDictionary.registerOre("gemOpal", EnumHelper.getItemIS(EnumGems.gemOpal));
        OreDictionary.registerOre("gemRuby", EnumHelper.getItemIS(EnumGems.gemRuby));
        OreDictionary.registerOre("gemSapphire", EnumHelper.getItemIS(EnumGems.gemSapphire));
        OreDictionary.registerOre("gemSQuartz", EnumHelper.getItemIS(EnumGems.gemSQuartz));
        OreDictionary.registerOre("gemSun", EnumHelper.getItemIS(EnumGems.gemSun));
        OreDictionary.registerOre("gemTopaz", EnumHelper.getItemIS(EnumGems.gemTopaz));
        OreDictionary.registerOre("gemTurquoise", EnumHelper.getItemIS(EnumGems.gemTurquoise));
        OreDictionary.registerOre("gemWAlabaster", EnumHelper.getItemIS(EnumGems.gemWAlabaster));

        OreDictionary.registerOre("oreAmethyst", EnumHelper.getBlockIS(EnumOres.oreAmethyst));
        OreDictionary.registerOre("oreBDiamond", EnumHelper.getBlockIS(EnumOres.oreBDiamond));
        OreDictionary.registerOre("oreCitrine", EnumHelper.getBlockIS(EnumOres.oreCitrine));
        OreDictionary.registerOre("oreCZirconia", EnumHelper.getBlockIS(EnumOres.oreCZirconia));
        OreDictionary.registerOre("oreFuchsia", EnumHelper.getBlockIS(EnumOres.oreFuchsia));
        OreDictionary.registerOre("oreJet", EnumHelper.getBlockIS(EnumOres.oreJet));
        OreDictionary.registerOre("oreOlivine", EnumHelper.getBlockIS(EnumOres.oreOlivine));
        OreDictionary.registerOre("oreOpal", EnumHelper.getBlockIS(EnumOres.oreOpal));
        OreDictionary.registerOre("oreRuby", EnumHelper.getBlockIS(EnumOres.oreRuby));
        OreDictionary.registerOre("oreSapphire", EnumHelper.getBlockIS(EnumOres.oreSapphire));
        OreDictionary.registerOre("oreSQuartz", EnumHelper.getBlockIS(EnumOres.oreSQuartz));
        OreDictionary.registerOre("oreSun", EnumHelper.getBlockIS(EnumOres.oreSun));
        OreDictionary.registerOre("oreTopaz", EnumHelper.getBlockIS(EnumOres.oreTopaz));
        OreDictionary.registerOre("oreTurquoise", EnumHelper.getBlockIS(EnumOres.oreTurquoise));
        OreDictionary.registerOre("oreWAlabaster", EnumHelper.getBlockIS(EnumOres.oreWAlabaster));

        OreDictionary.registerOre("blockAmethyst", EnumHelper.getBlockIS(EnumBlocks.blockAmethyst));
        OreDictionary.registerOre("blockBDiamond", EnumHelper.getBlockIS(EnumBlocks.blockBDiamond));
        OreDictionary.registerOre("blockCitrine", EnumHelper.getBlockIS(EnumBlocks.blockCitrine));
        OreDictionary.registerOre("blockCZirconia",
                EnumHelper.getBlockIS(EnumBlocks.blockCZirconia));
        OreDictionary.registerOre("blockFuchsia", EnumHelper.getBlockIS(EnumBlocks.blockFuchsia));
        OreDictionary.registerOre("blockJet", EnumHelper.getBlockIS(EnumBlocks.blockJet));
        OreDictionary.registerOre("blockOlivine", EnumHelper.getBlockIS(EnumBlocks.blockOlivine));
        OreDictionary.registerOre("blockOpal", EnumHelper.getBlockIS(EnumBlocks.blockOpal));
        OreDictionary.registerOre("blockRuby", EnumHelper.getBlockIS(EnumBlocks.blockRuby));
        OreDictionary.registerOre("blockSapphire", EnumHelper.getBlockIS(EnumBlocks.blockSapphire));
        OreDictionary.registerOre("blockSQuartz", EnumHelper.getBlockIS(EnumBlocks.blockSQuartz));
        OreDictionary.registerOre("blockSun", EnumHelper.getBlockIS(EnumBlocks.blockSun));
        OreDictionary.registerOre("blockTopaz", EnumHelper.getBlockIS(EnumBlocks.blockTopaz));
        OreDictionary.registerOre("blockTurquoise",
                EnumHelper.getBlockIS(EnumBlocks.blockTurquoise));
        OreDictionary.registerOre("blockWAlabaster",
                EnumHelper.getBlockIS(EnumBlocks.blockWAlabaster));
    }
}