package pkg;

public class BaseClass {
    private int[] numbers;

    public BaseClass() {
        numbers = new int[1000];

        int i = 0;

        while (i < numbers.length) {
            numbers[i] = (int)(Math.random() * 1000);
            i++;
        }
    }

    public void printNumbers() {
        int i = 0;

        while (i < numbers.length) {
            System.out.println(numbers[i]);
            i++;
        }
    }
}