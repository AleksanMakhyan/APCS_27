
import java.util.Scanner;
class starter { 

    public static boolean checkPrime(int a) {
        if (a <= 1) {
            return false;
        }
        
        int num = a - 1;
        while (num > 1) {
            if (a % num == 0) {
                return false;
            }
            num--;
        }
        return true; 
    }

    public static void printPrimes(int counter) {
        while (counter > 1) {
            if (checkPrime(counter)) {
                System.out.println(counter);
            }
            counter--;
        }
    }

    public static void main(String args[]) { 
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Please enter the highest number checked to be prime:"); 
        int counter = sc.nextInt(); 
        
        printPrimes(counter);
        
    } 
}
