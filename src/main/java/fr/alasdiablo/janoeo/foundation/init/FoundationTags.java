package fr.alasdiablo.janoeo.foundation.init;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;

public class FoundationTags {

    public static class Blocks {
        public static final Tags.IOptionalNamedTag<Block> ORES_ALUMINIUM = tag("ores/aluminium"); // UK also FR btw (haha)
        public static final Tags.IOptionalNamedTag<Block> ORES_ALUMINUM = tag("ores/aluminum");  // US // because we can found both…
        public static final Tags.IOptionalNamedTag<Block> ORES_LEAD = tag("ores/lead");
        public static final Tags.IOptionalNamedTag<Block> ORES_NICKEL = tag("ores/nickel");
        public static final Tags.IOptionalNamedTag<Block> ORES_SILVER = tag("ores/silver");
        public static final Tags.IOptionalNamedTag<Block> ORES_TIN = tag("ores/tin");
        public static final Tags.IOptionalNamedTag<Block> ORES_URANIUM = tag("ores/uranium");

        public static final Tags.IOptionalNamedTag<Block> ORES_TINY = tag("ores/tiny");
        public static final Tags.IOptionalNamedTag<Block> ORES_TINY_COAL = tag("ores/tiny/coal");
        public static final Tags.IOptionalNamedTag<Block> ORES_TINY_COPPER = tag("ores/tiny/copper");
        public static final Tags.IOptionalNamedTag<Block> ORES_TINY_DIAMOND = tag("ores/tiny/diamond");
        public static final Tags.IOptionalNamedTag<Block> ORES_TINY_EMERALD = tag("ores/tiny/emerald");
        public static final Tags.IOptionalNamedTag<Block> ORES_TINY_GOLD = tag("ores/tiny/gold");
        public static final Tags.IOptionalNamedTag<Block> ORES_TINY_IRON = tag("ores/tiny/iron");
        public static final Tags.IOptionalNamedTag<Block> ORES_TINY_LAPIS = tag("ores/tiny/lapis");
        public static final Tags.IOptionalNamedTag<Block> ORES_TINY_REDSTONE = tag("ores/tiny/redstone");

        private static Tags.IOptionalNamedTag<Block> tag(String name) {
            return BlockTags.createOptional(new ResourceLocation("forge", name));
        }
    }

    public static class Items {
        public static final Tags.IOptionalNamedTag<Item> ORES_ALUMINIUM = tag("ores/aluminium"); // UK also FR btw (haha)
        public static final Tags.IOptionalNamedTag<Item> ORES_ALUMINUM = tag("ores/aluminum");  // US // because we can found both…
        public static final Tags.IOptionalNamedTag<Item> ORES_LEAD = tag("ores/lead");
        public static final Tags.IOptionalNamedTag<Item> ORES_NICKEL = tag("ores/nickel");
        public static final Tags.IOptionalNamedTag<Item> ORES_SILVER = tag("ores/silver");
        public static final Tags.IOptionalNamedTag<Item> ORES_TIN = tag("ores/tin");
        public static final Tags.IOptionalNamedTag<Item> ORES_URANIUM = tag("ores/uranium");

        public static final Tags.IOptionalNamedTag<Item> ORES_TINY = tag("ores/tiny");
        public static final Tags.IOptionalNamedTag<Item> ORES_TINY_COAL = tag("ores/tiny/coal");
        public static final Tags.IOptionalNamedTag<Item> ORES_TINY_COPPER = tag("ores/tiny/copper");
        public static final Tags.IOptionalNamedTag<Item> ORES_TINY_DIAMOND = tag("ores/tiny/diamond");
        public static final Tags.IOptionalNamedTag<Item> ORES_TINY_EMERALD = tag("ores/tiny/emerald");
        public static final Tags.IOptionalNamedTag<Item> ORES_TINY_GOLD = tag("ores/tiny/gold");
        public static final Tags.IOptionalNamedTag<Item> ORES_TINY_IRON = tag("ores/tiny/iron");
        public static final Tags.IOptionalNamedTag<Item> ORES_TINY_LAPIS = tag("ores/tiny/lapis");
        public static final Tags.IOptionalNamedTag<Item> ORES_TINY_REDSTONE = tag("ores/tiny/redstone");

        public static final Tags.IOptionalNamedTag<Item> DUSTS_ALUMINIUM = tag("dusts/aluminium"); // UK also FR btw (haha)
        public static final Tags.IOptionalNamedTag<Item> DUSTS_ALUMINUM = tag("dusts/aluminum");  // US // because we can found both…
        public static final Tags.IOptionalNamedTag<Item> DUSTS_AMETHYST = tag("dusts/amethyst");
        public static final Tags.IOptionalNamedTag<Item> DUSTS_COAL = tag("dusts/coal");
        public static final Tags.IOptionalNamedTag<Item> DUSTS_COPPER = tag("dusts/copper");
        public static final Tags.IOptionalNamedTag<Item> DUSTS_DIAMOND = tag("dusts/diamond");
        public static final Tags.IOptionalNamedTag<Item> DUSTS_EMERALD = tag("dusts/emerald");
        public static final Tags.IOptionalNamedTag<Item> DUSTS_GOLD = tag("dusts/gold");
        public static final Tags.IOptionalNamedTag<Item> DUSTS_IRON = tag("dusts/iron");
        public static final Tags.IOptionalNamedTag<Item> DUSTS_LAPIS = tag("dusts/lapis");
        public static final Tags.IOptionalNamedTag<Item> DUSTS_LEAD = tag("dusts/lead");
        public static final Tags.IOptionalNamedTag<Item> DUSTS_NICKEL = tag("dusts/nickel");
        public static final Tags.IOptionalNamedTag<Item> DUSTS_SILVER = tag("dusts/silver");
        public static final Tags.IOptionalNamedTag<Item> DUSTS_TIN = tag("dusts/tin");
        public static final Tags.IOptionalNamedTag<Item> DUSTS_URANIUM = tag("dusts/uranium");

        public static final Tags.IOptionalNamedTag<Item> NUGGETS_ALUMINIUM = tag("nuggets/aluminium"); // UK also FR btw (haha)
        public static final Tags.IOptionalNamedTag<Item> NUGGETS_ALUMINUM = tag("nuggets/aluminum");  // US // because we can found both…
        public static final Tags.IOptionalNamedTag<Item> NUGGETS_COAL = tag("nuggets/coal");
        public static final Tags.IOptionalNamedTag<Item> NUGGETS_COPPER = tag("nuggets/copper");
        public static final Tags.IOptionalNamedTag<Item> NUGGETS_DIAMOND = tag("nuggets/diamond");
        public static final Tags.IOptionalNamedTag<Item> NUGGETS_EMERALD = tag("nuggets/emerald");
        public static final Tags.IOptionalNamedTag<Item> NUGGETS_LAPIS = tag("nuggets/lapis");
        public static final Tags.IOptionalNamedTag<Item> NUGGETS_LEAD = tag("nuggets/lead");
        public static final Tags.IOptionalNamedTag<Item> NUGGETS_NICKEL = tag("nuggets/nickel");
        public static final Tags.IOptionalNamedTag<Item> NUGGETS_REDSTONE = tag("nuggets/redstone");
        public static final Tags.IOptionalNamedTag<Item> NUGGETS_SILVER = tag("nuggets/silver");
        public static final Tags.IOptionalNamedTag<Item> NUGGETS_TIN = tag("nuggets/tin");
        public static final Tags.IOptionalNamedTag<Item> NUGGETS_URANIUM = tag("nuggets/uranium");

        public static final Tags.IOptionalNamedTag<Item> INGOTS_ALUMINIUM = tag("ingots/aluminium"); // UK also FR btw (haha)
        public static final Tags.IOptionalNamedTag<Item> INGOTS_ALUMINUM = tag("ingots/aluminum");  // US // because we can found both…
        public static final Tags.IOptionalNamedTag<Item> INGOTS_COPPER = tag("ingots/copper");
        public static final Tags.IOptionalNamedTag<Item> INGOTS_LEAD = tag("ingots/lead");
        public static final Tags.IOptionalNamedTag<Item> INGOTS_NICKEL = tag("ingots/nickel");
        public static final Tags.IOptionalNamedTag<Item> INGOTS_SILVER = tag("ingots/silver");
        public static final Tags.IOptionalNamedTag<Item> INGOTS_TIN = tag("ingots/tin");
        public static final Tags.IOptionalNamedTag<Item> INGOTS_URANIUM = tag("ingots/uranium");

        public static final Tags.IOptionalNamedTag<Item> RAWS = tag("raws"); // To change or not in 1.17
        public static final Tags.IOptionalNamedTag<Item> RAWS_ALUMINIUM = tag("raws/aluminium"); // UK also FR btw (haha)
        public static final Tags.IOptionalNamedTag<Item> RAWS_ALUMINUM = tag("raws/aluminum");  // US // because we can found both…
        public static final Tags.IOptionalNamedTag<Item> RAWS_LEAD = tag("raws/lead");
        public static final Tags.IOptionalNamedTag<Item> RAWS_NICKEL = tag("raws/nickel");
        public static final Tags.IOptionalNamedTag<Item> RAWS_SILVER = tag("raws/silver");
        public static final Tags.IOptionalNamedTag<Item> RAWS_TIN = tag("raws/tin");
        public static final Tags.IOptionalNamedTag<Item> RAWS_URANIUM = tag("raws/uranium");

        private static Tags.IOptionalNamedTag<Item> tag(String name) {
            return ItemTags.createOptional(new ResourceLocation("forge", name));
        }
    }
}
