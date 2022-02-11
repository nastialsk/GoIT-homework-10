class InputStreamTest {
    public static void alphaSort() {
        String[] names = {"John", "Daniel", "Michael", "Tobey", "Tom", "Andrew", "Christopher", "Sebastian"};
        int shortestStringIndex;
        for (int j = 0; j <= names.length; j++) {
            shortestStringIndex = j;
            for (int i = j + 1; i < names.length; i++) {
                if (names[i].trim().compareTo(names[shortestStringIndex].trim()) < 0) //null pointer exception points here
                {
                    shortestStringIndex = i;
                }
            }
            if (shortestStringIndex != j) {
                String temp = names[j];
                names[j] = names[shortestStringIndex];
                names[shortestStringIndex] = temp;
            }
        }
        int count = names.length;
        while (count < names.length) {
            System.out.println(names[count]);
            count--;
        }
    }
}
