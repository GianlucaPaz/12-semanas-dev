package exercicios;

public class QuizEstruturasCondicionais {
    public static void main(String[] args) {

        //Quiz Javanauta - Estruturas Condicionais

        //1) Qual é a saída do seguinte código?

        int a = 5;
        if (a > 3) {
            System.out.println("Maior que 3");
        } else {
            System.out.println("Menor ou igual a 3");
        }

        //Resposta: Maior que 3

        /*---------------------------------------*/

        //2) Qual é a função do operador == em uma expressão condicional?

        //Resposta: É uma comparação de igualdade

        /*---------------------------------------*/

        //3) Qual é a saída do seguinte código?

        int x = 10;
        if (x == 10) {
            System.out.println("x é igual a 10");
        } else {
            System.out.println("x não é igual a 10");
        }

        //Resposta: x é igual a 10

        /*---------------------------------------*/

        //4) Qual é a saída do seguinte código?

        int num = 7;
        String resultado = (num) ? "Par" : "Ímpar";
        System.out.println(resultado);

        /*
        - Resposta: Erro de compilação

        - Explicação: O erro ocorre por dois motivos...
             --> A condição da expressão ternária exige um valor do tipo booleano e o valor de 'num' é do tipo inteiro.
             --> O erro também ocorre porque o Java não converte tipos (inteiro no caso) de forma automática para booleano.

        - Correção da linha errada: String resultado = (num % 2 == 0) ? "Par" : "Ímpar";
             --> Com essa correção, começamos utilizando o operador aritimético '%' (que gera um valor do tipo int) o que sozinho ainda não serve como condição..
                 E logo depois utilizamos o operador de igualdade '==' (que gera um valor do tipo booleano) atendendo a exigência da condição da expressao ternária

        - Resposta pós correção: Ímpar
        */

        /*---------------------------------------*/

        //5) O que o seguinte código imprime?

        int y = 20;
        if (y > 10 && y < 30) {
            System.out.println("Dentro do intervalo");
        } else {
            System.out.println("Fora do intervalo");
        }

        //Resposta: Dentro do intervalo

        /*---------------------------------------*/

        //6) Para qual cenário é mais adequado usar a estrutura switch-case?

        //Resposta: Quando temos muitas condições de igualdade

        /*---------------------------------------*/
    }
}
