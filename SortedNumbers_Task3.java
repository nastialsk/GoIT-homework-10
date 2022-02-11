class SortedArray {
    public static void SortNumbers() {
        String[] unsortedNumbers = {"1,2,4", "10,4,9"};
        for (int i = 0; i <= unsortedNumbers.length; i++) {
            char[] numbers = unsortedNumbers[i].toCharArray();
            if (numbers[i] > numbers[i + 1]) numbers[i] = numbers[i];
            System.out.println(numbers[i]);
        }
    }
}
