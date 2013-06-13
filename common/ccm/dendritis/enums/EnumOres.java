package ccm.dendritis.enums;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import ccm.dendritis.block.ModBlocks;
import ccm.dendritis.utils.lib.Locations;
import ccm.nucleum.helper.TextureHelper;
import ccm.nucleum.helper.enums.IBlockEnum;

public enum EnumOres implements IBlockEnum {

    oreAmethyst,
    oreBDiamond,
    oreCitrine,
    oreCZirconia,
    oreFuchsia,
    oreJet,
    oreOlivine,
    oreOpal,
    oreRuby,
    oreSapphire,
    oreSQuartz,
    oreSun,
    oreTopaz,
    oreTurquoise,
    oreWAlabaster;

    private Icon        icon;

    public final String texture;

    public static void registerIcons(final IconRegister register) {
        for (final EnumOres ore : EnumOres.values())
            ore.icon = register.registerIcon(ore.texture);
    }

    private EnumOres() {
        this.texture = TextureHelper.getTextureFromName(this.name(), Locations.TEXTURE + "ore/");
    }

    @Override
    public Icon getIcon() {
        return this.icon;
    }

    @Override
    public Block getBaseBlock() {
        return ModBlocks.blocks;
    }
}