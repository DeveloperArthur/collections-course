package collections.optionals;

import java.util.Optional;

public class ExercicioOptional {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.empty();
        Optional<String> o2 = Optional.of("Exercicio");
        Optional<String> o3 = Optional.ofNullable(null);

        if (o1.isPresent())
            System.out.println(o1+"- O1");

        if (o2.isPresent())
            System.out.println(o2+"- O2");

        if (o3.isPresent())
            System.out.println(o3+"- O3");

        //o1.orElseThrow(IllegalStateException::new);
        o2.orElseThrow(IllegalStateException::new);
        //o3.orElseThrow(IllegalStateException::new);

        if (o1.equals(""))
            System.out.println("Optional vazio == O1");

        if (o2.equals(""))
            System.out.println("Optional vazio == O2");

        if (o3.equals(""))
            System.out.println("Optional vazio == O3");

        o1.map((valor) -> valor.concat("taPresenteSim == O1")).ifPresent(System.out::println);
        o2.map((valor) -> valor.concat("taPresenteSim == O2")).ifPresent(System.out::println);
        o3.map((valor) -> valor.concat("taPresenteSim == O3")).ifPresent(System.out::println);

        if (o1.isPresent()) {
            String valor = o1.get();
            System.out.println(valor+"- O1");
        }

        if (o2.isPresent()) {
            String valor = o2.get();
            System.out.println(valor+"- O2");
        }

        if (o3.isPresent()) {
            String valor = o3.get();
            System.out.println(valor+"- O3");
        }
    }
}
