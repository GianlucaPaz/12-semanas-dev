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

        /*=================================================================================================================================*/

        //RESOLUÇÃO:

        Scanner scanner = new Scanner(System.in);

        //Leitura da primeira nota
        System.out.print("Digite a primeira nota: ");
        double primeiraNota = scanner.nextDouble();

        //Leitura da segunda nota
        System.out.print("Digite a segunda nota: ");
        double segundaNota = scanner.nextDouble();

        //Leitura da frequência
        System.out.print("Digite a frequência (em %): ");
        long frequencia = scanner.nextLong();

        //Cálculo da média
        long mediaLong = (Math.round(primeiraNota * 100) + Math.round(segundaNota * 100) + 1) / 2;      //Média com fração de centésimo e arredondada para cima (half-up).
        double media = mediaLong / 100.0;

        //Exposição dos dados (Extra)
        System.out.println("-----------------------------------");
        System.out.println("Frequência do aluno: " + frequencia + "%");
        System.out.println("Média do aluno: " + media);
        System.out.println("-----------------------------------");

        //Verificação de aprovação
        if (frequencia < 75) {
            System.out.println("Status do aluno -> REPROVADO POR FALTA");
        }
        else if (media >= 7) {
            System.out.println("Status do aluno -> APROVADO");
        }
        else if (media >= 4) {
            System.out.println("Status do aluno -> PROVA FINAL");
        }
        else {
            System.out.println("Status do aluno -> REPROVADO POR NOTA");
        }

        /*
        ============================================================================================================================================================================
        1) Por que a ordem dos if importa aqui?

        -> RESPOSTA: Porque as condições não são mutuamente exclusivas.

           Um aluno com média 9 e frequência 60 satisfaz frequência < 75 e média >= 7 ao mesmo tempo e as duas regras se aplicam a ele.

           Quando isso acontece, quem estiver primeiro na cadeia é quem decide.

           Como o enunciado diz que a falta reprova independente das notas, ela tem que vir primeiro pois é uma guarda que precisa ser resolvida antes da avaliação de nota começar.

           E tem um segundo motivo: numa cadeia, cada else if só é alcançado se todos os anteriores falharam.

           Então media >= 4 significa na prática "média entre 4 e 7", porque o ramo de cima já eliminou o 7 pra cima.

           Se eu inverter esses dois, um aluno de média 9 cai em prova final.

        ------------------------------------------------------------

        2) Por que else if não é a mesma coisa que vários if soltos?

        -> RESPOSTA: Porque são coisas estruturalmente diferentes.

        Uma cadeia if / else if é uma estrutura de decisão: no máximo um ramo executa, e com else no final.

        Vários if soltos são N estruturas independentes: todas as condições são avaliadas e vários corpos podem executar na mesma passada.

        Na prática, com ifs soltos o aluno de média 9 e frequência 60 imprime "reprovado por falta" e "aprovado", duas saídas contraditórias.

        ============================================================================================================================================================================
        */

        /*
        ================================
        STATUS: ✅ EXERCÍCIO CONCLUÍDO!
        ================================
        */

    }
}
