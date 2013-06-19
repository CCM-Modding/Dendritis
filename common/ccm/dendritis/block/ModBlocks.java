package ccm.dendritis.block;

import net.minecraft.block.Block;
import ccm.dendritis.Dendritis;
import ccm.dendritis.utils.lib.Properties;
import ccm.nucleum_omnium.handler.Handler;

public final class ModBlocks {
    
    public static Block tiles;
    
    public static Block ores;
    
    public static Block blocks;
    
    /**
     * Creates all the Block Objects in the Mod.
     */
    public static void init() {
        Handler.log(Dendritis.instance, "Loading Blocks");
        
        ModBlocks.ores = new ModOres(Properties.oreID);
        ModBlocks.blocks = new ModStrgBlocks(Properties.blocksID);
        
    }
}