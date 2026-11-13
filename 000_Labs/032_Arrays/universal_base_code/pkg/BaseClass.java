package pkg;

public class BaseClass {
    private int[] numbers;

    public BaseClass() {
        numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 9 - i;
        }
    }

    public void printNumbers() {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}