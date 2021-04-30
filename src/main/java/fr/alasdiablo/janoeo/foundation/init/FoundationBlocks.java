package fr.alasdiablo.janoeo.foundation.init;

import fr.alasdiablo.diolib.util.RegistryHelper;
import fr.alasdiablo.janoeo.foundation.util.JanoeoGroup;
import fr.alasdiablo.janoeo.foundation.util.Registries;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@SuppressWarnings("unused")
public class FoundationBlocks {

    public static Block SAPPHIRE_BLOCK
            = new Block(Block.Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(3f).harvestTool(ToolType.PICKAXE))
            .setRegistryName(Registries.SAPPHIRE_BLOCK);
    public static Block RUBY_BLOCK = new Block(
            Block.Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(3f).harvestTool(ToolType.PICKAXE))
            .setRegistryName(Registries.RUBY_BLOCK);

    /**
     * Registry Event Handler
     */
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        /**
         * Handle Block registries
         *
         * @param event Instance of the event
         */
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
            RegistryHelper.registerBlock(event.getRegistry(),
                    SAPPHIRE_BLOCK, RUBY_BLOCK
            );
        }

        /**
         * Handle Item registries
         *
         * @param event Instance of the event
         */
        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            Item.Properties properties = new Item.Properties().group(JanoeoGroup.ORE_ITEMS);
            RegistryHelper.registerBlockItem(event.getRegistry(), properties,
                    SAPPHIRE_BLOCK, RUBY_BLOCK
            );
        }
    }
}
