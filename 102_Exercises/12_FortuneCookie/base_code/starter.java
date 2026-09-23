/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	System.out.println("Welcome to the Fortune Cookie Generator");
	System.out.println("");
	int fortune = (int)(Math.random() * 10 + 1);
	if (fortune == 1) {	System.out.println("Success will come with time");}
	if (fortune == 2) {	System.out.println("Don't be afraid of failure");}	
	if (fortune == 3) {	System.out.println("Be wise with your time — it doesn’t come back");}	
	if (fortune == 4) {	System.out.println("Try new things, they can shape new realities");}	
	if (fortune == 5) {	System.out.println("Everything will fall in place once the time is right");}
	if (fortune == 6) {	System.out.println("Your progress will lead to success");}	
	if (fortune == 7) {	System.out.println("Your failures are the foundation of your character");}	
	if (fortune == 8) {	System.out.println("Don't forget to show appreciation for the opportunities you recieve");}	
	if (fortune == 9) {	System.out.println("Don't let anger destroy your character");}	
	if (fortune == 10) {System.out.println("Leave the coding before the coding leaves you");}	

	}
}
