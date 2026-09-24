/*
 *	Author:
 *  Date:
 * 	Collaborator:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("The goal of the game is to guess a word with two hints! ");
int randomizer = (int)(Math.random() *2 + 1);
String answer = "";
String hint1 = "";
String hint2 = "";
if (randomizer == 1) {
	answer = "dog";
	hint1 = "It's a common household pet!";
	hint2 = "They're known for their loyalty and friendly nature!";
}
if (randomizer == 2) {
	answer = "apple";
	hint1 = "It's a fruit that grows on a tree!";
	hint2 = "An _____ a day keeps the doctor away!";
}
if (randomizer == 3) {	
	answer = "cloud";
	hint1 = "When you look up into the sky you can see them!";
	hint2 = "It's often white or grey depending on the weather!";
}
System.out.println(hint1);
System.out.print("What is your guess? ");
String response = sc.nextLine();

if (response.equalsIgnoreCase(answer)) {
	System.out.println("You got it! Woo!!!");
} else {
	System.out.println("You sadly didn't guess it right, here's another hint!");
	System.out.println(hint2);
	System.out.println("What is your second guess? ");
	String response2 = sc.nextLine();
	if (response.equalsIgnoreCase(answer)) {
		System.out.println("YAY you got it correct!");
	} else {
		System.out.println("Sorry you have used up all your hints, please try again! ");
	}
}
	
	}
}
