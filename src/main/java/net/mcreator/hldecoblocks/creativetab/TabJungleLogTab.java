
package net.mcreator.hldecoblocks.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.hldecoblocks.block.BlockJl1;
import net.mcreator.hldecoblocks.ElementsHldecoratedMod;

@ElementsHldecoratedMod.ModElement.Tag
public class TabJungleLogTab extends ElementsHldecoratedMod.ModElement {
	public TabJungleLogTab(ElementsHldecoratedMod instance) {
		super(instance, 432);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabjungle_log_tab") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(BlockJl1.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
