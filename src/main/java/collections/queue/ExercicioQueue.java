package collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class ExercicioQueue {
    public static void main(String[] args) {
        Queue<String> nomes = new LinkedList<String>();
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        for (String nome : nomes)
            System.out.println("NOME: " + nome);

        System.out.println("Primeiro item da fila = " + nomes.peek());

        nomes.poll();
        System.out.println(nomes);

        nomes.add("Daniel");
        System.out.println(nomes);

        System.out.println("tamanho da lista = " + nomes.size());

        if (nomes.isEmpty())
            System.out.println("vazio");
        else
            System.out.println("cheio");

        if (nomes.contains("Carlos"))
            System.out.println("Existe Carlos na lista");
        else
            System.out.println("Nao existe Carlos na lista");
    }
}
