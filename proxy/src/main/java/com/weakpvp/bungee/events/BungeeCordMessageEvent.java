package com.weakpvp.bungee.events;

import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Event;

public class BungeeCordMessageEvent extends Event
{
    private final ProxiedPlayer player;
    private final String messageType;

    public BungeeCordMessageEvent(ProxiedPlayer player, String messageType)
    {
        this.player = player;
        this.messageType = messageType;
    }

    public ProxiedPlayer getPlayer()
    {
        return player;
    }

    public String getMessageType()
    {
        return messageType;
    }
}
