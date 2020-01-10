package collections.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorsExemploList {
    public static void main(String[] args) {
        List<Estudante> estudantes = new ArrayList<Estudante>();

        estudantes.add(new Estudante("Pedro", 19));
        estudantes.add(new Estudante("Carlos", 23));
        estudantes.add(new Estudante("Mariana", 21));
        estudantes.add(new Estudante("Joao", 18));
        estudantes.add(new Estudante("Thiago", 20));
        estudantes.add(new Estudante("George", 22));
        estudantes.add(new Estudante("Larissa", 21));

        System.out.println("\n\nORDEM DE INSERCAO");
        System.out.println(estudantes);

        System.out.println("\n\nORDEM NATURAL DOS NUMEROS - IDADE (LAMBDA)");
        estudantes.sort((first, second) -> first.getIdade() - second.getIdade());
        System.out.println(estudantes);

        System.out.println("\n\nORDEM REVERSA DOS NUMEROS - IDADE (LAMBDA)");
        estudantes.sort((first, second) -> second.getIdade() - first.getIdade());
        System.out.println(estudantes);

        System.out.println("\n\nORDEM NATUAL DOS NUMEROS - IDADE (COMPARATOR)");
        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));
        System.out.println(estudantes);

        System.out.println("\n\nORDEM REVERSA DOS NUMEROS - IDADE (COMPARATOR)");
        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
        System.out.println(estudantes);

        System.out.println("\n\nORDEM NATUAL DOS NUMEROS - IDADE (COLLECTIONS)");
        Collections.sort(estudantes);
        System.out.println(estudantes);

        System.out.println("\n\nORDEM REVERSA DOS NUMEROS - IDADE (COLLECTIONS)");
        Collections.sort(estudantes, new EstudanteOrdemIdadeReversaComparators());
        System.out.println(estudantes);
    }
}
