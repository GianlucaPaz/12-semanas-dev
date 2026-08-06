import java.util.Scanner;

public class Bee1015 {
    public static void main(String[] args) {

        //Exercício BEE 1015 - Distância Entre Dois Pontos

        Scanner scanner = new Scanner(System.in);

//        System.out.print("Digite os valore das coordenadas x e y do ponto 1: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

//        System.out.print("Digite os valore das coordenadas x e y do ponto 2: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2 - y1, 2));

        System.out.printf("%.4f%n", distancia);
    }
}
