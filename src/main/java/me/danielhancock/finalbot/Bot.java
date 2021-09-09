package me.danielhancock.finalbot;

import com.jagrosh.jdautilities.command.CommandClient;
import com.jagrosh.jdautilities.command.CommandClientBuilder;
import me.danielhancock.finalbot.commands.*;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import javax.security.auth.login.LoginException;

public class Bot {

    private Bot() throws LoginException {
        JDA jda = JDABuilder.createDefault("NzA0NDc5NjA0OTI0MjE5Mzky.XqdzSg.13zGqnB0J-73vo14qNROYS8D9jo").build();
        CommandClientBuilder builder;
        builder = new CommandClientBuilder();
        builder.setPrefix("*");
        builder.setOwnerId("137826631531102208");
        builder.setHelpWord("helpme");
        builder.setActivity(Activity.playing("in a vat of redundancy"));

        CommandClient client = builder.build();
        client.addCommand(new PingCommand());
        client.addCommand(new calcLPCommand());
        client.addCommand(new horseRaceCommand());
        client.addCommand(new coinflipCommand());
        client.addCommand(new yayornayCommand());
        client.addCommand(new telephoneCommand());
        client.addCommand(new todoCommand());
        client.addCommand(new quoteOfTheDayCommand());
        jda.addEventListener(client);

    }

    public static void main(String[] args) throws LoginException {
        new Bot();
    }
}
