package ccm.dendritis.enums;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

import ccm.dendritis.utils.lib.Locations;
import ccm.nucleum_omnium.helper.TextureHelper;

public enum EnumMain
{

    handle;

    public static void registerIcons(final IconRegister register)
    {
        for (final EnumMain main : EnumMain.values()){
            main.icon = register.registerIcon(main.texture);
        }
    }

    private Icon        icon;

    public final String texture;

    private EnumMain()
    {
        this.texture = TextureHelper.getTextureFromName(this.name(), Locations.TEXTURE);
    }

    public Icon getIcon()
    {
        return this.icon;
    }
}