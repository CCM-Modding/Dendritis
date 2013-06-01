package ccm.dendritis.core.recipe;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.ShapedOreRecipe;

import ccm.dendritis.item.ModItems;

final class RecipesCraftingTools
{

    /**
     * Adds all the Shaped recipes in the Mod.
     */
    @SuppressWarnings("unchecked")
    private static void addShaped()
    {

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.axeAmethyst), new Object[]
        { "xx", "xy", " y", 'x', "gemAmethyst", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.hoeAmethyst), new Object[]
        { "xx", " y", " y", 'x', "gemAmethyst", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.spadeAmethyst), new Object[]
        { "x", "y", "y", 'x', "gemAmethyst", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.pickAmethyst), new Object[]
        { "xxx", " y ", " y ", 'x', "gemAmethyst", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.swordAmethyst), new Object[]
        { "x", "x", "y", 'x', "gemAmethyst", 'y', "stickWood" }));

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.axeBDiamond), new Object[]
        { "xx", "xy", " y", 'x', "gemBDiamond", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.hoeBDiamond), new Object[]
        { "xx", " y", " y", 'x', "gemBDiamond", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.spadeBDiamond), new Object[]
        { "x", "y", "y", 'x', "gemBDiamond", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.pickBDiamond), new Object[]
        { "xxx", " y ", " y ", 'x', "gemBDiamond", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.swordBDiamond), new Object[]
        { "x", "x", "y", 'x', "gemBDiamond", 'y', "stickWood" }));

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.axeCitrine), new Object[]
        { "xx", "xy", " y", 'x', "gemCitrine", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.hoeCitrine), new Object[]
        { "xx", " y", " y", 'x', "gemCitrine", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.spadeCitrine), new Object[]
        { "x", "y", "y", 'x', "gemCitrine", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.pickCitrine), new Object[]
        { "xxx", " y ", " y ", 'x', "gemCitrine", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.swordCitrine), new Object[]
        { "x", "x", "y", 'x', "gemCitrine", 'y', "stickWood" }));

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.axeCZirconia), new Object[]
        { "xx", "xy", " y", 'x', "gemCZirconia", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.hoeCZirconia), new Object[]
        { "xx", " y", " y", 'x', "gemCZirconia", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.spadeCZirconia), new Object[]
        { "x", "y", "y", 'x', "gemCZirconia", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.pickCZirconia), new Object[]
        { "xxx", " y ", " y ", 'x', "gemCZirconia", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.swordCZirconia), new Object[]
        { "x", "x", "y", 'x', "gemCZirconia", 'y', "stickWood" }));

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.axeEmerald), new Object[]
        { "xx", "xy", " y", 'x', Item.emerald, 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.hoeEmerald), new Object[]
        { "xx", " y", " y", 'x', Item.emerald, 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.spadeEmerald), new Object[]
        { "x", "y", "y", 'x', Item.emerald, 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.pickEmerald), new Object[]
        { "xxx", " y ", " y ", 'x', Item.emerald, 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.swordEmerald), new Object[]
        { "x", "x", "y", 'x', Item.emerald, 'y', "stickWood" }));

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.axeFuchsia), new Object[]
        { "xx", "xy", " y", 'x', "gemFuchsia", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.hoeFuchsia), new Object[]
        { "xx", " y", " y", 'x', "gemFuchsia", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.spadeFuchsia), new Object[]
        { "x", "y", "y", 'x', "gemFuchsia", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.pickFuchsia), new Object[]
        { "xxx", " y ", " y ", 'x', "gemFuchsia", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.swordFuchsia), new Object[]
        { "x", "x", "y", 'x', "gemFuchsia", 'y', "stickWood" }));

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.axeJet), new Object[]
        { "xx", "xy", " y", 'x', "gemJet", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.hoeJet), new Object[]
        { "xx", " y", " y", 'x', "gemJet", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.spadeJet), new Object[]
        { "x", "y", "y", 'x', "gemJet", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.pickJet), new Object[]
        { "xxx", " y ", " y ", 'x', "gemJet", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.swordJet), new Object[]
        { "x", "x", "y", 'x', "gemJet", 'y', "stickWood" }));

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.axeOlivine), new Object[]
        { "xx", "xy", " y", 'x', "gemOlivine", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.hoeOlivine), new Object[]
        { "xx", " y", " y", 'x', "gemOlivine", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.spadeOlivine), new Object[]
        { "x", "y", "y", 'x', "gemOlivine", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.pickOlivine), new Object[]
        { "xxx", " y ", " y ", 'x', "gemOlivine", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.swordOlivine), new Object[]
        { "x", "x", "y", 'x', "gemOlivine", 'y', "stickWood" }));

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.axeOpal), new Object[]
        { "xx", "xy", " y", 'x', "gemOpal", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.hoeOpal), new Object[]
        { "xx", " y", " y", 'x', "gemOpal", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.spadeOpal), new Object[]
        { "x", "y", "y", 'x', "gemOpal", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.pickOpal), new Object[]
        { "xxx", " y ", " y ", 'x', "gemOpal", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.swordOpal), new Object[]
        { "x", "x", "y", 'x', "gemOpal", 'y', "stickWood" }));

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.axeQuartz), new Object[]
        { "xx", "xy", " y", 'x', Item.netherQuartz, 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.hoeQuartz), new Object[]
        { "xx", " y", " y", 'x', Item.netherQuartz, 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.spadeQuartz), new Object[]
        { "x", "y", "y", 'x', Item.netherQuartz, 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.pickQuartz), new Object[]
        { "xxx", " y ", " y ", 'x', Item.netherQuartz, 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.swordQuartz), new Object[]
        { "x", "x", "y", 'x', Item.netherQuartz, 'y', "stickWood" }));

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.axeRuby), new Object[]
        { "xx", "xy", " y", 'x', "gemRuby", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.hoeRuby), new Object[]
        { "xx", " y", " y", 'x', "gemRuby", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.spadeRuby), new Object[]
        { "x", "y", "y", 'x', "gemRuby", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.pickRuby), new Object[]
        { "xxx", " y ", " y ", 'x', "gemRuby", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.swordRuby), new Object[]
        { "x", "x", "y", 'x', "gemRuby", 'y', "stickWood" }));

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.axeSapphire), new Object[]
        { "xx", "xy", " y", 'x', "gemSapphire", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.hoeSapphire), new Object[]
        { "xx", " y", " y", 'x', "gemSapphire", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.spadeSapphire), new Object[]
        { "x", "y", "y", 'x', "gemSapphire", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.pickSapphire), new Object[]
        { "xxx", " y ", " y ", 'x', "gemSapphire", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.swordSapphire), new Object[]
        { "x", "x", "y", 'x', "gemSapphire", 'y', "stickWood" }));

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.axeSQuartz), new Object[]
        { "xx", "xy", " y", 'x', "gemSQuartz", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.hoeSQuartz), new Object[]
        { "xx", " y", " y", 'x', "gemSQuartz", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.spadeSQuartz), new Object[]
        { "x", "y", "y", 'x', "gemSQuartz", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.pickSQuartz), new Object[]
        { "xxx", " y ", " y ", 'x', "gemSQuartz", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.swordSQuartz), new Object[]
        { "x", "x", "y", 'x', "gemSQuartz", 'y', "stickWood" }));

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.axeSun), new Object[]
        { "xx", "xy", " y", 'x', "gemSun", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.hoeSun), new Object[]
        { "xx", " y", " y", 'x', "gemSun", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.spadeSun), new Object[]
        { "x", "y", "y", 'x', "gemSun", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.pickSun), new Object[]
        { "xxx", " y ", " y ", 'x', "gemSun", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.swordSun), new Object[]
        { "x", "x", "y", 'x', "gemSun", 'y', "stickWood" }));

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.axeTopaz), new Object[]
        { "xx", "xy", " y", 'x', "gemTopaz", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.hoeTopaz), new Object[]
        { "xx", " y", " y", 'x', "gemTopaz", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.spadeTopaz), new Object[]
        { "x", "y", "y", 'x', "gemTopaz", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.pickTopaz), new Object[]
        { "xxx", " y ", " y ", 'x', "gemTopaz", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.swordTopaz), new Object[]
        { "x", "x", "y", 'x', "gemTopaz", 'y', "stickWood" }));

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.axeTurquoise), new Object[]
        { "xx", "xy", " y", 'x', "gemTurquoise", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.hoeTurquoise), new Object[]
        { "xx", " y", " y", 'x', "gemTurquoise", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.spadeTurquoise), new Object[]
        { "x", "y", "y", 'x', "gemTurquoise", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.pickTurquoise), new Object[]
        { "xxx", " y ", " y ", 'x', "gemTurquoise", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.swordTurquoise), new Object[]
        { "x", "x", "y", 'x', "gemTurquoise", 'y', "stickWood" }));

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.axeWAlabaster), new Object[]
        { "xx", "xy", " y", 'x', "gemWAlabaster", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.hoeWAlabaster), new Object[]
        { "xx", " y", " y", 'x', "gemWAlabaster", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.spadeWAlabaster), new Object[]
        { "x", "y", "y", 'x', "gemWAlabaster", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.pickWAlabaster), new Object[]
        { "xxx", " y ", " y ", 'x', "gemWAlabaster", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.swordWAlabaster), new Object[]
        { "x", "x", "y", 'x', "gemWAlabaster", 'y', "stickWood" }));
    }

    public static void init()
    {
        addShaped();
    }
}
