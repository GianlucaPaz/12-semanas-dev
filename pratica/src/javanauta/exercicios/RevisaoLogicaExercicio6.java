package exercicios;

import java.util.Scanner;

public class RevisaoLogicaExercicio6 {
    public static void main(String[] args) {

        /*
        =========================================================================================================================================================================================================================
        6. Leitura até sentinela (While, acumuladores)

        - Lê números inteiros até que o usuário digite 0. Ao final, imprime: quantidade lida, soma, média, maior e menor. Valores negativos devem ser rejeitados com aviso e não entram na conta (mas o programa continua lendo).

        - Aceite: entrada 5, -3, 10, 2, 0 → 3 valores, soma 17, média 5,67, maior 10, menor 2. Entrada 0 direto → nenhuma divisão por zero, mensagem apropriada.

        - Pega clássica: inicializar maior = 0 e menor = 0. Se todos os valores forem maiores que zero, o menor sai errado. Descubra por quê e corrija.
        =========================================================================================================================================================================================================================
        */

        // RESOLUÇÃO:

        Scanner scanner = new Scanner(System.in);

        int numeroInteiro;
        int cont = 0;
        int soma = 0;
        int maior = 0;
        int menor = 0;

        while (true) {

            // 1. Lê os valores inteiros
            System.out.println("=================================================================");
            System.out.print("Digite um número inteiro positivo [0 encerra]: ");
            numeroInteiro = scanner.nextInt();

            // 2. Trata a condição de saída (Sentinela)
            if (numeroInteiro == 0) {
                break;
            }

            // 3. Trata os valores inválidos (Negativos)
            if (numeroInteiro < 0) {
                System.out.println("=========================================");
                System.out.println("AVISO: Valores negativos não são válidos!");
                continue;
            }

            // 4. Lógica para valores válidos (Maiores que 0)

            // 4.1 Se for o primeiro número válido digitado, atribui ele ao maior e ao menor
            if (cont == 0) {
                maior = numeroInteiro;
                menor = numeroInteiro;
            }
            else {
                // 4.2 Do segundo número válido em diante, compara o maior e o menor
                if (maior < numeroInteiro) {
                    maior = numeroInteiro;
                }

                if (menor > numeroInteiro) {
                    menor = numeroInteiro;
                }
            }

            //4.3 Atualiza os acumuladores

            //Soma dos números válidos
            soma += numeroInteiro;

            //Iteração do contador de números
            cont++;
        }

        // 5. Imprime os resultados fora do loop
        if (cont == 0) {
            System.out.println("----------------------------------------------------");
            System.out.println("-> Operação encerrada: Nenhum valor válido");
            System.out.println("====================================================");
        }
        else {
            //Média dos números válidos
            double media = ((double)soma) / cont;

            //Resultado de saída
            System.out.println("-----------------------------------------------------------------");
            System.out.printf("-> RESULTADO: %d valor(es), soma %d, média %.2f, maior %d, menor %d%n", cont, soma, media, maior, menor);
            System.out.println("=================================================================");
        }

        scanner.close();

        /*
        =============================================================================================================================
        1) Se inicializar maior = 0 e menor = 0 e se todos os valores forem maiores que zero, o menor sai errado por que?

           O menor sai errado porque ele sempre será zero nessas condições, e zero não é um valor válido, ele apenas encerra.

           Para corrigir isso, devemos atribuir um valo positivo maior que zero para que a comparação seja feita com valores válidos.
        =============================================================================================================================
        */

        /*
        ==========================================================================================================
        STATUS: ✅ EXERCÍCIO CONCLUÍDO!
        ==========================================================================================================
        */

    }
}
