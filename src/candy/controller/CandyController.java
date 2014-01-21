package candy.controller;
import candy.model.AwesomeCandyVillain;

public class CandyController
{
	private AwesomeCandyVillain myCandyVillain;
	public void start()
	{
		makeVillain();
	}
	
	private void makeVillain()
	{
		myCandyVillain = new AwesomeCandyVillain(4, 6, 3, "PoopSlinger", false);
	}
	
	
}
