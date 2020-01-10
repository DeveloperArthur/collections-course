package collections.optionals;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class ExemploOptionalPrimitivos {
    public static void main(String[] args) {
        int i = 10;
        double d = 20.50;
        Long l = 30L;

        OptionalInt.of(i).ifPresent(System.out::println);
        OptionalDouble.of(d).ifPresent(System.out::println);
        OptionalLong.of(l).ifPresent(System.out::println);
    }
}
