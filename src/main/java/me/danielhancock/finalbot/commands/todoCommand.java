package me.danielhancock.finalbot.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;

public class todoCommand extends Command {

    public todoCommand(){
        super.name = "todo";
        super.cooldown = 15;
    }

    protected void execute(CommandEvent event){
        event.reply("do your freaking homework and study for finals.");
    }
}
