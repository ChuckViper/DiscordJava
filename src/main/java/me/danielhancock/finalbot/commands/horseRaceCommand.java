package me.danielhancock.finalbot.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import java.util.Random;

public class horseRaceCommand extends Command {
    public horseRaceCommand(){
        super.name = "horserace";
        super.cooldown = 30;
    }

    protected void execute(CommandEvent event) {
        int horses[] = {0, 0, 0, 0};
        Random rand = new Random();
        boolean keepGoing = true;
        int f = 0;
        while(keepGoing) {
            int c;
            int d;
            int e;
            for(d=0; d<4; d++){
                event.reply(String.valueOf(horses[d]));
            }
            event.reply("Number of Laps: " + f);
            for(c=0; c < 4; c++) {
                if(horses[c] == 15) {
                    keepGoing = false;
                }
            }
            f++;
            int h;
            for(h=0; h < 4; h++){
                if(rand.nextInt(1000) % 2 == 0){
                    horses[h]++;
                }
                if (horses[h] == 15) {
                    h=4;
                }
            }
        }
    }
}
