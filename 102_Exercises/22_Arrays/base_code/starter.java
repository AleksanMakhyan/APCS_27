class starter {
    public static void main(String[] args) {
        int[] firstArray = new int[1001];
        int[] secondArray = new int[1001];

        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = (i + 1) * 3;
        }

        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = 1000 - i;
        }

        for (int i = 0; i < firstArray.length; i++) {
            System.out.println(firstArray[i]);
        }

        for (int i = 0; i < secondArray.length; i++) {
            System.out.println(secondArray[i]);
        }
    }
}