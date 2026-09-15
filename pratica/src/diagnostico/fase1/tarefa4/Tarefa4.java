package fase1.tarefa4;

import fase1.tarefa3.Item;

import java.util.ArrayList;
import java.util.List;

public class Tarefa4 {
    public static void main(String[] args) {

        Item arroz = new Item("Arroz", "comida", 25.90);
        Item sabao = new Item("Sabão", "limpeza", 12.50);
        Item feijao = new Item("Feijão", "comida", 9.80);
        Item detergente = new Item("Detergente", "limpeza", 3.20);
        Item cafe = new Item("Café", "comida", 18.00);

        List<Item> listaDeItens = new ArrayList<>();

        listaDeItens.add(arroz);
        listaDeItens.add(sabao);
        listaDeItens.add(feijao);
        listaDeItens.add(detergente);
        listaDeItens.add(cafe);

        for (Item item : listaDeItens){
            System.out.println(item.getNome() + " - " + item.getCategoria() + " - " + item.getValor());
        }
    }
}
