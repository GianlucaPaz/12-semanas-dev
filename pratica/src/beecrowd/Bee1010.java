import java.util.Scanner;

public class Bee1010 {
    public static void main(String[] args) {

        //Exercício BEE 1010 - Cálculo Simples

        Scanner scanner = new Scanner(System.in);

//        System.out.print("Digite o [código da peça 1] | [número de peças 1] | [valor unitário de cada peça 1]: ");
        int codigoPeca1 = scanner.nextInt();
        int numeroPecas1 = scanner.nextInt();
        double valorUnitarioPeca1 = scanner.nextDouble();

//        System.out.print("Digite o [código da peça 2] | [número de peças 2] | [valor unitário de cada peça 2]: ");
        int codigoPeca2 = scanner.nextInt();
        int numeroPecas2 = scanner.nextInt();
        double valorUnitarioPeca2 = scanner.nextDouble();

        double valorPagar = (numeroPecas1 * valorUnitarioPeca1) + (numeroPecas2 * valorUnitarioPeca2);
        System.out.printf("VALOR A PAGAR: R$ " + "%.2f%n",valorPagar);
    }
}
