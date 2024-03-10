
package net.mcreator.hldecoblocks.gui;

import org.lwjgl.opengl.GL11;
import org.lwjgl.input.Keyboard;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Container;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.gui.GuiButton;

import net.mcreator.hldecoblocks.procedure.ProcedureSlot9;
import net.mcreator.hldecoblocks.procedure.ProcedureSlot8;
import net.mcreator.hldecoblocks.procedure.ProcedureSlot7;
import net.mcreator.hldecoblocks.procedure.ProcedureSlot6;
import net.mcreator.hldecoblocks.procedure.ProcedureSlot5;
import net.mcreator.hldecoblocks.procedure.ProcedureSlot4;
import net.mcreator.hldecoblocks.procedure.ProcedureSlot36;
import net.mcreator.hldecoblocks.procedure.ProcedureSlot35;
import net.mcreator.hldecoblocks.procedure.ProcedureSlot34;
import net.mcreator.hldecoblocks.procedure.ProcedureSlot33;
import net.mcreator.hldecoblocks.procedure.ProcedureSlot32;
import net.mcreator.hldecoblocks.procedure.ProcedureSlot31;
import net.mcreator.hldecoblocks.procedure.ProcedureSlot30;
import net.mcreator.hldecoblocks.procedure.ProcedureSlot3;
import net.mcreator.hldecoblocks.procedure.ProcedureSlot29;
import net.mcreator.hldecoblocks.procedure.ProcedureSlot28;
import net.mcreator.hldecoblocks.procedure.ProcedureSlot27;
import net.mcreator.hldecoblocks.procedure.ProcedureSlot26;
import net.mcreator.hldecoblocks.procedure.ProcedureSlot25;
import net.mcreator.hldecoblocks.procedure.ProcedureSlot24;
import net.mcreator.hldecoblocks.procedure.ProcedureSlot23;
import net.mcreator.hldecoblocks.procedure.ProcedureSlot22;
import net.mcreator.hldecoblocks.procedure.ProcedureSlot21;
import net.mcreator.hldecoblocks.procedure.ProcedureSlot20;
import net.mcreator.hldecoblocks.procedure.ProcedureSlot2;
import net.mcreator.hldecoblocks.procedure.ProcedureSlot19;
import net.mcreator.hldecoblocks.procedure.ProcedureSlot18;
import net.mcreator.hldecoblocks.procedure.ProcedureSlot17;
import net.mcreator.hldecoblocks.procedure.ProcedureSlot16;
import net.mcreator.hldecoblocks.procedure.ProcedureSlot15;
import net.mcreator.hldecoblocks.procedure.ProcedureSlot14;
import net.mcreator.hldecoblocks.procedure.ProcedureSlot13;
import net.mcreator.hldecoblocks.procedure.ProcedureSlot12;
import net.mcreator.hldecoblocks.procedure.ProcedureSlot11;
import net.mcreator.hldecoblocks.procedure.ProcedureSlot10;
import net.mcreator.hldecoblocks.procedure.ProcedureSlot1;
import net.mcreator.hldecoblocks.procedure.ProcedureSlot0Rem;
import net.mcreator.hldecoblocks.procedure.ProcedureLogMain2;
import net.mcreator.hldecoblocks.HldecoratedMod;
import net.mcreator.hldecoblocks.ElementsHldecoratedMod;

import java.util.function.Supplier;
import java.util.Map;
import java.util.HashMap;

import java.io.IOException;

@ElementsHldecoratedMod.ModElement.Tag
public class GuiGuiLog extends ElementsHldecoratedMod.ModElement {
	public static int GUIID = 3;
	public static HashMap guistate = new HashMap();
	public GuiGuiLog(ElementsHldecoratedMod instance) {
		super(instance, 398);
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		elements.addNetworkMessage(GUIButtonPressedMessageHandler.class, GUIButtonPressedMessage.class, Side.SERVER);
		elements.addNetworkMessage(GUISlotChangedMessageHandler.class, GUISlotChangedMessage.class, Side.SERVER);
	}
	public static class GuiContainerMod extends Container implements Supplier<Map<Integer, Slot>> {
		private IInventory internal;
		private World world;
		private EntityPlayer entity;
		private int x, y, z;
		private Map<Integer, Slot> customSlots = new HashMap<>();
		public GuiContainerMod(World world, int x, int y, int z, EntityPlayer player) {
			this.world = world;
			this.entity = player;
			this.x = x;
			this.y = y;
			this.z = z;
			this.internal = new InventoryBasic("", true, 37);
			TileEntity ent = world.getTileEntity(new BlockPos(x, y, z));
			if (ent instanceof IInventory)
				this.internal = (IInventory) ent;
			this.customSlots.put(1, this.addSlotToContainer(new Slot(internal, 1, 6, 10) {
				@Override
				public ItemStack onTake(EntityPlayer entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(1, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(2, this.addSlotToContainer(new Slot(internal, 2, 24, 10) {
				@Override
				public ItemStack onTake(EntityPlayer entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(2, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(3, this.addSlotToContainer(new Slot(internal, 3, 42, 10) {
				@Override
				public ItemStack onTake(EntityPlayer entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(3, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(4, this.addSlotToContainer(new Slot(internal, 4, 60, 10) {
				@Override
				public ItemStack onTake(EntityPlayer entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(4, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(5, this.addSlotToContainer(new Slot(internal, 5, 78, 10) {
				@Override
				public ItemStack onTake(EntityPlayer entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(5, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(6, this.addSlotToContainer(new Slot(internal, 6, 96, 10) {
				@Override
				public ItemStack onTake(EntityPlayer entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(6, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(7, this.addSlotToContainer(new Slot(internal, 7, 114, 10) {
				@Override
				public ItemStack onTake(EntityPlayer entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(7, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(8, this.addSlotToContainer(new Slot(internal, 8, 132, 10) {
				@Override
				public ItemStack onTake(EntityPlayer entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(8, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(9, this.addSlotToContainer(new Slot(internal, 9, 150, 10) {
				@Override
				public ItemStack onTake(EntityPlayer entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(9, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(10, this.addSlotToContainer(new Slot(internal, 10, 6, 28) {
				@Override
				public ItemStack onTake(EntityPlayer entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(10, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(11, this.addSlotToContainer(new Slot(internal, 11, 24, 28) {
				@Override
				public ItemStack onTake(EntityPlayer entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(11, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(12, this.addSlotToContainer(new Slot(internal, 12, 42, 28) {
				@Override
				public ItemStack onTake(EntityPlayer entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(12, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(13, this.addSlotToContainer(new Slot(internal, 13, 60, 28) {
				@Override
				public ItemStack onTake(EntityPlayer entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(13, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(14, this.addSlotToContainer(new Slot(internal, 14, 78, 28) {
				@Override
				public ItemStack onTake(EntityPlayer entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(14, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(15, this.addSlotToContainer(new Slot(internal, 15, 96, 28) {
				@Override
				public ItemStack onTake(EntityPlayer entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(15, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(16, this.addSlotToContainer(new Slot(internal, 16, 114, 28) {
				@Override
				public ItemStack onTake(EntityPlayer entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(16, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(17, this.addSlotToContainer(new Slot(internal, 17, 132, 28) {
				@Override
				public ItemStack onTake(EntityPlayer entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(17, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(18, this.addSlotToContainer(new Slot(internal, 18, 150, 28) {
				@Override
				public ItemStack onTake(EntityPlayer entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(18, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(19, this.addSlotToContainer(new Slot(internal, 19, 6, 46) {
				@Override
				public ItemStack onTake(EntityPlayer entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(19, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(20, this.addSlotToContainer(new Slot(internal, 20, 24, 46) {
				@Override
				public ItemStack onTake(EntityPlayer entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(20, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(21, this.addSlotToContainer(new Slot(internal, 21, 42, 46) {
				@Override
				public ItemStack onTake(EntityPlayer entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(21, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(22, this.addSlotToContainer(new Slot(internal, 22, 60, 46) {
				@Override
				public ItemStack onTake(EntityPlayer entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(22, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(23, this.addSlotToContainer(new Slot(internal, 23, 78, 46) {
				@Override
				public ItemStack onTake(EntityPlayer entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(23, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(24, this.addSlotToContainer(new Slot(internal, 24, 96, 46) {
				@Override
				public ItemStack onTake(EntityPlayer entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(24, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(25, this.addSlotToContainer(new Slot(internal, 25, 114, 46) {
				@Override
				public ItemStack onTake(EntityPlayer entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(25, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(26, this.addSlotToContainer(new Slot(internal, 26, 132, 46) {
				@Override
				public ItemStack onTake(EntityPlayer entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(26, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(27, this.addSlotToContainer(new Slot(internal, 27, 150, 46) {
				@Override
				public ItemStack onTake(EntityPlayer entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(27, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(28, this.addSlotToContainer(new Slot(internal, 28, 6, 64) {
				@Override
				public ItemStack onTake(EntityPlayer entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(28, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(29, this.addSlotToContainer(new Slot(internal, 29, 24, 64) {
				@Override
				public ItemStack onTake(EntityPlayer entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(29, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(30, this.addSlotToContainer(new Slot(internal, 30, 42, 64) {
				@Override
				public ItemStack onTake(EntityPlayer entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(30, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(31, this.addSlotToContainer(new Slot(internal, 31, 60, 64) {
				@Override
				public ItemStack onTake(EntityPlayer entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(31, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(32, this.addSlotToContainer(new Slot(internal, 32, 78, 64) {
				@Override
				public ItemStack onTake(EntityPlayer entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(32, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(33, this.addSlotToContainer(new Slot(internal, 33, 96, 64) {
				@Override
				public ItemStack onTake(EntityPlayer entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(33, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(34, this.addSlotToContainer(new Slot(internal, 34, 114, 64) {
				@Override
				public ItemStack onTake(EntityPlayer entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(34, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(35, this.addSlotToContainer(new Slot(internal, 35, 132, 64) {
				@Override
				public ItemStack onTake(EntityPlayer entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(35, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(36, this.addSlotToContainer(new Slot(internal, 36, 150, 64) {
				@Override
				public ItemStack onTake(EntityPlayer entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(36, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(0, this.addSlotToContainer(new Slot(internal, 0, 192, 26) {
				@Override
				public ItemStack onTake(EntityPlayer entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(0, 1, 0);
					return retval;
				}
			}));
			int si;
			int sj;
			for (si = 0; si < 3; ++si)
				for (sj = 0; sj < 9; ++sj)
					this.addSlotToContainer(new Slot(player.inventory, sj + (si + 1) * 9, -2 + 8 + sj * 18, 2 + 84 + si * 18));
			for (si = 0; si < 9; ++si)
				this.addSlotToContainer(new Slot(player.inventory, si, -2 + 8 + si * 18, 2 + 142));
		}

		public Map<Integer, Slot> get() {
			return customSlots;
		}

		@Override
		public boolean canInteractWith(EntityPlayer player) {
			return internal.isUsableByPlayer(player);
		}

		@Override
		public ItemStack transferStackInSlot(EntityPlayer playerIn, int index) {
			ItemStack itemstack = ItemStack.EMPTY;
			Slot slot = (Slot) this.inventorySlots.get(index);
			if (slot != null && slot.getHasStack()) {
				ItemStack itemstack1 = slot.getStack();
				itemstack = itemstack1.copy();
				if (index < 37) {
					if (!this.mergeItemStack(itemstack1, 37, this.inventorySlots.size(), true)) {
						return ItemStack.EMPTY;
					}
					slot.onSlotChange(itemstack1, itemstack);
				} else if (!this.mergeItemStack(itemstack1, 0, 37, false)) {
					if (index < 37 + 27) {
						if (!this.mergeItemStack(itemstack1, 37 + 27, this.inventorySlots.size(), true)) {
							return ItemStack.EMPTY;
						}
					} else {
						if (!this.mergeItemStack(itemstack1, 37, 37 + 27, false)) {
							return ItemStack.EMPTY;
						}
					}
					return ItemStack.EMPTY;
				}
				if (itemstack1.getCount() == 0) {
					slot.putStack(ItemStack.EMPTY);
				} else {
					slot.onSlotChanged();
				}
				if (itemstack1.getCount() == itemstack.getCount()) {
					return ItemStack.EMPTY;
				}
				slot.onTake(playerIn, itemstack1);
			}
			return itemstack;
		}

		@Override
		protected boolean mergeItemStack(ItemStack stack, int startIndex, int endIndex, boolean reverseDirection) {
			boolean flag = false;
			int i = startIndex;
			if (reverseDirection) {
				i = endIndex - 1;
			}
			if (stack.isStackable()) {
				while (!stack.isEmpty()) {
					if (reverseDirection) {
						if (i < startIndex) {
							break;
						}
					} else if (i >= endIndex) {
						break;
					}
					Slot slot = this.inventorySlots.get(i);
					ItemStack itemstack = slot.getStack();
					if (slot.isItemValid(itemstack) && !itemstack.isEmpty() && itemstack.getItem() == stack.getItem()
							&& (!stack.getHasSubtypes() || stack.getMetadata() == itemstack.getMetadata())
							&& ItemStack.areItemStackTagsEqual(stack, itemstack)) {
						int j = itemstack.getCount() + stack.getCount();
						int maxSize = Math.min(slot.getSlotStackLimit(), stack.getMaxStackSize());
						if (j <= maxSize) {
							stack.setCount(0);
							itemstack.setCount(j);
							slot.putStack(itemstack);
							flag = true;
						} else if (itemstack.getCount() < maxSize) {
							stack.shrink(maxSize - itemstack.getCount());
							itemstack.setCount(maxSize);
							slot.putStack(itemstack);
							flag = true;
						}
					}
					if (reverseDirection) {
						--i;
					} else {
						++i;
					}
				}
			}
			if (!stack.isEmpty()) {
				if (reverseDirection) {
					i = endIndex - 1;
				} else {
					i = startIndex;
				}
				while (true) {
					if (reverseDirection) {
						if (i < startIndex) {
							break;
						}
					} else if (i >= endIndex) {
						break;
					}
					Slot slot1 = this.inventorySlots.get(i);
					ItemStack itemstack1 = slot1.getStack();
					if (itemstack1.isEmpty() && slot1.isItemValid(stack)) {
						if (stack.getCount() > slot1.getSlotStackLimit()) {
							slot1.putStack(stack.splitStack(slot1.getSlotStackLimit()));
						} else {
							slot1.putStack(stack.splitStack(stack.getCount()));
						}
						slot1.onSlotChanged();
						flag = true;
						break;
					}
					if (reverseDirection) {
						--i;
					} else {
						++i;
					}
				}
			}
			return flag;
		}

		@Override
		public void onContainerClosed(EntityPlayer playerIn) {
			super.onContainerClosed(playerIn);
			if ((internal instanceof InventoryBasic) && (playerIn instanceof EntityPlayerMP)) {
				this.clearContainer(playerIn, playerIn.world, internal);
			}
		}

		private void slotChanged(int slotid, int ctype, int meta) {
			if (this.world != null && this.world.isRemote) {
				HldecoratedMod.PACKET_HANDLER.sendToServer(new GUISlotChangedMessage(slotid, x, y, z, ctype, meta));
				handleSlotAction(entity, slotid, ctype, meta, x, y, z);
			}
		}
	}

	public static class GuiWindow extends GuiContainer {
		private World world;
		private int x, y, z;
		private EntityPlayer entity;
		public GuiWindow(World world, int x, int y, int z, EntityPlayer entity) {
			super(new GuiContainerMod(world, x, y, z, entity));
			this.world = world;
			this.x = x;
			this.y = y;
			this.z = z;
			this.entity = entity;
			this.xSize = 240;
			this.ySize = 166;
		}
		private static final ResourceLocation texture = new ResourceLocation("hldecorated:textures/gui_log.png");
		@Override
		public void drawScreen(int mouseX, int mouseY, float partialTicks) {
			this.drawDefaultBackground();
			super.drawScreen(mouseX, mouseY, partialTicks);
			this.renderHoveredToolTip(mouseX, mouseY);
		}

		@Override
		protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3) {
			GL11.glColor4f(1, 1, 1, 1);
			this.mc.renderEngine.bindTexture(texture);
			int k = (this.width - this.xSize) / 2;
			int l = (this.height - this.ySize) / 2;
			this.drawModalRectWithCustomSizedTexture(k, l, 0, 0, this.xSize, this.ySize, this.xSize, this.ySize);
			zLevel = 100.0F;
		}

		@Override
		public void updateScreen() {
			super.updateScreen();
		}

		@Override
		protected void mouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException {
			super.mouseClicked(mouseX, mouseY, mouseButton);
		}

		@Override
		protected void keyTyped(char typedChar, int keyCode) throws IOException {
			super.keyTyped(typedChar, keyCode);
		}

		@Override
		protected void drawGuiContainerForegroundLayer(int par1, int par2) {
		}

		@Override
		public void onGuiClosed() {
			super.onGuiClosed();
			Keyboard.enableRepeatEvents(false);
		}

		@Override
		public void initGui() {
			super.initGui();
			this.guiLeft = (this.width - 240) / 2;
			this.guiTop = (this.height - 166) / 2;
			Keyboard.enableRepeatEvents(true);
			this.buttonList.clear();
			this.buttonList.add(new GuiButton(0, this.guiLeft + 177, this.guiTop + 58, 45, 20, "Shak"));
		}

		@Override
		protected void actionPerformed(GuiButton button) {
			HldecoratedMod.PACKET_HANDLER.sendToServer(new GUIButtonPressedMessage(button.id, x, y, z));
			handleButtonAction(entity, button.id, x, y, z);
		}

		@Override
		public boolean doesGuiPauseGame() {
			return false;
		}
	}

	public static class GUIButtonPressedMessageHandler implements IMessageHandler<GUIButtonPressedMessage, IMessage> {
		@Override
		public IMessage onMessage(GUIButtonPressedMessage message, MessageContext context) {
			EntityPlayerMP entity = context.getServerHandler().player;
			entity.getServerWorld().addScheduledTask(() -> {
				int buttonID = message.buttonID;
				int x = message.x;
				int y = message.y;
				int z = message.z;
				handleButtonAction(entity, buttonID, x, y, z);
			});
			return null;
		}
	}

	public static class GUISlotChangedMessageHandler implements IMessageHandler<GUISlotChangedMessage, IMessage> {
		@Override
		public IMessage onMessage(GUISlotChangedMessage message, MessageContext context) {
			EntityPlayerMP entity = context.getServerHandler().player;
			entity.getServerWorld().addScheduledTask(() -> {
				int slotID = message.slotID;
				int changeType = message.changeType;
				int meta = message.meta;
				int x = message.x;
				int y = message.y;
				int z = message.z;
				handleSlotAction(entity, slotID, changeType, meta, x, y, z);
			});
			return null;
		}
	}

	public static class GUIButtonPressedMessage implements IMessage {
		int buttonID, x, y, z;
		public GUIButtonPressedMessage() {
		}

		public GUIButtonPressedMessage(int buttonID, int x, int y, int z) {
			this.buttonID = buttonID;
			this.x = x;
			this.y = y;
			this.z = z;
		}

		@Override
		public void toBytes(io.netty.buffer.ByteBuf buf) {
			buf.writeInt(buttonID);
			buf.writeInt(x);
			buf.writeInt(y);
			buf.writeInt(z);
		}

		@Override
		public void fromBytes(io.netty.buffer.ByteBuf buf) {
			buttonID = buf.readInt();
			x = buf.readInt();
			y = buf.readInt();
			z = buf.readInt();
		}
	}

	public static class GUISlotChangedMessage implements IMessage {
		int slotID, x, y, z, changeType, meta;
		public GUISlotChangedMessage() {
		}

		public GUISlotChangedMessage(int slotID, int x, int y, int z, int changeType, int meta) {
			this.slotID = slotID;
			this.x = x;
			this.y = y;
			this.z = z;
			this.changeType = changeType;
			this.meta = meta;
		}

		@Override
		public void toBytes(io.netty.buffer.ByteBuf buf) {
			buf.writeInt(slotID);
			buf.writeInt(x);
			buf.writeInt(y);
			buf.writeInt(z);
			buf.writeInt(changeType);
			buf.writeInt(meta);
		}

		@Override
		public void fromBytes(io.netty.buffer.ByteBuf buf) {
			slotID = buf.readInt();
			x = buf.readInt();
			y = buf.readInt();
			z = buf.readInt();
			changeType = buf.readInt();
			meta = buf.readInt();
		}
	}
	private static void handleButtonAction(EntityPlayer entity, int buttonID, int x, int y, int z) {
		World world = entity.world;
		// security measure to prevent arbitrary chunk generation
		if (!world.isBlockLoaded(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				ProcedureLogMain2.executeProcedure($_dependencies);
			}
		}
	}

	private static void handleSlotAction(EntityPlayer entity, int slotID, int changeType, int meta, int x, int y, int z) {
		World world = entity.world;
		// security measure to prevent arbitrary chunk generation
		if (!world.isBlockLoaded(new BlockPos(x, y, z)))
			return;
		if (slotID == 1 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				ProcedureSlot1.executeProcedure($_dependencies);
			}
		}
		if (slotID == 2 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				ProcedureSlot2.executeProcedure($_dependencies);
			}
		}
		if (slotID == 3 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				ProcedureSlot3.executeProcedure($_dependencies);
			}
		}
		if (slotID == 4 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				ProcedureSlot4.executeProcedure($_dependencies);
			}
		}
		if (slotID == 5 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				ProcedureSlot5.executeProcedure($_dependencies);
			}
		}
		if (slotID == 6 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				ProcedureSlot6.executeProcedure($_dependencies);
			}
		}
		if (slotID == 7 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				ProcedureSlot7.executeProcedure($_dependencies);
			}
		}
		if (slotID == 8 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				ProcedureSlot8.executeProcedure($_dependencies);
			}
		}
		if (slotID == 9 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				ProcedureSlot9.executeProcedure($_dependencies);
			}
		}
		if (slotID == 10 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				ProcedureSlot10.executeProcedure($_dependencies);
			}
		}
		if (slotID == 11 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				ProcedureSlot11.executeProcedure($_dependencies);
			}
		}
		if (slotID == 12 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				ProcedureSlot12.executeProcedure($_dependencies);
			}
		}
		if (slotID == 13 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				ProcedureSlot13.executeProcedure($_dependencies);
			}
		}
		if (slotID == 14 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				ProcedureSlot14.executeProcedure($_dependencies);
			}
		}
		if (slotID == 15 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				ProcedureSlot15.executeProcedure($_dependencies);
			}
		}
		if (slotID == 16 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				ProcedureSlot16.executeProcedure($_dependencies);
			}
		}
		if (slotID == 17 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				ProcedureSlot17.executeProcedure($_dependencies);
			}
		}
		if (slotID == 18 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				ProcedureSlot18.executeProcedure($_dependencies);
			}
		}
		if (slotID == 19 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				ProcedureSlot19.executeProcedure($_dependencies);
			}
		}
		if (slotID == 20 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				ProcedureSlot20.executeProcedure($_dependencies);
			}
		}
		if (slotID == 21 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				ProcedureSlot21.executeProcedure($_dependencies);
			}
		}
		if (slotID == 22 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				ProcedureSlot22.executeProcedure($_dependencies);
			}
		}
		if (slotID == 23 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				ProcedureSlot23.executeProcedure($_dependencies);
			}
		}
		if (slotID == 24 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				ProcedureSlot24.executeProcedure($_dependencies);
			}
		}
		if (slotID == 25 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				ProcedureSlot25.executeProcedure($_dependencies);
			}
		}
		if (slotID == 26 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				ProcedureSlot26.executeProcedure($_dependencies);
			}
		}
		if (slotID == 27 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				ProcedureSlot27.executeProcedure($_dependencies);
			}
		}
		if (slotID == 28 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				ProcedureSlot28.executeProcedure($_dependencies);
			}
		}
		if (slotID == 29 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				ProcedureSlot29.executeProcedure($_dependencies);
			}
		}
		if (slotID == 30 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				ProcedureSlot30.executeProcedure($_dependencies);
			}
		}
		if (slotID == 31 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				ProcedureSlot31.executeProcedure($_dependencies);
			}
		}
		if (slotID == 32 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				ProcedureSlot32.executeProcedure($_dependencies);
			}
		}
		if (slotID == 33 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				ProcedureSlot33.executeProcedure($_dependencies);
			}
		}
		if (slotID == 34 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				ProcedureSlot34.executeProcedure($_dependencies);
			}
		}
		if (slotID == 35 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				ProcedureSlot35.executeProcedure($_dependencies);
			}
		}
		if (slotID == 36 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				ProcedureSlot36.executeProcedure($_dependencies);
			}
		}
		if (slotID == 0 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				ProcedureSlot0Rem.executeProcedure($_dependencies);
			}
		}
	}
}
