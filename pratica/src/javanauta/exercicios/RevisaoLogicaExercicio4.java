package exercicios;

import java.util.Scanner;

public class RevisaoLogicaExercicio4 {
    public static void main(String[] args) {

        /*
        ============================================================================================================================================
        4. Frete por faixa, só com ternário (Operador ternário)

        - Calcula o frete a partir do peso em kg: até 5kg custa R$ 15,00; acima de 5 até 20kg custa R$ 25,00; acima de 20kg custa R$ 40,00.

        - Escreva duas versões no mesmo arquivo: uma com if-else, outra com ternário aninhado. Imprima as duas e confirme que dão o mesmo resultado.

        - Depois escreva em comentário, em uma frase, qual das duas você levaria para produção e por quê. Essa parte é o exercício de verdade.
        ============================================================================================================================================
        */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso do pacote em kg para obter o valor do frete: ");
        int peso = scanner.nextInt();

        if (peso <= 5) {
            System.out.println("VALOR DO FRETE: R$ 15,00");
        }
        else if (peso <= 20) {
            System.out.println("VALOR DE FRETE: R$ 25,00");
        }
        else {
            System.out.println("VALOR DE FRETE: R$ 40,00");
        }
        System.out.println("===============================================================");

        String resposta = peso <= 5 ? "VALOR DO FRETE: R$ 15,00" : peso <= 20 ? "VALOR DE FRETE: R$ 25,00" : "VALOR DE FRETE: R$ 40,00";
        System.out.println(resposta);

        //-> Eu levaria para produção a versão com ternário aninhado, pois é mais rápido e enxuto, já que em uma única linha é feita a verificação das condições e apresenta uma única linha de print.

        /*
        ==========================================================================================================
        STATUS: ✅ EXERCÍCIO CONCLUÍDO!
        ==========================================================================================================
        AVALIAÇÃO (2026/08/13): Revisar conteúdo de operador ternário (passar o olho e ver onde é melhor aplicado)
        ==========================================================================================================
        */
    }
}
