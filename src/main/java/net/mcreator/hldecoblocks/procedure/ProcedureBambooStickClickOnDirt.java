package net.mcreator.hldecoblocks.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.init.Blocks;

import net.mcreator.hldecoblocks.block.BlockBamboo;
import net.mcreator.hldecoblocks.ElementsHldecoratedMod;

import java.util.Map;

@ElementsHldecoratedMod.ModElement.Tag
public class ProcedureBambooStickClickOnDirt extends ElementsHldecoratedMod.ModElement {
	public ProcedureBambooStickClickOnDirt(ElementsHldecoratedMod instance) {
		super(instance, 193);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure BambooStickClickOnDirt!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure BambooStickClickOnDirt!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure BambooStickClickOnDirt!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure BambooStickClickOnDirt!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.DIRT.getStateFromMeta(0).getBlock())) {
			world.setBlockState(new BlockPos((int) x, (int) 1, (int) z), BlockBamboo.block.getDefaultState(), 3);
		}
	}
}
