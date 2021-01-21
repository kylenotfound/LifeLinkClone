package com.spacelampsix.LifeLink;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.PlayerDeathEvent;

import java.util.Random;

public class DeathListeners implements Listener {

    private final double NO_HEALTH = 0.0;

    @EventHandler
    public void deathCheck(EntityDamageEvent event){
        Random random = new Random();
        int num = random.nextInt(2);

        if (event.getEntity() instanceof Player) {
            Player player = (Player) event.getEntity();
            if (event.getDamage() >= player.getHealth()) {
                for (Player steve : Bukkit.getOnlinePlayers()) {
                    steve.setHealth(NO_HEALTH);
                }
                switch (num) {
                    case 0:
                        Bukkit.broadcastMessage(ChatColor.YELLOW + event.getEntity().getName() +
                                " died and ruined it for everyone!");
                        break;
                    case 1:
                        Bukkit.broadcastMessage(ChatColor.YELLOW + event.getEntity().getName() +
                                " fucking ripped POG!");
                        break;
                    case 2:
                        Bukkit.broadcastMessage(ChatColor.YELLOW + event.getEntity().getName() +
                                " ate shit and now you will too!");
                        break;
                }
            }
        }
    }

    @EventHandler
    public void deathMessages(PlayerDeathEvent event) {
        event.setDeathMessage("");
    }

}

