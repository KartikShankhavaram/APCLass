public class Main {

	public static void main(String args[]) {
	
		Scanner in = new Scanner(System.in);
		
		int ID, pages, length;
		String title, type;
		int numberPrinted = 0, numberMultimedia = 0;
		char a;
		
		Printed p[] = new Printed[100];
		Multimedia m[] = new Multimedia[100];
		
		while(true) {
			
			System.out.println("Enter 'p' for Printed items and 'm' for multimedia items (without quotes) or 'q' to exit the program: ");
			a = '';
			a = in.nextLine.charAt(0);
			if(a != 'm' && a != 'p' && a != 'q') {
				
				System.out.print("Enter 'p' or 'm' or 'q': ");
				a = in.nextLine.charAt(0);
				
			}
			
			switch(a) {
				
				case 'm': 
					while(true) {
					
						boolean exitFlag = false;
						
						System.out.println("1. Enter details\n2. Search using ID\n3. Display number of records\n4.Exit\nEnter option: ");
						int b = Integer.parseInt(in.nextLine());
						
						switch(b) {
						
							case 1: 
							 
								System.out.print("\nEnter ID: ");
								int ID = Integer.parseInt(in.nextLine());
								System.out.print("\nEnter title: ");
								String title = in.nextLine();
								System.out.print("\nEnter type: ");
								String type = in.nextLine();
								System.out.print("\nEnter length(in seconds): ");
								int length = Integer.parseInt(in.nextLine());
								
								m[numberMultimedia++] = new Multimedia(ID, title, length, type);
								break;
								
							case 2: 
							
								System.out.print("\nEnter ID to be searched: ");
								int search = Integer.parseInt(in.nextLine());
								int flag = 0;
								for(int i = 0; i < numberMultimedia; i++) {
									
									if(m[i].getID == search) {
										
										m[i].display();
										flag = 1;
										break;
										
									}
									
								}
								if(flag == 0) {
									
									System.out.println("\nNo record with that ID was found.");
									
								}
								break;
								
							case 3: 
							
								System.out.println("\nNumber of records: " + numberMultimedia);
								break;
								
							case 4: 
							
								exitFlag = true;
								break:
								
							default: 
							
								System.out.println("\nEnter correct option.");
								
						}

						if(exitFlag) {
							break;
						}
							
					}

				case 'p':

					while(true) {

						boolean exitFlag = false;

						System.out.println("1. Enter details\n2. Search using ID\n3. Display number of records\n4.Exit\nEnter option: ");
						int b = Integer.parseInt(in.nextLine());

						switch(b) {

							case 1:

								System.out.print("\nEnter ID: ");
								int ID = Integer.parseInt(in.nextLine());
								System.out.print("\nEnter title: ");
								String title = in.nextLine();
								System.out.print("\nEnter type: ");
								String type = in.nextLine();
								System.out.print("\nEnter length(in seconds): ");
								int length = Integer.parseInt(in.nextLine());

								m[numberMultimedia++] = new Multimedia(ID, title, length, type);
								break;

							case 2:

								System.out.print("\nEnter ID to be searched: ");
								int search = Integer.parseInt(in.nextLine());
								int flag = 0;
								for(int i = 0; i < numberMultimedia; i++) {

									if(m[i].getID == search) {

										m[i].display();
										flag = 1;
										break;

									}

								}
								if(flag == 0) {

									System.out.println("\nNo record with that ID was found.");

								}
								break;

							case 3:

								System.out.println("\nNumber of records: " + numberMultimedia);
								break;

							case 4:

								exitFlag = true;
								break:

							default:

								System.out.println("\nEnter correct option.");

						}

						if(exitFlag) {
							break;
						}
						
					}
					
				}
				
			}
							
								
}
