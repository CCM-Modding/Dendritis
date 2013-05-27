package ccm.dendritis.enums;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import ccm.dendritis.utils.lib.Locations;
import ccm.nucleum_omnium.helper.TextureHelper;

public enum EnumOres {

    oreAmethyst, oreOpal, oreRuby, oreSapphire;

    private Icon icon;

    public final String texture;

    public static void registerIcons(final IconRegister register) {
        for (final EnumOres ore : EnumOres.values()) {
            ore.icon = register.registerIcon(ore.texture);
        }
    }

    private EnumOres() {
        this.texture = TextureHelper.getTextureFromName(this.name(), Locations.TEXTURE + "ore/");
    }

    public Icon getIcon() {
        return this.icon;
    }
}