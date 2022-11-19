package stream;

import java.util.Arrays;
import java.util.List;

public class SerialAndParallelStream {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello ", "J", "A", "V", "A");

        // serial stream
        list.stream().forEach(System.err::print);
        System.err.println(" ----------------------");
        // parallel stream (orders are not maintained)
        list.stream().parallel().forEach(System.err::print);
        System.err.println(" ********************");
        // for ordered - parallel stream
        list.stream().parallel().forEachOrdered(System.err::print);
    }
}
