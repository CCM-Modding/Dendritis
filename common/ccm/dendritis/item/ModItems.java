package ccm.dendritis.item;

import net.minecraft.item.Item;
import ccm.dendritis.Dendritis;
import ccm.dendritis.creativetab.DendritisTabs;
import ccm.dendritis.item.classes.BaseItem;
import ccm.dendritis.item.tool.DummyAxe;
import ccm.dendritis.item.tool.DummyHoe;
import ccm.dendritis.item.tool.DummyPick;
import ccm.dendritis.item.tool.DummySpade;
import ccm.dendritis.item.tool.DummySword;
import ccm.dendritis.item.tool.ToolMaterials;
import ccm.dendritis.utils.lib.ItemNames;
import ccm.dendritis.utils.lib.Properties;
import ccm.nucleum_omnium.handler.Handler;

public final class ModItems {

    public static Item itemMain;

    public static Item itemGems;
    
    public static Item axeAmethyst;
    public static Item hoeAmethyst;
    public static Item spadeAmethyst;
    public static Item pickAmethyst;
    public static Item swordAmethyst;
    
    public static Item axeBDiamond;
    public static Item hoeBDiamond;
    public static Item spadeBDiamond;
    public static Item pickBDiamond;
    public static Item swordBDiamond;
    
    public static Item axeCitrine;
    public static Item hoeCitrine;
    public static Item spadeCitrine;
    public static Item pickCitrine;
    public static Item swordCitrine;
    
    public static Item axeCZirconia;
    public static Item hoeCZirconia;
    public static Item spadeCZirconia;
    public static Item pickCZirconia;
    public static Item swordCZirconia;
    
    public static Item axeEmerald;
    public static Item hoeEmerald;
    public static Item spadeEmerald;
    public static Item pickEmerald;
    public static Item swordEmerald;
    
    public static Item axeFuchsia;
    public static Item hoeFuchsia;
    public static Item spadeFuchsia;
    public static Item pickFuchsia;
    public static Item swordFuchsia;
    
    public static Item axeJet;
    public static Item hoeJet;
    public static Item spadeJet;
    public static Item pickJet;
    public static Item swordJet;
    
    public static Item axeOlivine;
    public static Item hoeOlivine;
    public static Item spadeOlivine;
    public static Item pickOlivine;
    public static Item swordOlivine;
    
    public static Item axeOpal;
    public static Item hoeOpal;
    public static Item spadeOpal;
    public static Item pickOpal;
    public static Item swordOpal;
    
    public static Item axeQuartz;
    public static Item hoeQuartz;
    public static Item spadeQuartz;
    public static Item pickQuartz;
    public static Item swordQuartz;
    
    public static Item axeRuby;
    public static Item hoeRuby;
    public static Item spadeRuby;
    public static Item pickRuby;
    public static Item swordRuby;
    
    public static Item axeSapphire;
    public static Item hoeSapphire;
    public static Item spadeSapphire;
    public static Item pickSapphire;
    public static Item swordSapphire;
    
    public static Item axeSQuartz;
    public static Item hoeSQuartz;
    public static Item spadeSQuartz;
    public static Item pickSQuartz;
    public static Item swordSQuartz;
    
    public static Item axeSun;
    public static Item hoeSun;
    public static Item spadeSun;
    public static Item pickSun;
    public static Item swordSun;
    
    public static Item axeTopaz;
    public static Item hoeTopaz;
    public static Item spadeTopaz;
    public static Item pickTopaz;
    public static Item swordTopaz;
    
    public static Item axeTurquoise;
    public static Item hoeTurquoise;
    public static Item spadeTurquoise;
    public static Item pickTurquoise;
    public static Item swordTurquoise;
    
    public static Item axeWAlabaster;
    public static Item hoeWAlabaster;
    public static Item spadeWAlabaster;
    public static Item pickWAlabaster;
    public static Item swordWAlabaster;

    /**
     * Creates all the Item Objects in the Mod.
     */
    public static void init() {
        Handler.log(Dendritis.instance, "Loading Items");
        itemMain = new BaseItem(Properties.itemMainID, 0);
        itemGems = new BaseItem(Properties.itemGemsID, 1).setCreativeTab(DendritisTabs.tabDendritisMaterials);
        
        axeAmethyst = new DummyAxe(Properties.axeAmethystID, ToolMaterials.toolAMETHYST).setUnlocalizedName(ItemNames.axeAmethyst);
        hoeAmethyst = new DummyHoe(Properties.hoeAmethystID, ToolMaterials.toolAMETHYST).setUnlocalizedName(ItemNames.hoeAmethyst);
        spadeAmethyst = new DummySpade(Properties.spadeAmethystID, ToolMaterials.toolAMETHYST).setUnlocalizedName(ItemNames.spadeAmethyst);
        pickAmethyst = new DummyPick(Properties.pickAmethystID, ToolMaterials.toolAMETHYST).setUnlocalizedName(ItemNames.pickAmethyst);
        swordAmethyst = new DummySword(Properties.swordAmethystID, ToolMaterials.toolAMETHYST).setUnlocalizedName(ItemNames.swordAmethyst);
    }
}
