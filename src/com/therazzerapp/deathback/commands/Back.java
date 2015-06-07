package com.therazzerapp.deathback.commands;

import com.therazzerapp.deathback.DeathBackCommand;
import com.therazzerapp.deathback.listener.DeathListener;
import net.canarymod.api.entity.living.humanoid.Player;
import net.canarymod.chat.MessageReceiver;

/**
 * <description>
 *
 * @author The RaZZeR App <rezzer101@googlemail.com; e-mail@therazzerapp.com>
 */
public class Back implements DeathBackCommand{

    @Override
    public void run(MessageReceiver caller, String[] args) {
        if(caller instanceof Player){
            Player player = caller.asPlayer();

            try{
                player.teleportTo(DeathListener.getDeathLocation(player));
                player.message("Woosh!");
            } catch (NullPointerException ex){
                player.message("There is no death position!");
            }
        }
    }

}
