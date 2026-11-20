import pkg.BaseClass;

public class starter {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100) + 1;
        }

        BaseClass lab = new BaseClass();
        System.out.println("Array:");
        lab.toStringArray(numbers);
        System.out.println("Average: " + lab.getArrayAverage(numbers));
        System.out.println("Maximum: " + lab.getArrayMax(numbers));
        System.out.println("Minimum: " + lab.getArrayMin(numbers));
    }
}