
package net.mcreator.hldecoblocks.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.hldecoblocks.ElementsHldecoratedMod;

@ElementsHldecoratedMod.ModElement.Tag
public class TabHLDecoBlocks6 extends ElementsHldecoratedMod.ModElement {
	public TabHLDecoBlocks6(ElementsHldecoratedMod instance) {
		super(instance, 291);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabhl_deco_blocks_6") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(Blocks.CONCRETE, (int) (1), 4);
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
