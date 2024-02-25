package Institute;

public class School extends InstituteOperation
{
	private String schoolName;
	private String schoolLocation;
	private double schoolpassingRate;
	public School()
	 {
		
	 }
	public School(String schoolName,String schoolLocation,double schoolpassingRate )
	{
		 super(schoolName,schoolLocation,schoolpassingRate);
	}
	
    public void setSchoolName(String schoolName)
	{
		 this.schoolName =schoolName;
	}
	public void setSchoolLocation(String schoolLocation)
	{
		this.schoolLocation =schoolLocation;
	}
	 
	public void setSchoolPassingRate(double schoolpassingRate)
	{
		this.schoolpassingRate =schoolpassingRate;
	}
	
	public String getSchoolName()
	{
		return schoolName;
	}
	 
	 
	public String getSchoolLocation()
	{
		return schoolLocation;
	}
	 
	public double getSchoolpassingRate()
	{
		return schoolpassingRate;
	}
	public void instituteInformation()
	{
		System.out.println("-------------------------------------\n\n");
		System.out.println("School Name is :"+getSchoolName());
		System.out.println("School Location is :"+getSchoolLocation());
		System.out.println("School Passing Rate :"+getSchoolpassingRate()+"%");
		System.out.println("--------------------------------------\n\n");
	}
	
}