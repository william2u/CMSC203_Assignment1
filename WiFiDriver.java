//package assignment1;

import java.util.Scanner; 

public class WiFiDriver {
 
	public static void main(String[] args) {
		
		String answer = "";
		//Boolean fix = false ;
		//String non  = new String("no");
		String oui  = new String("yes");
		
		//prompt purpose of this program
		System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work.\n");
		
		// Create a new object of type Scanner that reads from the keyboard
		Scanner input = new Scanner(System.in); 
		
		//prompt first step
		System.out.println("First step: reboot your computer\r\n" + 
				"Are you able to connect with the internet? (yes or no)");
		
		// Read in the line that the user types
		answer = input.nextLine();
		
		if ( answer.equals(oui) ){ 
			//fix = true;
		}else {
			//prompt second step
			System.out.println("Second step: reboot your router\r\n" + 
					"Now are you able to connect with the internet? (yes or no)");
			// Read in the line that the user types
			answer = input.nextLine();
				
			if ( answer.equals(oui) ){ 
				//fix = true;
			}else {
				//prompt third step
				System.out.println("hird step: make sure the cables to your router are plugged in firmly and your router is getting power\r\n" + 
						"Now are you able to connect with the internet? (yes or no)");
				// Read in the line that the user types
				answer = input.nextLine();
					
				if ( answer.equals(oui) ){ 
					//fix = true;
				}else {
					//prompt fourth step
					System.out.println("Fourth step: move your computer closer to your router\r\n" + 
							"Now are you able to connect with the internet? (yes or no)");
					// Read in the line that the user types
					answer = input.nextLine();
						
					if ( answer.equals(oui) ){ 
						//fix = true;
					}else {
						//prompt fifth step
						System.out.println("Fifth step: contact your ISP\r\n" + 
								"Make sure your ISP is hooked up to your router.");
					}
				}		
			}			
		}
		
		// close scanner
		input.close();
		
		System.out.println("\nThank you for using this program. Have a good day.\n");
		
	}
}
