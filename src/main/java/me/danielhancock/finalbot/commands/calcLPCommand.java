package me.danielhancock.finalbot.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;

public class calcLPCommand extends Command {

    public calcLPCommand() {
        super.name = "calcLP";
        super.cooldown = 15;
    }

    protected void execute(CommandEvent event){
        String[] args = event.getMessage().getContentRaw().split("\\s+");
        int gamesPlayed = Integer.parseInt(args[1]);
        double winRate = (Integer.parseInt(args[2]));
        double winRatePercent = (winRate / 100);
        double gamesWon = Math.round(gamesPlayed * winRatePercent);
        event.getChannel().sendTyping();
        double gamesLost = gamesPlayed - gamesWon;
        double netWins = gamesWon - gamesLost;
        double HiLPRangePi = Math.ceil(netWins/Math.PI);
        double LoLPRangePi = Math.floor(netWins/Math.PI);
        double LPHigh = ((16 + (.15 * (HiLPRangePi))) - (1.5 * (Math.cos(HiLPRangePi))));
        LPHigh = Math.round(LPHigh);
        double LPLow = ((16 + (.15 * (LoLPRangePi))) - (1.5 * (Math.cos(LoLPRangePi))));
        LPLow = Math.round(LPLow);
        event.reply("I've done a lot of research into League of Legends,\n" +
                "The Range at which you should be gaining LP right now should be within the range of these two numbers:\n" +
                LPLow + " and " + LPHigh);

    }
}
