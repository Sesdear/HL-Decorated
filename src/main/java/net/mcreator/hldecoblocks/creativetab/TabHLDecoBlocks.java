
package net.mcreator.hldecoblocks.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.hldecoblocks.block.BlockAcasiaPlank1;
import net.mcreator.hldecoblocks.ElementsHldecoratedMod;

@ElementsHldecoratedMod.ModElement.Tag
public class TabHLDecoBlocks extends ElementsHldecoratedMod.ModElement {
	public TabHLDecoBlocks(ElementsHldecoratedMod instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabhl_deco_blocks") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(BlockAcasiaPlank1.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
