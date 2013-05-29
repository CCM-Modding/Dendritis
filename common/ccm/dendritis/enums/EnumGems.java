package ccm.dendritis.enums;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import ccm.dendritis.utils.lib.Locations;
import ccm.nucleum_omnium.helper.TextureHelper;

public enum EnumGems {

    gemAmethyst,
    gemBDiamond,
    gemCitrine,
    gemCZirconia,
    gemFuchsia,
    gemJet,
    gemOlivine,
    gemOpal,
    gemRuby,
    gemSapphire,
    gemSQuartz,
    gemSun,
    gemTopaz,
    gemTurquoise,
    gemWAlabaster;

    public static void registerIcons(final IconRegister register) {
        for (final EnumGems gem : EnumGems.values()) {
            gem.icon = register.registerIcon(gem.texture);
        }
    }

    private Icon icon;

    public final String texture;

    private EnumGems() {
        this.texture = TextureHelper.getTextureFromName(this.name(), Locations.TEXTURE + "gems/");
    }

    public Icon getIcon() {
        return this.icon;
    }
}