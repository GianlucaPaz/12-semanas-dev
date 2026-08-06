import java.util.Scanner;

public class Bee1016 {
    public static void main(String[] args) {

        //Exercício BEE 1016 - Distância

        Scanner scanner = new Scanner(System.in);

//        System.out.print("Digite a distância em Km entre os dois carros: ");
        int distancia = scanner.nextInt();

        int tempo = 2 * distancia;

        System.out.println(tempo+ " minutos");
    }
}
