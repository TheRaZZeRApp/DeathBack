package com.therazzerapp.deathback;

import com.therazzerapp.deathback.commands.Back;
import net.canarymod.chat.MessageReceiver;
import net.canarymod.commandsys.Command;
import net.canarymod.commandsys.CommandListener;

/**
 * Project: Template
 * User: Pual
 * Date: 21/03/2015
 * Time: 00:48 PM
 * Package: com.therazzerapp.deathback.RENAME
 * E-Mail: rezzer101@googlemail.com
 */

public class CommandList implements CommandListener{

    static final DeathBackCommand[] cmds = new DeathBackCommand[1];

    static {
        cmds[0] = new Back();
    }

    @Command(aliases = {"back"},
            description = "Teleports you back to your death position.",
            permissions = {"deathback.command.back"},
            toolTip = "/back",
            max = 1
    )
    public void commandBack(MessageReceiver caller, String[] args){
        cmds[0].run(caller,args);
    }
}
