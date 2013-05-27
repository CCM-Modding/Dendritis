package ccm.dendritis.enums;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import ccm.dendritis.utils.lib.Locations;
import ccm.nucleum_omnium.helper.TextureHelper;

public enum EnumBlocks {

    blockAmethyst,
    blockBlackDiamond,
    blockCitrine,
    blockCubicZirconia,
    blockFuchsia,
    blockJet,
    blockOlivine,
    blockOpal,
    blockRuby,
    blockSapphire,
    blockSmokyQuartz,
    blockSun,
    blockTopaz,
    blockTurquoise,
    blockWhiteAlabaster;

    private Icon icon;

    public final String texture;

    public static void registerIcons(final IconRegister register) {
        for (final EnumBlocks block : EnumBlocks.values()) {
            block.icon = register.registerIcon(block.texture);
        }
    }

    private EnumBlocks() {
        this.texture = TextureHelper.getTextureFromName(this.name(), Locations.TEXTURE + "block/");
    }

    public Icon getIcon() {
        return this.icon;
    }
}