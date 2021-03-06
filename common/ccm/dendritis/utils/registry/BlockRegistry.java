package ccm.dendritis.utils.registry;

import ccm.dendritis.Dendritis;
import ccm.dendritis.block.ModBlocks;
import ccm.dendritis.item.itemblock.ItemBlockBlock;
import ccm.dendritis.item.itemblock.ItemBlockOre;
import ccm.nucleum_omnium.handler.Handler;
import cpw.mods.fml.common.registry.GameRegistry;

final class BlockRegistry {
    
    /**
     * Registers all the Blocks.
     */
    protected static void registerBlocks() {
        Handler.log(Dendritis.instance, "Registering Blocks");
        GameRegistry.registerBlock(ModBlocks.ores, ItemBlockOre.class, "ORES");
        GameRegistry.registerBlock(ModBlocks.blocks, ItemBlockBlock.class, "BLOCKS");
    }
}