import java.util.Scanner;

public class Bee1013 {
    public static void main(String[] args) {

        //Exercício BEE 1013 - O Maior

        Scanner scanner = new Scanner(System.in);

//        System.out.print("Digite três valores: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int maiorAB = (a + b + Math.abs(a - b)) / 2;
        int maiorFinal = (c + maiorAB + Math.abs(c - maiorAB)) / 2;

        System.out.println(maiorFinal + " eh o maior");
    }
}
