package pkg;

public class BaseClass {
    private int[] numbers;

    public BaseClass() {
        numbers = new int[1000];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 1000);
        }
    }

    public void printNumbers() {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}