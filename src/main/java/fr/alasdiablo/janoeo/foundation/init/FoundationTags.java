package fr.alasdiablo.janoeo.foundation.init;

import net.minecraft.item.Item;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;

public class FoundationTags {

    public static class Items {
        public static final Tags.IOptionalNamedTag<Item> DUSTS_AMETHYST = tag("dusts/amethyst");
        public static final Tags.IOptionalNamedTag<Item> DUSTS_COAL = tag("dusts/coal");
        public static final Tags.IOptionalNamedTag<Item> DUSTS_COPPER = tag("dusts/copper");
        public static final Tags.IOptionalNamedTag<Item> DUSTS_DIAMOND = tag("dusts/diamond");
        public static final Tags.IOptionalNamedTag<Item> DUSTS_EMERALD = tag("dusts/emerald");
        public static final Tags.IOptionalNamedTag<Item> DUSTS_GOLD = tag("dusts/gold");
        public static final Tags.IOptionalNamedTag<Item> DUSTS_IRON = tag("dusts/iron");
        public static final Tags.IOptionalNamedTag<Item> DUSTS_LAPIS = tag("dusts/lapis");

        public static final Tags.IOptionalNamedTag<Item> NUGGETS_ALUMINIUM = tag("nuggets/aluminium"); // UK also FR btw (haha)
        public static final Tags.IOptionalNamedTag<Item> NUGGETS_ALUMINUM = tag("nuggets/aluminum");  // US // because we can found both…
        public static final Tags.IOptionalNamedTag<Item> NUGGETS_COPPER = tag("nuggets/copper");
        public static final Tags.IOptionalNamedTag<Item> NUGGETS_LEAD = tag("nuggets/lead");
        public static final Tags.IOptionalNamedTag<Item> NUGGETS_NICKEL = tag("nuggets/nickel");
        public static final Tags.IOptionalNamedTag<Item> NUGGETS_SILVER = tag("nuggets/silver");
        public static final Tags.IOptionalNamedTag<Item> NUGGETS_TIN = tag("nuggets/tin");
        public static final Tags.IOptionalNamedTag<Item> NUGGETS_URANIUM = tag("nuggets/uranium");

        public static final Tags.IOptionalNamedTag<Item> INGOTS_ALUMINIUM = tag("ingots/aluminium"); // UK also FR btw (haha)
        public static final Tags.IOptionalNamedTag<Item> INGOTS_ALUMINUM = tag("ingots/aluminum");  // US // because we can found both…
        public static final Tags.IOptionalNamedTag<Item> INGOTS_LEAD = tag("ingots/lead");
        public static final Tags.IOptionalNamedTag<Item> INGOTS_NICKEL = tag("ingots/nickel");
        public static final Tags.IOptionalNamedTag<Item> INGOTS_SILVER = tag("ingots/silver");
        public static final Tags.IOptionalNamedTag<Item> INGOTS_TIN = tag("ingots/tin");
        public static final Tags.IOptionalNamedTag<Item> INGOTS_URANIUM = tag("ingots/uranium");

        private static Tags.IOptionalNamedTag<Item> tag(String name) {
            return ItemTags.createOptional(new ResourceLocation("forge", name));
        }
    }
}