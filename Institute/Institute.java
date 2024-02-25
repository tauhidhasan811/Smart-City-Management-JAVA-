package Institute;

public class Institute
{
	private School schools[]= new School[100];
	private College colleges[]= new College[100];
	private University universitys[]= new University[100];
	
	public Institute()
	{
		
	}
	
    public boolean insertSchool(School s)
	{
		for(int i=0;i<=schools.length;i++)
		{
			if(schools[i]==null)
			{
				schools[i]=s;
				//schools[i].showInfo();
				return true;
			}
		}
		return false;
	}
    
    public boolean insertCollege(College s)
	{
		for(int i=0;i<=colleges.length;i++)
		{
			if(colleges[i]==null)
			{
				colleges[i]=s;
				//colleges[i].showInfo();
				return true;
			}
		}
		return false;
	}

    public boolean insertUniversity(University s)
	{
		for(int i=0;i<=universitys.length;i++)
		{
			if(universitys[i]==null)
			{
				universitys[i]=s;
				//universitys[i].showInfo();
				return true;
			}
		}
		return false;
	}	
    	
	
	public School searchSchool(String ri)
	{
		School s = null;
		
		for(int i=0; i<schools.length; i++)
		{
			if(schools[i] != null)
			{
				if(schools[i].getSchoolName().equals(ri))
				{
					s = schools[i];
					break;
				}
			}
		}
		return s;
	}
	
	public College searchCollege(String ri)
	{
		College  ir = null;
		
		for(int i=0; i<colleges.length; i++)
		{
			if(colleges[i] != null)
			{
				if(colleges[i].getCollegName().equals(ri))
				{
					ir = colleges[i];
					break;
				}
			}
		}
		return ir;
	}
	
	public University searchUniversity (String ri)
	{
		University lr = null;
		
		for(int i=0; i<universitys.length; i++)
		{
			if(universitys[i] != null)
			{
				if(universitys[i].getUniversityName().equals(ri))
				{
					lr = universitys[i];
					break;
				}
			}
		}
		return lr;
	}
	public void showAllSchool()
	{
		for(int i = 0; i<schools.length; i++)
		{
			if(schools[i]!=null)
			{
				schools[i].instituteInformation();
			}
		}
	}
	public void showAllCollege()
	{
		for(int i = 0; i<colleges.length; i++)
		{
			if(colleges[i]!=null)
			{
				colleges[i].instituteInformation();
			}
		}
	}
	public void showAllUniversity()
	{
		for(int i = 0; i<universitys.length; i++)
		{
			if(universitys[i]!=null)
			{
				universitys[i].instituteInformation();
			}
		}
	}
}