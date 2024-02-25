package Service;
public class PoliceStation extends Service
{

	protected String location;
	protected String contract;
	protected String id;
	
	//Constructor
	public PoliceStation(String location,String contract,String id)
	{
		this.location=location;
		this.contract=contract;
		this.id=id;
	}
	
	public PoliceStation()
	{
		
	}
	
	//encapsulation
	public void setLocation(String location)
	{
		this.location=location;
	}
	public void setId(String id)
	{
		this.id=id;
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
	public String getId()
	{
		return id;
	}

}