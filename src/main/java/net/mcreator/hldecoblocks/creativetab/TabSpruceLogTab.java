
package net.mcreator.hldecoblocks.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.hldecoblocks.ElementsHldecoratedMod;

@ElementsHldecoratedMod.ModElement.Tag
public class TabSpruceLogTab extends ElementsHldecoratedMod.ModElement {
	public TabSpruceLogTab(ElementsHldecoratedMod instance) {
		super(instance, 465);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabspruce_log_tab") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(Blocks.LOG, (int) (1), 1);
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
