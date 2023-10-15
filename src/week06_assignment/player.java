package week06_assignment;

import java.util.ArrayList;


public class player
{
private ArrayList<card> hand;
private int score;
private String name;

public player(String name)
{
this.name = name;
hand = new ArrayList<>();
score = 0;
}

public String getName()
{
return name;
}

public int getScore()
{
return score;
}

public void describe()
{
System.out.println ("PLAYER NAME: " + name);
for(int i=0; i<hand.size(); i++)
{
hand.get(i).describe();
}
}

public card flip()
{
card firstCard = hand.get(hand.size()-1);

hand.remove(firstCard);

return firstCard;
}


public void draw(Deck deck)
{
card card = deck.draw();
hand.add(card);
}

public void increment()
{
score = score + 1;
}
}