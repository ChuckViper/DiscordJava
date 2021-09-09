package me.danielhancock.finalbot.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;

import java.util.Random;

public class coinflipCommand extends Command {

    public coinflipCommand(){
        super.name = "cf";
        super.cooldown = 5;
    }

    protected void execute(CommandEvent event) {
        Random rand = new Random();
        int ht = rand.nextInt(1000) % 2;
        if(ht == 0){
            event.reply("We got... ... ... ... HEADS");
        }
        else {
            event.reply("Towels! I mean... tails!");
        }
    }
}
