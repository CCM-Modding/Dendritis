package ccm.dendritis.enums;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import ccm.dendritis.block.ModBlocks;
import ccm.dendritis.utils.lib.Locations;
import ccm.nucleum_omnium.helper.TextureHelper;
import ccm.nucleum_omnium.helper.enums.IBlockEnum;

public enum EnumOres implements IBlockEnum {
    
    oreAmethyst,
    oreBDiamond,
    oreCitrine,
    oreCZirconia,
    oreFuchsia,
    oreJet,
    oreOlivine,
    oreOpal,
    oreRuby,
    oreSapphire,
    oreSQuartz,
    oreSun,
    oreTopaz,
    oreTurquoise,
    oreWAlabaster;
    
    private Icon        icon;
    
    public final String texture;
    
    public static void registerIcons(final IconRegister register) {
        for (final EnumOres ore : EnumOres.values()) {
            ore.icon = register.registerIcon(ore.texture);
        }
    }
    
    private EnumOres() {
        texture = TextureHelper.getTextureFromName(name(), Locations.TEXTURE + "ore/");
    }
    
    @Override
    public Icon getIcon() {
        return icon;
    }
    
    @Override
    public Block getBaseBlock() {
        return ModBlocks.blocks;
    }
    
    @Override
    public void setBaseBlock(Block base) {
        // TODO Auto-generated method stub
        
    }
}