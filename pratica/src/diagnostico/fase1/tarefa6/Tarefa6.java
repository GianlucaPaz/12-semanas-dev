package fase1.tarefa6;

import fase1.tarefa3.Item;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tarefa6 {
    public static void main(String[] args) {

        Item arroz = new Item("Arroz", "comida", 25.90);
        Item sabao = new Item("Sabão", "limpeza", 12.50);
        Item feijao = new Item("Feijão", "comida", 9.80);
        Item detergente = new Item("Detergente", "limpeza", 3.20);
        Item cafe = new Item("Café", "comida", 18.00);

        List<Item> listaDeItens = new ArrayList<>(List.of(arroz, sabao, feijao, detergente, cafe));

        Map<String, Double> mapDosValoresTotaisDasCategorias = new HashMap<>();

        for(Item item : listaDeItens){

            String categoria = item.getCategoria();
            double valor = item.getValor();

            double somaDaCategoria = mapDosValoresTotaisDasCategorias.getOrDefault(categoria, 0.0) + valor;

            mapDosValoresTotaisDasCategorias.put(categoria, somaDaCategoria);
        }

        mapDosValoresTotaisDasCategorias.forEach((categoria, valor) -> System.out.printf("%s: %.2f%n", categoria, valor));
    }
}
