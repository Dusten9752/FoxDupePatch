package org.dusten.foxdupepatch;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Fox;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPickupItemEvent;

public class FoxPickupListener implements Listener {
    @EventHandler
    public void onEntityPickupItem(EntityPickupItemEvent event) {
        Entity entity = event.getEntity();

        if (entity instanceof Fox) {
            event.setCancelled(true);
        }
    }
}