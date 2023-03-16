package com.jjwngamer.sharpnessremovesv;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemHeldEvent;

public class heldItemListener implements Listener {
    @EventHandler
    public void heldItem(PlayerItemHeldEvent e){
        if(e.getPlayer().getInventory().getItemInMainHand().getType() == Material.DIAMOND_AXE || e.getPlayer().getInventory().getItemInMainHand().getType() == Material.IRON_AXE || e.getPlayer().getInventory().getItemInMainHand().getType() == Material.STONE_AXE || e.getPlayer().getInventory().getItemInMainHand().getType() == Material.WOOD_AXE){
            if(e.getPlayer().getInventory().getItemInMainHand().containsEnchantment(Enchantment.DAMAGE_ALL)){
                e.getPlayer().getInventory().getItemInMainHand().removeEnchantment(Enchantment.DAMAGE_ALL);
                e.getPlayer().updateInventory();
            }
        }
    }
}
