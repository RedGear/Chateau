package enosphorous.chateau_romani.handlers;

import enosphorous.chateau_romani.common.Items;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.EntityInteractEvent;

public class InteractionHandler
{
@ForgeSubscribe
public void onEntityInteract(EntityInteractEvent event)
{
if (event.entity instanceof EntityPlayer)
{
EntityPlayer player = (EntityPlayer) event.entity;
if (event.target != null && event.target instanceof EntityCow && player.getHeldItem() != null && player.getHeldItem().itemID == Item.glassBottle.itemID)
{
    if (player.getHeldItem().stackSize-- == 1)
    {
        player.inventory.setInventorySlotContents(player.inventory.currentItem, new ItemStack(Items.milk_bottle));
    }
}
}
}
}