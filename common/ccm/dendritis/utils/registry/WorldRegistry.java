package ccm.dendritis.utils.registry;

import net.minecraft.item.ItemStack;
import ccm.dendritis.Dendritis;
import ccm.dendritis.block.ModBlocks;
import ccm.dendritis.enums.EnumOres;
import ccm.dendritis.utils.lib.Properties;
import ccm.nucleum_omnium.handler.Handler;
import ccm.nucleum_omnium.worldgen.WorldGenHandler;
import ccm.nucleum_omnium.worldgen.WorldGenMineable;

final class WorldRegistry {

    /**
     * Registers all the World Generation.
     */
    protected static void registerWorld() {

        if (Properties.enableWorldGenAmethyst){
            registerAmethyst();
        }
        if (Properties.enableWorldGenBDiamond){
            registerBDiamond();
        }
        if (Properties.enableWorldGenCitrine){
            registerCitrine();
        }
        if (Properties.enableWorldGenCZirconia){
            registerCZirconia();
        }
        if (Properties.enableWorldGenFuchsia){
            registerFuchsia();
        }
        if (Properties.enableWorldGenJet){
            registerJet();
        }
        if (Properties.enableWorldGenOlivine){
            registerOlivine();
        }
        if (Properties.enableWorldGenOpal){
            registerOpal();
        }
        if (Properties.enableWorldGenRuby){
            registerRuby();
        }
        if (Properties.enableWorldGenSapphire){
            registerSapphire();
        }
        if (Properties.enableWorldGenSQuartz){
            registerSQuartz();
        }
        if (Properties.enableWorldGenSun){
            registerSun();
        }
        if (Properties.enableWorldGenTopaz){
            registerTopaz();
        }
        if (Properties.enableWorldGenTurquoise){
            registerTurquoise();
        }
        if (Properties.enableWorldGenWAlabaster){
            registerWAlabaster();
        }
    }

    private static void registerAmethyst()
    {
        Handler.log(Dendritis.instance, "Registering World Generation for Amethyst");
        WorldGenHandler.addSurfaceGenerator(new WorldGenMineable(new ItemStack(ModBlocks.ores.blockID, 1, EnumOres.oreAmethyst.ordinal()), Properties.ameSize),
                Properties.ameMinHeight,
                Properties.ameMaxHeight,
                Properties.ameDensity,
                WorldGenHandler.GenType.ORE_1.ordinal());
    }

    private static void registerBDiamond()
    {
        Handler.log(Dendritis.instance, "Registering World Generation for BlackDiamond");
        WorldGenHandler.addSurfaceGenerator(new WorldGenMineable(new ItemStack(ModBlocks.ores.blockID, 1, EnumOres.oreBDiamond.ordinal()), Properties.ameSize),
                Properties.ameMinHeight,
                Properties.ameMaxHeight,
                Properties.ameDensity,
                WorldGenHandler.GenType.ORE_1.ordinal());
    }

    private static void registerCitrine()
    {
        Handler.log(Dendritis.instance, "Registering World Generation for Citrine");
        WorldGenHandler.addSurfaceGenerator(new WorldGenMineable(new ItemStack(ModBlocks.ores.blockID, 1, EnumOres.oreCitrine.ordinal()), Properties.ameSize),
                Properties.ameMinHeight,
                Properties.ameMaxHeight,
                Properties.ameDensity,
                WorldGenHandler.GenType.ORE_1.ordinal());
    }

    private static void registerCZirconia()
    {
        Handler.log(Dendritis.instance, "Registering World Generation for CubicZirconia");
        WorldGenHandler.addSurfaceGenerator(new WorldGenMineable(new ItemStack(ModBlocks.ores.blockID, 1, EnumOres.oreCZirconia.ordinal()), Properties.ameSize),
                Properties.ameMinHeight,
                Properties.ameMaxHeight,
                Properties.ameDensity,
                WorldGenHandler.GenType.ORE_1.ordinal());
    }

    private static void registerFuchsia()
    {
        Handler.log(Dendritis.instance, "Registering World Generation for Fuchsia");
        WorldGenHandler.addSurfaceGenerator(new WorldGenMineable(new ItemStack(ModBlocks.ores.blockID, 1, EnumOres.oreFuchsia.ordinal()), Properties.ameSize),
                Properties.ameMinHeight,
                Properties.ameMaxHeight,
                Properties.ameDensity,
                WorldGenHandler.GenType.ORE_1.ordinal());
    }

    private static void registerJet()
    {
        Handler.log(Dendritis.instance, "Registering World Generation for Jet");
        WorldGenHandler.addSurfaceGenerator(new WorldGenMineable(new ItemStack(ModBlocks.ores.blockID, 1, EnumOres.oreJet.ordinal()), Properties.ameSize),
                Properties.ameMinHeight,
                Properties.ameMaxHeight,
                Properties.ameDensity,
                WorldGenHandler.GenType.ORE_1.ordinal());
    }

    private static void registerOlivine()
    {
        Handler.log(Dendritis.instance, "Registering World Generation for Olivine");
        WorldGenHandler.addSurfaceGenerator(new WorldGenMineable(new ItemStack(ModBlocks.ores.blockID, 1, EnumOres.oreOlivine.ordinal()), Properties.ameSize),
                Properties.ameMinHeight,
                Properties.ameMaxHeight,
                Properties.ameDensity,
                WorldGenHandler.GenType.ORE_1.ordinal());
    }

    private static void registerOpal()
    {
        Handler.log(Dendritis.instance, "Registering World Generation for Opal");
        WorldGenHandler.addSurfaceGenerator(new WorldGenMineable(new ItemStack(ModBlocks.ores.blockID, 1, EnumOres.oreOpal.ordinal()), Properties.opalSize),
                Properties.opalMinHeight,
                Properties.opalMaxHeight,
                Properties.opalDensity,
                WorldGenHandler.GenType.ORE_1.ordinal());
    }

    private static void registerRuby()
    {
        Handler.log(Dendritis.instance, "Registering World Generation for Ruby");
        WorldGenHandler.addSurfaceGenerator(new WorldGenMineable(new ItemStack(ModBlocks.ores.blockID, 1, EnumOres.oreRuby.ordinal()), Properties.rubySize),
                Properties.rubyMinHeight,
                Properties.rubyMaxHeight,
                Properties.rubyDensity,
                WorldGenHandler.GenType.ORE_1.ordinal());
    }

    private static void registerSapphire()
    {
        Handler.log(Dendritis.instance, "Registering World Generation for Sapphire");
        WorldGenHandler.addSurfaceGenerator(new WorldGenMineable(new ItemStack(ModBlocks.ores.blockID, 1, EnumOres.oreSapphire.ordinal()), Properties.sapSize),
                Properties.sapMinHeight,
                Properties.sapMaxHeight,
                Properties.sapDensity,
                WorldGenHandler.GenType.ORE_1.ordinal());
    }

    private static void registerSQuartz()
    {
        Handler.log(Dendritis.instance, "Registering World Generation for SmokyQuartz");
        WorldGenHandler.addSurfaceGenerator(new WorldGenMineable(new ItemStack(ModBlocks.ores.blockID, 1, EnumOres.oreSQuartz.ordinal()), Properties.ameSize),
                Properties.ameMinHeight,
                Properties.ameMaxHeight,
                Properties.ameDensity,
                WorldGenHandler.GenType.ORE_1.ordinal());
    }

    private static void registerSun()
    {
        Handler.log(Dendritis.instance, "Registering World Generation for Sun");
        WorldGenHandler.addSurfaceGenerator(new WorldGenMineable(new ItemStack(ModBlocks.ores.blockID, 1, EnumOres.oreSun.ordinal()), Properties.ameSize),
                Properties.ameMinHeight,
                Properties.ameMaxHeight,
                Properties.ameDensity,
                WorldGenHandler.GenType.ORE_1.ordinal());
    }

    private static void registerTopaz()
    {
        Handler.log(Dendritis.instance, "Registering World Generation for Topaz");
        WorldGenHandler.addSurfaceGenerator(new WorldGenMineable(new ItemStack(ModBlocks.ores.blockID, 1, EnumOres.oreTopaz.ordinal()), Properties.ameSize),
                Properties.ameMinHeight,
                Properties.ameMaxHeight,
                Properties.ameDensity,
                WorldGenHandler.GenType.ORE_1.ordinal());
    }

    private static void registerTurquoise()
    {
        Handler.log(Dendritis.instance, "Registering World Generation for Turquoise");
        WorldGenHandler.addSurfaceGenerator(new WorldGenMineable(new ItemStack(ModBlocks.ores.blockID, 1, EnumOres.oreTurquoise.ordinal()), Properties.ameSize),
                Properties.ameMinHeight,
                Properties.ameMaxHeight,
                Properties.ameDensity,
                WorldGenHandler.GenType.ORE_1.ordinal());
    }

    private static void registerWAlabaster()
    {
        Handler.log(Dendritis.instance, "Registering World Generation for WhiteAlabaster");
        WorldGenHandler.addSurfaceGenerator(new WorldGenMineable(new ItemStack(ModBlocks.ores.blockID, 1, EnumOres.oreWAlabaster.ordinal()), Properties.ameSize),
                Properties.ameMinHeight,
                Properties.ameMaxHeight,
                Properties.ameDensity,
                WorldGenHandler.GenType.ORE_1.ordinal());
    }

}