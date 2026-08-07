import java.util.Scanner;

public class Bee1019 {
    public static void main(String[] args) {

        //Exercício BEE 1019 - Conversão de Tempo

        Scanner scanner = new Scanner(System.in);

//        System.out.print("Digite a duração em segundos do evento da fábrica: ");
        int N = scanner.nextInt();

        int [] tempos = new int[3]; //{horas, minutos, segundos}

        if (N < 60) {
            tempos[2] = N;
            System.out.println(tempos[0] + ":" + tempos[1] + ":" + tempos[2]);
        }
        else {
            tempos[1] = N / 60;
            tempos[2] = N % 60;

            if (tempos[1] >= 60) {
                tempos[0] = tempos[1] / 60;
                tempos[1] = tempos[1] % 60;
                System.out.println(tempos[0] + ":" + tempos[1] + ":" + tempos[2]);
            }
            else {
                System.out.println(tempos[0] + ":" + tempos[1] + ":" + tempos[2]);
            }
        }
    }
}
