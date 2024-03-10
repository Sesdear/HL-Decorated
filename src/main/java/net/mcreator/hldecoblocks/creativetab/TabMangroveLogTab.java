
package net.mcreator.hldecoblocks.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.hldecoblocks.block.BlockMlM;
import net.mcreator.hldecoblocks.ElementsHldecoratedMod;

@ElementsHldecoratedMod.ModElement.Tag
public class TabMangroveLogTab extends ElementsHldecoratedMod.ModElement {
	public TabMangroveLogTab(ElementsHldecoratedMod instance) {
		super(instance, 473);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabmangrove_log_tab") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(BlockMlM.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
