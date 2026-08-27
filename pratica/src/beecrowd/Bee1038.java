import java.util.HashMap;
import java.util.Scanner;

public class Bee1038 {
    public static void main(String[] args) {

        //Exercício BEE 1038 - Lanche

        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, Double> item = new HashMap<>();

        item.put(1, 4.00);  //Cachorro Quente
        item.put(2, 4.50);  //X-Salada
        item.put(3, 5.00);  //X-Bacon
        item.put(4, 2.00);  //Torrada simples
        item.put(5, 1.50);  //Refrigerante

//        System.out.println("------------------------------------");
//        System.out.println("==========(LISTA DE ITENS)==========");
//        System.out.println("------------------------------------");
//        System.out.println("|CÓDIGO|  ESPECIFICAÇÃO  |  PREÇO  |");
//        System.out.println("|  1   | Cachorro Quente | R$ 4,00 |");
//        System.out.println("|  2   |    X-Salada     | R$ 4.50 |");
//        System.out.println("|  3   |    X-Bacon      | R$ 5.00 |");
//        System.out.println("|  4   | Torrada simples | R$ 2.00 |");
//        System.out.println("|  5   |   Refrigerante  | R$ 1.50 |");
//        System.out.println("------------------------------------");
//        System.out.println();
//        System.out.print("Digite o código do item e a quantidade dele: ");
        int codigo = scanner.nextInt();
        int quantidade = scanner.nextInt();

        //Enhanced Switch
        double valorPagamento = switch (codigo) {
            case 1, 2, 3, 4, 5 -> item.get(codigo) * quantidade;
            default -> 0;
        };

        if (valorPagamento == 0) {
            System.out.println("O CÓDIGO ESCOLHIDO NÃO EXISTE!");
        }
        else {
            System.out.printf("Total: R$ %.2f%n", valorPagamento);
        }
        scanner.close();
    }
}
