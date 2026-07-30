import java.util.Scanner;

public class Bee1002 {
    public static void main(String[] args) {

        //Exercício BEE 1002 - Área do Círculo

        Scanner scanner = new Scanner(System.in);

//        System.out.print("Digite o valor do raio do círculo: ");
        double raio = scanner.nextDouble();
        double n = 3.14159;
        double area = Math.pow(raio, 2) * n;
        System.out.printf("A=" + "%.4f%n",area);
    }
}
