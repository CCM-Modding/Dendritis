package ccm.dendritis.block;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraftforge.common.MinecraftForge;
import ccm.dendritis.enums.EnumOres;
import ccm.dendritis.utils.lib.Properties;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ModOres extends BaseBlock {
    
    private static EnumOres[] ores = EnumOres.values();
    
    /**
     * Creates a new Block instance capable of being a Ore
     * 
     * @param id
     *            Block Id
     */
    public ModOres(final int id) {
        super(id, Material.rock);
        setHardness(3.0F);
        setResistance(5.0F);
        setStepSound(Block.soundStoneFootstep);
        
        // Sets the required harvest level and tool
        // 0 is wood
        // 1 is stone
        // 2 is iron
        // 3 is diamond
        
        MinecraftForge.setBlockHarvestLevel(this, EnumOres.oreAmethyst.ordinal(), "pickaxe", 3);
        MinecraftForge.setBlockHarvestLevel(this, EnumOres.oreBDiamond.ordinal(), "pickaxe", 3);
        MinecraftForge.setBlockHarvestLevel(this, EnumOres.oreCitrine.ordinal(), "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(this, EnumOres.oreCZirconia.ordinal(), "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(this, EnumOres.oreFuchsia.ordinal(), "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(this, EnumOres.oreJet.ordinal(), "pickaxe", 4);
        MinecraftForge.setBlockHarvestLevel(this, EnumOres.oreOlivine.ordinal(), "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(this, EnumOres.oreOpal.ordinal(), "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(this, EnumOres.oreRuby.ordinal(), "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(this, EnumOres.oreSapphire.ordinal(), "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(this, EnumOres.oreSQuartz.ordinal(), "pickaxe", 3);
        MinecraftForge.setBlockHarvestLevel(this, EnumOres.oreSun.ordinal(), "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(this, EnumOres.oreTopaz.ordinal(), "pickaxe", 3);
        MinecraftForge.setBlockHarvestLevel(this, EnumOres.oreTurquoise.ordinal(), "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(this, EnumOres.oreWAlabaster.ordinal(), "pickaxe", 4);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(final int side, final int meta) {
        blockIcon = ModOres.ores[meta].getIcon();
        return blockIcon;
    }
    
    /**
     * Returns the ID of the items to drop on destruction.
     */
    @Override
    public int idDropped(final int par1, final Random par2Random, final int par3) {
        return Properties.itemGemsID;
    }
    
    // Makes sure pick block works right
    @Override
    public int damageDropped(final int metadata) {
        return metadata;
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IconRegister iconRegister) {
        EnumOres.registerIcons(iconRegister);
    }
    
    @Override
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public void getSubBlocks(final int itemId, final CreativeTabs tab, final List list) {
        for (int i = 0; i < EnumOres.values().length; i++) {
            list.add(new ItemStack(itemId, 1, i));
        }
    }
}