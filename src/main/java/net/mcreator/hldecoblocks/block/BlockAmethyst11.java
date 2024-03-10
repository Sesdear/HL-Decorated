
package net.mcreator.hldecoblocks.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import net.mcreator.hldecoblocks.creativetab.TabHLDecoBlocks2;
import net.mcreator.hldecoblocks.ElementsHldecoratedMod;

@ElementsHldecoratedMod.ModElement.Tag
public class BlockAmethyst11 extends ElementsHldecoratedMod.ModElement {
	@GameRegistry.ObjectHolder("hldecorated:amethyst_11")
	public static final Block block = null;
	public BlockAmethyst11(ElementsHldecoratedMod instance) {
		super(instance, 71);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("amethyst_11"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("hldecorated:amethyst_11", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.ROCK);
			setUnlocalizedName("amethyst_11");
			setSoundType(SoundType.STONE);
			setHardness(1F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabHLDecoBlocks2.tab);
		}
	}
}
