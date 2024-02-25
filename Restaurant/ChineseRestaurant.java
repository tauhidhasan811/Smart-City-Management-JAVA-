package Restaurant;

public class ChineseRestaurant implements RestaurantOperation
{
	private String Rname;
	private String Rid;
	private String Rlocation;
	
	public ChineseRestaurant()
	{
	}
	public ChineseRestaurant(String Rname,String Rid,String Rlocation)
	{
		this.Rname=Rname;
		this.Rid=Rid;
		this.Rlocation=Rlocation;
	}
	
	public void setRName(String Rname)
	{
		this.Rname=Rname;
	}
	public void setRID(String Rid)
	{
		this.Rid=Rid;
	}
	public void setRLocation(String Rlocation)
	{
		this.Rlocation=Rlocation;
	}
	public String getRName()
	{
		return Rname;
	}
	public String getRID()
	{
		return Rid;
	}
	public String getRLocation()
	{
		return Rlocation;
	}
	public void showInfo()
	{
		System.out.println("Resturent Name is     : "+Rname);
		System.out.println("Resturent Rating is   : "+Rid);
		System.out.println("Resturent Location is : "+Rlocation);
	}
	
}

	