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

public final class ModItems
{

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

    public static Item headAmethyst;

    public static Item chestAmethyst;

    public static Item legsAmethyst;

    public static Item bootsAmethyst;

    public static Item headBDiamond;

    public static Item chestBDiamond;

    public static Item legsBDiamond;

    public static Item bootsBDiamond;

    public static Item headCitrine;

    public static Item chestCitrine;

    public static Item legsCitrine;

    public static Item bootsCitrine;

    public static Item headCZirconia;

    public static Item chestCZirconia;

    public static Item legsCZirconia;

    public static Item bootsCZirconia;

    public static Item headEmerald;

    public static Item chestEmerald;

    public static Item legsEmerald;

    public static Item bootsEmerald;

    public static Item headFuchsia;

    public static Item chestFuchsia;

    public static Item legsFuchsia;

    public static Item bootsFuchsia;

    public static Item headJet;

    public static Item chestJet;

    public static Item legsJet;

    public static Item bootsJet;

    public static Item headOlivine;

    public static Item chestOlivine;

    public static Item legsOlivine;

    public static Item bootsOlivine;

    public static Item headOpal;

    public static Item chestOpal;

    public static Item legsOpal;

    public static Item bootsOpal;

    public static Item headQuartz;

    public static Item chestQuartz;

    public static Item legsQuartz;

    public static Item bootsQuartz;

    public static Item headRuby;

    public static Item chestRuby;

    public static Item legsRuby;

    public static Item bootsRuby;

    public static Item headSapphire;

    public static Item chestSapphire;

    public static Item legsSapphire;

    public static Item bootsSapphire;

    public static Item headSQuartz;

    public static Item chestSQuartz;

    public static Item legsSQuartz;

    public static Item bootsSQuartz;

    public static Item headSun;

    public static Item chestSun;

    public static Item legsSun;

    public static Item bootsSun;

    public static Item headTopaz;

    public static Item chestTopaz;

    public static Item legsTopaz;

    public static Item bootsTopaz;

    public static Item headTurquoise;

    public static Item chestTurquoise;

    public static Item legsTurquoise;

    public static Item bootsTurquoise;

    public static Item headWAlabaster;

    public static Item chestWAlabaster;

    public static Item legsWAlabaster;

    public static Item bootsWAlabaster;

    /**
     * Creates all the Item Objects in the Mod.
     */
    public static void init()
    {
        Handler.log(Dendritis.instance, "Loading Items");
        itemMain = new BaseItem(Properties.itemMainID, 0);
        itemGems = new BaseItem(Properties.itemGemsID, 1).setCreativeTab(DendritisTabs.tabDendritisGems);

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
        
        headAmethyst = new DummyArmor(Properties.headAmethystID, ArmorMaterials.armorAMETHYST).setUnlocalizedName(ItemNames.headAmethyst);
        headAmethyst = new DummyArmor(Properties.chestAmethystID, ArmorMaterials.armorAMETHYST).setUnlocalizedName(ItemNames.chestAmethyst);
        headAmethyst = new DummyArmor(Properties.legsAmethystID, ArmorMaterials.armorAMETHYST).setUnlocalizedName(ItemNames.legsAmethyst);
        headAmethyst = new DummyArmor(Properties.bootsAmethystID, ArmorMaterials.armorAMETHYST).setUnlocalizedName(ItemNames.bootsAmethyst);
        
        headAmethyst = new DummyArmor(Properties.headBDIAMONDID, ArmorMaterials.armorBDIAMOND).setUnlocalizedName(ItemNames.headBDIAMOND);
        headAmethyst = new DummyArmor(Properties.chestBDIAMONDID, ArmorMaterials.armorBDIAMOND).setUnlocalizedName(ItemNames.chestBDIAMOND);
        headAmethyst = new DummyArmor(Properties.legsBDIAMONDID, ArmorMaterials.armorBDIAMOND).setUnlocalizedName(ItemNames.legsBDIAMOND);
        headAmethyst = new DummyArmor(Properties.bootsBDIAMONDID, ArmorMaterials.armorBDIAMOND).setUnlocalizedName(ItemNames.bootsBDIAMOND);
        
        headAmethyst = new DummyArmor(Properties.headCITRINEID, ArmorMaterials.armorCITRINEID).setUnlocalizedName(ItemNames.headCITRINE);
        headAmethyst = new DummyArmor(Properties.chestCITRINEID, ArmorMaterials.armorCITRINEID).setUnlocalizedName(ItemNames.chestCITRINE);
        headAmethyst = new DummyArmor(Properties.legsCITRINEID, ArmorMaterials.armorCITRINEID).setUnlocalizedName(ItemNames.legsCITRINE);
        headAmethyst = new DummyArmor(Properties.bootsCITRINEID, ArmorMaterials.armorCITRINEID).setUnlocalizedName(ItemNames.bootsCITRINE);
        
        headAmethyst = new DummyArmor(Properties.headCZIRCONIA, ArmorMaterials.armorCZIRCONIA).setUnlocalizedName(ItemNames.headCZIRCONIA);
        headAmethyst = new DummyArmor(Properties.chestCZIRCONIA, ArmorMaterials.armorCZIRCONIA).setUnlocalizedName(ItemNames.chestCZIRCONIA);
        headAmethyst = new DummyArmor(Properties.legsCZIRCONIA, ArmorMaterials.armorCZIRCONIA).setUnlocalizedName(ItemNames.legsCZIRCONIA);
        headAmethyst = new DummyArmor(Properties.bootsCZIRCONIA, ArmorMaterials.armorCZIRCONIA).setUnlocalizedName(ItemNames.bootsCZIRCONIA);
        
        headAmethyst = new DummyArmor(Properties.headEMERALD, ArmorMaterials.armorEMERALD).setUnlocalizedName(ItemNames.headEMERALD);
        headAmethyst = new DummyArmor(Properties.chestEMERALD, ArmorMaterials.armorEMERALD).setUnlocalizedName(ItemNames.chestEMERALD);
        headAmethyst = new DummyArmor(Properties.legsEMERALD, ArmorMaterials.armorEMERALD).setUnlocalizedName(ItemNames.legsEMERALD);
        headAmethyst = new DummyArmor(Properties.bootsEMERALD, ArmorMaterials.armorEMERALD).setUnlocalizedName(ItemNames.bootsEMERALD);
        
        headAmethyst = new DummyArmor(Properties.headFUCHSIA, ArmorMaterials.armorFUCHSIA).setUnlocalizedName(ItemNames.headFUCHSIA);
        headAmethyst = new DummyArmor(Properties.chestFUCHSIA, ArmorMaterials.armorFUCHSIA).setUnlocalizedName(ItemNames.chestFUCHSIA);
        headAmethyst = new DummyArmor(Properties.legsFUCHSIA, ArmorMaterials.armorFUCHSIA).setUnlocalizedName(ItemNames.legsFUCHSIA);
        headAmethyst = new DummyArmor(Properties.bootsFUCHSIA, ArmorMaterials.armorFUCHSIA).setUnlocalizedName(ItemNames.bootsFUCHSIA);
        
        headAmethyst = new DummyArmor(Properties.headJET, ArmorMaterials.armorJET).setUnlocalizedName(ItemNames.headJET);
        headAmethyst = new DummyArmor(Properties.chestJET, ArmorMaterials.armorJET).setUnlocalizedName(ItemNames.chestdJET);
        headAmethyst = new DummyArmor(Properties.legsJET, ArmorMaterials.armorJET).setUnlocalizedName(ItemNames.legsJET);
        headAmethyst = new DummyArmor(Properties.bootsJET, ArmorMaterials.armorJET).setUnlocalizedName(ItemNames.bootsJET);
        
        headAmethyst = new DummyArmor(Properties.headOLIVINE, ArmorMaterials.armorOLIVINE).setUnlocalizedName(ItemNames.headOLIVINE);
        headAmethyst = new DummyArmor(Properties.chestOLIVINE, ArmorMaterials.armorOLIVINE).setUnlocalizedName(ItemNames.chestOLIVINE);
        headAmethyst = new DummyArmor(Properties.legsOLIVINE, ArmorMaterials.armorOLIVINE).setUnlocalizedName(ItemNames.legsOLIVINE);
        headAmethyst = new DummyArmor(Properties.bootsOLIVINE, ArmorMaterials.armorOLIVINE).setUnlocalizedName(ItemNames.bootsOLIVINE);
         
        headAmethyst = new DummyArmor(Properties.headOPAL, ArmorMaterials.armorOPAL).setUnlocalizedName(ItemNames.headOPAL);
        headAmethyst = new DummyArmor(Properties.chestOPAL, ArmorMaterials.armorOPAL).setUnlocalizedName(ItemNames.chestOPAL);
        headAmethyst = new DummyArmor(Properties.legsOPAL, ArmorMaterials.armorOPAL).setUnlocalizedName(ItemNames.legsOPAL);
        headAmethyst = new DummyArmor(Properties.bootsOPAL, ArmorMaterials.armorOPAL).setUnlocalizedName(ItemNames.bootsOPAL);
        
        headAmethyst = new DummyArmor(Properties.headQUARTZ, ArmorMaterials.armorQUARTZ).setUnlocalizedName(ItemNames.headQUARTZ);
        headAmethyst = new DummyArmor(Properties.chestQUARTZ, ArmorMaterials.armorQUARTZ).setUnlocalizedName(ItemNames.chestQUARTZ);
        headAmethyst = new DummyArmor(Properties.legsQUARTZ, ArmorMaterials.armorQUARTZ).setUnlocalizedName(ItemNames.legsQUARTZ);
        headAmethyst = new DummyArmor(Properties.bootsQUARTZ, ArmorMaterials.armorQUARTZ).setUnlocalizedName(ItemNames.bootsQUARTZ);
        
        headAmethyst = new DummyArmor(Properties.headRUBY, ArmorMaterials.armorRUBY).setUnlocalizedName(ItemNames.headRUBY);
        headAmethyst = new DummyArmor(Properties.chestRUBY, ArmorMaterials.armorRUBY).setUnlocalizedName(ItemNames.chestRUBY);
        headAmethyst = new DummyArmor(Properties.legsRUBY, ArmorMaterials.armorRUBY).setUnlocalizedName(ItemNames.legsRUBY);
        headAmethyst = new DummyArmor(Properties.bootsdRUBY, ArmorMaterials.armorRUBY).setUnlocalizedName(ItemNames.bootsRUBY);
        
        headAmethyst = new DummyArmor(Properties.headSAPPHIRE, ArmorMaterials.armorSAPPHIRE).setUnlocalizedName(ItemNames.headSAPPHIRE);
        headAmethyst = new DummyArmor(Properties.chestSAPPHIRE, ArmorMaterials.armorSAPPHIRE).setUnlocalizedName(ItemNames.chestSAPPHIRE);
        headAmethyst = new DummyArmor(Properties.legsSAPPHIRE, ArmorMaterials.armorSAPPHIRE).setUnlocalizedName(ItemNames.legsAPPHIRE);
        headAmethyst = new DummyArmor(Properties.bootsSAPPHIRE, ArmorMaterials.armorSAPPHIRE).setUnlocalizedName(ItemNames.bootsAPPHIRE);
        
        headAmethyst = new DummyArmor(Properties.headSQUARTZ, ArmorMaterials.armorSQUARTZ).setUnlocalizedName(ItemNames.headSQUARTZ);
        headAmethyst = new DummyArmor(Properties.chestSQUARTZ, ArmorMaterials.armorSQUARTZ).setUnlocalizedName(ItemNames.chestSQUARTZ);
        headAmethyst = new DummyArmor(Properties.legsSQUARTZ, ArmorMaterials.armorSQUARTZ).setUnlocalizedName(ItemNames.legsSQUARTZ);
        headAmethyst = new DummyArmor(Properties.bootsQUARTZ, ArmorMaterials.armorSQUARTZ).setUnlocalizedName(ItemNames.bootsSQUARTZ);
        
        headAmethyst = new DummyArmor(Properties.headSUN, ArmorMaterials.armorSUN).setUnlocalizedName(ItemNames.headSUN);
        headAmethyst = new DummyArmor(Properties.chestdSUN, ArmorMaterials.armorSUN).setUnlocalizedName(ItemNames.chestSUN);
        headAmethyst = new DummyArmor(Properties.legsSUN, ArmorMaterials.armorSUN).setUnlocalizedName(ItemNames.legsSUN);
        headAmethyst = new DummyArmor(Properties.bootsSUN, ArmorMaterials.armorSUN).setUnlocalizedName(ItemNames.boostSUN);
        
        headAmethyst = new DummyArmor(Properties.headTOPAZ, ArmorMaterials.armorTOPAZ).setUnlocalizedName(ItemNames.headTOPAZ);
        headAmethyst = new DummyArmor(Properties.chestTOPAZ, ArmorMaterials.armorTOPAZ).setUnlocalizedName(ItemNames.chestTOPAZ);
        headAmethyst = new DummyArmor(Properties.legsTOPAZ, ArmorMaterials.armorTOPAZ).setUnlocalizedName(ItemNames.legTOPAZ);
        headAmethyst = new DummyArmor(Properties.bootsTOPAZ, ArmorMaterials.armorTOPAZ).setUnlocalizedName(ItemNames.bootsTOPAZ);
        
        headAmethyst = new DummyArmor(Properties.headTURQUOISE, ArmorMaterials.armorTURQUOISE).setUnlocalizedName(ItemNames.headTURQUOISE);
        headAmethyst = new DummyArmor(Properties.chestTURQUOISE, ArmorMaterials.armorTURQUOISE).setUnlocalizedName(ItemNames.chestTURQUOISE);
        headAmethyst = new DummyArmor(Properties.legsTURQUOISE, ArmorMaterials.armorTURQUOISE).setUnlocalizedName(ItemNames.legsTURQUOISE);
        headAmethyst = new DummyArmor(Properties.bootsTURQUOISE, ArmorMaterials.armorTURQUOISE).setUnlocalizedName(ItemNames.bootsTURQUOISE);
        
        headAmethyst = new DummyArmor(Properties.headWALABASTER, ArmorMaterials.armorWALABASTER).setUnlocalizedName(ItemNames.headWALABASTER);
        headAmethyst = new DummyArmor(Properties.chestWALABASTER, ArmorMaterials.armorWALABASTER).setUnlocalizedName(ItemNames.chestWALABASTER);
        headAmethyst = new DummyArmor(Properties.legsWALABASTER, ArmorMaterials.armorWALABASTER).setUnlocalizedName(ItemNames.legsWALABASTER);
        headAmethyst = new DummyArmor(Properties.bootsWALABASTER, ArmorMaterials.armorWALABASTER).setUnlocalizedName(ItemNames.bootsWALABASTER);
        
    }
}