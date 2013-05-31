package ccm.dendritis.item.armor;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import ccm.dendritis.creativetab.DendritisTabs;
import ccm.dendritis.utils.lib.Locations;
import ccm.nucleum_omnium.helper.TextureHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class DummyArmor extends ItemArmor {

    public DummyArmor(final int par1, final EnumArmorMaterial par2EnumArmorMaterial, final int par3, final int par4) {
        super(par1, par2EnumArmorMaterial, par3, par4);
        this.setCreativeTab(DendritisTabs.tabDendritisArmor);
        // TODO Auto-generated constructor stub
    }

    /**
     * Registers the Icons for all the Usable Items.
     */
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IconRegister register) {
        this.itemIcon = register.registerIcon(TextureHelper.getTextureFromName(this.getUnlocalizedName(), Locations.TEXTURE + "armor/"));
    }

    public String getArmorTexture(final ItemStack stack) {
        return null;
    }
}