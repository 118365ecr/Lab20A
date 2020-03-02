//Name: Dominic Feliton
//Date: 3/2/20
//Per: 2
//AP Comp Sci

public class TwentyOneCard extends Card
{
	public TwentyOneCard(String s, int f) 
	{
		super(s, f);
	}
	
	public int getValue()
	{
		if(getFace() > 10)
		{
			setFace(10);
		}
		else if (getFace() == 1)
		{
			setFace(11);
		}
		return getFace();
	}
	
	public String toString()
	{
		return FACES[getFace()] + " of " + getSuit() + " " + getValue();
	}
}
