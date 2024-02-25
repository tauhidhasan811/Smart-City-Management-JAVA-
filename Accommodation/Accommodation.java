package Accommodation;

public class Accommodation
{
	Flat flats[]=new Flat[100];
	Hotel hotels[]=new Hotel[100];
	public Accommodation()
	{
	}
	public boolean insertFlat(Flat f)
	{
		for(int i=0;i<=flats.length;i++)
		{
			if(flats[i]==null)
			{
				flats[i]=f;
				return true;
			}
		}
		return false;
	}
	
	public boolean insertHotel(Hotel h)
	{
		for(int i=0;i<=hotels.length;i++)
		{
			if(hotels[i]==null)
			{
				hotels[i]=h;
				return true;
			}
		}
		return false;
	}
	
	
	public Flat searchFlat(String rid)
	{
		Flat f = null;
		
		for(int i=0; i<flats.length; i++){
			if(flats[i] != null)
			{
				if(flats[i].getAName().equals(rid))
				{
					f = flats[i];
					break;
				}
			}
		}
		return f;
	}
	
	public Hotel searchHotel(String rid)
	{
		Hotel h = null;
		
		for(int i=0; i<hotels.length; i++){
			if(hotels[i] != null)
			{
				if(hotels[i].getAName().equals(rid))
				{
					h = hotels[i];
					break;
				}
			}
		}
		return h;
	}
	public void showAllFlat()
	{
		for(int i = 0; i<flats.length; i++)
		{
			if(flats[i]!=null)
			{
				System.out.println("---------------------------------------------");
				System.out.println("House Name is       : "+flats[i].getAName());
				System.out.println("Flat size is        : "+flats[i].getASize());
		        System.out.println("rent of the flat is : "+flats[i].getARent());
				System.out.println("Number of Flats is  : "+flats[i].getATotalNumber());
		        System.out.println("Booked  flats is    : "+flats[i].getABookedNumber());
				System.out.println("Booked  flats is    : "+flats[i].getAvilAbleNumber());
		        System.out.println("House Location is   : "+flats[i].getALocation());
				System.out.println("---------------------------------------------");
			}
		}
	}
	public void showAllHotel()
	{
		for(int i = 0; i<hotels.length; i++)
		{
			if(hotels[i]!=null)
			{
				System.out.println("---------------------------------------------");
				System.out.println("Hotel Name is          : "+hotels[i].getAName());
				System.out.println("Room Size is           : "+hotels[i].getASize());
		        System.out.println("Rent For Room(Per Day) : "+hotels[i].getARent());
				System.out.println("Number of Room is      : "+hotels[i].getATotalNumber());
		        System.out.println("Boked Room is          : "+hotels[i].getABookedNumber());
				System.out.println("Boked Room is          : "+hotels[i].getAvilAbleNumber());
		        System.out.println("Hotel Location is      : "+hotels[i].getALocation());
				System.out.println("---------------------------------------------");
			}
		}
	}
}