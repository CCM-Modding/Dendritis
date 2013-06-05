package ccm.dendritis.item;

import net.minecraft.item.Item;

import ccm.nucleum_omnium.handler.Handler;

import ccm.dendritis.Dendritis;
import ccm.dendritis.item.armor.ArmorMaterials;
import ccm.dendritis.item.armor.DummyArmor;
import ccm.dendritis.utils.lib.Properties;

public final class ModArmors
{

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

        headAmethyst = new DummyArmor(Properties.headAmethystID, ArmorMaterials.armorAMETHYST, 0, 0).setUnlocalizedName("headAmethyst");
        chestAmethyst = new DummyArmor(Properties.chestAmethystID, ArmorMaterials.armorAMETHYST, 0, 1).setUnlocalizedName("chestAmethyst");
        legsAmethyst = new DummyArmor(Properties.legsAmethystID, ArmorMaterials.armorAMETHYST, 0, 2).setUnlocalizedName("legsAmethyst");
        bootsAmethyst = new DummyArmor(Properties.bootsAmethystID, ArmorMaterials.armorAMETHYST, 0, 3).setUnlocalizedName("bootsAmethyst");

        headBDiamond = new DummyArmor(Properties.headBDiamondID, ArmorMaterials.armorBDIAMOND, 0, 0).setUnlocalizedName("headBDiamond");
        chestBDiamond = new DummyArmor(Properties.chestBDiamondID, ArmorMaterials.armorBDIAMOND, 0, 1).setUnlocalizedName("chestBDiamond");
        legsBDiamond = new DummyArmor(Properties.legsBDiamondID, ArmorMaterials.armorBDIAMOND, 0, 2).setUnlocalizedName("legsBDiamond");
        bootsBDiamond = new DummyArmor(Properties.bootsBDiamondID, ArmorMaterials.armorBDIAMOND, 0, 3).setUnlocalizedName("bootsBDiamond");

        headCitrine = new DummyArmor(Properties.headCitrineID, ArmorMaterials.armorCITRINE, 0, 0).setUnlocalizedName("headCitrine");
        chestCitrine = new DummyArmor(Properties.chestCitrineID, ArmorMaterials.armorCITRINE, 0, 1).setUnlocalizedName("chestCitrine");
        legsCitrine = new DummyArmor(Properties.legsCitrineID, ArmorMaterials.armorCITRINE, 0, 2).setUnlocalizedName("legsCitrine");
        bootsCitrine = new DummyArmor(Properties.bootsCitrineID, ArmorMaterials.armorCITRINE, 0, 3).setUnlocalizedName("bootsCitrine");

        headCZirconia = new DummyArmor(Properties.headCZirconiaID, ArmorMaterials.armorCZIRCONIA, 0, 0).setUnlocalizedName("headCZirconia");
        chestCZirconia = new DummyArmor(Properties.chestCZirconiaID, ArmorMaterials.armorCZIRCONIA, 0, 1).setUnlocalizedName("chestCZirconia");
        legsCZirconia = new DummyArmor(Properties.legsCZirconiaID, ArmorMaterials.armorCZIRCONIA, 0, 2).setUnlocalizedName("legsCZirconia");
        bootsCZirconia = new DummyArmor(Properties.bootsCZirconiaID, ArmorMaterials.armorCZIRCONIA, 0, 3).setUnlocalizedName("bootsCZirconia");

        headEmerald = new DummyArmor(Properties.headEmeraldID, ArmorMaterials.armorEMERALD, 0, 0).setUnlocalizedName("headEmerald");
        chestEmerald = new DummyArmor(Properties.chestEmeraldID, ArmorMaterials.armorEMERALD, 0, 1).setUnlocalizedName("chestEmerald");
        legsEmerald = new DummyArmor(Properties.legsEmeraldID, ArmorMaterials.armorEMERALD, 0, 2).setUnlocalizedName("legsEmerald");
        bootsEmerald = new DummyArmor(Properties.bootsEmeraldID, ArmorMaterials.armorEMERALD, 0, 3).setUnlocalizedName("bootsEmerald");

        headFuchsia = new DummyArmor(Properties.headFuchsiaID, ArmorMaterials.armorFUCHSIA, 0, 0).setUnlocalizedName("headFuchsia");
        chestFuchsia = new DummyArmor(Properties.chestFuchsiaID, ArmorMaterials.armorFUCHSIA, 0, 1).setUnlocalizedName("chestFuchsia");
        legsFuchsia = new DummyArmor(Properties.legsFuchsiaID, ArmorMaterials.armorFUCHSIA, 0, 2).setUnlocalizedName("legsFuchsia");
        bootsFuchsia = new DummyArmor(Properties.bootsFuchsiaID, ArmorMaterials.armorFUCHSIA, 0, 3).setUnlocalizedName("bootsFuchsia");

        headJet = new DummyArmor(Properties.headJetID, ArmorMaterials.armorJET, 0, 0).setUnlocalizedName("headJet");
        chestJet = new DummyArmor(Properties.chestJetID, ArmorMaterials.armorJET, 0, 1).setUnlocalizedName("chestJet");
        legsJet = new DummyArmor(Properties.legsJetID, ArmorMaterials.armorJET, 0, 2).setUnlocalizedName("legsJet");
        bootsJet = new DummyArmor(Properties.bootsJetID, ArmorMaterials.armorJET, 0, 3).setUnlocalizedName("bootsJet");

        headOlivine = new DummyArmor(Properties.headOlivineID, ArmorMaterials.armorOLIVINE, 0, 0).setUnlocalizedName("headOlivine");
        chestOlivine = new DummyArmor(Properties.chestOlivineID, ArmorMaterials.armorOLIVINE, 0, 1).setUnlocalizedName("chestOlivine");
        legsOlivine = new DummyArmor(Properties.legsOlivineID, ArmorMaterials.armorOLIVINE, 0, 2).setUnlocalizedName("legsOlivine");
        bootsOlivine = new DummyArmor(Properties.bootsOlivineID, ArmorMaterials.armorOLIVINE, 0, 3).setUnlocalizedName("bootsOlivine");

        headOpal = new DummyArmor(Properties.headOpalID, ArmorMaterials.armorOPAL, 0, 0).setUnlocalizedName("headOpal");
        chestOpal = new DummyArmor(Properties.chestOpalID, ArmorMaterials.armorOPAL, 0, 1).setUnlocalizedName("chestOpal");
        legsOpal = new DummyArmor(Properties.legsOpalID, ArmorMaterials.armorOPAL, 0, 2).setUnlocalizedName("legsOpal");
        bootsOpal = new DummyArmor(Properties.bootsOpalID, ArmorMaterials.armorOPAL, 0, 3).setUnlocalizedName("bootsOpal");

        headQuartz = new DummyArmor(Properties.headQuartzID, ArmorMaterials.armorQUARTZ, 0, 0).setUnlocalizedName("headQuartz");
        chestQuartz = new DummyArmor(Properties.chestQuartzID, ArmorMaterials.armorQUARTZ, 0, 1).setUnlocalizedName("chestQuartz");
        legsQuartz = new DummyArmor(Properties.legsQuartzID, ArmorMaterials.armorQUARTZ, 0, 2).setUnlocalizedName("legsQuartz");
        bootsQuartz = new DummyArmor(Properties.bootsQuartzID, ArmorMaterials.armorQUARTZ, 0, 3).setUnlocalizedName("bootsQuartz");

        headRuby = new DummyArmor(Properties.headRubyID, ArmorMaterials.armorRUBY, 0, 0).setUnlocalizedName("headRuby");
        chestRuby = new DummyArmor(Properties.chestRubyID, ArmorMaterials.armorRUBY, 0, 1).setUnlocalizedName("chestRuby");
        legsRuby = new DummyArmor(Properties.legsRubyID, ArmorMaterials.armorRUBY, 0, 2).setUnlocalizedName("legsRuby");
        bootsRuby = new DummyArmor(Properties.bootsRubyID, ArmorMaterials.armorRUBY, 0, 3).setUnlocalizedName("bootsRuby");

        headSapphire = new DummyArmor(Properties.headSapphireID, ArmorMaterials.armorSAPPHIRE, 0, 0).setUnlocalizedName("headSapphire");
        chestSapphire = new DummyArmor(Properties.chestSapphireID, ArmorMaterials.armorSAPPHIRE, 0, 1).setUnlocalizedName("chestSapphire");
        legsSapphire = new DummyArmor(Properties.legsSapphireID, ArmorMaterials.armorSAPPHIRE, 0, 2).setUnlocalizedName("legsSapphire");
        bootsSapphire = new DummyArmor(Properties.bootsSapphireID, ArmorMaterials.armorSAPPHIRE, 0, 3).setUnlocalizedName("bootsSapphire");

        headSQuartz = new DummyArmor(Properties.headSQuartzID, ArmorMaterials.armorSQUARTZ, 0, 0).setUnlocalizedName("headSQuartz");
        chestSQuartz = new DummyArmor(Properties.chestSQuartzID, ArmorMaterials.armorSQUARTZ, 0, 1).setUnlocalizedName("chestSQuartz");
        legsSQuartz = new DummyArmor(Properties.legsSQuartzID, ArmorMaterials.armorSQUARTZ, 0, 2).setUnlocalizedName("legsSQuartz");
        bootsSQuartz = new DummyArmor(Properties.bootsSQuartzID, ArmorMaterials.armorSQUARTZ, 0, 3).setUnlocalizedName("bootsSQuartz");

        headSun = new DummyArmor(Properties.headSunID, ArmorMaterials.armorSUN, 0, 0).setUnlocalizedName("headSun");
        chestSun = new DummyArmor(Properties.chestSunID, ArmorMaterials.armorSUN, 0, 1).setUnlocalizedName("chestSun");
        legsSun = new DummyArmor(Properties.legsSunID, ArmorMaterials.armorSUN, 0, 2).setUnlocalizedName("legsSun");
        bootsSun = new DummyArmor(Properties.bootsSunID, ArmorMaterials.armorSUN, 0, 3).setUnlocalizedName("bootsSun");

        headTopaz = new DummyArmor(Properties.headTopazID, ArmorMaterials.armorTOPAZ, 0, 0).setUnlocalizedName("headTopaz");
        chestTopaz = new DummyArmor(Properties.chestTopazID, ArmorMaterials.armorTOPAZ, 0, 1).setUnlocalizedName("chestTopaz");
        legsTopaz = new DummyArmor(Properties.legsTopazID, ArmorMaterials.armorTOPAZ, 0, 2).setUnlocalizedName("legsTopaz");
        bootsTopaz = new DummyArmor(Properties.bootsTopazID, ArmorMaterials.armorTOPAZ, 0, 3).setUnlocalizedName("bootsTopaz");

        headTurquoise = new DummyArmor(Properties.headTurquoiseID, ArmorMaterials.armorTURQUOISE, 0, 0).setUnlocalizedName("headTurquoise");
        chestTurquoise = new DummyArmor(Properties.chestTurquoiseID, ArmorMaterials.armorTURQUOISE, 0, 1).setUnlocalizedName("chestTurquoise");
        legsTurquoise = new DummyArmor(Properties.legsTurquoiseID, ArmorMaterials.armorTURQUOISE, 0, 2).setUnlocalizedName("legsTurquoise");
        bootsTurquoise = new DummyArmor(Properties.bootsTurquoiseID, ArmorMaterials.armorTURQUOISE, 0, 3).setUnlocalizedName("bootsTurquoise");

        headWAlabaster = new DummyArmor(Properties.headWAlabasterID, ArmorMaterials.armorWALABASTER, 0, 0).setUnlocalizedName("headWAlabaster");
        chestWAlabaster = new DummyArmor(Properties.chestWAlabasterID, ArmorMaterials.armorWALABASTER, 0, 1).setUnlocalizedName("chestWAlabaster");
        legsWAlabaster = new DummyArmor(Properties.legsWAlabasterID, ArmorMaterials.armorWALABASTER, 0, 2).setUnlocalizedName("legsWAlabaster");
        bootsWAlabaster = new DummyArmor(Properties.bootsWAlabasterID, ArmorMaterials.armorWALABASTER, 0, 3).setUnlocalizedName("bootsWAlabaster");
    }
}