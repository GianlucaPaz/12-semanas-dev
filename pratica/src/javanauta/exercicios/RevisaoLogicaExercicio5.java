package exercicios;

import java.util.Scanner;

public class RevisaoLogicaExercicio5 {
    public static void main(String[] args) {

        /*
        ============================================================================================================================================
        5. Conversor de unidades com switch (Switch-case)

        - Lê uma unidade de origem (km, mi, m, ft) e um valor. Converte para metros e imprime. Unidade desconhecida imprime UNIDADE INVALIDA.

        - Restrição: use switch sobre String, sem nenhum if.

        - Aceite: mi 1 → 1609,34. Entrada KM (maiúsculo) — decida e trate.

        - Pega: se você esquecer um break, o programa não quebra, ele mente. Descubra o que acontece removendo um de propósito e depois consertando.
        ============================================================================================================================================
        */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a unidade de origem: ");
        String unidadeOrigem = scanner.nextLine();
        System.out.print("Digite um valor: ");
        double valor = scanner.nextDouble();

        switch (unidadeOrigem) {
            case "km":
                double valorkm = valor * 1000;
                System.out.println(valorkm);
                break;
            case "KM":
                double valorKM = valor * 1000;
                System.out.println(valorKM);
                break;
            case "mi":
                double valormi = valor * 1609.34;
                System.out.println(valormi);
                break;
            case "m":
                System.out.println(valor);
                break;
            case "ft":
                double valorft = valor * 0.3048;
                System.out.println(valorft);
        }

        //-> Se um break for removido, o próximo caso é lido mesmo não atendo a condição.

        /*
        ======================================================================================================
        STATUS: ✅ EXERCÍCIO CONCLUÍDO!
        ======================================================================================================
        AVALIAÇÃO (2026/08/13): Revisar Switch-Case e manipulação de entradas com String + (int, long, double)
        ======================================================================================================
        */
    }
}
