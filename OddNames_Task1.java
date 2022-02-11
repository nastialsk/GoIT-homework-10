class InputStreamTest {
    public static void main(String[] args) {
        String[] names = {"John", "Daniel", "Michael", "Tobey", "Tom", "Andrew", "Christopher", "Sebastian"};
        for (int i = 0; i <= names.length; i++) {
            if (i / 2 != 0) {
                System.out.println(names[i]);
            }
        }
    }
}
