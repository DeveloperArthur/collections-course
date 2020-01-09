package collections.set;

import java.util.HashSet;
import java.util.Set;

public class ExercicioSet {
    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<Integer>();
        numeros.add(8);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(3);

        for (int numero : numeros) {
            System.out.println(numero);
        }

        numeros.remove(3);

        numeros.add(23);

        if (numeros.isEmpty())
            System.out.println("lista vazia");
        else
            System.out.println("lista cheia");
    }
}
