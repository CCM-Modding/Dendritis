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

        axeBDiamond = new DummyAxe(Properties.axeBDiamondID, ToolMaterials.toolBDIAMOND).setUnlocalizedName(ItemNames.axeBDiamond);
        hoeBDiamond = new DummyHoe(Properties.hoeBDiamondID, ToolMaterials.toolBDIAMOND).setUnlocalizedName(ItemNames.hoeBDiamond);
        spadeBDiamond = new DummySpade(Properties.spadeBDiamondID, ToolMaterials.toolBDIAMOND).setUnlocalizedName(ItemNames.spadeBDiamond);
        pickBDiamond = new DummyPick(Properties.pickBDiamondID, ToolMaterials.toolBDIAMOND).setUnlocalizedName(ItemNames.pickBDiamond);
        swordBDiamond = new DummySword(Properties.swordBDiamondID, ToolMaterials.toolBDIAMOND).setUnlocalizedName(ItemNames.swordBDiamond);

        axeCitrine = new DummyAxe(Properties.axeCitrineID, ToolMaterials.toolCITRINE).setUnlocalizedName(ItemNames.axeCitrine);
        hoeCitrine = new DummyHoe(Properties.hoeCitrineID, ToolMaterials.toolCITRINE).setUnlocalizedName(ItemNames.hoeCitrine);
        spadeCitrine = new DummySpade(Properties.spadeCitrineID, ToolMaterials.toolCITRINE).setUnlocalizedName(ItemNames.spadeCitrine);
        pickCitrine = new DummyPick(Properties.pickCitrineID, ToolMaterials.toolCITRINE).setUnlocalizedName(ItemNames.pickCitrine);
        swordCitrine = new DummySword(Properties.swordCitrineID, ToolMaterials.toolCITRINE).setUnlocalizedName(ItemNames.swordCitrine);

        axeCZirconia = new DummyAxe(Properties.axeCZirconiaID, ToolMaterials.toolCZIRCONIA).setUnlocalizedName(ItemNames.axeCZirconia);
        hoeCZirconia = new DummyHoe(Properties.hoeCZirconiaID, ToolMaterials.toolCZIRCONIA).setUnlocalizedName(ItemNames.hoeCZirconia);
        spadeCZirconia = new DummySpade(Properties.spadeCZirconiaID, ToolMaterials.toolCZIRCONIA).setUnlocalizedName(ItemNames.spadeCZirconia);
        pickCZirconia = new DummyPick(Properties.pickCZirconiaID, ToolMaterials.toolCZIRCONIA).setUnlocalizedName(ItemNames.pickCZirconia);
        swordCZirconia = new DummySword(Properties.swordCZirconiaID, ToolMaterials.toolCZIRCONIA).setUnlocalizedName(ItemNames.swordCZirconia);

        axeEmerald = new DummyAxe(Properties.axeEmeraldID, ToolMaterials.toolEMERALD).setUnlocalizedName(ItemNames.axeEmerald);
        hoeEmerald = new DummyHoe(Properties.hoeEmeraldID, ToolMaterials.toolEMERALD).setUnlocalizedName(ItemNames.hoeEmerald);
        spadeEmerald = new DummySpade(Properties.spadeEmeraldID, ToolMaterials.toolEMERALD).setUnlocalizedName(ItemNames.spadeEmerald);
        pickEmerald = new DummyPick(Properties.pickEmeraldID, ToolMaterials.toolEMERALD).setUnlocalizedName(ItemNames.pickEmerald);
        swordEmerald = new DummySword(Properties.swordEmeraldID, ToolMaterials.toolEMERALD).setUnlocalizedName(ItemNames.swordEmerald);

        axeFuchsia = new DummyAxe(Properties.axeFuchsiaID, ToolMaterials.toolFUCHSIA).setUnlocalizedName(ItemNames.axeFuchsia);
        hoeFuchsia = new DummyHoe(Properties.hoeFuchsiaID, ToolMaterials.toolFUCHSIA).setUnlocalizedName(ItemNames.hoeFuchsia);
        spadeFuchsia = new DummySpade(Properties.spadeFuchsiaID, ToolMaterials.toolFUCHSIA).setUnlocalizedName(ItemNames.spadeFuchsia);
        pickFuchsia = new DummyPick(Properties.pickFuchsiaID, ToolMaterials.toolFUCHSIA).setUnlocalizedName(ItemNames.pickFuchsia);
        swordFuchsia = new DummySword(Properties.swordFuchsiaID, ToolMaterials.toolFUCHSIA).setUnlocalizedName(ItemNames.swordFuchsia);

        axeJet = new DummyAxe(Properties.axeJetID, ToolMaterials.toolJET).setUnlocalizedName(ItemNames.axeJet);
        hoeJet = new DummyHoe(Properties.hoeJetID, ToolMaterials.toolJET).setUnlocalizedName(ItemNames.hoeJet);
        spadeJet = new DummySpade(Properties.spadeJetID, ToolMaterials.toolJET).setUnlocalizedName(ItemNames.spadeJet);
        pickJet = new DummyPick(Properties.pickJetID, ToolMaterials.toolJET).setUnlocalizedName(ItemNames.pickJet);
        swordJet = new DummySword(Properties.swordJetID, ToolMaterials.toolJET).setUnlocalizedName(ItemNames.swordJet);

        axeOlivine = new DummyAxe(Properties.axeOlivineID, ToolMaterials.toolOLIVINE).setUnlocalizedName(ItemNames.axeOlivine);
        hoeOlivine = new DummyHoe(Properties.hoeOlivineID, ToolMaterials.toolOLIVINE).setUnlocalizedName(ItemNames.hoeOlivine);
        spadeOlivine = new DummySpade(Properties.spadeOlivineID, ToolMaterials.toolOLIVINE).setUnlocalizedName(ItemNames.spadeOlivine);
        pickOlivine = new DummyPick(Properties.pickOlivineID, ToolMaterials.toolOLIVINE).setUnlocalizedName(ItemNames.pickOlivine);
        swordOlivine = new DummySword(Properties.swordOlivineID, ToolMaterials.toolOLIVINE).setUnlocalizedName(ItemNames.swordOlivine);

        axeOpal = new DummyAxe(Properties.axeOpalID, ToolMaterials.toolOPAL).setUnlocalizedName(ItemNames.axeOpal);
        hoeOpal = new DummyHoe(Properties.hoeOpalID, ToolMaterials.toolOPAL).setUnlocalizedName(ItemNames.hoeOpal);
        spadeOpal = new DummySpade(Properties.spadeOpalID, ToolMaterials.toolOPAL).setUnlocalizedName(ItemNames.spadeOpal);
        pickOpal = new DummyPick(Properties.pickOpalID, ToolMaterials.toolOPAL).setUnlocalizedName(ItemNames.pickOpal);
        swordOpal = new DummySword(Properties.swordOpalID, ToolMaterials.toolOPAL).setUnlocalizedName(ItemNames.swordOpal);

        axeQuartz = new DummyAxe(Properties.axeQuartzID, ToolMaterials.toolQUARTZ).setUnlocalizedName(ItemNames.axeQuartz);
        hoeQuartz = new DummyHoe(Properties.hoeQuartzID, ToolMaterials.toolQUARTZ).setUnlocalizedName(ItemNames.hoeQuartz);
        spadeQuartz = new DummySpade(Properties.spadeQuartzID, ToolMaterials.toolQUARTZ).setUnlocalizedName(ItemNames.spadeQuartz);
        pickQuartz = new DummyPick(Properties.pickQuartzID, ToolMaterials.toolQUARTZ).setUnlocalizedName(ItemNames.pickQuartz);
        swordQuartz = new DummySword(Properties.swordQuartzID, ToolMaterials.toolQUARTZ).setUnlocalizedName(ItemNames.swordQuartz);

        axeRuby = new DummyAxe(Properties.axeRubyID, ToolMaterials.toolRUBY).setUnlocalizedName(ItemNames.axeRuby);
        hoeRuby = new DummyHoe(Properties.hoeRubyID, ToolMaterials.toolRUBY).setUnlocalizedName(ItemNames.hoeRuby);
        spadeRuby = new DummySpade(Properties.spadeRubyID, ToolMaterials.toolRUBY).setUnlocalizedName(ItemNames.spadeRuby);
        pickRuby = new DummyPick(Properties.pickRubyID, ToolMaterials.toolRUBY).setUnlocalizedName(ItemNames.pickRuby);
        swordRuby = new DummySword(Properties.swordRubyID, ToolMaterials.toolRUBY).setUnlocalizedName(ItemNames.swordRuby);

        axeSapphire = new DummyAxe(Properties.axeSapphireID, ToolMaterials.toolSAPPHIRE).setUnlocalizedName(ItemNames.axeSapphire);
        hoeSapphire = new DummyHoe(Properties.hoeSapphireID, ToolMaterials.toolSAPPHIRE).setUnlocalizedName(ItemNames.hoeSapphire);
        spadeSapphire = new DummySpade(Properties.spadeSapphireID, ToolMaterials.toolSAPPHIRE).setUnlocalizedName(ItemNames.spadeSapphire);
        pickSapphire = new DummyPick(Properties.pickSapphireID, ToolMaterials.toolSAPPHIRE).setUnlocalizedName(ItemNames.pickSapphire);
        swordSapphire = new DummySword(Properties.swordSapphireID, ToolMaterials.toolSAPPHIRE).setUnlocalizedName(ItemNames.swordSapphire);

        axeSQuartz = new DummyAxe(Properties.axeSQuartzID, ToolMaterials.toolSQUARTZ).setUnlocalizedName(ItemNames.axeSQuartz);
        hoeSQuartz = new DummyHoe(Properties.hoeSQuartzID, ToolMaterials.toolSQUARTZ).setUnlocalizedName(ItemNames.hoeSQuartz);
        spadeSQuartz = new DummySpade(Properties.spadeSQuartzID, ToolMaterials.toolSQUARTZ).setUnlocalizedName(ItemNames.spadeSQuartz);
        pickSQuartz = new DummyPick(Properties.pickSQuartzID, ToolMaterials.toolSQUARTZ).setUnlocalizedName(ItemNames.pickSQuartz);
        swordSQuartz = new DummySword(Properties.swordSQuartzID, ToolMaterials.toolSQUARTZ).setUnlocalizedName(ItemNames.swordSQuartz);

        axeSun = new DummyAxe(Properties.axeSunID, ToolMaterials.toolSUN).setUnlocalizedName(ItemNames.axeSun);
        hoeSun = new DummyHoe(Properties.hoeSunID, ToolMaterials.toolSUN).setUnlocalizedName(ItemNames.hoeSun);
        spadeSun = new DummySpade(Properties.spadeSunID, ToolMaterials.toolSUN).setUnlocalizedName(ItemNames.spadeSun);
        pickSun = new DummyPick(Properties.pickSunID, ToolMaterials.toolSUN).setUnlocalizedName(ItemNames.pickSun);
        swordSun = new DummySword(Properties.swordSunID, ToolMaterials.toolSUN).setUnlocalizedName(ItemNames.swordSun);

        axeTopaz = new DummyAxe(Properties.axeTopazID, ToolMaterials.toolTOPAZ).setUnlocalizedName(ItemNames.axeTopaz);
        hoeTopaz = new DummyHoe(Properties.hoeTopazID, ToolMaterials.toolTOPAZ).setUnlocalizedName(ItemNames.hoeTopaz);
        spadeTopaz = new DummySpade(Properties.spadeTopazID, ToolMaterials.toolTOPAZ).setUnlocalizedName(ItemNames.spadeTopaz);
        pickTopaz = new DummyPick(Properties.pickTopazID, ToolMaterials.toolTOPAZ).setUnlocalizedName(ItemNames.pickTopaz);
        swordTopaz = new DummySword(Properties.swordTopazID, ToolMaterials.toolTOPAZ).setUnlocalizedName(ItemNames.swordTopaz);

        axeTurquoise = new DummyAxe(Properties.axeTurquoiseID, ToolMaterials.toolTURQUOISE).setUnlocalizedName(ItemNames.axeTurquoise);
        hoeTurquoise = new DummyHoe(Properties.hoeTurquoiseID, ToolMaterials.toolTURQUOISE).setUnlocalizedName(ItemNames.hoeTurquoise);
        spadeTurquoise = new DummySpade(Properties.spadeTurquoiseID, ToolMaterials.toolTURQUOISE).setUnlocalizedName(ItemNames.spadeTurquoise);
        pickTurquoise = new DummyPick(Properties.pickTurquoiseID, ToolMaterials.toolTURQUOISE).setUnlocalizedName(ItemNames.pickTurquoise);
        swordTurquoise = new DummySword(Properties.swordTurquoiseID, ToolMaterials.toolTURQUOISE).setUnlocalizedName(ItemNames.swordTurquoise);

        axeWAlabaster = new DummyAxe(Properties.axeWAlabasterID, ToolMaterials.toolWALABASTER).setUnlocalizedName(ItemNames.axeWAlabaster);
        hoeWAlabaster = new DummyHoe(Properties.hoeWAlabasterID, ToolMaterials.toolWALABASTER).setUnlocalizedName(ItemNames.hoeWAlabaster);
        spadeWAlabaster = new DummySpade(Properties.spadeWAlabasterID, ToolMaterials.toolWALABASTER).setUnlocalizedName(ItemNames.spadeWAlabaster);
        pickWAlabaster = new DummyPick(Properties.pickWAlabasterID, ToolMaterials.toolWALABASTER).setUnlocalizedName(ItemNames.pickWAlabaster);
        swordWAlabaster = new DummySword(Properties.swordWAlabasterID, ToolMaterials.toolWALABASTER).setUnlocalizedName(ItemNames.swordWAlabaster);
    }
}
