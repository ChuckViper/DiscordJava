Main
House all functions so that they are available for the bot to use, as well as hold the structure that the bot runs off of

calcLPCommand

This command runs off of a data analysis that I made on the MMR - ELO ranking system on League of Legends. I've played this game for 
8 years and after comparing a couple different graphs I ended up coming together to make this.
https://www.desmos.com/calculator/xs6borykqb
Now the way this works is that you have a trust factor to the ranking system, going on a win streak doesnt necessarily mean
you will get more points, because they cant reliably say you wont go on a losing streak right afterwards.
Therefore, as you win more games therefore increasing your net games won, your LP possible to gain grows by each 1 pi range you move between
The program does a reudamentary calculation towards this, and takes the users games played + win percentage to calculate the range 
of lp you should be getting within a pi range of where your net wins is on the graph.

coinflip

uses random number generator with modulus of 2 to make a 50 50 chance of being 0 or some other number, hence heads or tails.

horse race

initialize an array of horses, continuously use a while loop with nested for loops to use the exact same 50/50 chance 
as coin flip to see if horses move forward while simultaneously checking to see if any of the horses are equal to 15 positions.

yay or nay

use a random number generator that generates numbers between 0-11 that has 10 choices 1-10 that post a topic of debate
then, hold posting that top and put it in queue and use lambda operators to react to the message twice as its posted so that 
members of the server can vote

todo

tells lazy students to do their schoolwork

quote of the day

is daily updated by me to have an inspirational quote that calls out the person looking for it 

telephone 

prompt the user who types the command for telephone into the bar by having the bot send them a personalized message with the
discord tag of the person they should pass it along to. this requires finding the unique discord tag of the person beforehand.


