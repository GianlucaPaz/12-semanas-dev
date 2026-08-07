import java.util.Scanner;

public class Bee1020 {
    public static void main(String[] args) {

        //Exercício BEE 1020 - Idade em Dias

        Scanner scanner = new Scanner(System.in);

        int [] tempos = new int[3]; //{ano(s), mes(es), dia(s)}

//        System.out.print("Digite todos os dias da idade de uma pessoa: ");
        int diasIdade = scanner.nextInt();

        for (int cont = 1; diasIdade >= 365; cont++) {
            diasIdade = diasIdade - 365;
            tempos[0] = cont;
        }

        for (int cont = 1; diasIdade >= 30; cont++) {
            diasIdade = diasIdade - 30;
            tempos[1] = cont;
            tempos[2] = diasIdade;
        }

        System.out.println(tempos[0] + " ano(s)");
        System.out.println(tempos[1] + " mes(es)");
        System.out.println(tempos[2] + " dia(s)");
    }
}
