package me.rickylafleur.lecterncrashpatch;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryAction;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class LecternCrashPatch extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onLecternCrashAttempt(InventoryClickEvent e) {
        if (e.getAction() == InventoryAction.MOVE_TO_OTHER_INVENTORY && e.getCursor().getType() == Material.AIR && e.getView().getTitle().equals("Lectern") && e.getClick().toString().equals("SHIFT_LEFT") && e.getHotbarButton() == -1) {
            e.setCancelled(true);
        }
    }
}
