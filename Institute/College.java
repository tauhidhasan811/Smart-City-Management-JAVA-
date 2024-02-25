package Institute;

public class College extends InstituteOperation

{
	private String collegName;
	private String collegeLocation;
	private double universityChanceRate;
	public College()
	{
		
	}
	public College(String collegName,String collegeLocation,double universityChanceRate )
	{
		super(collegName,collegeLocation,universityChanceRate);
	}
	
    public void setCollegName(String collegName)
	{
		this.collegName = collegName;
	}
	public void setCollegeLocation(String collegeLocation)
	{
		 this.collegeLocation = collegeLocation;
	}
	 
	public void setUniversityChanceRate(double universityChanceRate)
	{
		this.universityChanceRate = universityChanceRate;
	}
	
	public String getCollegName()
	{
		return collegName;
	}
	 
	 
	public String getCollegeLocation()
	{
		return collegeLocation;
	}
	 
	public double getUniversityChanceRate()
	{
		return universityChanceRate;
	}
	public void instituteInformation()
	{
		System.out.println("-------------------------------------\n\n");
		System.out.println("School Name is :"+getCollegName());
		System.out.println("School Location is :"+getCollegeLocation()+"%");
		System.out.println("School Passing Rate :"+getUniversityChanceRate());
		System.out.println("--------------------------------------\n\n");
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
