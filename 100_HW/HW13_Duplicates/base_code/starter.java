import java.util.Arrays;
import java.util.Random;

public class starter {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10) + 1;
        }
        System.out.println("Array: " + Arrays.toString(numbers));

        int target = random.nextInt(10) + 1;
        System.out.println("Target: " + target);
        int matches = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println("Match at index " + i);
                matches++;
            }
        }
        System.out.println("Total matches: " + matches);
        System.out.println("Duplicates after the first match: " + Math.max(0, matches - 1));

        boolean foundPair = false;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i - 1] == numbers[i]) {
                System.out.println("Indexes " + (i - 1) + " and " + i
                        + " both contain " + numbers[i]);
                foundPair = true;
            }
        }
        if (!foundPair) {
            System.out.println("No equal neighbors.");
        }
    }
}
