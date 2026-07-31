import java.util.Scanner;

public class Bee1007 {
    public static void main(String[] args) {

        //Exercício BEE 1007 - Diferença

        Scanner scanner = new Scanner(System.in);

//        System.out.print("Digite o primeiro valor inteiro: ");
        int A = scanner.nextInt();
//        System.out.print("Digite o segundo valor inteiro: ");
        int B = scanner.nextInt();
//        System.out.print("Digite o terceiro valor inteiro: ");
        int C = scanner.nextInt();
//        System.out.print("Digite o quarto valor inteiro: ");
        int D = scanner.nextInt();

        int DIFERENCA = (A * B - C * D);
        System.out.println("DIFERENCA = " + DIFERENCA);
    }
}
