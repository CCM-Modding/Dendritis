package ccm.dendritis.utils.registry;

import net.minecraft.item.ItemStack;
import ccm.dendritis.Dendritis;
import ccm.dendritis.block.ModBlocks;
import ccm.dendritis.enums.EnumOres;
import ccm.dendritis.utils.lib.Archive;
import ccm.dendritis.utils.lib.Properties;
import ccm.nucleum_omnium.handler.Handler;
import ccm.nucleum_omnium.world.WorldGenerator;

final class WorldRegistry {

    /*
     * Registers all the World Generation.
     */
    protected static void registerWorld() {

        if (Properties.enableWorldGenAmethyst) {
            registerAmethyst();
        }
        if (Properties.enableWorldGenBDiamond) {
            registerBDiamond();
        }
        if (Properties.enableWorldGenCitrine) {
            registerCitrine();
        }
        if (Properties.enableWorldGenCZirconia) {
            registerCZirconia();
        }
        if (Properties.enableWorldGenFuchsia) {
            registerFuchsia();
        }
        if (Properties.enableWorldGenJet) {
            registerJet();
        }
        if (Properties.enableWorldGenOlivine) {
            registerOlivine();
        }
        if (Properties.enableWorldGenOpal) {
            registerOpal();
        }
        if (Properties.enableWorldGenRuby) {
            registerRuby();
        }
        if (Properties.enableWorldGenSapphire) {
            registerSapphire();
        }
        if (Properties.enableWorldGenSQuartz) {
            registerSQuartz();
        }
        if (Properties.enableWorldGenSun) {
            registerSun();
        }
        if (Properties.enableWorldGenTopaz) {
            registerTopaz();
        }
        if (Properties.enableWorldGenTurquoise) {
            registerTurquoise();
        }
        if (Properties.enableWorldGenWAlabaster) {
            registerWAlabaster();
        }

    }

    private static void registerAmethyst() {
        Handler.log(Dendritis.instance, "Registering World Generation for Amethyst");
        WorldGenerator.addEndGen(Archive.MOD_NAME, new ItemStack(ModBlocks.ores.blockID, 1, EnumOres.oreAmethyst.ordinal()), EnumOres.oreAmethyst.name(), Properties.ameSize, Properties.ameDensity, Properties.ameMinHeight, Properties.ameMaxHeight, Properties.enableWorldGenAmethyst);
    }

    private static void registerBDiamond() {
        Handler.log(Dendritis.instance, "Registering World Generation for BlackDiamond");
        WorldGenerator.addNetherGen(Archive.MOD_NAME, new ItemStack(ModBlocks.ores.blockID, 1, EnumOres.oreBDiamond.ordinal()), EnumOres.oreBDiamond.name(), Properties.bdiSize, Properties.bdiDensity, Properties.bdiMinHeight, Properties.bdiMaxHeight, Properties.enableWorldGenBDiamond);
    }

    private static void registerCitrine() {
        Handler.log(Dendritis.instance, "Registering World Generation for Citrine");
        WorldGenerator.addOverworldGen(Archive.MOD_NAME, new ItemStack(ModBlocks.ores.blockID, 1, EnumOres.oreCitrine.ordinal()), EnumOres.oreCitrine.name(), Properties.citSize, Properties.citDensity, Properties.citMinHeight, Properties.citMaxHeight, Properties.enableWorldGenCitrine);
    }

    private static void registerCZirconia() {
        Handler.log(Dendritis.instance, "Registering World Generation for CubicZirconia");
        WorldGenerator.addNetherGen(Archive.MOD_NAME, new ItemStack(ModBlocks.ores.blockID, 1, EnumOres.oreCZirconia.ordinal()), EnumOres.oreCZirconia.name(), Properties.cziSize, Properties.cziDensity, Properties.cziMinHeight, Properties.cziMaxHeight, Properties.enableWorldGenCZirconia);
    }

    private static void registerFuchsia() {
        Handler.log(Dendritis.instance, "Registering World Generation for Fuchsia");
        WorldGenerator.addOverworldGen(Archive.MOD_NAME, new ItemStack(ModBlocks.ores.blockID, 1, EnumOres.oreFuchsia.ordinal()), EnumOres.oreFuchsia.name(), Properties.fucSize, Properties.fucDensity, Properties.fucMinHeight, Properties.fucMaxHeight, Properties.enableWorldGenFuchsia);
    }

    private static void registerJet() {
        Handler.log(Dendritis.instance, "Registering World Generation for Jet");
        WorldGenerator.addEndGen(Archive.MOD_NAME, new ItemStack(ModBlocks.ores.blockID, 1, EnumOres.oreJet.ordinal()), EnumOres.oreJet.name(), Properties.jetSize, Properties.jetDensity, Properties.jetMinHeight, Properties.jetMaxHeight, Properties.enableWorldGenJet);
    }

    private static void registerOlivine() {
        Handler.log(Dendritis.instance, "Registering World Generation for Olivine");
        WorldGenerator.addOverworldGen(Archive.MOD_NAME, new ItemStack(ModBlocks.ores.blockID, 1, EnumOres.oreOlivine.ordinal()), EnumOres.oreOlivine.name(), Properties.oliSize, Properties.oliDensity, Properties.oliMinHeight, Properties.oliMaxHeight, Properties.enableWorldGenOlivine);
    }

    private static void registerOpal() {
        Handler.log(Dendritis.instance, "Registering World Generation for Opal");
        WorldGenerator.addOverworldGen(Archive.MOD_NAME, new ItemStack(ModBlocks.ores.blockID, 1, EnumOres.oreOpal.ordinal()), EnumOres.oreOpal.name(), Properties.opalSize, Properties.opalDensity, Properties.opalMinHeight, Properties.opalMaxHeight, Properties.enableWorldGenOpal);
    }

    private static void registerRuby() {
        Handler.log(Dendritis.instance, "Registering World Generation for Ruby");
        WorldGenerator.addOverworldGen(Archive.MOD_NAME, new ItemStack(ModBlocks.ores.blockID, 1, EnumOres.oreRuby.ordinal()), EnumOres.oreRuby.name(), Properties.rubySize, Properties.rubyDensity, Properties.rubyMinHeight, Properties.rubyMaxHeight, Properties.enableWorldGenRuby);
    }

    private static void registerSapphire() {
        Handler.log(Dendritis.instance, "Registering World Generation for Sapphire");
        WorldGenerator.addOverworldGen(Archive.MOD_NAME, new ItemStack(ModBlocks.ores.blockID, 1, EnumOres.oreSapphire.ordinal()), EnumOres.oreSapphire.name(), Properties.sapSize, Properties.sapDensity, Properties.sapMinHeight, Properties.sapMaxHeight, Properties.enableWorldGenSapphire);
    }

    private static void registerSQuartz() {
        Handler.log(Dendritis.instance, "Registering World Generation for SmokyQuartz");
        WorldGenerator.addNetherGen(Archive.MOD_NAME, new ItemStack(ModBlocks.ores.blockID, 1, EnumOres.oreSQuartz.ordinal()), EnumOres.oreSQuartz.name(), Properties.squSize, Properties.squDensity, Properties.squMinHeight, Properties.squMaxHeight, Properties.enableWorldGenSQuartz);
    }

    private static void registerSun() {
        Handler.log(Dendritis.instance, "Registering World Generation for Sun");
        WorldGenerator.addOverworldGen(Archive.MOD_NAME, new ItemStack(ModBlocks.ores.blockID, 1, EnumOres.oreSun.ordinal()), EnumOres.oreSun.name(), Properties.sunSize, Properties.sunDensity, Properties.sunMinHeight, Properties.sunMaxHeight, Properties.enableWorldGenSun);
    }

    private static void registerTopaz() {
        Handler.log(Dendritis.instance, "Registering World Generation for Topaz");
        WorldGenerator.addOverworldGen(Archive.MOD_NAME, new ItemStack(ModBlocks.ores.blockID, 1, EnumOres.oreTopaz.ordinal()), EnumOres.oreTopaz.name(), Properties.topSize, Properties.topDensity, Properties.topMinHeight, Properties.topMaxHeight, Properties.enableWorldGenTopaz);
    }

    private static void registerTurquoise() {
        Handler.log(Dendritis.instance, "Registering World Generation for Turquoise");
        WorldGenerator.addOverworldGen(Archive.MOD_NAME, new ItemStack(ModBlocks.ores.blockID, 1, EnumOres.oreTurquoise.ordinal()), EnumOres.oreTurquoise.name(), Properties.turSize, Properties.turDensity, Properties.turMinHeight, Properties.turMaxHeight, Properties.enableWorldGenTurquoise);
    }

    private static void registerWAlabaster() {
        Handler.log(Dendritis.instance, "Registering World Generation for WhiteAlabaster");
        WorldGenerator.addEndGen(Archive.MOD_NAME, new ItemStack(ModBlocks.ores.blockID, 1, EnumOres.oreWAlabaster.ordinal()), EnumOres.oreWAlabaster.name(), Properties.walSize, Properties.walDensity, Properties.walMinHeight, Properties.walMaxHeight, Properties.enableWorldGenWAlabaster);
    }

}