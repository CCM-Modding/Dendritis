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
        if (Properties.enableWorldGenOpal){
            registerOpal();
        }
        if (Properties.enableWorldGenRuby){
            registerRuby();
        }
        if (Properties.enableWorldGenSapphire){
            registerSapphire();
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

}