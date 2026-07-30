import java.util.Scanner;

public class Bee1006 {
    public static void main(String[] args) {

        //Exercício BEE 1006 - Média 2

        Scanner scanner = new Scanner(System.in);

//        System.out.print("Digite a primeira nota: ");
        double A = scanner.nextDouble();
//        System.out.print("Digite a segunda nota: ");
        double B = scanner.nextDouble();
//        System.out.print("Digite a terceira nota: ");
        double C = scanner.nextDouble();

        double MEDIA = ((A * 2) + (B * 3) + (C * 5)) / 10;
        System.out.printf("MEDIA = " + "%.1f%n",MEDIA);
    }
}
