import java.util.Scanner;

public class Bee1018 {
    public static void main(String[] args) {

        //Exercício BEE 1018 - Cédulas

        Scanner scanner = new Scanner(System.in);

//        System.out.print("Digite um valor inteiro N (0 < N < 1000000): ");

        int [] qtdNotas = new int[7];

        int N = scanner.nextInt();
        System.out.println(N);

        for (int cont = 1; N >= 100; cont++) {
            N = N - 100;
            qtdNotas [0] = cont;
        }
        System.out.println(qtdNotas[0] + " nota(s) de R$ 100,00");

        for (int cont = 1; N >= 50; cont++) {
            N = N - 50;
            qtdNotas [1] = cont;
        }
        System.out.println(qtdNotas[1] + " nota(s) de R$ 50,00");

        for (int cont = 1; N >= 20; cont++) {
            N = N - 20;
            qtdNotas[2] = cont;
        }
        System.out.println(qtdNotas[2] + " nota(s) de R$ 20,00");

        for (int cont = 1; N >= 10; cont++) {
            N = N - 10;
            qtdNotas[3] = cont;
        }
        System.out.println(qtdNotas[3] + " nota(s) de R$ 10,00");

        for (int cont = 1; N >= 5; cont++) {
            N = N - 5;
            qtdNotas[4] = cont;
        }
        System.out.println(qtdNotas[4] + " nota(s) de R$ 5,00");

        for (int cont = 1; N >= 2; cont++) {
            N = N - 2;
            qtdNotas[5] = cont;
        }
        System.out.println(qtdNotas[5] + " nota(s) de R$ 2,00");

        for (int cont = 1; N == 1; cont++) {
            N = 0;
            qtdNotas[6] = cont;
        }
        System.out.println(qtdNotas[6] + " nota(s) de R$ 1,00");
    }
}
