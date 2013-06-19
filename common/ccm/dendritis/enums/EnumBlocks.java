package ccm.dendritis.enums;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import ccm.dendritis.block.ModBlocks;
import ccm.dendritis.utils.lib.Locations;
import ccm.nucleum_omnium.helper.TextureHelper;
import ccm.nucleum_omnium.helper.enums.IBlockEnum;

public enum EnumBlocks implements IBlockEnum {
    
    blockAmethyst,
    blockBDiamond,
    blockCitrine,
    blockCZirconia,
    blockFuchsia,
    blockJet,
    blockOlivine,
    blockOpal,
    blockRuby,
    blockSapphire,
    blockSQuartz,
    blockSun,
    blockTopaz,
    blockTurquoise,
    blockWAlabaster;
    
    private Icon        icon;
    
    public final String texture;
    
    public static void registerIcons(final IconRegister register) {
        for (final EnumBlocks block : EnumBlocks.values()) {
            block.icon = register.registerIcon(block.texture);
        }
    }
    
    private EnumBlocks() {
        texture = TextureHelper.getTextureFromName(name(), Locations.TEXTURE + "block/");
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