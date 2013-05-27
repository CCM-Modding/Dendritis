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
        OreDictionary.registerOre("gemOpal", EHandler.getItem(EnumGems.gemOpal));
        OreDictionary.registerOre("gemRuby", EHandler.getItem(EnumGems.gemRuby));
        OreDictionary.registerOre("gemSapphire", EHandler.getItem(EnumGems.gemSapphire));

        OreDictionary.registerOre("oreAmethyst", EHandler.getItem(EnumOres.oreAmethyst));
        OreDictionary.registerOre("oreOpal", EHandler.getItem(EnumOres.oreOpal));
        OreDictionary.registerOre("oreRuby", EHandler.getItem(EnumOres.oreRuby));
        OreDictionary.registerOre("oreSapphire", EHandler.getItem(EnumOres.oreSapphire));

        OreDictionary.registerOre("blockAmethyst", EHandler.getItem(EnumBlocks.blockAmethyst));
        OreDictionary.registerOre("blockOpal", EHandler.getItem(EnumBlocks.blockOpal));
        OreDictionary.registerOre("blockRuby", EHandler.getItem(EnumBlocks.blockRuby));
        OreDictionary.registerOre("blockSapphire", EHandler.getItem(EnumBlocks.blockSapphire));
    }
}