import java.util.Scanner;

public class Bee1035 {
    public static void main(String[] args) {

        //Exercício BEE 1035 - Teste de Seleção 1

        Scanner scanner = new Scanner(System.in);

//        System.out.print("Digite 4 valores inteiros: ");
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        if (B > C && D > A && C+D > A+B && C > 0 && D > 0 && A % 2 == 0) {
            System.out.println("Valores aceitos");
        }
        else {
            System.out.println("Valores nao aceitos");
        }
    }
}
