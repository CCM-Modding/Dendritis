package ccm.dendritis.utils.lib;

public class Properties {

    /*
     * ***********************************************
     * Defaluts ***********************************************
     */
    private static int itemID = 10000;

    private static int blockID = 1000;

    /*
     * ***********************************************
     * Item IDs ***********************************************
     */
    public static int itemMainID;

    public static int itemGemsID;

    /*
     * ***********************************************
     * Blocks IDs ***********************************************
     */

    public static int oreID;

    public static int blocksID;

    /*
     * ***************************************************
     * World Generation Stuff
     * ***************************************************
     */
    // Amethyst
    public static boolean enableWorldGenAmethyst;
    public static int ameMaxHeight;
    public static int ameMinHeight;
    public static int ameSize;
    public static int ameDensity;

    // Opal
    public static boolean enableWorldGenOpal;
    public static int opalMaxHeight;
    public static int opalMinHeight;
    public static int opalSize;
    public static int opalDensity;

    // Ruby
    public static boolean enableWorldGenRuby;
    public static int rubyMaxHeight;
    public static int rubyMinHeight;
    public static int rubySize;
    public static int rubyDensity;

    // Saphire
    public static boolean enableWorldGenSapphire;
    public static int sapMaxHeight;
    public static int sapMinHeight;
    public static int sapSize;
    public static int sapDensity;

    public static int getItemID() {
        return itemID;
    }

    public static int getBlockID() {
        return blockID;
    }
}