package exercicios;

public class QuizEstruturasRepetitivas {
    public static void main(String[] args) {

        //Quiz Javanauta - Estruturas Repetitivas

        System.out.println("------------------------------------------");
        //1) Qual é a saída do seguinte código?
        System.out.println("1) Qual é a saída do seguinte código?");

        int i = 0;
        while (i < 3) {
            System.out.println(i);
            i++;
        }

        //Resposta: 0 1 2

        /*---------------------------------------*/
        System.out.println("------------------------------------------");
        /*---------------------------------------*/

        //2) Qual é a saída do seguinte código?
        System.out.println("2) Qual é a saída do seguinte código?");

        for (int j = 0; j < 5; j++) {
            if (j == 3) {
                break;
            }
            System.out.println(j);
        }

        //Resposta: 0 1 2

        /*---------------------------------------*/
        System.out.println("------------------------------------------");
        /*---------------------------------------*/

        //3) Qual é a saída do seguinte código?
        System.out.println("3) Qual é a saída do seguinte código?");

        int l = 0;

        do {
            System.out.println(l);
            l++;
        } while (l < 3);

        //Resposta: 0 1 2

        /*---------------------------------------*/
        System.out.println("------------------------------------------");
        /*---------------------------------------*/

        //4) Para qual cenário é mais adequado usar a estrutura do-while?

        //Resposta: Quando o bloco de código deve ser executado pelo menos uma vez

        /*---------------------------------------*/

        //5) Qual das seguintes opções é verdadeira sobre loops while em Java?

        //Resposta: Um loop while pode nunca ser executado se a condição for falsa desde o início

        /*---------------------------------------*/

        //6) Qual é a saída do seguinte código?
        System.out.println("6) Qual é a saída do seguinte código?");

        int count = 1;

        while (count <= 3) {
            System.out.println("Contagem:" + count);
            count++;
        }

        //Resposta: Contagem:1 Contagem:2 Contagem:3

        /*---------------------------------------*/
        System.out.println("------------------------------------------");
        /*---------------------------------------*/
    }
}
