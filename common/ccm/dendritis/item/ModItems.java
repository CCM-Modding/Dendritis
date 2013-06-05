package ccm.dendritis.item;

import net.minecraft.item.Item;

import ccm.nucleum_omnium.handler.Handler;

import ccm.dendritis.Dendritis;
import ccm.dendritis.creativetab.DendritisTabs;
import ccm.dendritis.item.classes.BaseItem;
import ccm.dendritis.utils.lib.Properties;

public final class ModItems
{

    public static Item itemMain;

    public static Item itemGems;

    /**
     * Creates all the Item Objects in the Mod.
     */
    public static void init()
    {
        Handler.log(Dendritis.instance, "Loading Items");
        itemMain = new BaseItem(Properties.itemMainID, 0);
        itemGems = new BaseItem(Properties.itemGemsID, 1).setCreativeTab(DendritisTabs.tabDendritisGems);
    }
}