import java.util.Scanner;

public class Bee1004 {
    public static void main(String[] args) {

        //Exercício BEE 1004 - Produto Simples

        Scanner scanner = new Scanner(System.in);

//        System.out.print("Digite o primeiro valor (inteiro): ");
        int valor1 = scanner.nextInt();

//        System.out.print("Digite o segundo valor (inteiro): ");
        int valor2 = scanner.nextInt();

        int PROD = valor1 * valor2;
        System.out.println("PROD = " + PROD);
    }
}
