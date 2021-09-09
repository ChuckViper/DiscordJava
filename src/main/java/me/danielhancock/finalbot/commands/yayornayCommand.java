package me.danielhancock.finalbot.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;

import java.util.Random;

public class yayornayCommand extends Command {

    public yayornayCommand(){
        super.name = "yayornay";
        super.cooldown = 15;
    }

    protected void execute(CommandEvent event) {
        Random rand = new Random();
        int choice = rand.nextInt(10);
        if(choice == 1) {
            event.getChannel().sendMessage("A Hot Dog is a Sandwich.").queue(message -> {
                message.addReaction("❌").queue();
                message.addReaction("✔").queue();
            });
        }
        if(choice == 2) {
            event.getChannel().sendMessage("Water is not wet.").queue(message -> {
                message.addReaction("❌").queue();
                message.addReaction("✔").queue();
            });
        }
        if(choice == 3) {
            event.getChannel().sendMessage("Is the Earth flat.").queue(message -> {
                message.addReaction("❌").queue();
                message.addReaction("✔").queue();
            });
        }
        if(choice == 4) {
            event.getChannel().sendMessage("Government is comprised Lizard People.").queue(message -> {
                message.addReaction("❌").queue();
                message.addReaction("✔").queue();
            });
        }
        if(choice == 5) {
            event.getChannel().sendMessage("Inner Earth exists.").queue(message -> {
                message.addReaction("❌").queue();
                message.addReaction("✔").queue();
            });
        }
        if(choice == 6) {
            event.getChannel().sendMessage("He did have sexual with that woman.").queue(message -> {
                message.addReaction("❌").queue();
                message.addReaction("✔").queue();
            });
        }
        if(choice == 7) {
            event.getChannel().sendMessage("Video Games make you violent.").queue(message -> {
                message.addReaction("❌").queue();
                message.addReaction("✔").queue();
            });
        }
        if(choice == 8) {
            event.getChannel().sendMessage("Multiple Shooters in JFK Assassination.").queue(message -> {
                message.addReaction("❌").queue();
                message.addReaction("✔").queue();
            });
        }
        if(choice == 9) {
            event.getChannel().sendMessage("We're all becoming coding rockstars.").queue(message -> {
                message.addReaction("❌").queue();
                message.addReaction("✔").queue();
            });
        }
        if(choice == 10) {
            event.getChannel().sendMessage("Shrek was political commentary.").queue(message -> {
                message.addReaction("❌").queue();
                message.addReaction("✔").queue();
            });
        }
    }
}
