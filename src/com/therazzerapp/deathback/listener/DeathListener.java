package com.therazzerapp.deathback.listener;

import net.canarymod.api.entity.living.humanoid.Player;
import net.canarymod.api.world.position.Location;
import net.canarymod.hook.HookHandler;
import net.canarymod.hook.player.PlayerDeathHook;
import net.canarymod.plugin.PluginListener;

import java.util.HashMap;
import java.util.Map;

/**
 * <description>
 *
 * @author The RaZZeR App <rezzer101@googlemail.com; e-mail@therazzerapp.com>
 */
public class DeathListener implements PluginListener{

    private static Map<Player,Location> deathLocation = new HashMap<>();

    @HookHandler
    public void onDeath(PlayerDeathHook hook){
        Player player = hook.getPlayer();
        deathLocation.put(player,player.getLocation());
    }

    public static Location getDeathLocation(Player player){
        return deathLocation.get(player);
    }
}
