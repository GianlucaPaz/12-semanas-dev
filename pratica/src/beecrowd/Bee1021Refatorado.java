import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bee1021Refatorado {
    public static void main(String[] args) {

        //Exercício BEE 1021 REFATORADO - Notas e Moedas

        Scanner scanner = new Scanner(System.in);

//        System.out.print("Digite o valor monetário: ");
        double N = scanner.nextDouble();
        long centavos = Math.round(N * 100);

        //Por Array
//        long [] notas = {10000L, 5000L, 2000L, 1000L, 500L, 200L};
//        long [] moedas = {100L, 50L, 25L, 10L, 5L, 1L};

        //Por ArrayList
        List<Long> notas = new ArrayList<>(List.of(10000L, 5000L, 2000L, 1000L, 500L, 200L));
        List<Long> moedas = new ArrayList<>(List.of(100L, 50L, 25L, 10L, 5L, 1L));

        //Imprimindo as notas
        System.out.println("NOTAS:");
        for (long nota : notas) {
            System.out.printf("%d nota(s) de R$ %.2f%n", centavos / nota, nota / 100.0);
            centavos = centavos % nota;
        }

        //Imprimir as moedas
        System.out.println("MOEDAS:");
        for (long moeda : moedas) {
            System.out.printf("%d moeda(s) de R$ %.2f%n", centavos / moeda, moeda / 100.0);
            centavos = centavos % moeda;
        }
    }
}
