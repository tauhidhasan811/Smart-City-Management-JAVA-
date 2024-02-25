import javax.swing.JFrame;
import java.util.*;
import Accommodation.*;
import Restaurant.*;
import Institute.*;
import Service.*;
import fileio.*;

public class Main
{
	public static void main(String args[])
	{
		JFrame frame =new JFrame();
		frame.setSize(660,660);
		frame.setVisible(true);
		
		
		Scanner sc=new Scanner(System.in);
	
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		Accommodation a=new Accommodation();
		Restaurant r=new Restaurant();
		Institute i = new Institute();
		Service sr=new Service();
		
		System.out.println("\n\n\n********************************************");
		System.out.println("             WELCOME TO SMART CITY            ");
		System.out.println("********************************************\n\n\n");
			
			
			
			String choice0;
 	        boolean repeat0=true;
 	        while(repeat0)
			{
				Scanner input = new Scanner(System.in);
 		        System.out.println("                WHO ARE YOU?                ");
 		        System.out.println("                1.ADMIN                     ");
 		        System.out.println("                2.GUEST                     ");
 		        System.out.println("                3.EXIT                      ");
 		        System.out.print("\nEnter your choice :   ");
				choice0 = input.nextLine();
				
/*##################################################################################################################################################
                                                                
																ADMIN
																
##################################################################################################################################################*/
           
		
 		        if(choice0.equals("1"))
				{
					Scanner input1 = new Scanner(System.in);
					System.out.println("\n**************************************************************");
					System.out.println("                  You Select ADMIN                 ");
					System.out.println("**************************************************************\n");
					
					String name="admin",pass="password";
		            System.out.print("Plese Enter Your  username : ");
		            String name1=input1.nextLine();
		            System.out.print("Plese Enter Your Password  : ");
		            String pass1=input1.nextLine();
					if(name.equals(name1) && pass.equals(pass1))
					{
						 System.out.println("\n\nWELCOME "+name1+" YOU HAVE LOGGED-IN SUCCESSFUL\n\n");
		
		
		    boolean repeat=true;
		    while(repeat)
			{
				Scanner sc1 = new Scanner(System.in);
				
				System.out.println("-------------------------------------------");
				System.out.println("                 MAIN MENU                 ");
				System.out.println("-------------------------------------------");
				System.out.println("1.Restaurant.");
		        System.out.println("2.Accommodation.");
		        System.out.println("3.Institute.");
				System.out.println("4.Service.");
				System.out.println("5.Exit From Admin.\n");
		        System.out.print("\nPlese Enter your choice : ");
				String choice=sc1.nextLine();
				switch(choice)
				{
					case "1":
					{
						boolean repeatR=true;
						while(repeatR){
						
						Scanner scR = new Scanner(System.in);
						
						System.out.println("\n--------------------------------------------");
				        System.out.println("               WELCOME TO RESTURENT           ");
						System.out.println("--------------------------------------------\n");
				        System.out.println("1. Chinese Restaurant");
		                System.out.println("2. Italian Restaurant");
		                System.out.println("3. Local Restaurant");
						System.out.println("4. Exit From Restaurant");
						System.out.println("5. Exit From Admin\n");
		                System.out.print("\nPlese Enter your choice : ");
		                String choiceR=scR.nextLine();
				        switch(choiceR)
						{
							case "1":
							{
								boolean repeatCR=true;
								while(repeatCR){
									
								Scanner scCR = new Scanner(System.in);
									
								System.out.println("\n**************************************************************");
						        System.out.println("                  You Select Chinese Restaurant                 ");
						        System.out.println("**************************************************************\n");
								//System.out.println("\n--------------------------------------------\n");
						        System.out.println("1. Insert Chinese Restaurant.");
		                        System.out.println("2. Remove Chinese Restaurants.");
						        System.out.println("3. Search Chinese Restaurants.");
						        System.out.println("4. Show All Inserted Chinese Restaurants.");
								System.out.println("5. Exit From Chinese Restaurant.");
								System.out.println("6. Go To Main Menu.");
								System.out.println("7. Exit From Admin.\n");
						        System.out.print("Plese Enter your choice : ");
				                String choiceC =scCR.nextLine();
						        switch(choiceC)
								{
									case "1":
									{
										Scanner scCR1 = new Scanner(System.in);
										
										System.out.println("\n**************************************************************");
								        System.out.println("               You Select Insert Chinese Restaurant             ");
										System.out.println("**************************************************************\n");
								        System.out.print("Input Name of the Restaurant     : ");
				                        String Rname=scCR1.nextLine();
				                        System.out.print("Input ID of the Restaurant       : ");
				                        String Rid=scCR1.nextLine();
				                        System.out.print("Input Location of the Restaurant : ");
				                        String Rlocation=scCR1.nextLine();
				                        ChineseRestaurant cr=new ChineseRestaurant(Rname,Rid,Rlocation);
								
								        if(r.insertChineseRestaurant(cr))
										{
											System.out.println("\nInserted successfully!!\n");
									        //frwd.writeInFile("Chinese Restaurant Name is : "+cr.getRName()+" Restaurant ID : "+cr.getRID()+" Location : "+cr.getRLocation());
										}
										else
										{
											System.out.println("SORRY!!!YOU CAN'T INSERT RESTURENT.");
										}
										break;
									}
									case "2" :
									{
										Scanner scCR1 = new Scanner(System.in);
										
										
										System.out.println("\n**************************************************************");
								        System.out.println("              You Select Remove Chinese Restaurant              ");
								        System.out.println("**************************************************************\n");
								        System.out.print("Input The ID Of Chinese Restaurant : ");
						                String rid4 = scCR1.next();

						                ChineseRestaurant cr1 = r.searchChineseRestaurant(rid4);

						                if(cr1!= null)
										{
											System.out.println("We Find The Chinese Restaurant.");
									        System.out.println("Are You Sure You Want To Delete "+cr1.getRName()+" Restaurant");
									        System.out.println("1.Yes.");
									        System.out.println("2.No.");
									        System.out.print("Please Enter Your Choice : ");
											
											Scanner scCR2 = new Scanner(System.in);
											
									        String delete=scCR2.nextLine();
									        if(delete.equals("1"))
											{
												r.removeChineseRestaurant(cr1);
										        System.out.println("\n---------------------------------------------");
										        System.out.println("Chinese Restaurant Successfully Remove.");
										        System.out.println("---------------------------------------------\n");
											}
											if(delete.equals("2"))
											{
												System.out.println("Thank You For Change Your Mind.");
											}
											else
											{
												System.out.println("\nPlese Enter 1 Or 2 to delete ");
											}
										}
										else
										{
											System.out.println("Sorry!!We Can't Find The Chinese Restaurant.");
										}
										break;
									}
									case "3":
									{
										Scanner scCR1 = new Scanner(System.in);
										
										
										System.out.println("\n**************************************************************");
								        System.out.println("              You Select Search Chinese Restaurant             ");
								        System.out.println("**************************************************************\n");
								        System.out.print("Input The ID Of Chinese Restaurant : ");
						                String rid4 = scCR1.next();

						                ChineseRestaurant cr1 = r.searchChineseRestaurant(rid4);
										
										if(cr1!= null)
										{
											System.out.println("        We Find The Chinese Restaurant      ");
							                System.out.println("-------------------------------------------------------");
							                System.out.println("Name Of The Chinese Restaurant is       : "+cr1.getRName());
				                            System.out.println("ID Of The Chinese Restaurant is         : "+cr1.getRID());
				                            System.out.println("Location Of The Chinese Restaurant is   : "+cr1.getRLocation());
									        System.out.println("------------------------------------------------------\n");
										}
										else
										{
											System.out.println("Sorry!!We Don't Find The Chinese Restaurant.");
										}
										break;
									}
									case "4":
									{
										System.out.println("\n*********************************************************************");
								        System.out.println("             You Select Show all Inserted Chinese Restaurants           ");
								        System.out.println("************************************************************************\n");
								        r.showAllChineseRestaurant();
								        //frwd.readFromFile();
								        break;
									}
									case "5":
									{
										repeatCR=false;
										//System.out.println("-------------------------------------------");
									    System.out.println("            Exit From Chinese Restaurant       \n.");
									    //System.out.println("-------------------------------------------");
										break;
									}
									case "6":
									{
										repeatCR=false;
										repeatR=false;
										System.out.println("---------------------------------------------------");
									    System.out.println("             Going Back To  Main Menu");
									    System.out.println("--------------------------------------------------\n\n");
										break;
									}
									case "7":
									{
										repeatCR=false;
										repeatR=false;
										repeat=false;
										System.out.println("-------------------------------------------------");
						                System.out.println("              Thanks for being with us            ");
						                System.out.println("-------------------------------------------------\n\n");
										break;
									}
									default :
									{
										System.out.println("-------------------------------------------");
									    System.out.println("Invalid option. Plese Enter Between 1~7.     ");
									    System.out.println("-------------------------------------------\n");
									}
								}
								}
								break;
							}
							case "2":
							{
								boolean repeatIR=true;
								while(repeatIR){
								
								Scanner scIR = new Scanner(System.in);
									
								System.out.println("\n**************************************************************");
						        System.out.println("                You Select Italian Restaurant                   ");
						        System.out.println("**************************************************************\n");
								//System.out.println("\n--------------------------------------------\n");
						        System.out.println("1. Insert Italian Restaurant");
		                        System.out.println("2. Remove Italian Restaurants.");
						        System.out.println("3. Search Italian Restaurants.");
						        System.out.println("4. Show All Inserted Italian Restaurants.");
								System.out.println("5. Exit From Italian Restaurant.");
								System.out.println("6. Go To Main Menu.");
								System.out.println("7. Exit From Smart City.\n");
						        System.out.print("Plese Enter your choice : ");
				                String choiceI =scIR.nextLine();
						        switch(choiceI)
								{
									case "1":
									{
										Scanner scIR1 = new Scanner(System.in);
										
										System.out.println("\n**************************************************************");
								        System.out.println("               You Select Insert Italian Restaurant             ");
								        System.out.println("**************************************************************\n");
								        System.out.print("Input Name of the Italian Restaurant     : ");
				                        String Rname=scIR1.nextLine();
				                        System.out.print("Input ID of the Italian Restaurant       : ");
				                        String Rid=scIR1.nextLine();
				                        System.out.print("Input Location of the Italian Restaurant : ");
				                        String Rlocation=scIR1.nextLine();
				                        ItalianRestaurant ir=new ItalianRestaurant(Rname,Rid,Rlocation);
								
								        if(r.insertItalianRestaurant(ir))
										{
											System.out.println("\nInserted successfully!!\n");
											//frwd.writeInFile("Italian Restaurant Name is : "+ir.getRName()+" Restaurant ID : "+ir.getRID()+" Location : "+ir.getRLocation());
										}
										else
										{
											System.out.println("YOU CAN'T INSERT ITALIAN RESTURENT.");
										}
										break;
									}
									case "2":
									{
										Scanner scIR1 = new Scanner(System.in);
										
										
										System.out.println("\n**************************************************************");
								        System.out.println("              You Select Remove Italian Restaurant              ");
								        System.out.println("**************************************************************\n");
								        System.out.print("Input The ID Of Italian Restaurant : ");
						                String rid4 = scIR1.nextLine();

						                ItalianRestaurant ir1 = r.searchItalianRestaurant(rid4);

						                if(ir1!= null)
										{
											System.out.println("We Find The Italian Restaurant.");
									        System.out.println("Are You Sure You Want To Delete "+ir1.getRName()+" Restaurant");
									        System.out.println("1.Yes.");
									        System.out.println("2.No.");
									        System.out.print("Please Enter Your Choice : ");
											
											Scanner scIR2 = new Scanner(System.in);
											
									        String delete=scIR2.nextLine();
									        if(delete.equals("1"))
											{
												r.removeItalianRestaurant(ir1);
										        System.out.println("\n------------------------------------------------------");
										        System.out.println("         Italian Restaurant Successfully Remove.        ");
										        System.out.println("-------------------------------------------------------\n");
											}
											if(delete.equals("2"))
											{
												System.out.println("Thank You For Change Your Mind.\n");
											}
											else
											{
												System.out.println("Plese Enter 1 Or 2 For Delete.");
											}												
										}
										else
										{
											System.out.println("Sorry!!We Can't Find The Italian Restaurant.\n");
										}
										break;
									}
									
									case "3":
									{
										Scanner scIR1 = new Scanner(System.in);
										
										
										System.out.println("\n**************************************************************");
								        System.out.println("            You Select Search Italian Restaurant                 ");
								        System.out.println("**************************************************************\n");
								        System.out.print("Input The Italian Restaurant  ID: ");
						                String rid4 = scIR1.nextLine();

						                ItalianRestaurant ir1 = r.searchItalianRestaurant(rid4);

						                if(ir1!= null)
										{
											System.out.println("             We Find The Italian Restaurant.              ");
							                System.out.println("------------------------------------------------------------");
							                System.out.println("Name of the Italian Restaurant is     : "+ir1.getRName());
				                            System.out.println("ID of the Italian Restaurant is       : "+ir1.getRID());
				                            System.out.println("Location of the Italian Restaurant is : "+ir1.getRLocation());
									        System.out.println("------------------------------------------------------------\n");
										}
										else
										{
											System.out.println("Sorry!!We Can't Find The Italian Restaurant.\n");
										}
										break;
									}
									case "4":
									{
										System.out.println("\n**************************************************************");
								        System.out.println("        You Select Show all Inserted Italian Restaurants         ");
								        System.out.println("**************************************************************\n");
								        r.showAllItalianRestaurant();
								        //frwd.readFromFile();
								        break;
									}
									case "5":
									{
										repeatIR=false;
										System.out.println("-------------------------------------------");
									    System.out.println("      Exit From Italian Restaurant        ");
									    System.out.println("-------------------------------------------");
										break;
									}
									case "6":
									{
										repeatIR=false;
										repeatR=false;
										System.out.println("-------------------------------------------");
									    System.out.println("         Going Back to the main menu       ");
									    System.out.println("-------------------------------------------");
										break;
									}
									case "7":
									{
										repeatIR=false;
										repeatR=false;
										repeat=false;
										System.out.println("-------------------------------------------");
						                System.out.println("        Thanks for being with us     ");
						                System.out.println("-------------------------------------------");
										break;
									}
									default :
									{
										System.out.println("-------------------------------------------");
									    System.out.println("       Invalid option . Try again        ");
									    System.out.println("-------------------------------------------");
									}
								}
								}
								break;
							}
							case "3":
							{
								boolean repeatLR=true;
								while(repeatLR){
									
								Scanner scLR = new Scanner(System.in);
									
								System.out.println("\n**************************************************************");
						        System.out.println("                   You Select Local Restaurant                  ");
						        System.out.println("**************************************************************\n");
								//System.out.println("\n--------------------------------------------\n");
						        System.out.println("1. Insert Local Restaurants");
		                        System.out.println("2. Remove Local Restaurants.");
						        System.out.println("3. Search Local Restaurants.");
						        System.out.println("4. Show All Inserted Local Restaurants.");
								System.out.println("5. Exit From Local Restaurants.");
								System.out.println("6. Go To Main Menu.");
								System.out.println("7. Exit From Smart City.\n");
						        System.out.print("Plese Enter your choice : ");
				                String choiceL =scLR.nextLine();
						        switch(choiceL)
								{
									case "1":
									{
										Scanner scLR1 = new Scanner(System.in);
										
										System.out.println("\n**************************************************************");
								        System.out.println("            You Select Insert Local Restaurant                ");
								        System.out.println("**************************************************************\n");
								        System.out.print("Input Name of the Local Restaurant : ");
				                        String Rname=scLR1.nextLine();
				                        System.out.print("Input ID of the Local Restaurant   : ");
				                        String Rid=scLR1.nextLine();
				                        System.out.print("Input Location of the Restaurant   : ");
				                        String Rlocation=scLR1.nextLine();
				                        LocalRestaurant lr=new LocalRestaurant(Rname,Rid,Rlocation);
								
								        if(r.insertLocalRestaurant(lr))
										{
											System.out.println("\nInserted successfully!!\n");
											frwd.writeInFile("\nLocal Restaurant Name is : "+lr.getRName()+"\nRestaurant ID : "+lr.getRID()+"\nLocation : "+lr.getRLocation());
										}
										else
										{
											System.out.println("YOU CAN'T INSERT RESTURENT.");
										}
										break;
									}
									case "2":
									{
										Scanner scLR1 = new Scanner(System.in);
										
										
										System.out.println("\n**************************************************************");
								        System.out.println("                You Select Remove Local Restaurant             ");
								        System.out.println("**************************************************************\n");
								        System.out.print("Input The ID Of Local Restaurant : ");
						                String rid4 = scLR1.nextLine();

						                LocalRestaurant lr1 = r.searchLocalRestaurant(rid4);

						                if(lr1!= null)
										{
											Scanner scLR2 = new Scanner(System.in);
											
											System.out.println("We Find The Local Restaurant.");
									        System.out.println("Are You Sure You Want To Delete "+lr1.getRName()+" Restaurant");
									        System.out.println("1.Yes.");
									        System.out.println("2.No.");
									        System.out.print("Please Enter Your Choice : ");
									        String delete=scLR2.nextLine();
									        if(delete.equals("1"))
											{
												r.removeItalianRestaurant(lr1);
										        System.out.println("-------------------------------------------------");
										        System.out.println("      Local Restaurant Successfully Remove.      ");
										        System.out.println("-------------------------------------------------\n");
											}
											else
											{
												System.out.println("Thank You For Change Your Mind.\n");
											}
										}
										else
										{
											System.out.println("Sorry!!We Can't Find The Local Restaurant.");
										}
										break;
									}
									case "3":
									{
										Scanner scLR1 = new Scanner(System.in);
										
										
										System.out.println("\n**************************************************************");
								        System.out.println("              You Select Search Local Restaurant                ");
								        System.out.println("**************************************************************\n");
								        System.out.print("Input Local Restaurant  ID : ");
						                String rid4 = scLR1.nextLine();

						                LocalRestaurant lr1 = r.searchLocalRestaurant(rid4);

						                if(lr1!= null)
										{
											System.out.println("             We Find The Local Restaurant.              ");
							                System.out.println("---------------------------------------------------------");
							                System.out.println("Name of the Local Restaurant is     : "+lr1.getRName());
				                            System.out.println("ID of the Local Restaurant is       : "+lr1.getRID());
				                            System.out.println("Location of the Local Restaurant is : "+lr1.getRLocation());
									        System.out.println("-----------------------------------------------==---------\n");
										}
										else
										{
											System.out.println("Sorry!!We Can't Find The Local Restaurant.");
										}
										break;
									}
									case "4":
									{
										/*System.out.println("********************************************");
								        System.out.println("\nYou Select Show all Inserted Local Restaurants \n");
								        System.out.println("********************************************");
								        r.showAllLocalRestaurant();*/
								        frwd.readFromFile();
										System.out.println("---------------------------------------------");
								        break;
									}
									case "5":
									{
										repeatLR=false;
										System.out.println("-------------------------------------------");
									    System.out.println("         Exit From Local Restaurants        ");
									    System.out.println("-------------------------------------------/n");
										break;
									}
									case "6":
									{
										repeatLR=false;
										repeatR=false;
										System.out.println("-------------------------------------------");
									    System.out.println("        Going Back to the Main Menu       ");
									    System.out.println("-------------------------------------------");
										break;
									}
									case "7":
									{
										repeatLR=false;
										repeatR=false;
										repeat=false;
										System.out.println("-------------------------------------------");
						                System.out.println("          Thanks for being with us          ");
						                System.out.println("-------------------------------------------\n");
										break;
									}
									default :
									{
										System.out.println("-------------------------------------------");
									    System.out.println("         Invalid option . Try again       ");
									    System.out.println("-------------------------------------------\n");
									}
								}
								}
								break;
							}
							case "4":
							{
								repeatR=false;
								System.out.println("-------------------------------------------");
								System.out.println("        Going Back to the main menu        ");
							    System.out.println("-------------------------------------------\n");
								break;
							}
							case "5":
							{
								repeatR=false;
								repeat=false;
								System.out.println("-------------------------------------------");
						        System.out.println("           Thanks for being with us        ");
						        System.out.println("-------------------------------------------\n");
								break;
							}
							default :
							{
								System.out.println("\n-------------------------------------------");
								System.out.println("       Invalid option . Try again      ");
								System.out.println("-------------------------------------------\n");
							}
						}
						}
						break;
					}
					case "2": 
					{
						Scanner scA = new Scanner(System.in);
						
						System.out.println("********************************************");
				        System.out.println("\nHABIBI !!! WELCOME TO Accommodation\n");
				        System.out.println("********************************************");
				        System.out.println("1. Flat.");
		                System.out.println("2. Hotel.");
						System.out.println("3. Exit From Accommodation.");
		                System.out.print("\nPlese Enter your choice : ");
		                String choiceA=scA.nextLine();
						switch(choiceA)
						{
							case "1":
							{
								Scanner scF = new Scanner(System.in);
								
								System.out.println("********************************************");
						        System.out.println("\nYou Select Flat \n");
						        System.out.println("********************************************");
						        System.out.println("1.Insert Flat.");
		                        System.out.println("2.Search Flat.");
						        System.out.println("3. Show All Inserted Flat.");
								System.out.println("3.Exit From Smart City.");
						        System.out.print("Plese Enter your choice : ");
				                String choiceA1 =scF.nextLine();
								switch(choiceA1)
								{
									case "1": 
									{
										Scanner scF1 = new Scanner(System.in);
										
										System.out.println("********************************************");
								        System.out.println("\nYou Select Insert Flat \n");
								        System.out.println("********************************************");
								        System.out.print("Input Name of The House        : ");
				                        String Aname=scF1.next();
										System.out.print("Input Total Number Flat on House : ");
				                        int AtotalNumber=scF1.nextInt();
										System.out.print("Input Booked Flats On House : ");
				                        int AbookedNumber=scF1.nextInt();
				                        System.out.print("Input Size of Flat(Square feet) : ");
				                        double Asize=scF1.nextDouble();
				                        System.out.print("Input Rent of The Flat         : ");
				                        double Arent=scF1.nextDouble();
										System.out.print("Input Location of The Flat     : ");
				                        String Alocation=scF1.next();
				                        Flat f=new Flat(Aname,Asize,Arent,Alocation,AtotalNumber,AbookedNumber);
								
								        if(a.insertFlat(f))
										{
											System.out.println("\nInserted successfully!!\n");
										}
										else 
										{
											System.out.println("\nSORRY!!!YOU CAN'T INSERT FLAT.\n");
										}
										break;
									}
									case "2":
									{
										Scanner scF1 = new Scanner(System.in);
										
										System.out.println("********************************************");
								        System.out.println("\nYou Select Search Flat  \n");
								        System.out.println("********************************************");
								        System.out.print("Input House Name : ");
						                String rid4 = scF1.next();

						                Flat f1 = a.searchFlat(rid4);

						                if(f1!= null)
										{
											System.out.println("We Find The Flat .");
							                System.out.println("---------------------------------------------");
							                System.out.println("House Name is       : "+f1.getAName());
				                            System.out.println("Flat size is        : "+f1.getASize());
		                                    System.out.println("rent of the flat is : "+f1.getARent());
				                            System.out.println("Number of Flats is  : "+f1.getATotalNumber());
		                                    System.out.println("Booked  flats is    : "+f1.getABookedNumber());
				                            System.out.println("Booked  flats is    : "+f1.getAvilAbleNumber());
		                                    System.out.println("House Location is   : "+f1.getALocation());
									        System.out.println("---------------------------------------------");
										}
										else
										{
											System.out.println("Sorry!!We Can't Find The Flat.");
										}
										break;
									}
									case "3":
									{
										System.out.println("********************************************");
								        System.out.println("\nYou Select Show all Inserted Flat  \n");
								        System.out.println("********************************************");
								        a.showAllFlat();
								        break;
									}
									case "4":
									{
										repeat=false;
										System.out.println("-------------------------------------------");
									    System.out.println("Thank You for Bring With Us...............");
									    System.out.println("-------------------------------------------");
										break;
									}
									default :
									{
										System.out.println("-------------------------------------------");
									    System.out.println("Invalid option . Try again...............");
									    System.out.println("-------------------------------------------");
									}
								}
								break;
							}
							case "2":
							{
								Scanner scH = new Scanner(System.in);
								
								System.out.println("********************************************");
						        System.out.println("\nYou Select Hotel \n");
						        System.out.println("********************************************");
						        System.out.println("1. Insert Hotel.");
		                        System.out.println("2. Search Hotel.");
								System.out.println("3. Show All Inserted Flat.");
								System.out.println("4. Exit From Smart City.");
						        System.out.print("Plese Enter your choice : ");
				                String choiceA2 =scH.nextLine();
								switch(choiceA2)
								{
									case "1": 
									{
										Scanner scH1 = new Scanner(System.in);
										
										System.out.println("********************************************");
								        System.out.println("\nYou Select Insert Hotel \n");
								        System.out.println("********************************************");
								        System.out.print("Input Name of The Hotel               : ");
				                        String Aname=scH1.next();
										System.out.print("Input Total Number Room on Hotel : ");
				                        int AtotalNumber=scH1.nextInt();
										System.out.print("Input Booked Room On Hotel : ");
				                        int AbookedNumber=scH1.nextInt();
				                        System.out.print("Input Size of Hotel Room(Square feet) : ");
				                        double Asize=scH1.nextDouble();
				                        System.out.print("Input Rent of The Hotel(PER-DAY)      : ");
				                        double Arent=scH1.nextDouble();
										System.out.print("Input Location of The Hotel           : ");
				                        String Alocation=scH1.next();
				                        Hotel h=new Hotel(Aname,Asize,Arent,Alocation,AtotalNumber,AbookedNumber);
								
								        if(a.insertHotel(h))
										{
											System.out.println("\nInserted successfully!!\n");
											System.out.println();
										}
										else 
										{
											System.out.println("\nSORRY!!!YOU CAN'T INSERT HOTEL.\n");
										}
										break;
									}
									case "2":
									{
										Scanner scH1 = new Scanner(System.in);
										
										System.out.println("********************************************");
								        System.out.println("\nYou Select Search Hotel \n");
								        System.out.println("********************************************");
								        System.out.print("Input The Name Of Hotel : ");
						                String rid4 = scH1.next();
										
						                Hotel h1 = a.searchHotel(rid4);

						                if(h1!= null)
										{
											System.out.println("We Find The Hotel.");
							                System.out.println("---------------------------------------------");
							                System.out.println("Hotel Name is          : "+h1.getAName());
				                            System.out.println("Room Size is           : "+h1.getASize());
		                                    System.out.println("Rent For Room(Per Day) : "+h1.getARent());
				                            System.out.println("Number of Room is      : "+h1.getATotalNumber());
		                                    System.out.println("Boked Room is          : "+h1.getABookedNumber());
				                            System.out.println("Boked Room is          : "+h1.getAvilAbleNumber());
		                                    System.out.println("Hotel Location is      : "+h1.getALocation());
									        System.out.println("---------------------------------------------");
										}
										else
										{
											System.out.println("\nSorry!!We Don't Find The Hotel.\n");
										}
										break;
									}
									case "3":
									{
										System.out.println("********************************************");
								        System.out.println("\nYou Select Show all Inserted Hotel \n");
								        System.out.println("********************************************");
								        a.showAllFlat();
								        break;
									}
									case "4":
									{
										repeat=false;
										System.out.println("-------------------------------------------");
									    System.out.println("Thank You for Bring With Us...............");
									    System.out.println("-------------------------------------------");
										break;
									}
									default :
									{
										System.out.println("-------------------------------------------");
									    System.out.println("Invalid option . Try again...............");
									    System.out.println("-------------------------------------------");
									}
								}
								break;
							}
							case "3":
							{
								System.out.println("-------------------------------------------");
								System.out.println("Going Back to the main menu...............");
							    System.out.println("-------------------------------------------");
								break;
							}
							default :
							{
								System.out.println("-------------------------------------------");
								System.out.println("Invalid option . Try again...............");
								System.out.println("-------------------------------------------");
							}
						}
						break;
					}
					case "3":
					{
						Scanner scI = new Scanner(System.in);
						
						System.out.println("********************************************");
				        System.out.println(" !!! WELCOME TO INSTITUTE\n");
				        System.out.println("********************************************");
				        System.out.println("1. School");
		                System.out.println("2. College");
		                System.out.println("3. University\n");
		                System.out.print("\nPlese Enter your choice : ");
		                String choiceI=sc.nextLine();
				        switch(choiceI)
						{
							case "1":
							{
								Scanner scS = new Scanner(System.in);
								
								System.out.println("********************************************");
						        System.out.println("\nYou Select School \n");
						        System.out.println("********************************************");
						        System.out.println("1. Insert School");
		                        System.out.println("2. Search School");
								System.out.println("2. Show All School");
						        System.out.print("Plese Enter your choice : ");
				                String choiceC =scS.nextLine();
								switch(choiceC)
								{
									case"1":
									{
										Scanner scS1 = new Scanner(System.in);
										
										System.out.println("********************************************");
								        System.out.println("\nYou Select Insert School \n");
								        System.out.println("********************************************");
								        System.out.print("Input Name of the School : ");
				                        String schoolName=scS1.next();
				                        System.out.print("Input School Location : ");
				                        String schoolLocation=scS1.next();
				                        System.out.print("Input School Passing Rate : ");
				                        double schoolpassingRate=scS1.nextDouble();
				                        School cr=new School();
								        cr.setSchoolName(schoolName);
								        cr.setSchoolLocation(schoolLocation);
								        cr.setSchoolPassingRate(schoolpassingRate);
								        if(i.insertSchool(cr))
										{
											System.out.println("\nInserted successfully!!\n");
										}
										else
										{
											System.out.println("SORRY!!!YOU CAN'T INSERT SCHOOL.");
										}
										break;
									}
									case "2":
									{
										Scanner scS1 = new Scanner(System.in);
										
										System.out.println("********************************************");
								        System.out.println("\nYou Select Search School \n");
								        System.out.println("********************************************");
								        System.out.print("Input The Name of School : ");
						                String ri4 = scS1.next();

						                School s1 = i.searchSchool(ri4);

						                if(s1!= null)
										{
											System.out.println("We Find The School.");
							                System.out.println("---------------------------------------------");
							                System.out.println("Name Of The School is         : "+s1.getSchoolName());
				                            System.out.println("Location of School is         : "+s1.getSchoolLocation());
				                            System.out.println("Passing Rate of School is     : "+s1.getSchoolpassingRate());
									        System.out.println("---------------------------------------------");
										}
										else
										{
											System.out.println("Sorry!!We Can't Find The School.");
										}
										break;
									}
									case "3":
									{
										System.out.println("********************************************");
								        System.out.println("\n   You Select ShowAll School   \n");
								        System.out.println("********************************************");
										i.showAllSchool();
										break;
									}
									default:
									{
										System.out.println("Invalid Choice");
									}
								}
								break;
							}
							case "2":
							{
								Scanner scC = new Scanner(System.in);
								
								System.out.println("********************************************");
						        System.out.println("\nYou Select College  \n");
						        System.out.println("********************************************");
						        System.out.println("1. Insert College");
		                        System.out.println("2. Search College");
								System.out.println("3. Show all College");
						        System.out.print("Plese Enter your choice : ");
				                String choiceC =scC.nextLine();
					            switch(choiceC)
								{
									case "1":
									{
										Scanner scC1 = new Scanner(System.in);
										
										System.out.println("********************************************");
								        System.out.println("\nYou Select Insert College \n");
								        System.out.println("********************************************");
								        System.out.print("Input Name of the College : ");
				                        String collegName=scC1.next();
				                        System.out.print("Input College Location : ");
				                        String collegeLocation=scC1.next();
				                        System.out.print("Input College University Getting Rate : ");
				                        double universityChanceRate=scC1.nextDouble();
				                        College cl=new College();
								        cl.setCollegName(collegName);
								        cl.setCollegeLocation(collegeLocation);
								        cl.setUniversityChanceRate(universityChanceRate);
								        if(i.insertCollege(cl))
										{
											System.out.println("\nInserted successfully!!\n");
										}
										else
										{
											System.out.println("SORRY!!!YOU CAN'T INSERT College.");
										}
										break;
									}
									case "2":
									{
										Scanner scC1 = new Scanner(System.in);
										System.out.println("********************************************");
								        System.out.println("\nYou Select Search College \n");
								        System.out.println("********************************************");
								        System.out.print("Input The Name of College : ");
						                String col = scC1.next();
								
						                College cl = i. searchCollege(col);
								
								        if(cl!= null)
										{
											System.out.println("We Find The College.");
							                System.out.println("---------------------------------------------");
							                System.out.println("Name Of The College is                 : "+cl.getCollegName());
				                            System.out.println("Lacation of College is                 : "+cl.getCollegeLocation());
				                            System.out.println("University Chance Rate is              : "+cl.getUniversityChanceRate());
									        System.out.println("---------------------------------------------");
										}
										else
										{
											System.out.println("Sorry!!We Can't Find The College.");
										}
										break;
									}
									case "3":
									{
										System.out.println("********************************************");
								        System.out.println("\n   You Select ShowAll College   \n");
								        System.out.println("********************************************");
										i.showAllCollege();
										break;
									}
									default:
									{
										System.out.println("Invalid Choice");
									}
								}
								break;
							}
							case "3":
							{
								Scanner scU = new Scanner(System.in);
								
								System.out.println("********************************************");
						        System.out.println("\nYou Select University  \n");
						        System.out.println("********************************************");
						        System.out.println("1. Insert University");
		                        System.out.println("2. Search University");
								System.out.println("3. Show all University");
						        System.out.print("Plese Enter your choice : ");
				                String choiceU =scU.nextLine();
						        switch(choiceU)
								{
									case "1":
									{
										Scanner scU1 = new Scanner(System.in);
										
										System.out.println("********************************************");
								        System.out.println("\nYou Select Insert University \n");
								        System.out.println("********************************************");
								        System.out.print("Input Name of the University : ");
				                        String universityName=scU1.next();
				                        System.out.print("Input University Location : ");
				                        String universityLocation=scU1.next();
				                        System.out.print("Input University Getting Job Rate : ");
				                        double getingJobRate=scU1.nextDouble();
				                        University ul=new University();
								        ul.setUniversityName(universityName);
								        ul.setUniversityLocation(universityLocation);
								        ul.setGetingJobRate(getingJobRate);
								        if(i.insertUniversity(ul))
										{
											System.out.println("\nInserted successfully!!\n");
										}
										else
										{
											System.out.println("SORRY!!!YOU CAN'T INSERT UNIVERSITY.");
										}
										break;
									}
									case "2":
									{
										System.out.println("********************************************");
								        System.out.println("\nYou Select Search University \n");
								        System.out.println("********************************************");
								        System.out.print("Input The Name of University : ");
						                String un = scU.next();
								
						                University ul = i. searchUniversity(un);
								
							    
								        if( ul!= null)
										{
											System.out.println("We Find The University.");
							                System.out.println("---------------------------------------------");
							                System.out.println("Name of the University is                   : "+ul.getUniversityName());
				                            System.out.println("University Location    is                   : "+ul.getUniversityLocation());
				                            System.out.println("University Getting Job Rate is              : "+ul.getGetingJobRate());
									        System.out.println("---------------------------------------------");
										}
										else
										{
											System.out.println("Sorry!!We Can't Find The University.");
										}
										break;
									}
									case "3":
									{
										System.out.println("********************************************");
								        System.out.println("\n   You Select ShowAll University   \n");
								        System.out.println("********************************************");
										i.showAllUniversity();
										break;
									}
									default:
									{
										System.out.println("Invalid Choice");
									}
									
								}
								break;
							}
						}
						break;
					}
					case "4":
					{
						boolean repeatS=true;
						while(repeatS)
						{
							System.out.println("");
		                    System.out.println("");
		                    System.out.println("1. Fire Brigade");
		                    System.out.println("2. Medical");
		                    System.out.println("3. Police Station");
		                    System.out.println("4. Exit");
		                    System.out.println("Please choose any of them for Information and type it below-");
		                    String choiceS1=sc.next();
		                    switch(choiceS1)
							{
								case "1" :
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
				
				                    String choiceS =sc.next();
				                    switch(choiceS)
									{
										case "1" :
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
										case "2" :
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
									
									        if(delete==1)
											{
												if(f2 != null)
												{
													if(sr.removeFireBrigade(f2))
													{
														System.out.println("FireBrigade ID " +id +" Removed Successfully.");
													}
													else
													{
														System.out.println("FireBrigade can not be removed now. Try again later");
													}
												}
												else
												{
													System.out.println("No FireBrigade found.");
												}
											}
											else
											{
												System.out.println("FireBrigade is not deleted. Thanks for come back");
											}
											System.out.println("\n\n#######################################################\n\n");
											break;
										}
										case "3" :
										{
											System.out.println("********************************************");
								            System.out.println("\nYou Select Show all FireBrigade \n");
								            System.out.println("********************************************");
								            sr.showAllFireBrigade();
											break;
										}
										case "4" :
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
									}
									break;
								}
								case "2" :
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
										case "1" :
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
											if(sr.addMedical(md1))
											{
												System.out.println("\n------Insert successfully!!------\n");
											}
											else
											{
												System.out.println("SORRY!!!Try again later.");
											}
											break;
										}
										case "2" :
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
									
									        if(delete==1)
											{
												if(md2 != null)
												{
													if(sr.removeMedical(md2))
													{
														System.out.println("Medical ID " +mid +" Removed Successfully.");
													}
													else
													{
														System.out.println("Medical can not be removed now. Try again later");
													}
												}
												else
												{
													System.out.println("No Medical found.");
												}
											}
											else
											{
												System.out.println("Medical is not deleted. Thanks for come back");
											}
											break;
										}
										case "3" :
										{
											System.out.println("********************************************");
								            System.out.println("\nYou Select Show all Medical \n");
								            System.out.println("********************************************");
								            sr.showAllMedical();
								            break;
										}
									}
									break;
								}
								case "3" : 
								{
									System.out.println("");
		                            System.out.println("Please Choose a option :");
									System.out.println("-----------------------");
									System.out.println("-----------------------");
				                    System.out.println("1. Insert a Police Station");
				                    System.out.println("2. Show all Police Station");
				                    System.out.println("3. Search Police Station");
				                    System.out.println("4. Exit");
				                    System.out.println("-----------------------");
				                    System.out.println("-----------------------");
				
				                    String choiceC =sc.next();
				                    switch(choiceC)
									{
										case "1" :
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
					                        if(sr.addPoliceStation(p))
											{
												System.out.println("\n------Insert successfully!!------\n");
											}
											else
											{
												System.out.println("SORRY!!!Try again later.");
											}
											break;
										}
										case "3" :
										{
											System.out.println("********************************************");
								            System.out.println("\nYou Select Show all Police Station \n");
								            System.out.println("********************************************");
								            sr.showAllPoliceStation();
								        
								            break;
										}
										case "4" :
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
										case "5" :
										{
											repeat=false;
						                    System.out.println("\n------------------------------------------------------------");
						                    System.out.println("                 THANK YOU FOR BRING WITH US                  ");
						                    System.out.println("------------------------------------------------------------\n");
						                    break;
										}
										default :
										{
											System.out.println("\nInvalid Choice.\n");
										}
									}
									break;
								}
								case "4" :
								{
									repeatS=false;
									System.out.println("\nExiting From Service\n");
									break;
								}
								default:
								{
									System.out.println("\nInvalid Choice.\n");
								}
							}
						}
						break;
					}
					case "5":
					{
						repeat=false;
						System.out.println("\n------------------------------------------------------------");
						System.out.println("                 THANK YOU FOR BRING WITH US                  ");
						System.out.println("------------------------------------------------------------\n");
						break;
					}
					default:
					{
						System.out.println("\nInvalid Choice.\n");
					}
				}
			}
		}
		
		
		
		else
		{
			System.out.println("\n\nWrong User ID OR Password. Plese Try Again..\n\n");
		}
		}
/*##################################################################################################################################################
                                                                
																GUEST
																
##################################################################################################################################################*/
		
		
		if (choice0.equals("2"))
		{
			
			
			System.out.println("\n**************************************************************");
			System.out.println("                        You Select GUEST                        ");
			System.out.println("**************************************************************\n");
			boolean repeat=true;
		    while(repeat)
			{
				Scanner sc1 = new Scanner(System.in);
				
				System.out.println("-------------------------------------------");
				System.out.println("                 MAIN MENU                 ");
				System.out.println("-------------------------------------------");
				System.out.println("1.Restaurant.");
		        System.out.println("2.Accommodation.");
		        System.out.println("3.Institute.");
				System.out.println("4.Service.");
				System.out.println("5.Exit.\n");
		        System.out.print("\nPlese Enter your choice : ");
				String choice=sc1.nextLine();
				switch(choice)
				{
					case "1":
					{
						boolean repeatR=true;
						while(repeatR){
						
						Scanner scR = new Scanner(System.in);
						
						System.out.println("\n--------------------------------------------");
				        System.out.println("               WELCOME TO RESTURENT           ");
						System.out.println("--------------------------------------------\n");
				        System.out.println("1. Chinese Restaurant");
		                System.out.println("2. Italian Restaurant");
		                System.out.println("3. Local Restaurant");
						System.out.println("4. Exit From Restaurant");
						System.out.println("5. Exit From Smart City\n");
		                System.out.print("\nPlese Enter your choice : ");
		                String choiceR=scR.nextLine();
				        switch(choiceR)
						{
							case "1":
							{
								boolean repeatCR=true;
								while(repeatCR){
									
								Scanner scCR = new Scanner(System.in);
									
								System.out.println("\n**************************************************************");
						        System.out.println("                  You Select Chinese Restaurant                 ");
						        System.out.println("**************************************************************\n");
								//System.out.println("\n--------------------------------------------\n");
						        //System.out.println("1. Insert Chinese Restaurant.");
		                        //System.out.println("2. Remove Chinese Restaurants.");
						        System.out.println("1. Search Chinese Restaurants.");
						        System.out.println("2. Show All Inserted Chinese Restaurants.");
								System.out.println("3. Exit From Chinese Restaurant.");
								System.out.println("4. Go To Main Menu.");
								System.out.println("5. Exit From Smart City.\n");
						        System.out.print("Plese Enter your choice : ");
				                String choiceC =scCR.nextLine();
						        switch(choiceC)
								{
									
									case "1":
									{
										Scanner scCR1 = new Scanner(System.in);
										
										
										System.out.println("\n**************************************************************");
								        System.out.println("              You Select Search Chinese Restaurant             ");
								        System.out.println("**************************************************************\n");
								        System.out.print("Input The ID Of Chinese Restaurant : ");
						                String rid4 = scCR1.next();

						                ChineseRestaurant cr1 = r.searchChineseRestaurant(rid4);
										
										if(cr1!= null)
										{
											System.out.println("        We Find The Chinese Restaurant      ");
							                System.out.println("-------------------------------------------------------");
							                System.out.println("Name Of The Chinese Restaurant is       : "+cr1.getRName());
				                            System.out.println("ID Of The Chinese Restaurant is         : "+cr1.getRID());
				                            System.out.println("Location Of The Chinese Restaurant is   : "+cr1.getRLocation());
									        System.out.println("------------------------------------------------------\n");
										}
										else
										{
											System.out.println("Sorry!!We Can't Find The Chinese Restaurant.");
										}
										break;
									}
									case "2":
									{
										System.out.println("\n*********************************************************************");
								        System.out.println("             You Select Show all Inserted Chinese Restaurants           ");
								        System.out.println("************************************************************************\n");
								        r.showAllChineseRestaurant();
								        //frwd.readFromFile();
								        break;
									}
									case "3":
									{
										repeatCR=false;
										//System.out.println("-------------------------------------------");
									    System.out.println("            Exit From Chinese Restaurant       \n.");
									    //System.out.println("-------------------------------------------");
										break;
									}
									case "4":
									{
										repeatCR=false;
										repeatR=false;
										System.out.println("---------------------------------------------------");
									    System.out.println("             Going Back to the Main Menu");
									    System.out.println("--------------------------------------------------\n\n");
										break;
									}
									case "5":
									{
										repeatCR=false;
										repeatR=false;
										repeat=false;
										System.out.println("-------------------------------------------------");
						                System.out.println("              Thanks for being with us            ");
						                System.out.println("-------------------------------------------------\n\n");
										break;
									}
									default :
									{
										System.out.println("-------------------------------------------");
									    System.out.println("        Invalid option . Try again        ");
									    System.out.println("-------------------------------------------\n");
									}
								}
								}
								break;
							}
							case "2":
							{
								boolean repeatIR=true;
								while(repeatIR){
								
								Scanner scIR = new Scanner(System.in);
									
								System.out.println("\n**************************************************************");
						        System.out.println("                You Select Italian Restaurant                   ");
						        System.out.println("**************************************************************\n");
								//System.out.println("\n--------------------------------------------\n");
						        //System.out.println("1. Insert Italian Restaurant");
		                        //System.out.println("2. Remove Italian Restaurants.");
						        System.out.println("1. Search Italian Restaurants.");
						        System.out.println("2. Show All Inserted Italian Restaurants.");
								System.out.println("3. Exit From Italian Restaurant.");
								System.out.println("4. Go To Main Menu.");
								System.out.println("5. Exit From Smart City.\n");
						        System.out.print("Plese Enter your choice : ");
				                String choiceI =scIR.nextLine();
						        switch(choiceI)
								{
									case "1":
									{
										Scanner scIR1 = new Scanner(System.in);
										
										
										System.out.println("\n**************************************************************");
								        System.out.println("            You Select Search Italian Restaurant                 ");
								        System.out.println("**************************************************************\n");
								        System.out.print("Input The Italian Restaurant  ID: ");
						                String rid4 = scIR1.nextLine();

						                ItalianRestaurant ir1 = r.searchItalianRestaurant(rid4);

						                if(ir1!= null)
										{
											System.out.println("             We Find The Italian Restaurant.              ");
							                System.out.println("------------------------------------------------------------");
							                System.out.println("Name of the Italian Restaurant is     : "+ir1.getRName());
				                            System.out.println("ID of the Italian Restaurant is       : "+ir1.getRID());
				                            System.out.println("Location of the Italian Restaurant is : "+ir1.getRLocation());
									        System.out.println("------------------------------------------------------------\n");
										}
										else
										{
											System.out.println("Sorry!!We Can't Find The Italian Restaurant.\n");
										}
										break;
									}
									case "2":
									{
										System.out.println("\n**************************************************************");
								        System.out.println("        You Select Show all Inserted Italian Restaurants         ");
								        System.out.println("**************************************************************\n");
								        r.showAllItalianRestaurant();
								        //frwd.readFromFile();
								        break;
									}
									case "3":
									{
										repeatIR=false;
										System.out.println("-------------------------------------------");
									    System.out.println("      Exit From Italian Restaurant        ");
									    System.out.println("-------------------------------------------");
										break;
									}
									case "4":
									{
										repeatIR=false;
										repeatR=false;
										System.out.println("-------------------------------------------");
									    System.out.println("         Going Back to the main menu       ");
									    System.out.println("-------------------------------------------");
										break;
									}
									case "5":
									{
										repeatIR=false;
										repeatR=false;
										repeat=false;
										System.out.println("-------------------------------------------");
						                System.out.println("        Thanks for being with us     ");
						                System.out.println("-------------------------------------------");
										break;
									}
									default :
									{
										System.out.println("-------------------------------------------");
									    System.out.println("       Invalid option . Try again        ");
									    System.out.println("-------------------------------------------");
									}
								}
								}
								break;
							}
							case "3":
							{
								boolean repeatLR=true;
								while(repeatLR){
									
								Scanner scLR = new Scanner(System.in);
									
								System.out.println("\n**************************************************************");
						        System.out.println("                   You Select Local Restaurant                  ");
						        System.out.println("**************************************************************\n");
								//System.out.println("\n--------------------------------------------\n");
						        //System.out.println("1. Insert Local Restaurants");
		                        //System.out.println("2. Remove Local Restaurants.");
						        System.out.println("1. Search Local Restaurants.");
						        System.out.println("2. Show All Inserted Local Restaurants.");
								System.out.println("3. Exit From Local Restaurants.");
								System.out.println("4. Go To Main Menu.");
								System.out.println("5. Exit From Smart City.\n");
						        System.out.print("Plese Enter your choice : ");
				                String choiceL =scLR.nextLine();
						        switch(choiceL)
								{
									
									case "1":
									{
										Scanner scLR1 = new Scanner(System.in);
										
										
										System.out.println("\n**************************************************************");
								        System.out.println("              You Select Search Local Restaurant                ");
								        System.out.println("**************************************************************\n");
								        System.out.print("Input Local Restaurant  ID : ");
						                String rid4 = scLR1.nextLine();

						                LocalRestaurant lr1 = r.searchLocalRestaurant(rid4);

						                if(lr1!= null)
										{
											System.out.println("             We Find The Local Restaurant.              ");
							                System.out.println("---------------------------------------------------------");
							                System.out.println("Name of the Local Restaurant is     : "+lr1.getRName());
				                            System.out.println("ID of the Local Restaurant is       : "+lr1.getRID());
				                            System.out.println("Location of the Local Restaurant is : "+lr1.getRLocation());
									        System.out.println("-----------------------------------------------==---------\n");
										}
										else
										{
											System.out.println("Sorry!!We Can't Find The Local Restaurant.");
										}
										break;
									}
									case "2":
									{
										/*System.out.println("********************************************");
								        System.out.println("\nYou Select Show all Inserted Local Restaurants \n");
								        System.out.println("********************************************");
								        r.showAllLocalRestaurant();*/
								        frwd.readFromFile();
										System.out.println("---------------------------------------------");
								        break;
									}
									case "3":
									{
										repeatLR=false;
										System.out.println("-------------------------------------------");
									    System.out.println("         Exit From Local Restaurants        ");
									    System.out.println("-------------------------------------------/n");
										break;
									}
									case "4":
									{
										repeatLR=false;
										repeatR=false;
										System.out.println("-------------------------------------------");
									    System.out.println("        Going Back to the Main Menu       ");
									    System.out.println("-------------------------------------------");
										break;
									}
									case "5":
									{
										repeatLR=false;
										repeatR=false;
										repeat=false;
										System.out.println("-------------------------------------------");
						                System.out.println("          Thanks for being with us          ");
						                System.out.println("-------------------------------------------\n");
										break;
									}
									default :
									{
										System.out.println("-------------------------------------------");
									    System.out.println("         Invalid option . Try again       ");
									    System.out.println("-------------------------------------------\n");
									}
								}
								}
								break;
							}
							case "4":
							{
								repeatR=false;
								System.out.println("-------------------------------------------");
								System.out.println("        Going Back to the main menu        ");
							    System.out.println("-------------------------------------------\n");
								break;
							}
							case "5":
							{
								repeatR=false;
								repeat=false;
								System.out.println("-------------------------------------------");
						        System.out.println("           Thanks for being with us        ");
						        System.out.println("-------------------------------------------\n");
								break;
							}
							default :
							{
								System.out.println("\n-------------------------------------------");
								System.out.println("       Invalid option . Try again      ");
								System.out.println("-------------------------------------------\n");
							}
						}
						}
						break;
					}
					case "2": 
					{
						Scanner scA = new Scanner(System.in);
						
						System.out.println("********************************************");
				        System.out.println("\nHABIBI !!! WELCOME TO Accommodation\n");
				        System.out.println("********************************************");
				        System.out.println("1. Flat.");
		                System.out.println("2. Hotel.");
						System.out.println("3. Exit From Accommodation.");
		                System.out.print("\nPlese Enter your choice : ");
		                String choiceA=scA.nextLine();
						switch(choiceA)
						{
							case "1":
							{
								Scanner scF = new Scanner(System.in);
								
								System.out.println("********************************************");
						        System.out.println("\nYou Select Flat \n");
						        System.out.println("********************************************");
						        //System.out.println("1.Insert Flat.");
		                        System.out.println("1.Search Flat.");
						        System.out.println("2. Show All Inserted Flat.");
								System.out.println("3.Exit From Smart City.");
						        System.out.print("Plese Enter your choice : ");
				                String choiceA1 =scF.nextLine();
								switch(choiceA1)
								{
									
									case "1":
									{
										Scanner scF1 = new Scanner(System.in);
										
										System.out.println("********************************************");
								        System.out.println("\nYou Select Search Flat  \n");
								        System.out.println("********************************************");
								        System.out.print("Input House Name : ");
						                String rid4 = scF1.next();

						                Flat f1 = a.searchFlat(rid4);

						                if(f1!= null)
										{
											System.out.println("We Find The Flat .");
							                System.out.println("---------------------------------------------");
							                System.out.println("House Name is       : "+f1.getAName());
				                            System.out.println("Flat size is        : "+f1.getASize());
		                                    System.out.println("rent of the flat is : "+f1.getARent());
				                            System.out.println("Number of Flats is  : "+f1.getATotalNumber());
		                                    System.out.println("Booked  flats is    : "+f1.getABookedNumber());
				                            System.out.println("Booked  flats is    : "+f1.getAvilAbleNumber());
		                                    System.out.println("House Location is   : "+f1.getALocation());
									        System.out.println("---------------------------------------------");
										}
										else
										{
											System.out.println("Sorry!!We Can't Find The Flat.");
										}
										break;
									}
									case "2":
									{
										System.out.println("********************************************");
								        System.out.println("\nYou Select Show all Inserted Flat  \n");
								        System.out.println("********************************************");
								        a.showAllFlat();
								        break;
									}
									case "3":
									{
										repeat=false;
										System.out.println("-------------------------------------------");
									    System.out.println("Thank You for Bring With Us...............");
									    System.out.println("-------------------------------------------");
										break;
									}
									default :
									{
										System.out.println("-------------------------------------------");
									    System.out.println("Invalid option . Try again...............");
									    System.out.println("-------------------------------------------");
									}
								}
								break;
							}
							case "2":
							{
								Scanner scH = new Scanner(System.in);
								
								System.out.println("********************************************");
						        System.out.println("\nYou Select Hotel \n");
						        System.out.println("********************************************");
						        //System.out.println("1. Insert Hotel.");
		                        System.out.println("1. Search Hotel.");
								System.out.println("2. Show All Inserted Flat.");
								System.out.println("3. Exit From Smart City.");
						        System.out.print("Plese Enter your choice : ");
				                String choiceA2 =scH.nextLine();
								switch(choiceA2)
								{
									case "1":
									{
										Scanner scH1 = new Scanner(System.in);
										
										System.out.println("********************************************");
								        System.out.println("\nYou Select Search Hotel \n");
								        System.out.println("********************************************");
								        System.out.print("Input The Name Of Hotel : ");
						                String rid4 = scH1.next();
										
						                Hotel h1 = a.searchHotel(rid4);

						                if(h1!= null)
										{
											System.out.println("We Find The Hotel.");
							                System.out.println("---------------------------------------------");
							                System.out.println("Hotel Name is          : "+h1.getAName());
				                            System.out.println("Room Size is           : "+h1.getASize());
		                                    System.out.println("Rent For Room(Per Day) : "+h1.getARent());
				                            System.out.println("Number of Room is      : "+h1.getATotalNumber());
		                                    System.out.println("Boked Room is          : "+h1.getABookedNumber());
				                            System.out.println("Boked Room is          : "+h1.getAvilAbleNumber());
		                                    System.out.println("Hotel Location is      : "+h1.getALocation());
									        System.out.println("---------------------------------------------");
										}
										else
										{
											System.out.println("\nSorry!!We Don't Find The Hotel.\n");
										}
										break;
									}
									case "2":
									{
										System.out.println("********************************************");
								        System.out.println("\nYou Select Show all Inserted Hotel \n");
								        System.out.println("********************************************");
								        a.showAllFlat();
								        break;
									}
									case "3":
									{
										repeat=false;
										System.out.println("-------------------------------------------");
									    System.out.println("Thank You for Bring With Us...............");
									    System.out.println("-------------------------------------------");
										break;
									}
									default :
									{
										System.out.println("-------------------------------------------");
									    System.out.println("Invalid option . Try again...............");
									    System.out.println("-------------------------------------------");
									}
								}
								break;
							}
							case "3":
							{
								System.out.println("-------------------------------------------");
								System.out.println("Going Back to the main menu...............");
							    System.out.println("-------------------------------------------");
								break;
							}
							default :
							{
								System.out.println("-------------------------------------------");
								System.out.println("Invalid option . Try again...............");
								System.out.println("-------------------------------------------");
							}
						}
						break;
					}
					case "3":
					{
						Scanner scI = new Scanner(System.in);
						
						System.out.println("********************************************");
				        System.out.println(" !!! WELCOME TO INSTITUTE\n");
				        System.out.println("********************************************");
				        System.out.println("1. School");
		                System.out.println("2. College");
		                System.out.println("3. University\n");
		                System.out.print("\nPlese Enter your choice : ");
		                String choiceI=sc.nextLine();
				        switch(choiceI)
						{
							case "1":
							{
								Scanner scS = new Scanner(System.in);
								
								System.out.println("********************************************");
						        System.out.println("\nYou Select School \n");
						        System.out.println("********************************************");
						        System.out.println("1. Search School");
		                        System.out.println("2. Show All School");
								
						        System.out.print("Plese Enter your choice : ");
				                String choiceC =scS.nextLine();
								switch(choiceC)
								{
									
									case "1":
									{
										Scanner scS1 = new Scanner(System.in);
										
										System.out.println("********************************************");
								        System.out.println("\nYou Select Search School \n");
								        System.out.println("********************************************");
								        System.out.print("Input The Name of School : ");
						                String ri4 = scS1.next();

						                School s1 = i.searchSchool(ri4);

						                if(s1!= null)
										{
											System.out.println("We Find The School.");
							                System.out.println("---------------------------------------------");
							                System.out.println("Name Of The School is         : "+s1.getSchoolName());
				                            System.out.println("Location of School is         : "+s1.getSchoolLocation());
				                            System.out.println("Passing Rate of School is     : "+s1.getSchoolpassingRate());
									        System.out.println("---------------------------------------------");
										}
										else
										{
											System.out.println("Sorry!!We Can't Find The School.");
										}
										break;
									}
									case "2" :
									{
										i.showAllSchool();
										break;
									}
									default:
									{
										System.out.println("Invalid Choice");
									}
								}
								break;
							}
							case "2":
							{
								Scanner scC = new Scanner(System.in);
								
								System.out.println("********************************************");
						        System.out.println("\nYou Select College  \n");
						        System.out.println("********************************************");
						        System.out.println("1. Search College");
		                        System.out.println("2. Show All College");
						        System.out.print("Plese Enter your choice : ");
				                String choiceC =scC.nextLine();
					            switch(choiceC)
								{

									case "1":
									{
										Scanner scC1 = new Scanner(System.in);
										System.out.println("********************************************");
								        System.out.println("\nYou Select Search College \n");
								        System.out.println("********************************************");
								        System.out.print("Input The Name of College : ");
						                String col = scC1.next();
								
						                College cl = i. searchCollege(col);
								
								        if(cl!= null)
										{
											System.out.println("We Find The College.");
							                System.out.println("---------------------------------------------");
							                System.out.println("Name Of The College is                 : "+cl.getCollegName());
				                            System.out.println("Lacation of College is                 : "+cl.getCollegeLocation());
				                            System.out.println("University Chance Rate is              : "+cl.getUniversityChanceRate());
									        System.out.println("---------------------------------------------");
										}
										else
										{
											System.out.println("Sorry!!We Can't Find The College.");
										}
										break;
									}
									case "2" :
									{
										i.showAllCollege();
										break;
									}
									default:
									{
										System.out.println("Invalid Choice");
									}
								}
								break;
							}
							case "3":
							{
								Scanner scU = new Scanner(System.in);
								
								System.out.println("********************************************");
						        System.out.println("\nYou Select University  \n");
						        System.out.println("********************************************");
						        System.out.println("1. Search University");
		                        System.out.println("2. Show All University");
						        System.out.print("Plese Enter your choice : ");
				                String choiceU =scU.nextLine();
						        switch(choiceU)
								{
									
									case "1":
									{
										System.out.println("********************************************");
								        System.out.println("\nYou Select Search University \n");
								        System.out.println("********************************************");
								        System.out.print("Input The Name of University : ");
						                String un = scU.next();
								
						                University ul = i. searchUniversity(un);
								
							    
								        if( ul!= null)
										{
											System.out.println("We Find The University.");
							                System.out.println("---------------------------------------------");
							                System.out.println("Name of the University is                   : "+ul.getUniversityName());
				                            System.out.println("University Location    is                   : "+ul.getUniversityLocation());
				                            System.out.println("University Getting Job Rate is              : "+ul.getGetingJobRate());
									        System.out.println("---------------------------------------------");
										}
										else
										{
											System.out.println("Sorry!!We Can't Find The University.");
										}
										break;
									}
									case "2" :
									{
										i.showAllUniversity();
										break;
									}
									default:
									{
										System.out.println("Invalid Choice");
									}
								}
								break;
							}
						}
						break;
					}
					case "4":
					{
						boolean repeatS=true;
						while(repeatS)
						{
							System.out.println("");
		                    System.out.println("");
		                    System.out.println("1. Fire Brigade");
		                    System.out.println("2. Medical");
		                    System.out.println("3. Police Station");
		                    System.out.println("4. Exit");
		                    System.out.println("Please choose any of them for Information and type it below-");
		                    String choiceS1=sc.next();
		                    switch(choiceS1)
							{
								case "1" :
								{
									System.out.println("");
		                            System.out.println("Please Choose a option :");
				
		                            System.out.println("-----------------------");
		                            System.out.println("-----------------------");
				                    System.out.println("1. Show all FireBrigade");
				                    System.out.println("2. Search FireBrigade");
				                    System.out.println("3. Exit");
				                    System.out.println("-----------------------");
				                    System.out.println("-----------------------");
				
				                    String choiceS =sc.next();
				                    switch(choiceS)
									{
										case "1" :
										{
											System.out.println("********************************************");
								            System.out.println("\nYou Select Show all FireBrigade \n");
								            System.out.println("********************************************");
								            sr.showAllFireBrigade();
											break;
										}
										case "2" :
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
									}
									break;
								}
								case "2" :
								{
									System.out.println("");
		                            System.out.println("Please Choose a option :");
				
		                            System.out.println("-----------------------");
		                            System.out.println("-----------------------");
				                    System.out.println("1. Show All Hospital ");
				
				                    System.out.println("2. Exit");
				                    System.out.println("-----------------------");
				                    System.out.println("-----------------------");
				
				                    String choiceC =sc.next();
				                    switch(choiceC)
									{
										case "1" :
										{
											System.out.println("********************************************");
								            System.out.println("\nYou Select Show all Medical \n");
								            System.out.println("********************************************");
								            sr.showAllMedical();
								            break;
										}
									}
									break;
								}
								case "3" : 
								{
									System.out.println("");
		                            System.out.println("Please Choose a option :");
									System.out.println("-----------------------");
									System.out.println("-----------------------");
				                    System.out.println("1. Show Police Station");
									System.out.println("2. Search Police Station");
				                    System.out.println("3. Exit");
				                    System.out.println("-----------------------");
				                    System.out.println("-----------------------");
				
				                    String choiceC =sc.next();
				                    switch(choiceC)
									{
										case "1" :
										{
											System.out.println("********************************************");
								            System.out.println("\nYou Select Show all Police Station \n");
								            System.out.println("********************************************");
								            sr.showAllPoliceStation();
								        
								            break;
										}
										case "2" :
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
										case "3" :
										{
											repeat=false;
						                    System.out.println("\n------------------------------------------------------------");
						                    System.out.println("                 THANK YOU FOR BRING WITH US                  ");
						                    System.out.println("------------------------------------------------------------\n");
						                    break;
										}
										default :
										{
											System.out.println("\nInvalid Choice.\n");
										}
									}
									break;
								}
								case "4" :
								{
									repeatS=false;
									System.out.println("\nExiting From Service\n");
									break;
								}
								default:
								{
									System.out.println("\nInvalid Choice.\n");
								}
							}
						}
						break;
					}
					case "5":
					{
						repeat=false;
						System.out.println("\n------------------------------------------------------------");
						System.out.println("                 THANK YOU FOR BRING WITH US                  ");
						System.out.println("------------------------------------------------------------\n");
						break;
					}
					default:
					{
						System.out.println("\nInvalid Choice.\n");
					}
				}
			}
		}
/*##################################################################################################################################################
                                                                
																EXIT FROM SMART CITY
																
##################################################################################################################################################*/
		if (choice0.equals("3"))
		{
			repeat0=false;
			System.out.println("\n------------------------------------------------------------");
			System.out.println("                 THANK YOU FOR BRING WITH US                  ");
			System.out.println("------------------------------------------------------------\n");
		}
		else
		{
			System.out.println("\n\nInvalid Choice\n\n");
		}
		}
	}
}
	