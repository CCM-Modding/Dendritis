package ccm.dendritis.enums;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.Icon;
import ccm.dendritis.item.ModItems;
import ccm.dendritis.utils.lib.Locations;
import ccm.nucleum.helper.TextureHelper;
import ccm.nucleum.helper.enums.IItemEnum;

public enum EnumGems implements IItemEnum {

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
        for (final EnumGems gem : EnumGems.values())
            gem.icon = register.registerIcon(gem.texture);
    }

    private Icon        icon;

    public final String texture;

    private EnumGems() {
        this.texture = TextureHelper.getTextureFromName(this.name(), Locations.TEXTURE + "gems/");
    }

    @Override
    public Icon getIcon() {
        return this.icon;
    }

    @Override
    public Item getBaseItem() {
        return ModItems.itemGems;
    }
}