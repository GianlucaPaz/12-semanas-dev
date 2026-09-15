package fase1.tarefa3;

public class Principal {
    public static void main(String[] args){

        Item item1 = new Item("Feijão", "Comida", 9.80);
        Item item2 = new Item("Sabonete", "Limpeza", 12.50);

        System.out.println(item1.getNome());
        System.out.println(item2.getNome());
    }
}
