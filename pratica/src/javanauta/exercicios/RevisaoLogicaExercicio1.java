package exercicios;

import java.util.Scanner;

public class RevisaoLogicaExercicio1 {
    public static void main(String[] args) {

        /*
        =====================================================================================================================================================================
        1. Folha de pagamento em centavos (Sequenciais, tipos primitivos, aritmética, casting)

        - Lê o valor da hora trabalhada (em reais, com centavos) e a quantidade de horas. Calcula bruto, desconto de INSS de 11%, e líquido. Imprime os três com duas casas.

        - Restrição obrigatória: nenhum cálculo intermediário pode usar double. Converta para long em centavos antes de qualquer operação.

        - Aceite: 12,50 e 160 → bruto 2000,00 / INSS 220,00 / líquido 1780,00. Teste também 9,99 e 7 (bruto 69,93 — confira se o arredondamento do INSS não come um centavo).
        =====================================================================================================================================================================
        */

        Scanner scanner = new Scanner(System.in);

        //-> Leitura dos valores
        System.out.print("Digite o valor da hora trabalhada (em reais, com centavos) e a quantidade de horas: ");
        double valor = scanner.nextDouble();
        int hora = scanner.nextInt();

        //-> Conversão explícita (double para long) através do (long)valor:
        double centavosD = Math.round(valor * 100);
        long centavosL = (long)centavosD;

        //-> Conversão alternativa feita através do Math.round
        //long centavos = Math.round(valor * 100);

        //-> Cálculos
        long valorBruto = centavosL * hora;
        long valorDesconto = valorBruto * 11 / 100;  //11% = 11 / 100
        long valorLiquido = valorBruto - valorDesconto;

        //-> Conversão implícita (long para double)
        double valorBrutoFinal = valorBruto;
        double valorDescontoFinal = valorDesconto;
        double valorLiquidoFinal = valorLiquido;

        //-> Resultado na tela
        System.out.printf("Bruto %.2f / INSS %.2f / Líquido %.2f%n", valorBrutoFinal/100, valorDescontoFinal/100, valorLiquidoFinal/100);

        //-> Resultado na tela sem precisar da conversão implícita (divisão por 100.0)
        //System.out.printf("Bruto %.2f / INSS %.2f / Líquido %.2f%n", valorBrutoFinal/100.0, valorDescontoFinal/100.0, valorLiquidoFinal/100.0);

        /*
        ==========================================================================
        STATUS: ✅ EXERCÍCIO CONCLUÍDO!
        ==========================================================================
        AVALIAÇÃO (2026/08/12): Revisar o conteúdo de casting e conversão de tipos
        ==========================================================================
        */
    }
}
