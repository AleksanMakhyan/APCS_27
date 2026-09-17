
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		System.out.println("An Integer range 0-9 " + ((int)(Math.random() * 10)));
		System.out.println("An Integer range 1-100 "  + ((int)(Math.random() * 100 + 1)));
		System.out.println("A Double range 2.5-3.5 " + ((double)(Math.random() + 2.5)));
		System.out.println("A Double range 14-589 " + ((double)(Math.random() * 575 + 14)));
	}
}
