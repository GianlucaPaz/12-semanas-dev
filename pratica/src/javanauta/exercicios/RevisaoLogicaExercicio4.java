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

        /*========================================================================================================================================*/

        //RESOLUÇÃO:

        Scanner scanner = new Scanner(System.in);

        System.out.println("=====================================================");
        System.out.print("   - Digite o peso em kg: ");
        double peso = scanner.nextDouble();

        while (peso <= 0) {
            System.out.println("   ==================================================");
            System.out.println("   PESO INVÁLIDO! DIGITE UM VALOR MAIOR QUE ZERO!");
            System.out.println("   ==================================================");
            System.out.print("   - Digite o peso em kg: ");
            peso = scanner.nextDouble();
        }

        System.out.println("=====================================================");

        //1) Versão com if-else
        System.out.println("1) Versão com if-else                               |");
        System.out.println("----------------------------------------------------|");

        //Calculo Do frete a partir do peso em kg
        if (peso <= 5) {                                //Frete = R$15,00 (peso > 0 && peso <= 5)
            System.out.println("   - FRETE = R$15,00");
        }
        else if (peso <= 20) {                          //Frete = R$25,00 (peso > 5 && peso <= 20)
            System.out.println("   - FRETE = R$25,00");
        }
        else {                                          //Frete = R$40,00 (peso > 20)
            System.out.println("   - FRETE = R$40,00");
        }

        System.out.println("=====================================================");

        //2) Versão com ternário aninhado
        System.out.println("=====================================================");
        System.out.println("2) Versão com ternário aninhado                     |");
        System.out.println("----------------------------------------------------|");

        //Calculo Do frete a partir do peso em kg
        String frete = (peso <= 5)  ? "   - FRETE = R$15,00" :  //Frete = R$15,00 (peso > 0 && peso <= 5)
                (peso <= 20) ? "   - FRETE = R$25,00" :  //Frete = R$25,00 (peso > 5 && peso <= 20)
                        "   - FRETE = R$40,00";   //Frete = R$40,00 (peso > 20)

        System.out.println(frete);

        /*
        ============================================================================================================================================================================
        1) Qual das duas você levaria para produção e por quê?

           Para três faixas fixas, o ternário resolve. Para faixa de frete em produção, eu não usaria nenhuma das duas e faria o seguinte:

           Os limites e preços virariam uma tabela percorrida em laço, porque a regra muda com frequência e alterá-la não deveria exigir tocar em lógica nem recompilar.

        ============================================================================================================================================================================
        */

        /*
        ==========================================================================================================
        STATUS: ✅ EXERCÍCIO CONCLUÍDO!
        ==========================================================================================================
        */

    }
}
