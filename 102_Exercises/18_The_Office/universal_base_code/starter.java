/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		Employee DwightSchrute = new Employee(1987 ,"Dwight", "Schrute", 4416.66);
		Employee JimHalpert = new Employee(2474, "Jim", "Halpert", 4416.66);
		Employee PamBeesly = new Employee(2011, "Pam" ,"Beesly", 2250);
		Employee JohnSmith = new Employee(2934, "John" ,"Smith", 3940);
		DwightSchrute.raiseSalary(20);
		JimHalpert.raiseSalary(20);
		PamBeesly.raiseSalary(20);
		JohnSmith.raiseSalary(20);
		System.out.println(DwightSchrute.getSalary());
		System.out.println(JimHalpert.getSalary());
		System.out.println(PamBeesly.getSalary());
		System.out.println(JohnSmith.getSalary());
		System.out.println(DwightSchrute.getAnnualSalary());
		System.out.println(JimHalpert.getAnnualSalary());
		System.out.println(PamBeesly.getAnnualSalary());
		System.out.println(JohnSmith.getAnnualSalary());
		DwightSchrute.employeeToString();
		JimHalpert.employeeToString();
		PamBeesly.employeeToString();
		JohnSmith.employeeToString();
	}
}
