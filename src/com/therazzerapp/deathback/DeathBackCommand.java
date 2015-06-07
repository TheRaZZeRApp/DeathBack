package com.therazzerapp.deathback;

import net.canarymod.chat.MessageReceiver;

/**
 * <description>
 *
 * @author The RaZZeR App <rezzer101@googlemail.com; e-mail@therazzerapp.com>
 */
public interface DeathBackCommand {
    void run(MessageReceiver caller, String[] args);
}
