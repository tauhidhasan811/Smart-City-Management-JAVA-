package Service;

public class Service
{
	protected Medical medical[]=new Medical[50];
	protected FireBrigade fireBrigade[]=new FireBrigade[50];
	protected PoliceStation policeStation[]=new PoliceStation[50];
	protected String name;
	protected int id;
	
	public Service()
    {
		
	}
	
	public boolean addFireBrigade(FireBrigade f)
	{
		for(int i=0;i<fireBrigade.length;i++)
		{
			if(fireBrigade[i]==null)
			{
				fireBrigade[i]=f;
				
				return true;
			}
		}
		
	    return false;
	}
	
	public boolean removeFireBrigade(FireBrigade f1)
	{
		for(int i=0;i<fireBrigade.length;i++)
		{
			if(fireBrigade[i]==f1)
			{
				fireBrigade[i]=null;
				
				return true;
			}
		}
		
	    return false;
	
	}
	
	public FireBrigade searchFireBrigade(String id)
	{
		FireBrigade f3=null;
		for(int i = 0;i<fireBrigade.length;i++)
		{
			if(fireBrigade[i]!=f3)
			{
				if(fireBrigade[i].getId().equals(id))
				{
					f3=fireBrigade[i];
					break;
				}
		    }
		}
		return f3;
		
	}
	
	public void showAllFireBrigade()
	{
		for(int i = 0; i<fireBrigade.length; i++)
		{
			if(fireBrigade[i]!=null)
			{
				System.out.println("---------------------------------------------");
				
		        System.out.println("FireBrigade ID      : "+fireBrigade[i].getId());
		        System.out.println("FireBrigade Location: "+fireBrigade[i].getLocation());
				System.out.println("---------------------------------------------");
			}
		}
	}
	
	public boolean addMedical(Medical md1)
	{
		for(int i=0;i<medical.length;i++)
		{
			if(medical[i]==null)
			{
				medical[i]=md1;
				
				return true;
			}
		}
		
	    return false;
	
	}
	
	public Medical searchMedical(String name)
	{
		Medical md1=null;
		for(int i = 0;i<medical.length;i++)
		{
			if(medical[i]!=md1)
			{
				if(medical[i].getName().equals(name))
				{
					md1=medical[i];
					break;
				}
		    }
		}
		return md1;
		
	}
		
	
	public boolean removeMedical(Medical md)
	{
		for(int i=0;i<medical.length;i++)
		{
			if(medical[i]==md)
			{
				medical[i]=null;
				
				return true;
			}
		}
		
	    return false;
	
	}
	
	
	public void showAllMedical()
	{
		for(int i = 0; i<medical.length; i++)
		{
			if(medical[i]!=null)
			{
				System.out.println("---------------------------------------------");
				System.out.println("Hospital Name    : "+medical[i].getHname());
		        System.out.println("Hospital ID      : "+medical[i].getmid());
		        System.out.println("Hospital Location: "+medical[i].getHlocation());
				System.out.println("Total Beds       : "+medical[i].getTotalbed());
				System.out.println("Available Beds   : "+medical[i].getAvailableBeds());
				System.out.println("---------------------------------------------");
			}
		}
	}
	
	
	public boolean addPoliceStation(PoliceStation p)
	{
		for(int i=0;i<policeStation.length;i++)
		{
			if(policeStation[i]==null)
			{
				policeStation[i]=p;
				
				return true;
			}
		}
		
	    return false;
	}
	
	public boolean removePoliceStation(PoliceStation p1)
	{
		for(int i=0;i<policeStation.length;i++)
		{
			if(policeStation[i]==p1)
			{
				policeStation[i]=null;
				
				return true;
			}
		}
		
	    return false;
	
	}
	
	public PoliceStation searchPoliceStation(String id)
	{
		PoliceStation p2=null;
		for(int i = 0;i<fireBrigade.length;i++)
		{
			if(policeStation[i]!=p2)
			{
				if(policeStation[i].getId().equals(id))
				{
					p2=policeStation[i];
					break;
				}
		    }
		}
		return p2;
		
	}
	
	public void showAllPoliceStation()
	{
		for(int i = 0; i<policeStation.length; i++)
		{
			if(policeStation[i]!=null)
			{
				System.out.println("---------------------------------------------");
				
		        System.out.println("PoliceStation ID      : "+policeStation[i].getId());
		        System.out.println("PoliceStation Location: "+policeStation[i].getLocation());
				System.out.println("---------------------------------------------");
			}
		}
	}
	
}