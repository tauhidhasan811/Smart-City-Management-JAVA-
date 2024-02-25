 package Restaurant;

public class Restaurant
{
	private ChineseRestaurant chineseRestaurants[]=new ChineseRestaurant[100];
	private ItalianRestaurant italianRestaurants[]=new ItalianRestaurant[100];
	private LocalRestaurant localRestaurants[]=new LocalRestaurant[100];
	
	public Restaurant()
	{
	}
	public boolean insertChineseRestaurant(ChineseRestaurant cr)
	{
		for(int i=0;i<=chineseRestaurants.length;i++)
		{
			if(chineseRestaurants[i]==null)
			{
				chineseRestaurants[i]=cr;
				return true;
			}
		}
		return false;
	}
	
	public boolean insertItalianRestaurant(ItalianRestaurant ir)
	{
		for(int i=0;i<=italianRestaurants.length;i++)
		{
			if(italianRestaurants[i]==null)
			{
				italianRestaurants[i]=ir;
				return true;
			}
		}
		return false;
	}
	
	public boolean insertLocalRestaurant(LocalRestaurant lr)
	{
		for(int i=0;i<=localRestaurants.length;i++)
		{
			if(localRestaurants[i]==null)
			{
				localRestaurants[i]=lr;
				return true;
			}
		}
		return false;
	}
	public boolean removeChineseRestaurant(ChineseRestaurant cr)
	{
		for(int i=0;i<chineseRestaurants.length;i++)
		{
			if(chineseRestaurants[i]==cr)
			{
				chineseRestaurants[i]=null;
				return true; 
			}
		}
		return false;
	}
	public boolean removeItalianRestaurant(ItalianRestaurant ir)
	{
		for(int i=0;i<italianRestaurants.length;i++)
		{
			if(italianRestaurants[i]==ir)
			{
				italianRestaurants[i]=null;
				return true; 
			}
		}
		return false;
	}
	public boolean removeLocalRestaurant(LocalRestaurant lr)
	{
		for(int i=0;i<localRestaurants.length;i++)
		{
			if(localRestaurants[i]==lr)
			{
				localRestaurants[i]=null;
				return true; 
			}
		}
		return false;
	} 
	public ChineseRestaurant searchChineseRestaurant(String rid)
	{
		ChineseRestaurant cr = null;
		
		for(int i=0; i<chineseRestaurants.length; i++)
		{
			if(chineseRestaurants[i] != null)
			{
				if(chineseRestaurants[i].getRID().equals(rid))
				{
					cr = chineseRestaurants[i];
					break;
				}
			}
		}
		return cr;
	}
	public ItalianRestaurant searchItalianRestaurant(String rid)
	{
		ItalianRestaurant ir = null;
		
		for(int i=0; i<italianRestaurants.length; i++)
		{
			if(italianRestaurants[i] != null)
			{
				if(italianRestaurants[i].getRID().equals(rid))
				{
					ir = italianRestaurants[i];
					break;
				}
			}
		}
		return ir;
	}
	public LocalRestaurant searchLocalRestaurant(String rid)
	{
		LocalRestaurant lr = null;
		
		for(int i=0; i<localRestaurants.length; i++)
		{
			if(localRestaurants[i] != null)
			{
				if(localRestaurants[i].getRID().equals(rid))
				{
					lr = localRestaurants[i];
					break;
				}
			}
		}
		return lr;
	}
	public void showAllChineseRestaurant()
	{
		for(int i = 0; i<chineseRestaurants.length; i++)
		{
			if(chineseRestaurants[i]!=null)
			{
				System.out.println("---------------------------------------------");
				chineseRestaurants[i].showInfo();
				System.out.println("---------------------------------------------");
			}
		}
	}
	public void showAllItalianRestaurant()
	{
		for(int i = 0; i<italianRestaurants.length; i++)
		{
			if(italianRestaurants[i]!=null)
			{
				System.out.println("---------------------------------------------");
				System.out.println("Resturent Name is     : "+italianRestaurants[i].getRName());
		        System.out.println("Resturent Rating is   : "+italianRestaurants[i].getRID());
		        System.out.println("Resturent Location is : "+italianRestaurants[i].getRLocation());
				System.out.println("---------------------------------------------");
			}
		}
	}
	public void showAllLocalRestaurant()
	{
		for(int i = 0; i<localRestaurants.length; i++)
		{
			if(localRestaurants[i]!=null)
			{
				System.out.println("---------------------------------------------");
				//localRestaurants[i].showInfo();
				System.out.println("---------------------------------------------");
			}
		}
	}
}
	
	
	