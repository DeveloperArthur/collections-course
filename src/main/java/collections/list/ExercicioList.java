package collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExercicioList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<String>();
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        for (String nome : nomes) {
            System.out.println("Nome: " + nome);
        }

        nomes.set(2, "Roberto");
        System.out.println("Nome da posição 1 = " + nomes.get(1));
        nomes.remove(4);
        nomes.remove("João");

        System.out.println("Quantidade de itens na lista = " + nomes.size());

        nomes.contains("Juliano");

        List<String> novaLista = new ArrayList<String>();
        novaLista.add("Ismael");
        novaLista.add("Rodrigo");

        nomes.addAll(novaLista);

        Collections.sort(nomes);

        for (String nome : nomes) {
            System.out.println("Nome: " + nome);
        }

        if (nomes.isEmpty())
            System.out.println("vazia");
        else
            System.out.println("cheia");
    }
}
