
package net.mcreator.hldecoblocks.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.hldecoblocks.block.BlockBamboo;
import net.mcreator.hldecoblocks.ElementsHldecoratedMod;

@ElementsHldecoratedMod.ModElement.Tag
public class TabHLDecoBlocks4 extends ElementsHldecoratedMod.ModElement {
	public TabHLDecoBlocks4(ElementsHldecoratedMod instance) {
		super(instance, 190);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabhl_deco_blocks_4") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(BlockBamboo.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
