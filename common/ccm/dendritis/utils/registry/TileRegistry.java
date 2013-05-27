package ccm.dendritis.utils.registry;

import net.minecraft.tileentity.TileEntity;
import ccm.dendritis.Dendritis;
import ccm.nucleum_omnium.handler.Handler;

final class TileRegistry {

    /**
     * Registers all the {@link TileEntity}s.
     */
    protected static void registerTileEntities() {
        Handler.log(Dendritis.instance, "Registering Tile Entities");
    }
}