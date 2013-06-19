package ccm.dendritis.item.classes;

import net.minecraft.client.renderer.texture.IconRegister;
import ccm.dendritis.creativetab.DendritisTabs;
import ccm.dendritis.utils.lib.Locations;
import ccm.nucleum_omnium.helper.TextureHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BaseUseableItem extends BaseItemClass {
    
    public BaseUseableItem(final int id, final int maxDamage) {
        super(id);
        setMaxStackSize(1);
        setHasSubtypes(false);
        setMaxDamage(maxDamage);
        setCreativeTab(DendritisTabs.tabDendritisTools);
    }
    
    /**
     * Registers the Icons for all the Usable Items.
     */
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IconRegister register) {
        itemIcon = register.registerIcon(TextureHelper.getTexture(this, Locations.TEXTURE));
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public boolean shouldRotateAroundWhenRendering() {
        return true;
    }
}