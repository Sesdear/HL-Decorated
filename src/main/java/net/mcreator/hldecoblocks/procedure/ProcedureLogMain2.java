package net.mcreator.hldecoblocks.procedure;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.Container;
import net.minecraft.init.Blocks;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.Entity;

import net.mcreator.hldecoblocks.block.BlockSpruceLogMain;
import net.mcreator.hldecoblocks.block.BlockSl9;
import net.mcreator.hldecoblocks.block.BlockSl8;
import net.mcreator.hldecoblocks.block.BlockSl7;
import net.mcreator.hldecoblocks.block.BlockSl6;
import net.mcreator.hldecoblocks.block.BlockSl5;
import net.mcreator.hldecoblocks.block.BlockSl4;
import net.mcreator.hldecoblocks.block.BlockSl3;
import net.mcreator.hldecoblocks.block.BlockSl2;
import net.mcreator.hldecoblocks.block.BlockSl11;
import net.mcreator.hldecoblocks.block.BlockSl10;
import net.mcreator.hldecoblocks.block.BlockSl1;
import net.mcreator.hldecoblocks.block.BlockOl9;
import net.mcreator.hldecoblocks.block.BlockOl8;
import net.mcreator.hldecoblocks.block.BlockOl7;
import net.mcreator.hldecoblocks.block.BlockOl6;
import net.mcreator.hldecoblocks.block.BlockOl5;
import net.mcreator.hldecoblocks.block.BlockOl4;
import net.mcreator.hldecoblocks.block.BlockOl3;
import net.mcreator.hldecoblocks.block.BlockOl2;
import net.mcreator.hldecoblocks.block.BlockOl11;
import net.mcreator.hldecoblocks.block.BlockOl10;
import net.mcreator.hldecoblocks.block.BlockOl1;
import net.mcreator.hldecoblocks.block.BlockOakLogMain;
import net.mcreator.hldecoblocks.block.BlockMlM;
import net.mcreator.hldecoblocks.block.BlockMl9;
import net.mcreator.hldecoblocks.block.BlockMl8;
import net.mcreator.hldecoblocks.block.BlockMl7;
import net.mcreator.hldecoblocks.block.BlockMl6;
import net.mcreator.hldecoblocks.block.BlockMl5;
import net.mcreator.hldecoblocks.block.BlockMl4;
import net.mcreator.hldecoblocks.block.BlockMl3;
import net.mcreator.hldecoblocks.block.BlockMl2;
import net.mcreator.hldecoblocks.block.BlockMl11;
import net.mcreator.hldecoblocks.block.BlockMl10;
import net.mcreator.hldecoblocks.block.BlockMl1;
import net.mcreator.hldecoblocks.block.BlockJungleLogMain;
import net.mcreator.hldecoblocks.block.BlockJl9;
import net.mcreator.hldecoblocks.block.BlockJl8;
import net.mcreator.hldecoblocks.block.BlockJl6;
import net.mcreator.hldecoblocks.block.BlockJl5;
import net.mcreator.hldecoblocks.block.BlockJl4;
import net.mcreator.hldecoblocks.block.BlockJl3;
import net.mcreator.hldecoblocks.block.BlockJl2;
import net.mcreator.hldecoblocks.block.BlockJl11;
import net.mcreator.hldecoblocks.block.BlockJl10;
import net.mcreator.hldecoblocks.block.BlockJl1;
import net.mcreator.hldecoblocks.block.BlockDol9;
import net.mcreator.hldecoblocks.block.BlockDol8;
import net.mcreator.hldecoblocks.block.BlockDol7;
import net.mcreator.hldecoblocks.block.BlockDol6;
import net.mcreator.hldecoblocks.block.BlockDol5;
import net.mcreator.hldecoblocks.block.BlockDol4;
import net.mcreator.hldecoblocks.block.BlockDol3;
import net.mcreator.hldecoblocks.block.BlockDol2;
import net.mcreator.hldecoblocks.block.BlockDol11;
import net.mcreator.hldecoblocks.block.BlockDol10;
import net.mcreator.hldecoblocks.block.BlockDol1;
import net.mcreator.hldecoblocks.block.BlockDarkOakLogMain;
import net.mcreator.hldecoblocks.block.BlockBrichLogMain;
import net.mcreator.hldecoblocks.block.BlockBrich9;
import net.mcreator.hldecoblocks.block.BlockBrich8;
import net.mcreator.hldecoblocks.block.BlockBrich7;
import net.mcreator.hldecoblocks.block.BlockBrich6;
import net.mcreator.hldecoblocks.block.BlockBrich5;
import net.mcreator.hldecoblocks.block.BlockBrich4;
import net.mcreator.hldecoblocks.block.BlockBrich3;
import net.mcreator.hldecoblocks.block.BlockBrich2;
import net.mcreator.hldecoblocks.block.BlockBrich11;
import net.mcreator.hldecoblocks.block.BlockBrich10;
import net.mcreator.hldecoblocks.block.BlockBrich1;
import net.mcreator.hldecoblocks.block.BlockAcasiaPlank9;
import net.mcreator.hldecoblocks.block.BlockAcasiaPlank8;
import net.mcreator.hldecoblocks.block.BlockAcasiaPlank6;
import net.mcreator.hldecoblocks.block.BlockAcasiaPlank5;
import net.mcreator.hldecoblocks.block.BlockAcasiaPlank4;
import net.mcreator.hldecoblocks.block.BlockAcasiaPlank38;
import net.mcreator.hldecoblocks.block.BlockAcasiaPlank37;
import net.mcreator.hldecoblocks.block.BlockAcasiaPlank36;
import net.mcreator.hldecoblocks.block.BlockAcasiaPlank35;
import net.mcreator.hldecoblocks.block.BlockAcasiaPlank34;
import net.mcreator.hldecoblocks.block.BlockAcasiaPlank33;
import net.mcreator.hldecoblocks.block.BlockAcasiaPlank32;
import net.mcreator.hldecoblocks.block.BlockAcasiaPlank31;
import net.mcreator.hldecoblocks.block.BlockAcasiaPlank30;
import net.mcreator.hldecoblocks.block.BlockAcasiaPlank3;
import net.mcreator.hldecoblocks.block.BlockAcasiaPlank29;
import net.mcreator.hldecoblocks.block.BlockAcasiaPlank28;
import net.mcreator.hldecoblocks.block.BlockAcasiaPlank27;
import net.mcreator.hldecoblocks.block.BlockAcasiaPlank26;
import net.mcreator.hldecoblocks.block.BlockAcasiaPlank25;
import net.mcreator.hldecoblocks.block.BlockAcasiaPlank24;
import net.mcreator.hldecoblocks.block.BlockAcasiaPlank23;
import net.mcreator.hldecoblocks.block.BlockAcasiaPlank22;
import net.mcreator.hldecoblocks.block.BlockAcasiaPlank21;
import net.mcreator.hldecoblocks.block.BlockAcasiaPlank2;
import net.mcreator.hldecoblocks.block.BlockAcasiaPlank19;
import net.mcreator.hldecoblocks.block.BlockAcasiaPlank18;
import net.mcreator.hldecoblocks.block.BlockAcasiaPlank17;
import net.mcreator.hldecoblocks.block.BlockAcasiaPlank16;
import net.mcreator.hldecoblocks.block.BlockAcasiaPlank15;
import net.mcreator.hldecoblocks.block.BlockAcasiaPlank14;
import net.mcreator.hldecoblocks.block.BlockAcasiaPlank13;
import net.mcreator.hldecoblocks.block.BlockAcasiaPlank12;
import net.mcreator.hldecoblocks.block.BlockAcasiaPlank11;
import net.mcreator.hldecoblocks.block.BlockAcasiaPlank10;
import net.mcreator.hldecoblocks.block.BlockAcasiaPlank1;
import net.mcreator.hldecoblocks.block.BlockAcasiaLog9;
import net.mcreator.hldecoblocks.block.BlockAcasiaLog8;
import net.mcreator.hldecoblocks.block.BlockAcasiaLog7;
import net.mcreator.hldecoblocks.block.BlockAcasiaLog6;
import net.mcreator.hldecoblocks.block.BlockAcasiaLog5;
import net.mcreator.hldecoblocks.block.BlockAcasiaLog4;
import net.mcreator.hldecoblocks.block.BlockAcasiaLog3;
import net.mcreator.hldecoblocks.block.BlockAcasiaLog2;
import net.mcreator.hldecoblocks.block.BlockAcasiaLog11;
import net.mcreator.hldecoblocks.block.BlockAcasiaLog10;
import net.mcreator.hldecoblocks.block.BlockAcasiaLog1;
import net.mcreator.hldecoblocks.block.BlockAcasiaBlock20;
import net.mcreator.hldecoblocks.block.BlockAcaciaLogMain;
import net.mcreator.hldecoblocks.ElementsHldecoratedMod;

import java.util.function.Supplier;
import java.util.Map;

@ElementsHldecoratedMod.ModElement.Tag
public class ProcedureLogMain2 extends ElementsHldecoratedMod.ModElement {
	public ProcedureLogMain2(ElementsHldecoratedMod instance) {
		super(instance, 443);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure LogMain2!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((new Object() {
			public ItemStack getItemStack(int sltid) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (0))).getItem() == new ItemStack(BlockJungleLogMain.block, (int) (1)).getItem())) {
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockJl10.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockJl11.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockJl1.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (3))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockJl2.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (4))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockJl3.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (5))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockJl4.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (6))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockJl5.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (7))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockJl6.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (8))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockJl8.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (9))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockJl9.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (10))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
		} else if (((new Object() {
			public ItemStack getItemStack(int sltid) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (0))).getItem() == new ItemStack(BlockMlM.block, (int) (1)).getItem())) {
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockMl1.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockMl2.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockMl3.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (3))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockMl4.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (4))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockMl5.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (5))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockMl6.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (6))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockMl7.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (7))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockMl8.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (8))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockMl9.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (9))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockMl10.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (10))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockMl11.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (11))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
		} else if (((new Object() {
			public ItemStack getItemStack(int sltid) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (0))).getItem() == new ItemStack(BlockSpruceLogMain.block, (int) (1)).getItem())) {
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockSl1.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockSl3.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockSl4.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (3))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockSl5.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (4))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockSl6.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (5))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockSl7.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (6))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockSl8.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (7))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockSl9.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (8))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockSl10.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (9))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockSl11.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (10))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockSl1.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (11))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockSl2.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (12))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
		} else if (((new Object() {
			public ItemStack getItemStack(int sltid) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (0))).getItem() == new ItemStack(BlockDarkOakLogMain.block, (int) (1)).getItem())) {
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockDol3.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockDol4.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockDol5.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (3))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockDol6.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (4))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockDol7.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (5))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockDol8.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (6))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockDol9.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (7))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockDol10.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (8))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockDol11.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (9))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockDol1.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (10))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockDol2.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (11))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
		} else if (((new Object() {
			public ItemStack getItemStack(int sltid) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (0))).getItem() == new ItemStack(BlockAcaciaLogMain.block, (int) (1)).getItem())) {
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockAcasiaLog4.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockAcasiaLog5.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockAcasiaLog6.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (3))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockAcasiaLog7.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (4))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockAcasiaLog8.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (5))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockAcasiaLog9.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (6))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockAcasiaLog10.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (7))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockAcasiaLog11.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (8))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockAcasiaLog1.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (9))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockAcasiaLog2.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (10))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockAcasiaLog3.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (11))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
		} else if (((new Object() {
			public ItemStack getItemStack(int sltid) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (0))).getItem() == new ItemStack(BlockOakLogMain.block, (int) (1)).getItem())) {
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockOl1.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockOl2.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockOl3.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (3))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockOl4.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (4))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockOl5.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (5))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockOl6.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (6))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockOl7.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (7))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockOl8.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (8))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockOl9.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (9))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockOl10.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (10))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockOl11.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (11))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockOl10.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (12))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
		} else if (((new Object() {
			public ItemStack getItemStack(int sltid) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (0))).getItem() == new ItemStack(BlockBrichLogMain.block, (int) (1)).getItem())) {
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockBrich2.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockBrich3.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockBrich4.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (3))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockBrich5.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (4))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockBrich6.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (5))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockBrich7.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (6))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockBrich8.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (7))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockBrich9.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (8))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockBrich10.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (9))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockBrich11.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (10))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockBrich1.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (11))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
		} else if (((new Object() {
			public ItemStack getItemStack(int sltid) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (0))).getItem() == new ItemStack(Blocks.PLANKS, (int) (1), 4).getItem())) {
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockAcasiaPlank1.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockAcasiaPlank11.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockAcasiaPlank21.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (3))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockAcasiaPlank31.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (4))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockAcasiaPlank2.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (5))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockAcasiaPlank12.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (6))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockAcasiaPlank22.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (7))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockAcasiaPlank32.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (8))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockAcasiaPlank3.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (9))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockAcasiaPlank13.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (10))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockAcasiaPlank23.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (11))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockAcasiaPlank33.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (12))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockAcasiaPlank4.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (13))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockAcasiaPlank14.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (14))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockAcasiaPlank24.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (15))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockAcasiaPlank34.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (16))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockAcasiaPlank5.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (17))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockAcasiaPlank15.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (18))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockAcasiaPlank25.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (19))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockAcasiaPlank35.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (20))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockAcasiaPlank6.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (21))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockAcasiaPlank16.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (22))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockAcasiaPlank26.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (23))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockAcasiaPlank36.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (24))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockAcasiaPlank17.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (25))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockAcasiaPlank27.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (26))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockAcasiaPlank37.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (27))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockAcasiaPlank8.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (28))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockAcasiaPlank18.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (29))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockAcasiaPlank28.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (21))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockAcasiaPlank38.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (22))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockAcasiaPlank9.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (23))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockAcasiaPlank19.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (24))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockAcasiaPlank29.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (25))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockAcasiaPlank10.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (26))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockAcasiaBlock20.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (27))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BlockAcasiaPlank30.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (28))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
		}
	}
}
