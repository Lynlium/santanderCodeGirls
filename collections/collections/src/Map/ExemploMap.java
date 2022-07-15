package Map;

import java.util.*;

/*
Dados os modelos dos carros e seus respectivos consumos na estrada, faça:
modelo = gol - consumo = 14,4 km/l;
modelo = uno - consumo = 15,5 km/;
modeo = mobi - consumo = 16,1 km/l;
modeo = hb20 - consumo = 14,5 km/l;
modeo = kwid - consumo = 15,6 km/l;
 */
public class ExemploMap {
    public static void main(String[] args) {
        System.out.println("Crie um dicionário e relacione os modelos e seus respectivos consumos: ");
        Map<String, Double> carrosPopulares = new HashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.5);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);

        }};
        System.out.println(carrosPopulares);

        System.out.println("Substitua o consumodo gol por 15,2 km/l: ");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("Confira se o modelo tucson está no dicionário:" + carrosPopulares.containsKey("tucson"));
        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));

//        System.out.println("Exiba o terceiro modeo adicionado: "); -- N é possivel fzr através de Map
        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("Exiba o consumo dos carros: ");
        Collection<Double> consumo = carrosPopulares.values();
        System.out.println(consumo);

        System.out.println("Exiba o modelo mais econômico e seu consumo: ");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";
        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(consumoMaisEficiente))
                modeloMaisEficiente = entry.getKey();

        }
        System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);

        System.out.println("Exiba modelo menos econômico e seu consumo: ");
        Double menosConsumo = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";

        for (Map.Entry<String, Double> entry : carrosPopulares.entrySet()) {
            if (entry.getValue().equals(menosConsumo)) modeloMenosEficiente = entry.getKey();
        }
        System.out.println("modelo menos eficiente: " + modeloMenosEficiente + " - " + menosConsumo);


        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;

        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("Exiba a soma dos consumos: " + soma);

        System.out.println("Exiba a média dos consumos deste sicionário de carros: " + (soma / carrosPopulares.size()));

        System.out.println("Remova os modelos com consumo igua à 15,6 km/l: " + carrosPopulares);

        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println("Removido: " + carrosPopulares);

        System.out.println("Exiba os carros na odem em que forma informados: ");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>() {
            {
                put("gol", 14.4);
                put("uno", 15.5);
                put("mobi", 16.1);
                put("hb20", 14.5);
                put("kwid", 15.6);
            }};
        System.out.println(carrosPopulares1.toString());

        System.out.println("Exiba o dicionário ordenado por modelo: ");
        Map <String, Double> carrosPopuares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopuares2.toString());


        System.out.println("Apague o dicionário de carros: ");
        carrosPopulares.clear();
        System.out.println("Apagando..."+ carrosPopulares);
        System.out.println("Confira se o dicionários está vazio: " + carrosPopulares.isEmpty());





    }
}


