package me.danielhancock.finalbot.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;

public class quoteOfTheDayCommand extends Command {

    public quoteOfTheDayCommand(){
        super.name = "qotd";
        super.cooldown = 30;
    }

    protected void execute(CommandEvent event) {
        event.reply("Do. Or Do Not. There is no try. Quit Slacking " + event.getMember().getAsMention() + ". There are no shortcuts. -Yoda");
    }
}
