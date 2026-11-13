package pkg;

public class BaseClass {
    private int[] numbers;

    public BaseClass() {
        int size = (int)(Math.random() * 150) + 51;
        numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 100) + 1;
        }
    }

    public int findMinimum() {
        int minimum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minimum) {
                minimum = numbers[i];
            }
        }

        return minimum;
    }

    public int findMaximum() {
        int maximum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maximum) {
                maximum = numbers[i];
            }
        }

        return maximum;
    }

    public double findAverage() {
        int total = 0;

        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }

        return (double) total / numbers.length;
    }

    public void printResults() {
        System.out.println("Number of elements: " + numbers.length);
        System.out.println("Minimum: " + findMinimum());
        System.out.println("Maximum: " + findMaximum());
        System.out.println("Average: " + findAverage());
    }
}