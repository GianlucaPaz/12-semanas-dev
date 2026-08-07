package reconstrucao.logica.repetitivas;

import java.util.ArrayList;
import java.util.List;

public class CollectionsArrayList {
    public static void main(String[] args) {

        //Reconstrução Javanauta - Collections ArrayList

        //-> 1) Declaração e Inicialização de uma ArrayList
        List<String> listaDeFrutas = new ArrayList<>();
        List<Integer> listaDeIdades = new ArrayList<>();

        //-> 2) Metodo .add(): Adicionando objetos à ArrayList
        listaDeFrutas.add("Maçã");   //posição 0
        listaDeFrutas.add("Banana"); //posição 1
        listaDeFrutas.add("Limão");  //posição 2

        listaDeIdades.add(7);        //posição 0
        listaDeIdades.add(70);       //posição 1
        listaDeIdades.add(490);      //posição 2

        //-> 3) Metodo .get(): Pegando um objeto de uma posição específica da ArrayList
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("3) A fruta presente na posição 1 da lista é: " + listaDeFrutas.get(1));
        System.out.println("   ------------------------------------------------");
        System.out.println("   A idade presente na posição 1 da lista é: " + listaDeIdades.get(2));
        System.out.println("--------------------------------------------------------------------------");

        //-> 4) Iteração com forEach (para mostrar todos os objetos da ArrayList)
        //-> Estrutura: for (tipo nomeDaVariavel : nomeDaLista);
        System.out.println("4) Lista de frutas:");
        for (String fruta : listaDeFrutas) {
            System.out.println("   --> " + fruta);
        }
        System.out.println("   ----------------");

        System.out.println("   Lista de idades:");
        for (int idade : listaDeIdades) {            //Dica: Usar int para um código mais simples e rápido; Use Integer se precisar aceitar valores nulos na sua lista.
            System.out.println("   --> " + idade);
        }
        System.out.println("--------------------------------------------------------------------------");

        //-> 5) Metodo .forEach(): Iteração com forEach versão metodo utilizando function '->' (para mostrar todos os objetos da ArrayList)
        System.out.println("5) Lista de idades:");
        listaDeIdades.forEach(idade -> System.out.println("   --> " + idade));
        System.out.println("   ----------------");
        System.out.println("   Lista de frutas:");
        listaDeFrutas.forEach(fruta -> System.out.println("   --> " + fruta));
        System.out.println("--------------------------------------------------------------------------");

        //-> 6) Trocando a posição de objetos da ArrayList
        listaDeFrutas.add(2,"Kiwi");  //Kiwi substitui Limão na posição 2 e Limão passa a ocupar a posição 3
        System.out.println("6) Lista de frutas atualizada:");
        for (String fruta : listaDeFrutas) {
            System.out.println("   --> " + fruta);
        }
        System.out.println("--------------------------------------------------------------------------");

        //-> 7) Metodo .remove(): Removendo um objeto da ArrayList
        listaDeFrutas.remove("Banana");  //Retirando Banana pelo conteúdo
        listaDeFrutas.remove(1);      //Retirando Kiwi pela posição (repare que depois que Banana saiu, Kiwi passou a ocupar a posição 1)

        System.out.println("7) Lista de frutas atualizada:");
        for (String fruta : listaDeFrutas) {
            System.out.println("   --> " + fruta);
        }
        System.out.println("--------------------------------------------------------------------------");

        //-> 8) Metodo .isEmpty(): Verificando se a ArrayList está vazia ou não
        boolean ehVerdade = listaDeIdades.isEmpty();
        if (ehVerdade == true) {
            System.out.println("8) A lista de idades está vazia? Sim!");
        }
        else {
            System.out.println("8) A lista de idades está vazia? Não!");
        }
        System.out.println("--------------------------------------------------------------------------");

        //-> 9) Metodo .size(): Verificando o tamanho da ArrayList
        System.out.println("9) A quantidade de objetos dentro da lista de idades é: " + listaDeIdades.size());
        System.out.println("   ------------------------------------------------------");
        System.out.println("   A quantidade de objetos dentro da lista de frutas é: " + listaDeFrutas.size());
        System.out.println("--------------------------------------------------------------------------");

        //-> 10) Metodo .contains(): Verificando se um objeto específico está presente no ArrayList
        boolean ehMentira = listaDeFrutas.contains("Limão");
        if (ehMentira == true) {
            System.out.println("10) Limão está presente na lista de frutas? Sim!");
        }
        else {
            System.out.println("10) Limão está presente na lista de frutas? Não!");
        }
        System.out.println("--------------------------------------------------------------------------");

        //-> 11) Metodo .clear(): Limpando a ArrayList
        listaDeFrutas.clear();
        listaDeIdades.clear();

        System.out.println("11) A lista de frutas está vazia [true = Sim; false = Não]? Resposta: " + listaDeFrutas.isEmpty());
        System.out.println("    ----------------------------------------------------------------------");
        System.out.println("    A lista de idades está vazia [true = Sim; false = Não]? Resposta: " + listaDeIdades.isEmpty());
    }
}
