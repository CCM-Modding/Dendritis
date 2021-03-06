package ccm.dendritis.enums;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.Icon;
import ccm.dendritis.item.ModItems;
import ccm.dendritis.utils.lib.Locations;
import ccm.nucleum_omnium.helper.TextureHelper;
import ccm.nucleum_omnium.helper.enums.IItemEnum;

public enum EnumMain implements IItemEnum {
    
    handle;
    
    public static void registerIcons(final IconRegister register) {
        for (final EnumMain main : EnumMain.values()) {
            main.icon = register.registerIcon(main.texture);
        }
    }
    
    private Icon        icon;
    
    public final String texture;
    
    private EnumMain() {
        texture = TextureHelper.getTextureFromName(name(), Locations.TEXTURE);
    }
    
    @Override
    public Icon getIcon() {
        return icon;
    }
    
    @Override
    public Item getBaseItem() {
        return ModItems.itemMain;
    }
}