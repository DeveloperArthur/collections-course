package collections.map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap {
    public static void main(String[] args) {
        TreeMap<String, String> capitais = new TreeMap<String, String>();

        //monta a arvore com as capitais
        capitais.put("RS", "Porto Alegre");
        capitais.put("SC", "Florianopolis");
        capitais.put("PR", "Curitiba");
        capitais.put("SP", "Sao Paulo");
        capitais.put("RJ", "Rio de Janeiro");
        capitais.put("MG", "Belo Horizonte");

        System.out.println(capitais);

        //retorna a primeira capital no topo da arvore
        System.out.println(capitais.firstKey());

        //retorna a ultima capital no final da arvore
        System.out.println(capitais.lastKey());

        //retorna a primeira capital abaixo na arvore da capital parametrizada
        System.out.println(capitais.lowerKey("SC"));

        //retorna a primeira capital acima na arvore da capital parametrizada
        System.out.println(capitais.higherKey("SC"));

        //retorna a primeira capital no topo da arvore
        System.out.println(capitais.firstEntry().getKey() + " - " + capitais.firstEntry().getValue());

        //retorna a ultima capital no final da arvore
        System.out.println(capitais.lastEntry().getKey() + " - " + capitais.lastEntry().getValue());

        //retorna a primeira capital abaixo na arvore da capital parametrizada
        System.out.println(capitais.lowerEntry("SC").getKey() + " - " + capitais.lowerEntry("SC").getValue());

        //retorna a primeira capital acima na arvore da capital parametrizada
        System.out.println(capitais.higherEntry("SC").getKey() + " - " + capitais.higherEntry("SC").getValue());

        //retorna a primeira capital no topo da arvore, removendo do mapa
        System.out.println(capitais.pollFirstEntry().getKey() + " - " + capitais.pollFirstEntry().getValue());

        //retorna a primeira capital no final da arvore, removendo do mapa
        System.out.println(capitais.pollLastEntry().getKey() + " - " + capitais.pollLastEntry().getValue());

        Iterator<String> iterator = capitais.keySet().iterator();
        System.out.println("WHILE");
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + " - " + capitais.get(key));
        }
        System.out.println("FOR");
        for (String capital : capitais.keySet()) {
            System.out.println(capital + " - " + capitais.get(capital));
        }
        System.out.println("FOR");
        for (Map.Entry<String, String> capital : capitais.entrySet()) {
            System.out.println(capital.getKey() + " - " + capital.getValue());
        }
    }
}
