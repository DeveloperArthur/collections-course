package collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {
    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<String>();

        filaBanco.add("Teste");
        filaBanco.add("Segundo");
        filaBanco.add("Terceiro");
        filaBanco.add("Quarto");
        filaBanco.add("Quitno");

        System.out.println(filaBanco);

        String clienteAtendido = filaBanco.poll();
        System.out.println(clienteAtendido);
        System.out.println(filaBanco);

        //filaBanco.clear();

        String primeiroCliente = filaBanco.peek();
        System.out.println(primeiroCliente);
        System.out.println(filaBanco);

        //filaBanco.clear();
        String primeiroClienteOuErro = filaBanco.element();
        System.out.println(primeiroClienteOuErro);
        System.out.println(filaBanco);
    }
}
