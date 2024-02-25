import java.util.*;

//import Service.*;
public class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Service sr=new Service();
		boolean repeat=true;
		
		
		while(repeat)
		{
		//option
		System.out.println("");
		System.out.println("");
		System.out.println("---------------Welcom to our Smart City Service----------------");
		System.out.println("1. Fire Brigade");
		System.out.println("2. Medical");
		System.out.println("3. Police Station");
		System.out.println("4. Exit");
		System.out.println("Please choose any of them for Information and type it below-");
		String choice=sc.next();
		switch(choice)
		{
			case "1":
			{
				System.out.println("");
		        System.out.println("Please Choose a option :");
				
		        System.out.println("-----------------------");
		        System.out.println("-----------------------");
				System.out.println("1. Insert a FireBrigade");
				System.out.println("2. Remove FireBrigade");
				System.out.println("3. Show all FireBrigade");
				System.out.println("4. Search FireBrigade");
				System.out.println("5. Exit");
				System.out.println("-----------------------");
				System.out.println("-----------------------");
				
				String choiceC =sc.next();
				switch(choiceC)
				{
				
				
				case "1":
				{
                     System.out.println("-------Fill Up The Information--------");
					 
					 System.out.println("-----------------------");
				     System.out.println("-----------------------");
					 System.out.print("FireBrigade ID      : ");
					 String srid=sc.next();
					 System.out.print("FireBrigade Location: ");
					 String srlocation=sc.next();
					 System.out.println("-----------------------");
				     System.out.println("-----------------------");

					 FireBrigade f1=new FireBrigade();
					 
					  {
					 if(sr.addFireBrigade(f1))
								{
									System.out.println("\n------Insert successfully!!------\n");
								}
								else
								{
									System.out.println("SORRY!!!Try again later.");
								}
								
							System.out.println("\n\n#######################################################\n\n");
							    break;
					 }
				}
				
				
				case "2":
				{
					System.out.println("\n\n#######################################################\n\n");
						System.out.println("-------------------------------------------");
						System.out.println("You have chose to Remove FireBrigade");
						System.out.println("-------------------------------------------");
						
						            System.out.print("FireBrigade  ID: ");
									String id = sc.next();

									FireBrigade f2 = sr.searchFireBrigade(id);

									System.out.println("Are You sure you want to delete FireBrigade? ");
									System.out.print("Press 1 to delete FireBrigade  ");

									int delete = sc.nextInt();
									
									if(delete==1){

										if(f2 != null){
											if(sr.removeFireBrigade(f2)){
												System.out.println("FireBrigade ID " +id +" Removed Successfully.");
											}
											else{System.out.println("FireBrigade can not be removed now. Try again later");}
										}
										else{System.out.println("No FireBrigade found.");}
									}
									else{System.out.println("FireBrigade is not deleted. Thanks for come back");}


									System.out.println("\n\n#######################################################\n\n");

								break;
				}
				
				case "4":
									{
										System.out.println("********************************************");
								        System.out.println("\nYou Select Search FireBrigade \n");
								        System.out.println("********************************************");
								        System.out.print("Input The ID Of FireBrigade : ");
						                String srid = sc.next();

						                FireBrigade f= sr.searchFireBrigade(srid);
										
										if(f!= null)
										{
											System.out.println("We Find FireBrigade.");
							                System.out.println("---------------------------------------------");
							                
				                            System.out.println("ID Of The fireBrigade is         : "+f.getId());
				                            System.out.println("Location Of The FireBrigade is   : "+f.getLocation());
									        System.out.println("---------------------------------------------");
										}
										else
										{
											System.out.println("Sorry!!We Can't Find The FireBrigade.");
										}
										break;
									}
				
				case "3":
									{
										System.out.println("********************************************");
								        System.out.println("\nYou Select Show all FireBrigade \n");
								        System.out.println("********************************************");
								        sr.showAllFireBrigade();
								        
								        break;
									}
			}
			
		}
	}
		switch(choice)
		{
			case "2":
			{
				System.out.println("");
		        System.out.println("Please Choose a option :");
				
		        System.out.println("-----------------------");
		        System.out.println("-----------------------");
				System.out.println("1. Insert a Hospital");
				System.out.println("2. Remove Hospital");
				System.out.println("3. Show All Hospital ");
				
				System.out.println("4. Exit");
				System.out.println("-----------------------");
				System.out.println("-----------------------");
				
				String choiceC =sc.next();
				switch(choiceC)
				{
				
				
				case "1":
				    {
					 System.out.println("-------Fill Up The Information--------");
					 
					 System.out.println("-----------------------");
				     System.out.println("-----------------------");
					 System.out.print("Hospital Name      : ");
					 String srhname=sc.next();
					 System.out.print("Hospital ID        : ");
					 String srmid=sc.next();
					 System.out.print("Hospital Location  : ");
					 String srhlocation=sc.next();
					 System.out.print("Total Beds         : ");
					 String srtotalbed=sc.next();
					 System.out.print("Available Beds     : ");
					 String sravailableBeds=sc.next();
					 System.out.println("-----------------------");
				     System.out.println("-----------------------");

					 Medical md1=new Medical();
					 //md1.setId(srid);
					 {
					 if(sr.addMedical(md1))
								{
				                    
									System.out.println("\n------Insert successfully!!------\n");
								}
								else
								{
									System.out.println("SORRY!!!Try again later.");
								}
								
							System.out.println("\n\n#######################################################\n\n");
							    break;
					 }
				    }
					
					case "2":
					{
						System.out.println("\n\n#######################################################\n\n");
						System.out.println("-------------------------------------------");
						System.out.println("You have chose to Remove Medical");
						System.out.println("-------------------------------------------");
						
						            System.out.print("Hospital  ID: ");
									String mid = sc.next();

									Medical md2 = sr.searchMedical(mid);

									System.out.println("Are You sure you want to delete this Medical? ");
									System.out.print("Press 1 to delete Medical  ");

									int delete = sc.nextInt();
									
									if(delete==1){

										if(md2 != null)
										{
											if(sr.removeMedical(md2))
											{
												System.out.println("Medical ID " +mid +" Removed Successfully.");
											}
											else{System.out.println("Medical can not be removed now. Try again later");
											}
										}
										else{System.out.println("No Medical found.");
										}
									}
									else{System.out.println("Medical is not deleted. Thanks for come back");
									}


									System.out.println("\n\n#######################################################\n\n");

								break;
					}
								case "3":
									{
										System.out.println("********************************************");
								        System.out.println("\nYou Select Show all Medical \n");
								        System.out.println("********************************************");
								        sr.showAllMedical();
								        //frwd.readFromFile();
								        break;
									}
						
					}
				}
				
			}
		
		switch(choice)
		{
			case "3":
	
			{
				System.out.println("");
		        System.out.println("Please Choose a option :");
				
		        System.out.println("-----------------------");
		        System.out.println("-----------------------");
				System.out.println("1. Insert a Police Station");
				System.out.println("2. Remove Police Station");
				System.out.println("3. Show all Police Station");
				System.out.println("4. Search Police Station");
				System.out.println("5. Exit");
				System.out.println("-----------------------");
				System.out.println("-----------------------");
				
				String choiceC =sc.next();
				switch(choiceC)
				{
				
				
				case "1":
				{
                     System.out.println("-------Fill Up The Information--------");
					 
					 System.out.println("-----------------------");
				     System.out.println("-----------------------");
					 System.out.print("Police Station ID      : ");
					 String srid=sc.next();
					 System.out.print("Police Station Location: ");
					 String srlocation=sc.next();
					 System.out.println("-----------------------");
				     System.out.println("-----------------------");

					 PoliceStation p=new PoliceStation();
					 
					  {
					 if(sr.addPoliceStation(p))
								{
									System.out.println("\n------Insert successfully!!------\n");
								}
								else
								{
									System.out.println("SORRY!!!Try again later.");
								}
								
							System.out.println("\n\n#######################################################\n\n");
							    break;
					 }
				}
				
				
				case "2":
				{
					System.out.println("\n\n#######################################################\n\n");
						System.out.println("-------------------------------------------");
						System.out.println("You have chose to Remove Police Station");
						System.out.println("-------------------------------------------");
						
						            System.out.print("Police Station  ID: ");
									String id = sc.next();

									PoliceStation p1 = sr.searchPoliceStation(id);

									System.out.println("Are You sure you want to delete Police Station? ");
									System.out.print("Press 1 to delete Police Station  ");

									int delete = sc.nextInt();
									
									if(delete==1){

										if(p1 != null){
											if(sr.removePoliceStation(p1)){
												System.out.println("Police Station ID " +id +" Removed Successfully.");
											}
											else{System.out.println("Police Station can not be removed now. Try again later");}
										}
										else{System.out.println("No Police Station found.");}
									}
									else{System.out.println("Police Station is not deleted. Thanks for come back");}


									System.out.println("\n\n#######################################################\n\n");

								break;
				}
				
				case "4":
									{
										System.out.println("********************************************");
								        System.out.println("\nYou Select Search Police Station \n");
								        System.out.println("********************************************");
								        System.out.print("Input The ID Of Police Station : ");
						                String srid = sc.next();

						                PoliceStation f= sr.searchPoliceStation(srid);
										
										if(f!= null)
										{
											System.out.println("We Find Police Station.");
							                System.out.println("---------------------------------------------");
							                
				                            System.out.println("ID Of The Police Station is         : "+f.getId());
				                            System.out.println("Location Of The Police Station is   : "+f.getLocation());
									        System.out.println("---------------------------------------------");
										}
										else
										{
											System.out.println("Sorry!!We Can't Find The Police Station.");
										}
										break;
									}
				
				case "3":
									{
										System.out.println("********************************************");
								        System.out.println("\nYou Select Show all Police Station \n");
								        System.out.println("********************************************");
								        sr.showAllPoliceStation();
								        
								        break;
									}
			    }
			
		       }
			}
		
		}
		
	}
		
 }


