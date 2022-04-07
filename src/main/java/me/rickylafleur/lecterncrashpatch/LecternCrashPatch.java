package me.rickylafleur.lecterncrashpatch;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.plugin.java.JavaPlugin;

public final class LecternCrashPatch extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onLecternCrashAttempt(InventoryClickEvent e) {
        if (e.getInventory().getType() == InventoryType.LECTERN) {
            e.setCancelled(true);
        }
    }
}
