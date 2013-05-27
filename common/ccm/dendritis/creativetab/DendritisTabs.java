package ccm.dendritis.creativetab;

import ccm.dendritis.core.handlers.EHandler;
import ccm.dendritis.enums.EnumBlocks;
import ccm.dendritis.enums.EnumGems;
import ccm.dendritis.enums.EnumMain;
import ccm.dendritis.utils.lib.Archive;

public class DendritisTabs {

    /**
     * Tabs that Contains All the blocks
     */
    public static DendritisTab tabDendritisBlocks;

    /**
     * Contains All the Material Items
     */
    public static DendritisTab tabDendritisMaterials;

    /**
     * Contains All the Misc Items
     */
    public static DendritisTab tabDendritisItems;

    /**
     * Contains All the Useable Items
     */
    public static DendritisTab tabDendritisTools;

    public static void initTabs() {
        tabDendritisBlocks = new DendritisTab(Archive.TAB_DENDRITIS);
        tabDendritisMaterials = new DendritisTab(Archive.TAB_DENDRITIS);
        tabDendritisItems = new DendritisTab(Archive.TAB_DENDRITIS);
        tabDendritisTools = new DendritisTab(Archive.TAB_DENDRITIS);
    }

    public static void initTabIcons() {
        tabDendritisBlocks.init(EHandler.getItem(EnumBlocks.blockAmethyst));
        tabDendritisMaterials.init(EHandler.getItem(EnumGems.gemAmethyst));
        tabDendritisItems.init(EHandler.getItem(EnumMain.handle));
        tabDendritisTools.init(EHandler.getItem(EnumGems.gemOpal));
    }
}