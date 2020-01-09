package collections.map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {
    public static void main(String[] args) {
        Map<String, Integer> campeoesMundiaisFifa = new HashMap<String, Integer>();

        //adiciona os campeoes no mapa
        campeoesMundiaisFifa.put("Brasil", 5);
        campeoesMundiaisFifa.put("Alemanha", 4);
        campeoesMundiaisFifa.put("Italia", 4);
        campeoesMundiaisFifa.put("Uruguai", 2);
        campeoesMundiaisFifa.put("Argentina", 2);
        campeoesMundiaisFifa.put("Franca", 2);
        campeoesMundiaisFifa.put("Inglaterra", 1);
        campeoesMundiaisFifa.put("Espanha", 1);

        System.out.println(campeoesMundiaisFifa);

        //retorna elemento (argentina)
        campeoesMundiaisFifa.get("Argentina");

        //retorna se existe ou nao o elemento (franca)
        campeoesMundiaisFifa.containsKey("Franca");

        //remove elemento
        campeoesMundiaisFifa.remove("Uruguai");

        //retorna elemento pelo valor
        System.out.println(campeoesMundiaisFifa.containsValue(5));

        //retorna o tamanho do mapa
        System.out.println(campeoesMundiaisFifa.size());

        System.out.println(campeoesMundiaisFifa);

        //navega pelos registros do mapa
        System.out.println("\nPRIMEIRO FOR");
        for (Map.Entry<String, Integer> entry : campeoesMundiaisFifa.entrySet()) {
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }
        System.out.println("\n\n\nSEGUNDO FOR");
        //navega pelos registros do mapa
        for (String key : campeoesMundiaisFifa.keySet()) {
            System.out.println(key + " -- " + campeoesMundiaisFifa.get(key));
        }

        System.out.println(campeoesMundiaisFifa);

        //limpa mapa
        campeoesMundiaisFifa.clear();

        System.out.println(campeoesMundiaisFifa.size());
    }
}
