package fase1.tarefa2;

import java.util.Scanner;

public class Tarefa2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int soma = 0;

        for (int cont = 1; cont <= 5; cont++){
            System.out.printf("Digite o %d° número: ", cont);
            int numero = scanner.nextInt();

            soma += numero;
        }

        System.out.println("Soma: " + soma);
        scanner.close();
    }
}

// A variável que acumula a soma precisa existir antes do laço para garantir que seu valor não retorne a zero a cada
// repetição, o que comprometeria o resultado final da soma dos 5 valores retornando apenas o último valor digitada.
