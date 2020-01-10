package collections.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStream {
    public static void main(String[] args) {
        List<String> estudantes = new ArrayList<>();

        estudantes.add("Pedro");
        estudantes.add("Thayse");
        estudantes.add("Marcelo");
        estudantes.add("Carla");
        estudantes.add("Juliana");
        estudantes.add("Thiago");
        estudantes.add("Rafael");

        System.out.println("Contagem: " + estudantes.stream().count());

        System.out.println("String com maior numero de letras: " + estudantes.stream().max(Comparator.comparingInt(String::length)));

        System.out.println("String com menor numero de letras: " + estudantes.stream().min(Comparator.comparingInt(String::length)));

        //retorna elementos com a letra r no nome
        System.out.println("Com a letra r no nome: " + estudantes.stream().filter((estudante) ->
                estudante.toLowerCase().contains("r")).collect(Collectors.toList()));

        //retorna uma nova colecao com os nomes concatenados a quantidade de letra de cada nome
        System.out.println(estudantes.stream().map(estudante ->
                estudante.concat(" -- ").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));

        System.out.println("retorna os 3 primeiros elementos: " + estudantes.stream().limit(3).collect(Collectors.toList()));

        //peek printa todos os elementos e em seguida é coletado elementos na lista e printado
        System.out.println("retorna os elementos: " + estudantes.stream().peek(System.out::println).collect(Collectors.toList()));

        estudantes.stream().forEach(System.out::println);

        //retorna true se todos os elementos possuirem a letra W no nome
        System.out.println(estudantes.stream().allMatch((el)->el.contains("W")));

        //retorna true se alguns elementos possuirem a letra a minuscula no nome
        System.out.println(estudantes.stream().anyMatch((el)->el.contains("a")));

        //retorna true se nenhum elemento possuir a letra a minucula no nome
        System.out.println(estudantes.stream().noneMatch((el)->el.contains("a")));

        //primeiro elemento
        estudantes.stream().findFirst().ifPresent(System.out::println);
    }
}
