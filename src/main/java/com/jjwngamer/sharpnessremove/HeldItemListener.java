package com.jjwngamer.sharpnessremove;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.inventory.ItemStack;

public class HeldItemListener implements Listener {
    @EventHandler
    public void heldItem(PlayerItemHeldEvent event){
        ItemStack item = event.getPlayer().getInventory().getItemInMainHand();
        if(item.getType() == Material.DIAMOND_AXE || item.getType() == Material.IRON_AXE || item.getType() == Material.STONE_AXE || item.getType() == Material.WOOD_AXE){
            if(item.containsEnchantment(Enchantment.DAMAGE_ALL)){
                item.removeEnchantment(Enchantment.DAMAGE_ALL);
                event.getPlayer().updateInventory();
            }
        }
    }
}
