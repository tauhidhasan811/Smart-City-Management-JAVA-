package Service;

public class FireBrigade extends Service
{
	protected String location;
	protected String contract;
	protected String id;
	
	//Constructor
	public FireBrigade()
	{
		
	}
	public FireBrigade(String location,String contract)
	{
		this.location=location;
		this.contract=contract;
		this.id=id;
	}
	
	//encapsulation
	public void setLocation(String location)
	{
		this.location=location;
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
	public void setId(String id)
	{
		this.id=id;
	}
	public String getId()
	{
		return id;
	}
	
	
	
}
	