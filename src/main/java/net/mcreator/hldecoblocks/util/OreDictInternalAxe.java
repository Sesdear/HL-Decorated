
package net.mcreator.hldecoblocks.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.hldecoblocks.ElementsHldecoratedMod;

@ElementsHldecoratedMod.ModElement.Tag
public class OreDictInternalAxe extends ElementsHldecoratedMod.ModElement {
	public OreDictInternalAxe(ElementsHldecoratedMod instance) {
		super(instance, 196);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("internal_axe", new ItemStack(Items.WOODEN_AXE, (int) (1)));
		OreDictionary.registerOre("internal_axe", new ItemStack(Items.STONE_AXE, (int) (1)));
		OreDictionary.registerOre("internal_axe", new ItemStack(Items.IRON_AXE, (int) (1)));
		OreDictionary.registerOre("internal_axe", new ItemStack(Items.GOLDEN_AXE, (int) (1)));
		OreDictionary.registerOre("internal_axe", new ItemStack(Items.DIAMOND_AXE, (int) (1)));
	}
}
