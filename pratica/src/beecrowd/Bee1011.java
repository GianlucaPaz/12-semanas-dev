import java.util.Locale;
import java.util.Scanner;

public class Bee1011 {
    public static void main(String[] args) {

        //Exercício BEE 1011 - Esfera

        Scanner scanner = new Scanner(System.in);

//        System.out.print("Digite o valor do raio da esfera: ");
        double R = scanner.nextDouble();
        double pi = 3.14159;

        double VOLUME = (4 * pi * Math.pow(R,3)) / 3;
        System.out.printf(Locale.US, "VOLUME = %.3f%n", VOLUME);
    }
}
