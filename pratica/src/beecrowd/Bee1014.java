import java.util.Scanner;

public class Bee1014 {
    public static void main(String[] args) {

        //Exercício BEE 1014 - Consumo

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Digite a distãncia total percorrida: ");
        int X = scanner.nextInt();        //distância percorrida em Km
//        System.out.println("Digite o total de combustível gasto: ");
        double Y = scanner.nextDouble();  //total de combustível gastto

        double consumoMedio = X / Y;

        System.out.printf("%.3f km/l%n", consumoMedio);
    }
}
