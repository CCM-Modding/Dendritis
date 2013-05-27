package ccm.dendritis.enums;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import ccm.dendritis.utils.lib.Locations;
import ccm.nucleum_omnium.helper.TextureHelper;

public enum EnumGems {

    gemAmethyst, gemOpal, gemRuby, gemSapphire;

    public static void registerIcons(final IconRegister register) {
        for (final EnumGems ingot : EnumGems.values()) {
            ingot.icon = register.registerIcon(ingot.texture);
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