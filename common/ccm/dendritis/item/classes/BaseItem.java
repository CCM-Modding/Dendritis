package ccm.dendritis.item.classes;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import ccm.dendritis.creativetab.DendritisTabs;
import ccm.dendritis.enums.EnumGems;
import ccm.dendritis.enums.EnumMain;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BaseItem extends BaseItemClass {
    
    private int               enumType;
    
    private static EnumMain[] currentMain = EnumMain.values();
    
    private static EnumGems[] currentGems = EnumGems.values();
    
    /**
     * Creates an Item Instance.
     * 
     * @param id
     *            The Item ID
     */
    public BaseItem(final int id) {
        super(id);
        setHasSubtypes(true);
        setMaxDamage(0);
        setCreativeTab(DendritisTabs.tabDendritisItems);
    }
    
    /**
     * Creates an Item Instance.
     * 
     * @param id
     *            The Item ID
     */
    public BaseItem(final int id, final int enumType) {
        super(id);
        setMaxDamage(0);
        setHasSubtypes(true);
        this.enumType = enumType;
        setCreativeTab(DendritisTabs.tabDendritisItems);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    /**
     * Gets an icon index based on an item's damage value
     */
    public Icon getIconFromDamage(final int meta) {
        switch (enumType) {
            case 0:
                return BaseItem.currentMain[meta].getIcon();
            case 1:
                return BaseItem.currentGems[meta].getIcon();
            default:
                return null;
        }
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    @SuppressWarnings({ "rawtypes", "unchecked" })
    /**
     * returns a list of items with the same ID, but different meta (eg: dye returns 16 items)
     */
    public void getSubItems(final int itemID, final CreativeTabs creativeTabs, final List list) {
        switch (enumType) {
            case 0:
                for (int currentMeta = 0; currentMeta < EnumMain.values().length; ++currentMeta) {
                    list.add(new ItemStack(itemID, 1, currentMeta));
                }
                break;
            case 1:
                for (int currentMeta = 0; currentMeta < EnumGems.values().length; ++currentMeta) {
                    list.add(new ItemStack(itemID, 1, currentMeta));
                }
                break;
        }
    }
    
    @Override
    public String getUnlocalizedName(final ItemStack itemStack) {
        switch (enumType) {
            case 0:
                setUnlocalizedName(BaseItem.currentMain[itemStack.getItemDamage()].name());
                return super.getUnlocalizedName();
            case 1:
                setUnlocalizedName(BaseItem.currentGems[itemStack.getItemDamage()].name());
                return super.getUnlocalizedName();
            default:
                return null;
        }
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IconRegister iconRergister) {
        EnumMain.registerIcons(iconRergister);
        EnumGems.registerIcons(iconRergister);
    }
}