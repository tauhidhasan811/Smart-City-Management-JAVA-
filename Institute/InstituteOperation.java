package Institute;

abstract public class InstituteOperation
{
  public  String instituteName;
  public  String institueLocation;
  public  double PassingRate;
   InstituteOperation()
   { 
   }
   InstituteOperation(String instituteName,String institueLocation,double PassingRate)
   {
	   this.instituteName = instituteName;
       this.institueLocation = institueLocation;
       this.PassingRate = PassingRate;
   }
   public void setInstituteName(String instituteName)
   {
	   this.instituteName = instituteName;
   }
   public void setinstitueLocation(String institueLocation)
   {
	   this.institueLocation = institueLocation;
   }
   public void setPassingRate(double PassingRate)
   {
	  this.PassingRate = PassingRate;
   }
   
   public String getInstituteName()
   {
	   return instituteName;
   }
   public String getinstitueLocation()
   {
	   return institueLocation;
   }
   public double getPassingRate()
   {
	   return PassingRate;
   }
   public abstract void instituteInformation();
}
	