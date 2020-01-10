package collections.optionals;

import java.util.Optional;

public class ExemploOptional {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Valor optional");

        System.out.println(optional.isPresent());

        optional.ifPresent(System.out::println);

        if (optional.isPresent()) {
            String valor = optional.get();
            System.out.println(valor);
        }

        optional.map((valor) -> valor.concat("MAP")).ifPresent(System.out::println);

        optional.orElseThrow(IllegalStateException::new);
    }
}
