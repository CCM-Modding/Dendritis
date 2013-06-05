package ccm.dendritis.enums;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.Icon;

import ccm.nucleum_omnium.helper.TextureHelper;
import ccm.nucleum_omnium.helper.enums.IItemEnum;

import ccm.dendritis.item.ModItems;
import ccm.dendritis.utils.lib.Locations;

public enum EnumMain implements IItemEnum
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

    @Override
    public Icon getIcon()
    {
        return this.icon;
    }

    @Override
    public Item getBaseItem()
    {
        return ModItems.itemMain;
    }
}