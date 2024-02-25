package Restaurant;

public class LocalRestaurant extends ItalianRestaurant
{
	public LocalRestaurant()
	{
	}
	
	public LocalRestaurant(String Rname,String Rid,String Rlocation)
	{
		super(Rname,Rid,Rlocation);
	}
	
	public void showInfo()
	{
		super.showInfo();
	}
}