import java.util.stream.Stream;

class MixElements {
    public static <T> void zip(Stream<T> first, Stream<T> second) {
        Stream.of(first, second)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
