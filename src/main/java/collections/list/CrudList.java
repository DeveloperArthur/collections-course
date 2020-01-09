package collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CrudList {
    public static void main(String[] args) {
        //quase um crud com list
        List<String> clientes = new ArrayList<String>();
        while (true) {
            System.out.println("1-ADICIONAR CLIENTE\n2-EXCLUIR CLIENTE\n3-LISTAR CLIENTES\n4-SAIR");
            Scanner scanner = new Scanner(System.in);
            int opcao = scanner.nextInt();
            if (opcao == 4) break;
            else if (opcao == 1 || opcao == 2) {
                System.out.println("Digite o nome do cliente");
                String nomeTeste = scanner.next();
                if (opcao == 1) {
                    clientes.add(nomeTeste);
                    System.out.println("Cliente adicionado com sucesso\n");
                } else if (opcao == 2)
                    if (clientes.contains(nomeTeste)) {
                        clientes.remove(nomeTeste);
                        System.out.println("Cliente removido com sucesso\n");
                    } else System.out.println("Cliente nao existe na lista\n");
            } else if (opcao == 3)
                if (clientes.isEmpty())
                    System.out.println("Lista esta vazia");
                else
                    for (String cliente : clientes)
                        System.out.println(cliente);

        }
    }
}
