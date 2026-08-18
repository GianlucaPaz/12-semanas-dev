import java.util.Scanner;

public class Bee1037 {
    public static void main(String[] args) {

        //Exercício BEE 1037 - Intervalo

        Scanner scanner = new Scanner(System.in);

//        System.out.print("Digite um valor ponto flutuante: ");
        double numeroFlutuante = scanner.nextDouble();

        if (numeroFlutuante < 0 || numeroFlutuante > 100) {
            System.out.println("Fora de intervalo");
        } else if (numeroFlutuante <= 25) {
            System.out.println("Intervalo [0,25]");
        } else if (numeroFlutuante <= 50) {
            System.out.println("Intervalo (25,50]");
        } else if (numeroFlutuante <= 75) {
            System.out.println("Intervalo (50,75]");
        } else {
            System.out.println("Intervalo (75,100]");
        }
    }
}
