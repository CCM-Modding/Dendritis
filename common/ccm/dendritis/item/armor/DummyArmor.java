package ccm.dendritis.item.armor;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import ccm.dendritis.creativetab.DendritisTabs;
import ccm.dendritis.utils.lib.Locations;
import ccm.dendritis.utils.lib.Properties;
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

        if (stack.itemID == Properties.headAmethystID || stack.itemID == Properties.chestAmethystID || stack.itemID == Properties.bootsAmethystID)
            return Locations.ARMOR + "Amethyst_1.png";
        else if (stack.itemID == Properties.legsAmethystID)
            return Locations.ARMOR + "Amethyst_2.png";
        else if (stack.itemID == Properties.headBDiamondID || stack.itemID == Properties.chestBDiamondID || stack.itemID == Properties.bootsBDiamondID)
            return Locations.ARMOR + "BDiamond_1.png";
        else if (stack.itemID == Properties.legsBDiamondID)
            return Locations.ARMOR + "BDiamond_2.png";
        else if (stack.itemID == Properties.headCitrineID || stack.itemID == Properties.chestCitrineID || stack.itemID == Properties.bootsCitrineID)
            return Locations.ARMOR + "Citrine_1.png";
        else if (stack.itemID == Properties.legsCitrineID)
            return Locations.ARMOR + "Citrine_2.png";
        else if (stack.itemID == Properties.headCZirconiaID || stack.itemID == Properties.chestCZirconiaID || stack.itemID == Properties.bootsCZirconiaID)
            return Locations.ARMOR + "CZirconia_1.png";
        else if (stack.itemID == Properties.legsCZirconiaID)
            return Locations.ARMOR + "CZirconia_2.png";
        else if (stack.itemID == Properties.headEmeraldID || stack.itemID == Properties.chestEmeraldID || stack.itemID == Properties.bootsEmeraldID)
            return Locations.ARMOR + "Emerald_1.png";
        else if (stack.itemID == Properties.legsEmeraldID)
            return Locations.ARMOR + "Emerald_2.png";
        else if (stack.itemID == Properties.headFuchsiaID || stack.itemID == Properties.chestFuchsiaID || stack.itemID == Properties.bootsFuchsiaID)
            return Locations.ARMOR + "Fuchsia_1.png";
        else if (stack.itemID == Properties.legsFuchsiaID)
            return Locations.ARMOR + "Fuchsia_2.png";
        else if (stack.itemID == Properties.headJetID || stack.itemID == Properties.chestJetID || stack.itemID == Properties.bootsJetID)
            return Locations.ARMOR + "Jet_1.png";
        else if (stack.itemID == Properties.legsJetID)
            return Locations.ARMOR + "Jet_2.png";
        else if (stack.itemID == Properties.headOlivineID || stack.itemID == Properties.chestOlivineID || stack.itemID == Properties.bootsOlivineID)
            return Locations.ARMOR + "Olivine_1.png";
        else if (stack.itemID == Properties.legsOlivineID)
            return Locations.ARMOR + "Olivine_2.png";
        else if (stack.itemID == Properties.headOpalID || stack.itemID == Properties.chestOpalID || stack.itemID == Properties.bootsOpalID)
            return Locations.ARMOR + "Opal_1.png";
        else if (stack.itemID == Properties.legsOpalID)
            return Locations.ARMOR + "Opal_2.png";
        else if (stack.itemID == Properties.headQuartzID || stack.itemID == Properties.chestQuartzID || stack.itemID == Properties.bootsQuartzID)
            return Locations.ARMOR + "Quartz_1.png";
        else if (stack.itemID == Properties.legsQuartzID)
            return Locations.ARMOR + "Quartz_2.png";
        else if (stack.itemID == Properties.headRubyID || stack.itemID == Properties.chestRubyID || stack.itemID == Properties.bootsRubyID)
            return Locations.ARMOR + "Ruby_1.png";
        else if (stack.itemID == Properties.legsRubyID)
            return Locations.ARMOR + "Ruby_2.png";
        else if (stack.itemID == Properties.headSapphireID || stack.itemID == Properties.chestSapphireID || stack.itemID == Properties.bootsSapphireID)
            return Locations.ARMOR + "Sapphire_1.png";
        else if (stack.itemID == Properties.legsSapphireID)
            return Locations.ARMOR + "Sapphire_2.png";
        else if (stack.itemID == Properties.headSQuartzID || stack.itemID == Properties.chestSQuartzID || stack.itemID == Properties.bootsSQuartzID)
            return Locations.ARMOR + "SQuartz_1.png";
        else if (stack.itemID == Properties.legsSQuartzID)
            return Locations.ARMOR + "SQuartz_2.png";
        else if (stack.itemID == Properties.headSunID || stack.itemID == Properties.chestSunID || stack.itemID == Properties.bootsSunID)
            return Locations.ARMOR + "Sun_1.png";
        else if (stack.itemID == Properties.legsSunID)
            return Locations.ARMOR + "Sun_2.png";
        else if (stack.itemID == Properties.headTopazID || stack.itemID == Properties.chestTopazID || stack.itemID == Properties.bootsTopazID)
            return Locations.ARMOR + "Topaz_1.png";
        else if (stack.itemID == Properties.legsTopazID)
            return Locations.ARMOR + "Topaz_2.png";
        else if (stack.itemID == Properties.headTurquoiseID || stack.itemID == Properties.chestTurquoiseID || stack.itemID == Properties.bootsTurquoiseID)
            return Locations.ARMOR + "Turquoise_1.png";
        else if (stack.itemID == Properties.legsTurquoiseID)
            return Locations.ARMOR + "Turquoise_2.png";
        else if (stack.itemID == Properties.headWAlabasterID || stack.itemID == Properties.chestWAlabasterID || stack.itemID == Properties.bootsWAlabasterID)
            return Locations.ARMOR + "WAlabaster_1.png";
        else if (stack.itemID == Properties.legsWAlabasterID)
            return Locations.ARMOR + "WAlabaster_2.png";
        else
            return null;
    }
}