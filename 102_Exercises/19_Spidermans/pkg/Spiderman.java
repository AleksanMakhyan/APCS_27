package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spiderman {
	String actor;		// What's the actors name?
	int age;			// What's the age of the actor?
	String villain;		// Who's the arch nemesis of this Spiderman?

	public Spiderman() {
		actor = "unknown";
		age = 0;
		villain = "unknown";
	}

	public Spiderman(String name) {
		age = 0;
		villain = "unknown";
		actor = name;
	}

	public Spiderman(String name , int years) {
		actor = name;
		villain = "unknown";
		age = years;
	}
	
	public Spiderman(String name, int years, String vil) {
		actor = name;
		age = years;
		villain = vil;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int years) {
		age = years;
	}
	public String getActor() {
		return actor;
	}

	public void setActor(String name) {
		actor = name;
	}
	public String getVillain() {
		return villain;
	}

	public void setVillain(String vil) {
		villain = vil;
	}
	
	// ---------------------------------------
	// Create accessor and mutator methods for actor, age, and villain (6 total methods)
	// Ex: getAge and setAge
	


	// ---------------------------------------
	public void fight(){
		System.out.println("Spidey shoots his web at " + villain);
	}

	public void printArt(){				// Prints out Spidey!
	System.out.println("           :              ");  
    System.out.println("           ;              ");   
    System.out.println("          :               ");   
    System.out.println("          ;               ");   
    System.out.println("         /                ");   
    System.out.println("       o/                 ");   
    System.out.println("     ._/\\___,             ");    
    System.out.println("         \\                ");   
    System.out.println("         /    			  "); 
	}
}
