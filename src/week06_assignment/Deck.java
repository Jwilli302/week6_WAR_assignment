package week06_assignment;

import java.util.ArrayList;
import java.util.Random;


public class Deck
{
private ArrayList<card> cards;

public Deck()
{
String Rank[] = {"TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "Jack", "Queen", "King", "Ace"};
String Suit[] = {"Club", "Diamond", "Heart", "Spade"};
cards = new ArrayList<>();
for(int i=0; i<4; i++)
{
for(int j=0; j<13; j++)
{
String name = Rank[j] + " of " + Suit[i];
card theCard = new card(name, j+1);
cards.add(theCard);
}
}
}

public void shuffle()
{
Random rand = new Random();
for(int i=1; i<52; i++)
{
int j = rand.nextInt(52-i) + i;
card tmp = cards.get(i-1);
cards.set(i-1, cards.get(j));
cards.set(j, tmp);
}
}


public card draw()
{
card topCard = cards.get(cards.size()-1);

cards.remove(topCard);

return topCard;
}
}