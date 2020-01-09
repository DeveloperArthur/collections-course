package collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<String>();
        nomes.add("Arthur");
        nomes.add("z");
        nomes.add("Sofia");

        System.out.println(nomes);

        Collections.sort(nomes);

        System.out.println(nomes);

        nomes.set(1, "aaaa");

        System.out.println(nomes);

        nomes.remove(1);

        System.out.println(nomes);

        String nome = nomes.get(0);

        System.out.println(nome);

        int tamanho = nomes.size();

        System.out.println(tamanho);

        boolean temArthur = nome.contains("Arthur");

        System.out.println(temArthur);

        boolean listaVazia = nomes.isEmpty();

        System.out.println(listaVazia);

        int posicao = nomes.indexOf("Arthur");

        System.out.println(posicao);

        nomes.clear();

        if (nomes.isEmpty()) {
            System.out.println("lista vazia");
        } else {
            System.out.println("lista cheia");
        }

        nomes.add("Arthur");
        nomes.add("z");
        nomes.add("Sofia");

        for (String nomeItem : nomes) {
            System.out.println("FOR: " + nomeItem);
        }

        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()) {
            System.out.println("ITERATOR: " + iterator.next());
        }
    }
}
