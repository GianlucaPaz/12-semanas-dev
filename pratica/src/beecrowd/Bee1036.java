import java.util.Scanner;

public class Bee1036 {
    public static void main(String[] args) {

        //Exercício BEE 1036 - Fórmula de Bhaskara

        Scanner scanner = new Scanner(System.in);

//        System.out.print("Digite 3 valores de ponto flutuante: ");

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();
        double raizDelta = Math.sqrt(Math.pow(B, 2) - 4 * A * C);

        if (2 * A != 0 && raizDelta > 0) {
            double R1 = (-1 * B + raizDelta) / (2 * A);
            double R2 = (-1 * B - raizDelta) / (2 * A);

            System.out.printf("R1 = %.5f%n", R1);
            System.out.printf("R2 = %.5f%n", R2);
        }
        else {
            System.out.println("Impossivel calcular");
        }
    }
}
