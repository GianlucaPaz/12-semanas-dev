package exercicios;

import java.util.Scanner;

public class RevisaoLogicaExercicio3 {
    public static void main(String[] args) {

        /*
        =====================================================================================================================================
        3. Situação final do aluno (Expressões comparativas, operadores lógicos, if-else encadeado)

        - Lê duas notas e a frequência em porcentagem. Regras, nesta ordem de precedência:

          -> frequência < 75 → REPROVADO POR FALTA (independente das notas)
          -> média ≥ 7 → APROVADO
          -> média ≥ 4 e < 7 → PROVA FINAL
          -> média < 4 → REPROVADO POR NOTA

        - Aceite: 9, 9, 60 → reprovado por falta. 6.9, 7.1, 75 → aprovado (média exatamente 7,0 — verifique).

        - O que você precisa saber explicar: por que a ordem dos if importa aqui, e por que else if não é a mesma coisa que vários if soltos.
        =====================================================================================================================================
        */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite | nota 1 | nota 2 | frequência (em porcentagem) |: ");
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double frequencia = scanner.nextDouble();
        double media = (nota1 + nota2) / 2;

        if (frequencia < 75) {
            System.out.println("REPROVADO POR FALTA");
        }
        else {
            if (media >= 7) {
                System.out.println("APROVADO");
            }
            else if (media >= 4) {
                System.out.println("PROVA FINAL");
            }
            else {
                System.out.println("REPROVADO POR NOTA");
            }
        }

        //-> A ordem dos if importa porque se a ordem de prioridade das condições não for atendida, os testes pararão antes ou depois do que deveriam, e a resposta estará errada.
        //-> Else if não é igual a vários if separados porque ele para de testar assim que acha uma resposta certa, enquanto vários if testam todas as opções.

        /*
        ================================
        STATUS: ✅ EXERCÍCIO CONCLUÍDO!
        ================================
        AVALIAÇÃO (2026/08/12): Tudo ok!
        ================================
        */
    }
}
