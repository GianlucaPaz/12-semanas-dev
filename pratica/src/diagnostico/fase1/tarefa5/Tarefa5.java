package fase1.tarefa5;

import fase1.tarefa3.Item;

import java.util.ArrayList;
import java.util.List;

public class Tarefa5 {
    public static void main(String[] args) {

        Item arroz = new Item("Arroz", "comida", 25.90);
        Item sabao = new Item("Sabão", "limpeza", 12.50);
        Item feijao = new Item("Feijão", "comida", 9.80);
        Item detergente = new Item("Detergente", "limpeza", 3.20);
        Item cafe = new Item("Café", "comida", 18.00);

        List<Item> listaDeItens = new ArrayList<>(List.of(arroz, sabao, feijao, detergente, cafe));

        final String CATEGORIA_DO_ITEM = "comida";
        double soma = 0;

        for(Item item : listaDeItens){
            if(CATEGORIA_DO_ITEM.equals(item.getCategoria())){
                soma += item.getValor();
            }
        }

        System.out.printf("Total de %s: %.2f%n", CATEGORIA_DO_ITEM, soma);
    }
}
