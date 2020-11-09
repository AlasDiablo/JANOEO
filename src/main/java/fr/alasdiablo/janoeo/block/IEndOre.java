package fr.alasdiablo.janoeo.block;

import fr.alasdiablo.janoeo.config.GlobalConfig;
import net.minecraft.entity.monster.EndermanEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.World;

import java.util.List;

/**
 * Interface use by all The End Ore Block
 */
public interface IEndOre {

    /**
     * Default implementation of angerEnderman (function use of make <i>EndermanEntity</i> attack <i>PlayerEntity</i>)
     *
     * @param player Player who brake the block
     * @param world  The current world
     * @param pos    Block world position
     */
    default void angerEnderman(PlayerEntity player, World world, BlockPos pos) {
        GlobalConfig.Config globalConfig = GlobalConfig.CONFIG;
        if (globalConfig.ENDERMAN_ANGER.get()) {
            final int aggroRange = globalConfig.ENDERMAN_ANGER_RANGE.get();
            final int x = pos.getX(), y = pos.getY(), z = pos.getZ();
            List<EndermanEntity> list = world.getEntitiesWithinAABB(EndermanEntity.class,
                    AxisAlignedBB.toImmutable(MutableBoundingBox.createProper(
                            x - aggroRange,
                            y - aggroRange,
                            z - aggroRange,
                            x + aggroRange + 1,
                            y + aggroRange + 1,
                            z + aggroRange + 1))
            );
            list.forEach(e -> e.setAttackTarget(player));
        }
    }
}
