package me.danielhancock.finalbot.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;

public class PingCommand extends Command {

    public PingCommand(){
        super.name = "ping";
        super.cooldown = 30;

    }

    protected void execute(CommandEvent event) {
        event.reply("My ping is " + event.getJDA().getGatewayPing() + "ms, thanks for asking!");
    }
}
