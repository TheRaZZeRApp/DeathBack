package com.therazzerapp.deathback;

import com.therazzerapp.deathback.listener.DeathListener;
import net.canarymod.Canary;
import net.canarymod.commandsys.CommandDependencyException;
import net.canarymod.plugin.Plugin;

/**
 * Project: DeathBack
 * User: Pual
 * Date: 21/03/2015
 * Time: 00:47 PM
 * Package: com.therazzerapp.deathback
 * E-Mail: rezzer101@googlemail.com
 */

public class DeathBack extends Plugin{
    @Override
    public boolean enable() {
        try {
            Canary.commands().registerCommands(new CommandList(),this,false);
        } catch (CommandDependencyException e) {
            e.printStackTrace();
        }

        registerListener(new DeathListener());
        return true;
    }

    @Override
    public void disable() {

    }
}
