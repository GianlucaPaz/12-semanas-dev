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

        /*=================================================================================================================================================================*/

        //RESOLUÇÃO:

        Scanner scanner = new Scanner(System.in);

        //Leitura do valor por hora trabalhada (Reais / Hora)
        System.out.print("Digite o valor recebido por hora trabalhada: ");
        double valorDaHoraTrabalhada = scanner.nextDouble();

        //Leitura da quantidade de horas trabalhada (Horas totais do trabalho)
        System.out.print("Digite a quantidade de horas de trabalho: ");
        long horasTrabalhadas = scanner.nextLong();

        //Calculo Bruto
        long salarioBruto = Math.round(valorDaHoraTrabalhada * 100) * horasTrabalhadas; //ATENÇÃO: NOTA TÉCNICA (TÓPICO 1)

        //Desconto de INSS
        long descontoINSS = (salarioBruto * 11 + 50) / 100;  //ATENÇÃO: NOTA TÉCNICA (TÓPICO 2 a 4)

        //Calculo Líquido
        long salarioLiquido = salarioBruto - descontoINSS;

        //Impressão dos valores
        System.out.printf("Salário Bruto: %.2f | Desconto do INSS: %.2f | Salário Líquido: %.2f%n", salarioBruto/100.0, descontoINSS/100.0, salarioLiquido/100.0);


        /*
        === NOTA TÉCNICA: TRATAMENTO DE DECIMAIS E BIGDECIMAL ===

        ===================================================================================================
        1. A Ilusão do double e o porquê de usar Math.round()
        ===================================================================================================
        Computadores têm dificuldade em representar certos números decimais de forma exata usando
        o sistema binário (padrão IEEE 754). Quando você digita 9.99 e multiplica por 100, nós sabemos
        que o resultado é exatamente 999. No entanto, na memória do Java, a conta 9.99 * 100 pode
        resultar em um número extremamente próximo, mas impreciso, como 998.99999999999999.

        O problema do Cast (long):
        Se você usar apenas o cast direto, como em (long)(valorDaHoraTrabalhada * 100), o Java
        simplesmente corta a parte decimal. Ele transforma 998.99999999999999 em 998. Você perde
        1 centavo logo na primeira linha do programa, antes mesmo de calcular o INSS!

        A solução com Math.round():
        O Math.round() atua como um escudo contra essa imprecisão. Ele analisa o 998.99999999999999,
        percebe que a fração é maior que 0.5 e arredonda para cima, entregando o resultado exato: 999.
        Além disso, há uma vantagem técnica: quando o Math.round() recebe um valor do tipo double,
        ele automaticamente devolve um tipo long. Isso resolve perfeitamente a nossa necessidade de
        converter o valor original com segurança.

        ===================================================================================================
        2. O Problema: A "Guilhotina" dos Inteiros
        ===================================================================================================
        Quando você usa tipos como long na hora de fazer divisões, o Java não sabe o que é uma vírgula.
        Ele não faz "arredondamento" natural. Ele age como uma guilhotina: ele simplesmente corta e joga
        fora qualquer coisa que vier depois da vírgula.

        Vamos olhar para a sua fórmula, imaginando um salário bruto de R$ 10,45 (que em centavos é 1045):

        1. A Multiplicação: 1045 * 11 = 11495
        2. A Divisão Matemática (Calculadora): 11495 / 100 = 114,95 (ou seja, 114 centavos e uma
           fração de quase 1 centavo inteiro).
        3. A Divisão do Java (long): Como o Java corta os decimais, ele faz 11495 / 100 = 114.

        Resultado: O INSS foi calculado como 114 centavos (R$ 1,14). Mas, como a matemática deu 114,95,
        o correto seria arredondar para cima: 115 centavos (R$ 1,15). Ao usar long puro, você "roubou"
        1 centavo do cálculo.

        ===================================================================================================
        3. O Truque Matemático: Por que somar 50?
        ===================================================================================================
        Para resolver essa guilhotina sem sair do tipo long, os programadores usam um truque clássico
        de lógica matemática: adicionar metade do divisor antes de dividir.

        Como você está dividindo por 100, a metade é 50. Mas por que isso funciona? O objetivo é empurrar
        o valor para cima. Se a fração cortada for de 50 para cima, ela ganha força para pular para o
        próximo número inteiro. Se for 49 para baixo, ela não tem força suficiente e continua no mesmo número.

        Veja como a mágica acontece nos dois cenários:

        - Cenário A (Precisa arredondar para CIMA): O valor era 11495 (114,95).
          - Somamos 50: 11495 + 50 = 11545
          - O Java passa a guilhotina: 11545 / 100 = 115.
          - Sucesso! Arredondou para 115.

        - Cenário B (Precisa arredondar para BAIXO): Imagine que o cálculo deu 76923 (769,23).
          - Somamos 50: 76923 + 50 = 76973
          - O Java passa a guilhotina: 76973 / 100 = 769.
          - Sucesso! O número permaneceu 769.

        No seu código, a correção ficaria assim:
        long descontoINSS = (salarioBruto * 11 + 50) / 100;

        ===================================================================================================
        4. A Solução Profissional: BigDecimal
        ===================================================================================================
        Embora o truque do + 50 seja rápido e excelente para exercícios de lógica, ele cria o que
        chamamos de "número mágico" no código. Em aplicações robustas — com regras de negócio bem
        definidas — ler um + 50 no meio de um cálculo de INSS pode confundir outro desenvolvedor no futuro.

        É aí que entra o BigDecimal. Ele é uma classe no Java criada especificamente para lidar com dinheiro.
        Ele guarda o valor exato, não perde nenhum centavo e, o mais importante, obriga você a declarar
        qual é a sua regra de arredondamento abertamente.

        Em vez de truques matemáticos, você diz ao código de forma literal: "Se a fração for 50 ou
        maior, arredonde para cima", usando o comando RoundingMode.HALF_UP.

        Para usar o BigDecimal no seu código e resolver o problema dos centavos de forma profissional,
        nós vamos substituir apenas a linha do descontoINSS.

        Como a regra do seu exercício exige que você guarde o valor final em long (representando os
        centavos), o que faremos é "converter para BigDecimal, fazer a conta com precisão, e voltar
        para long".

        // Veja como fica a implementação na prática:

        long salarioBruto = 1045; // Usando nosso exemplo anterior: R$ 10,45

        // 1. Transformamos o long em BigDecimal
        BigDecimal brutoBD = BigDecimal.valueOf(salarioBruto);

        // 2. Fazemos a matemática definindo a regra de arredondamento clara
        BigDecimal descontoBD = brutoBD
                .multiply(new BigDecimal("11")) // Multiplica por 11
                .divide(new BigDecimal("100"), RoundingMode.HALF_UP); // Divide por 100 e arredonda

        // 3. Devolvemos para o tipo long para continuar o programa
        long descontoINSS = descontoBD.longValue(); // O resultado aqui será exatamente 115

        O que está acontecendo passo a passo?

        1. new BigDecimal("11") e new BigDecimal("100"): Você vai notar que passamos os números como
           texto (String) entre aspas. Isso é uma regra de ouro do BigDecimal. Se você passar um double
           direto para ele, o Java pode trazer aquelas imprecisões de casas decimais infinitas. Usar
           String garante que o número é exatamente o que você digitou.

        2. .divide(..., RoundingMode.HALF_UP): Aqui está a mágica substituindo o truque do + 50.
           O HALF_UP significa literalmente "Metade (Half) para Cima (Up)". Ele diz ao Java: "Faça a
           divisão. Se a fração que iria para a guilhotina for 0.50 (metade) ou maior, arredonde o
           número inteiro para cima. Se for menor, jogue a fração fora".

        Por que isso é melhor no mundo real?
        Imagine que amanhã a regra mude e o governo diga que os descontos de impostos devem sempre
        ser arredondados para baixo, beneficiando o trabalhador. Se você estivesse usando o truque
        matemático de somar 50, teria que refazer a lógica matemática. Com o BigDecimal, você só
        precisaria trocar uma palavra no código: de RoundingMode.HALF_UP para RoundingMode.DOWN.
        O código fica extremamente fácil de ler e dar manutenção!
        */

        /*
        ==========================================================================
        STATUS: ✅ EXERCÍCIO CONCLUÍDO!
        ==========================================================================
        */
    }
}
