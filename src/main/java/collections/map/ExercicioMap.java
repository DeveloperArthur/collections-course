package collections.map;

import java.util.HashMap;
import java.util.Map;

public class ExercicioMap {
    public static void main(String[] args) {
        Map<String, String> estados = new HashMap<String, String>();
        //sigla chave, nome valor
        estados.put("AC", "Acre");
        estados.put("AL", "Alagoas");
        estados.put("AP", "Amapa");
        estados.put("AM", "Amazonas");
        estados.put("BA", "Bahia");
        estados.put("CE", "Ceara");
        estados.put("TO", "Tocantis");
        estados.put("ES", "Espirito Santo");
        estados.put("GO", "Goias");
        estados.put("MA", "Maranhao");
        estados.put("MT", "Mato Grosso");
        estados.put("MS", "Mato Grosso do Sul");
        estados.put("MG", "Minas Gerais");
        estados.put("PA", "Para");
        estados.put("PB", "Paraiba");
        estados.put("PR", "Parana");
        estados.put("PE", "Pernambuco");
        estados.put("PI", "Piaui");
        estados.put("RJ", "Rio de Janeiro");
        estados.put("RN", "Rio Grande do Norte");
        estados.put("RS", "Rio Grande do Sul");
        estados.put("RO", "Rondonia");
        estados.put("RR", "Roraima");
        estados.put("SC", "Santa Catarina");
        estados.put("SP", "Sao Paulo");
        estados.put("SE", "Sergipe");

        System.out.println(estados);

        estados.remove("MG");

        estados.put("DF", "Distrito Federal");

        System.out.println("tamanho do mapa == " + estados.size());

        estados.values().remove("Mato Grosso do Sul");

        for (String key : estados.keySet()) {
            System.out.println(estados.get(key) + "(" + key + ")");
        }

        System.out.println("SC existe? R: " + estados.containsKey("SC"));
        System.out.println("Maranhao existe? R: " + estados.containsValue("Maranhao"));

    }
}
