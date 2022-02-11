import java.util.stream.Stream;

class RandomInfinity {
    public void GetInfinity() {
        int a = 25214903917;
        int c = 11;
        int m = (int) Math.pow(2, 48);
        for (int n = 0; n <= m; n++) {
            int[] x = new int[n];
            System.out.println(Stream.iterate(x[0], x[n + 1] = (a * x[n] + c) % m));
        }
    }
}
