/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select your role (Wizard, Warrior, or a Rogue): ");
		String role = sc.nextLine();
		if (role.equalsIgnoreCase("Wizard") || role.equalsIgnoreCase("Warrior") || role.equalsIgnoreCase("Rogue") ) {
			System.out.println("The role you chose was the " + role + " role!");
		} else {
			System.out.println("Please try again, your input doesn't match the criteria: ");
		}
		
		
	}
}
