package StreamApp;

import java.util.stream.Stream;


public class TerminalOp {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6);
        stream.filter(n -> n % 2 == 0).forEach(System.out::println);
    }
}
