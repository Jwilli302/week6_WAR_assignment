package week06_assignment;

import java.util.*;

public class app
{
public static void main (String[] args)
{
Deck deck = new Deck();

player firstPlayer = new player("FIRSTPLAYER");

player secondPlayer = new player("SECONDPLAYER");

deck.shuffle();

for(int i=0; i<52; i++)
{
if(i%2==0)
firstPlayer.draw(deck);
else
secondPlayer.draw(deck);
}

for(int i=0; i<26; i++)
{
card firstPlayerCard = firstPlayer.flip();
card secondPlayerCard = secondPlayer.flip();
if(firstPlayerCard.getValue() > secondPlayerCard.getValue())
firstPlayer.increment();
else
secondPlayer.increment();
}

System.out.println ("Score of " + firstPlayer.getName() + ": " + firstPlayer.getScore());
System.out.println ("Score of " + secondPlayer.getName() + ": " + secondPlayer.getScore());

if(firstPlayer.getScore() > secondPlayer.getScore())
System.out.println ("PLAYER 1 YOU WON!");
else if(firstPlayer.getScore() < secondPlayer.getScore())
System.out.println ("PLAYER 2 YOU WON!");
else
System.out.println ("THE GAME IS A DRAW");
}
}