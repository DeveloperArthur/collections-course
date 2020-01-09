package collections.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<Integer>();

        sequenciaNumerica.add(1);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(16);

        System.out.println(sequenciaNumerica);

        sequenciaNumerica.remove(4);

        System.out.println(sequenciaNumerica);

        System.out.println("quantidade de itens == " + sequenciaNumerica.size());

        Iterator<Integer> iterator = sequenciaNumerica.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (Integer numero : sequenciaNumerica) {
            System.out.println(numero);
        }

        System.out.println(sequenciaNumerica.isEmpty());
    }
}
