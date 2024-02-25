package Service;
public class Medical extends Service
{
	protected String location;
	protected String contract;
	protected int bed;
	protected String name;
	protected String mid;
	protected String hname;
	protected String hlocation;
	protected int availableBeds;
	protected int totalbed;
	
	//Constructor
	public Medical(String location,String name,String contract)
	{
		this.location=location;
		this.contract=contract;
		this.name=name;
		
	}
	public Medical()
	{
		
	}
	
	//encapsulation
	public void setTotalbed(int totalbed)
	{
		this.totalbed=totalbed;
	}
	public void setAvailableBeds(int availableBeds)
	{
		this.availableBeds=availableBeds;
	}
	public void setHname(String hname)
	{
		this.hname=hname;
	}
	public void setHlocation(String hlocation)
	{
		this.hlocation=hlocation;
	}
	public void setLocation(String loc)
	{
		this.location=location;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setid(String mid)
	{
		this.mid=mid;
	}
	
	public void setContract(String contract)
	{
		this.contract=contract;
	}
	public String getLocation()
	{
		return location;
	}
	public String getContract()
	{
		return contract;
	}
	public String getmid()
	{
		return mid;
	}
	public String getName()
	{
		return name;
	}
	public String getHname()
	{
		return hname;
	}
	public String getHlocation()
	{
		return hlocation;
	}
	public int getTotalbed()
	{
		return totalbed;
	}
	public int getAvailableBeds()
	{
		return availableBeds;
	}
		
}
