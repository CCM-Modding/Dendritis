package ccm.dendritis.core.recipe;

import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import ccm.dendritis.enums.EnumBlocks;
import ccm.dendritis.enums.EnumGems;
import ccm.nucleum_omnium.helper.enums.EnumHelper;

final class RecipesCraftingBlocks {

    /**
     * Adds all the Shaped recipes in the Mod.
     */
    @SuppressWarnings("unchecked")
    private static void addShaped() {

        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumHelper.getBlockIS(EnumBlocks.blockAmethyst),
                        new Object[] { "xxx", "xxx", "xxx", 'x',
                                EnumHelper.getItemIS(EnumGems.gemAmethyst) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumHelper.getBlockIS(EnumBlocks.blockBDiamond),
                        new Object[] { "xxx", "xxx", "xxx", 'x',
                                EnumHelper.getItemIS(EnumGems.gemBDiamond) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumHelper.getBlockIS(EnumBlocks.blockCitrine),
                        new Object[] { "xxx", "xxx", "xxx", 'x',
                                EnumHelper.getItemIS(EnumGems.gemCitrine) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumHelper.getBlockIS(EnumBlocks.blockCZirconia),
                        new Object[] { "xxx", "xxx", "xxx", 'x',
                                EnumHelper.getItemIS(EnumGems.gemCZirconia) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumHelper.getBlockIS(EnumBlocks.blockFuchsia),
                        new Object[] { "xxx", "xxx", "xxx", 'x',
                                EnumHelper.getItemIS(EnumGems.gemFuchsia) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumHelper.getBlockIS(EnumBlocks.blockJet), new Object[] {
                        "xxx", "xxx", "xxx", 'x', EnumHelper.getItemIS(EnumGems.gemJet) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumHelper.getBlockIS(EnumBlocks.blockOlivine),
                        new Object[] { "xxx", "xxx", "xxx", 'x',
                                EnumHelper.getItemIS(EnumGems.gemOlivine) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumHelper.getBlockIS(EnumBlocks.blockOpal), new Object[] {
                        "xxx", "xxx", "xxx", 'x', EnumHelper.getItemIS(EnumGems.gemOpal) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumHelper.getBlockIS(EnumBlocks.blockRuby), new Object[] {
                        "xxx", "xxx", "xxx", 'x', EnumHelper.getItemIS(EnumGems.gemRuby) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumHelper.getBlockIS(EnumBlocks.blockSapphire),
                        new Object[] { "xxx", "xxx", "xxx", 'x',
                                EnumHelper.getItemIS(EnumGems.gemSapphire) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumHelper.getBlockIS(EnumBlocks.blockSQuartz),
                        new Object[] { "xxx", "xxx", "xxx", 'x',
                                EnumHelper.getItemIS(EnumGems.gemSQuartz) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumHelper.getBlockIS(EnumBlocks.blockSun), new Object[] {
                        "xxx", "xxx", "xxx", 'x', EnumHelper.getItemIS(EnumGems.gemSun) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumHelper.getBlockIS(EnumBlocks.blockTopaz),
                        new Object[] { "xxx", "xxx", "xxx", 'x',
                                EnumHelper.getItemIS(EnumGems.gemTopaz) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumHelper.getBlockIS(EnumBlocks.blockTurquoise),
                        new Object[] { "xxx", "xxx", "xxx", 'x',
                                EnumHelper.getItemIS(EnumGems.gemTurquoise) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumHelper.getBlockIS(EnumBlocks.blockWAlabaster),
                        new Object[] { "xxx", "xxx", "xxx", 'x',
                                EnumHelper.getItemIS(EnumGems.gemWAlabaster) }));
    }

    /**
     * Adds all the Shapeless recipes in the Mod.
     */
    @SuppressWarnings("unchecked")
    private static void addShapeless() {

        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapelessOreRecipe(EnumHelper.getItemIS(EnumGems.gemAmethyst, 9),
                        EnumHelper.getBlockIS(EnumBlocks.blockAmethyst)));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapelessOreRecipe(EnumHelper.getItemIS(EnumGems.gemBDiamond, 9),
                        EnumHelper.getBlockIS(EnumBlocks.blockBDiamond)));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapelessOreRecipe(EnumHelper.getItemIS(EnumGems.gemCitrine, 9),
                        EnumHelper.getBlockIS(EnumBlocks.blockCitrine)));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapelessOreRecipe(EnumHelper.getItemIS(EnumGems.gemCZirconia, 9),
                        EnumHelper.getBlockIS(EnumBlocks.blockCZirconia)));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapelessOreRecipe(EnumHelper.getItemIS(EnumGems.gemFuchsia, 9),
                        EnumHelper.getBlockIS(EnumBlocks.blockFuchsia)));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapelessOreRecipe(EnumHelper.getItemIS(EnumGems.gemJet, 9), EnumHelper
                        .getBlockIS(EnumBlocks.blockJet)));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapelessOreRecipe(EnumHelper.getItemIS(EnumGems.gemOlivine, 9),
                        EnumHelper.getBlockIS(EnumBlocks.blockOlivine)));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapelessOreRecipe(EnumHelper.getItemIS(EnumGems.gemOpal, 9), EnumHelper
                        .getBlockIS(EnumBlocks.blockOpal)));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapelessOreRecipe(EnumHelper.getItemIS(EnumGems.gemRuby, 9), EnumHelper
                        .getBlockIS(EnumBlocks.blockRuby)));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapelessOreRecipe(EnumHelper.getItemIS(EnumGems.gemSapphire, 9),
                        EnumHelper.getBlockIS(EnumBlocks.blockSapphire)));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapelessOreRecipe(EnumHelper.getItemIS(EnumGems.gemSQuartz, 9),
                        EnumHelper.getBlockIS(EnumBlocks.blockSQuartz)));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapelessOreRecipe(EnumHelper.getItemIS(EnumGems.gemSun, 9), EnumHelper
                        .getBlockIS(EnumBlocks.blockSun)));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapelessOreRecipe(EnumHelper.getItemIS(EnumGems.gemTopaz, 9), EnumHelper
                        .getBlockIS(EnumBlocks.blockTopaz)));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapelessOreRecipe(EnumHelper.getItemIS(EnumGems.gemTurquoise, 9),
                        EnumHelper.getBlockIS(EnumBlocks.blockTurquoise)));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapelessOreRecipe(EnumHelper.getItemIS(EnumGems.gemWAlabaster, 9),
                        EnumHelper.getBlockIS(EnumBlocks.blockWAlabaster)));
    }

    public RecipesCraftingBlocks() {
        RecipesCraftingBlocks.addShaped();
        RecipesCraftingBlocks.addShapeless();
    }
}
