package Accommodation;

public class AccommodationOperation
{
	private String Aname;
	private double Asize;
	private double Arent;
	private String Alocation;
	private int AtotalNumber;
	private int AbookedNumber;
	
	public AccommodationOperation()
	{
	}
	public AccommodationOperation(String Aname, double Asize,double Arent,String Alocation,int AtotalNumber,int AbookedNumber)
	{
		this.Aname=Aname;
		this.Asize=Asize;
		this.Arent=Arent;
		this.Alocation=Alocation;
		this.AtotalNumber=AtotalNumber;
		this.AbookedNumber=AbookedNumber;
	}
	public void setAName(String Aname)
	{
		this.Aname=Aname;
	}
	public void setASize(double Asize)
	{
		this.Asize=Asize;
	}
	public void setARent(double Arent)
	{
		this.Arent=Arent;
	}
	public void setALocation(String Alocation)
	{
		this.Alocation=Alocation;
	}
	public void setATotalNumber(int AtotalNumber)
	{
		this.AtotalNumber=AtotalNumber;
	}
	public void setABookedNumber(int AbookedNumber)
	{
		this.AbookedNumber=AbookedNumber;
	}
	public String getAName()
	{
		return Aname;
	}
	public double getASize()
	{
		return Asize;
	}
	public double getARent()
	{
		return Arent;
	}
	public String getALocation()
	{
		return Alocation;
	}
	public int getATotalNumber()
	{
		return AtotalNumber;
	}
	public int getABookedNumber()
	{
		return AbookedNumber;
	}
	
	public int getAvilAbleNumber()
	{
		return getATotalNumber()-getABookedNumber();
	}
}
	