import java.util.Scanner;

public class Bee1017 {
    public static void main(String[] args) {

        //Exercício BEE 1017 - Gasto de Combustível

        Scanner scanner = new Scanner(System.in);

//        System.out.print("Digite o tempo gasto na viagem (em horas): ");
        int tempoViagem = scanner.nextInt();
//        System.out.print("Digite a velocidade média durante a viagem (em km/h): ");
        int velocidadeMedia = scanner.nextInt();

        double distanciaPercorrida = tempoViagem * velocidadeMedia;
        double litrosNecessarios = distanciaPercorrida / 12;

        System.out.printf("%.3f%n", litrosNecessarios);
    }
}
