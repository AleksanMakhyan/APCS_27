/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("What is your name? ");
		String name = sc.nextLine();
		System.out.print("What is your title? Ex: Slayer of Dragons: ");
		String title = sc.nextLine();
		System.out.println("Please select your role (Wizard, Warrior, or a Rogue): ");
		String role = sc.nextLine();
		if (role.equalsIgnoreCase("Wizard") || role.equalsIgnoreCase("Warrior") || role.equalsIgnoreCase("Rogue") ) {
			System.out.println("The role you chose was the " + role + " role!");
		} else {
			System.out.println("Please try again, your input doesn't match the criteria: ");
		}
		System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, Constitution, and Charisma. Spend them wisely.");
		int skillpoints = 20;
		System.out.print("Strength (1-10): ");
		int strength = sc.nextInt();
		sc.nextLine();
		skillpoints = skillpoints - strength;
		System.out.println("You have " + skillpoints + " left to spend.");
		System.out.print("Dexterity (1-10): ");
		int dexterity = sc.nextInt();
		sc.nextLine();
		skillpoints = skillpoints - strength;
		System.out.println("You have " + skillpoints + " left to spend.");
		System.out.print("Intelligence (1-10): ");
		int intelligence = sc.nextInt();
		sc.nextLine();
		skillpoints = skillpoints - strength;
		System.out.println("You have " + skillpoints + " left to spend.");
		System.out.print("Constitution (1-10): ");
		int constitution = sc.nextInt();
		sc.nextLine();
		skillpoints = skillpoints - strength;
		System.out.println("You have " + skillpoints + " left to spend.");
		System.out.print("Charisma (1-10): ");
		int charisma = sc.nextInt();
		sc.nextLine();
		skillpoints = skillpoints - strength;
		System.out.println("You have " + skillpoints + " left to spend.");

		if (skillpoints >= 0) {
			System.out.println("You are " + name + ", the " + title +" of CHVS.");
			System.out.println("You're a " + role + " with the following stats!");
			System.out.println("Strength - " + strength);
			System.out.println("Dexterity - " + dexterity);
			System.out.println("Intelligence - " + intelligence);
			System.out.println("Constitution - " + constitution);
			System.out.println("Charisam - " + charisma);
			System.out.println("");
			System.out.println("Good luck on your quest " + name);
		} else {
			System.out.println("You ran out of skillpoints please try again!");
		}
	}
}
