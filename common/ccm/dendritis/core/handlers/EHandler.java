package ccm.dendritis.core.handlers;

import net.minecraft.item.ItemStack;

import ccm.dendritis.block.ModBlocks;
import ccm.dendritis.enums.EnumBlocks;
import ccm.dendritis.enums.EnumGems;
import ccm.dendritis.enums.EnumMain;
import ccm.dendritis.enums.EnumOres;
import ccm.dendritis.item.ModItems;

public final class EHandler
{

    /**
     * @param enumBaseItem
     * @return new ItemStack
     */
    public static ItemStack getItem(final EnumMain enumMain)
    {
        return new ItemStack(ModItems.itemMain, 1, enumMain.ordinal());
    }

    /**
     * @param enumBaseItem
     * @param amount
     * @return new ItemStack
     */
    public static ItemStack getItem(final EnumMain enumMain, final int amount)
    {
        return new ItemStack(ModItems.itemMain, amount, enumMain.ordinal());
    }

    /**
     * @param enumNonStack
     * @return new ItemStack
     */
    public static ItemStack getItem(final EnumGems enumGems)
    {
        return new ItemStack(ModItems.itemGems, 1, enumGems.ordinal());
    }

    /**
     * @param enumNonStack
     * @param amount
     * @return new ItemStack
     */
    public static ItemStack getItem(final EnumGems enumGems, final int amount)
    {
        return new ItemStack(ModItems.itemGems, amount, enumGems.ordinal());
    }

    /**
     * @param enumNonStack
     * @return new ItemStack
     */
    public static ItemStack getItem(final EnumOres enumOres)
    {
        return new ItemStack(ModBlocks.ores, 1, enumOres.ordinal());
    }

    /**
     * @param enumNonStack
     * @param amount
     * @return new ItemStack
     */
    public static ItemStack getItem(final EnumOres enumOres, final int amount)
    {
        return new ItemStack(ModBlocks.ores, amount, enumOres.ordinal());
    }

    /**
     * @param enumNonStack
     * @return new ItemStack
     */
    public static ItemStack getItem(final EnumBlocks enumBlocks)
    {
        return new ItemStack(ModBlocks.blocks, 1, enumBlocks.ordinal());
    }

    /**
     * @param enumNonStack
     * @param amount
     * @return new ItemStack
     */
    public static ItemStack getItem(final EnumBlocks enumBlocks, final int amount)
    {
        return new ItemStack(ModBlocks.blocks, amount, enumBlocks.ordinal());
    }
}