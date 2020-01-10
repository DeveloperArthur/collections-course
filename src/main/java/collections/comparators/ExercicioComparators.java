package collections.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExercicioComparators {
    public static void main(String[] args) {
        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante("Arthur", 21));
        estudantes.add(new Estudante("Ilza", 41));
        estudantes.add(new Estudante("Raul", 48));
        estudantes.add(new Estudante("Wellingthon", 16));
        estudantes.add(new Estudante("Gabriela", 18));

        System.out.println("Ordenado utilizando Comparator");
        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));
        System.out.println(estudantes);

        System.out.println("\n\nOrdenando utilizando lambda");
        estudantes.sort((first, second) -> first.getIdade() - second.getIdade());
        System.out.println(estudantes);

        System.out.println("\n\nOrdenando utilizando Collections");
        Collections.sort(estudantes);
        System.out.println(estudantes);
    }
}
