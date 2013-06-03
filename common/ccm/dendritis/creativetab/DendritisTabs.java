package ccm.dendritis.creativetab;

import net.minecraft.item.ItemStack;
import ccm.dendritis.core.handlers.EHandler;
import ccm.dendritis.enums.EnumBlocks;
import ccm.dendritis.enums.EnumGems;
import ccm.dendritis.enums.EnumMain;
import ccm.dendritis.item.ModArmors;
import ccm.dendritis.item.ModTools;
import ccm.dendritis.utils.lib.Archive;
import ccm.nucleum_omnium.creativetab.CreativeTab;

public class DendritisTabs
{

    /**
     * Tabs that Contains All the blocks
     */
    public static CreativeTab tabDendritisBlocks;

    /**
     * Contains All the Gems Items
     */
    public static CreativeTab tabDendritisGems;

    /**
     * Contains All the Misc Items
     */
    public static CreativeTab tabDendritisItems;

    /**
     * Contains All the Tools Items
     */
    public static CreativeTab tabDendritisTools;

    /**
     * Contains All the Armor Items
     */
    public static CreativeTab tabDendritisArmor;

    /**
     * Contains All the TC Items
     */
    public static CreativeTab tabDendritisTC;

    public static void initTabs()
    {
        tabDendritisBlocks = new CreativeTab(Archive.TAB_DENDRITIS_BLOCKS);
        tabDendritisGems = new CreativeTab(Archive.TAB_DENDRITIS_GEMS);
        tabDendritisItems = new CreativeTab(Archive.TAB_DENDRITIS_ITEMS);
        tabDendritisTools = new CreativeTab(Archive.TAB_DENDRITIS_TOOLS);
        tabDendritisArmor = new CreativeTab(Archive.TAB_DENDRITIS_ARMOR);
        tabDendritisTC = new CreativeTab(Archive.TAB_DENDRITIS_TC);
    }

    public static void initTabIcons()
    {
        tabDendritisBlocks.init(EHandler.getItem(EnumBlocks.blockAmethyst));
        tabDendritisGems.init(EHandler.getItem(EnumGems.gemAmethyst));
        tabDendritisItems.init(EHandler.getItem(EnumMain.handle));
        tabDendritisTools.init(new ItemStack(ModTools.swordAmethyst));
        tabDendritisArmor.init(new ItemStack(ModArmors.chestAmethyst));
        tabDendritisTC.init(EHandler.getItem(EnumMain.handle));
    }
}