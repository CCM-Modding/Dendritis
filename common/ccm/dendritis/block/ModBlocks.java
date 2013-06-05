package ccm.dendritis.block;

import net.minecraft.block.Block;

import ccm.nucleum_omnium.handler.Handler;

import ccm.dendritis.Dendritis;
import ccm.dendritis.utils.lib.Properties;

public final class ModBlocks
{

    public static Block tiles;

    public static Block ores;

    public static Block blocks;

    /**
     * Creates all the Block Objects in the Mod.
     */
    public static void init()
    {
        Handler.log(Dendritis.instance, "Loading Blocks");

        ores = new ModOres(Properties.oreID);
        blocks = new ModStrgBlocks(Properties.blocksID);

    }
}