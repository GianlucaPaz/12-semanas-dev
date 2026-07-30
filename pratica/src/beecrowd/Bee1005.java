import java.util.Scanner;

public class Bee1005 {
    public static void main(String[] args) {

        //Exercício BEE 1005 - Média 1

        Scanner scanner = new Scanner(System.in);

//        System.out.print("Digite a primeira nota: ");
        double A = scanner.nextDouble();
//        System.out.print("Digite a segunda nota: ");
        double B = scanner.nextDouble();

        double MEDIA = ((A * 3.5) + (B * 7.5)) / 11;
        System.out.printf("MEDIA = " + "%.5f%n",MEDIA);
    }
}
