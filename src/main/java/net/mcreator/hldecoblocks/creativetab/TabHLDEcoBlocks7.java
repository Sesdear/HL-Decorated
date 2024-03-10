
package net.mcreator.hldecoblocks.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.hldecoblocks.ElementsHldecoratedMod;

@ElementsHldecoratedMod.ModElement.Tag
public class TabHLDEcoBlocks7 extends ElementsHldecoratedMod.ModElement {
	public TabHLDEcoBlocks7(ElementsHldecoratedMod instance) {
		super(instance, 312);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabhld_eco_blocks_7") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(Blocks.STAINED_HARDENED_CLAY, (int) (1), 9);
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
