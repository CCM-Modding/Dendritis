package ccm.dendritis.core.recipe;

import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import ccm.dendritis.core.handlers.EHandler;
import ccm.dendritis.enums.EnumBlocks;
import ccm.dendritis.enums.EnumGems;

final class RecipesCraftingBlocks
{

    /**
     * Adds all the Shaped recipes in the Mod.
     */
    @SuppressWarnings("unchecked")
    private static void addShaped()
    {

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumBlocks.blockAmethyst), new Object[]
        { "xxx", "xxx", "xxx", 'x', EHandler.getItem(EnumGems.gemAmethyst) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumBlocks.blockBDiamond), new Object[]
        { "xxx", "xxx", "xxx", 'x', EHandler.getItem(EnumGems.gemBDiamond) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumBlocks.blockCitrine), new Object[]
        { "xxx", "xxx", "xxx", 'x', EHandler.getItem(EnumGems.gemCitrine) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumBlocks.blockCZirconia), new Object[]
        { "xxx", "xxx", "xxx", 'x', EHandler.getItem(EnumGems.gemCZirconia) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumBlocks.blockFuchsia), new Object[]
        { "xxx", "xxx", "xxx", 'x', EHandler.getItem(EnumGems.gemFuchsia) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumBlocks.blockJet), new Object[]
        { "xxx", "xxx", "xxx", 'x', EHandler.getItem(EnumGems.gemJet) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumBlocks.blockOlivine), new Object[]
        { "xxx", "xxx", "xxx", 'x', EHandler.getItem(EnumGems.gemOlivine) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumBlocks.blockOpal), new Object[]
        { "xxx", "xxx", "xxx", 'x', EHandler.getItem(EnumGems.gemOpal) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumBlocks.blockRuby), new Object[]
        { "xxx", "xxx", "xxx", 'x', EHandler.getItem(EnumGems.gemRuby) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumBlocks.blockSapphire), new Object[]
        { "xxx", "xxx", "xxx", 'x', EHandler.getItem(EnumGems.gemSapphire) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumBlocks.blockSQuartz), new Object[]
        { "xxx", "xxx", "xxx", 'x', EHandler.getItem(EnumGems.gemSQuartz) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumBlocks.blockSun), new Object[]
        { "xxx", "xxx", "xxx", 'x', EHandler.getItem(EnumGems.gemSun) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumBlocks.blockTopaz), new Object[]
        { "xxx", "xxx", "xxx", 'x', EHandler.getItem(EnumGems.gemTopaz) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumBlocks.blockTurquoise), new Object[]
        { "xxx", "xxx", "xxx", 'x', EHandler.getItem(EnumGems.gemTurquoise) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumBlocks.blockWAlabaster), new Object[]
        { "xxx", "xxx", "xxx", 'x', EHandler.getItem(EnumGems.gemWAlabaster) }));
    }

    /**
     * Adds all the Shapeless recipes in the Mod.
     */
    @SuppressWarnings("unchecked")
    private static void addShapeless()
    {

        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EHandler.getItem(EnumGems.gemAmethyst, 9), EHandler.getItem(EnumBlocks.blockAmethyst)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EHandler.getItem(EnumGems.gemBDiamond, 9), EHandler.getItem(EnumBlocks.blockBDiamond)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EHandler.getItem(EnumGems.gemCitrine, 9), EHandler.getItem(EnumBlocks.blockCitrine)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EHandler.getItem(EnumGems.gemCZirconia, 9), EHandler.getItem(EnumBlocks.blockCZirconia)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EHandler.getItem(EnumGems.gemFuchsia, 9), EHandler.getItem(EnumBlocks.blockFuchsia)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EHandler.getItem(EnumGems.gemJet, 9), EHandler.getItem(EnumBlocks.blockJet)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EHandler.getItem(EnumGems.gemOlivine, 9), EHandler.getItem(EnumBlocks.blockOlivine)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EHandler.getItem(EnumGems.gemOpal, 9), EHandler.getItem(EnumBlocks.blockOpal)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EHandler.getItem(EnumGems.gemRuby, 9), EHandler.getItem(EnumBlocks.blockRuby)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EHandler.getItem(EnumGems.gemSapphire, 9), EHandler.getItem(EnumBlocks.blockSapphire)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EHandler.getItem(EnumGems.gemSQuartz, 9), EHandler.getItem(EnumBlocks.blockSQuartz)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EHandler.getItem(EnumGems.gemSun, 9), EHandler.getItem(EnumBlocks.blockSun)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EHandler.getItem(EnumGems.gemTopaz, 9), EHandler.getItem(EnumBlocks.blockTopaz)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EHandler.getItem(EnumGems.gemTurquoise, 9), EHandler.getItem(EnumBlocks.blockTurquoise)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EHandler.getItem(EnumGems.gemWAlabaster, 9), EHandler.getItem(EnumBlocks.blockWAlabaster)));
    }

    public static void init()
    {
        addShaped();
        addShapeless();
    }
}
