package collections.set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String[] args) {
        TreeSet<String> capitais = new TreeSet<String>();

        capitais.add("Porto Alegre");
        capitais.add("Florianopolis");
        capitais.add("Curitiba");
        capitais.add("São Paulo");
        capitais.add("Rio de Janeiro");
        capitais.add("Belo Horizonte");

        System.out.println(capitais);

        //primeira capital no topo da arvore
        System.out.println(capitais.first());

        //ultima capital no final da arvore
        System.out.println(capitais.last());

        //primeira capital abaixo da arvore na capital parametrizada
        System.out.println(capitais.lower("Florianopolis"));

        //primeira capital acima da arvore na capital parametrizada
        System.out.println(capitais.higher("Florianopolis"));

        //todas as capitais
        System.out.println(capitais);

        //primeira capital no topo da arvore, removendo do set
        System.out.println(capitais.pollFirst());

        //primeira capital no final da arvore, removendo do set
        System.out.println(capitais.pollLast());

        Iterator<String> iterator = capitais.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (String capital : capitais) {
            System.out.println(capital);
        }
    }
}
