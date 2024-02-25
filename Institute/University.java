package Institute;

public class University extends InstituteOperation
{
	private String universityName;
	private String universityLocation;
	private double getingJobRate;
	public University()
	{
		
	}
	public University(String universityName,String universityLocation,double getingJobRate )
	{
		super(universityName,universityLocation,getingJobRate);
	}
	
    public void setUniversityName(String universityName)
	{
		this.universityName = universityName;
	}
	public void setUniversityLocation(String universityLocation)
	 {
		this.universityLocation = universityLocation;
	 }
	 
	public void setGetingJobRate(double getingJobRate)
	{
		this.getingJobRate= getingJobRate;
	}
	
	public String getUniversityName()
	{
		return universityName;
	}
	 
	 
	public String getUniversityLocation()
	{
		return universityLocation;
	}
	 
	public double getGetingJobRate()
	{
		return getingJobRate;
	}
	public void instituteInformation()
	{
		System.out.println("-------------------------------------\n\n");
		System.out.println("University Name is :"+getUniversityName());
		System.out.println("University Location is :"+getUniversityLocation());
		System.out.println("University Getting job Rate :"+getUniversityLocation()+"%");
		System.out.println("--------------------------------------\n\n");
	}
	
}