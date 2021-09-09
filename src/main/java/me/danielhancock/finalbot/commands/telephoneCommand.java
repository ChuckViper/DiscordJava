package me.danielhancock.finalbot.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;

public class telephoneCommand extends Command {

    public telephoneCommand(){
        super.name = "telephone";
        super.cooldown = 60;
    }

    protected void execute(CommandEvent event) {
        String victim = event.getGuild().getOwnerId();
        event.replyInDm("Working on the rollercoaster is a hard job. Send this to " + victim );
    }
}
