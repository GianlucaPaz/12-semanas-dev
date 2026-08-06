package reconstrucao.logica.repetitivas;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        //Reconstrução Javanauta - Arrays

        //--> Declaração de um array (sem instanciar)
        int [] idades;     //declarado sem tamanho alocado e sem memória alocada
        double [] valores;
        /*---------------------------------------------------------------*/

        //--> Inicialização de um array
        idades = new int[]{28, 61, 60};     //inicializado com valores específicos

        valores = new double [3];           //inicializado com 3 elementos iguais a zero - (O dev alocou apenas o tamanho, e o Java alocou a memória com valores zero)
        valores [0] = 7.000;                //depois foi feita a substituição individual dos valores por posição
        valores [1] = 17.000;
        valores [2] = 70.000;

        /*---------------------------------------------------------------*/

        //--> Declaração e Inicialização
        String [] nomes = {"Gian", "Marc", "Mari"};

        double [] salarios = new double[3]; //declarado e inicializado com 3 elementos iguais a zero - (O dev alocou apenas o tamanho, e o Java alocou a memória com valores zero)

        /* Nota: No caso em que se inicializa apenas alocando o tamanho do array, o Java faz a inicialização na memória e
                preenche todas as posições com um valor padrão (como 0 para números, false para booleanos ou null para objetos)
        */

        /*---------------------------------------------------------------*/

        //--> Escrevendo informações do array

        //-> Escrevendo os nomes
        for (int cont = 0; cont < nomes.length; cont++) {
            System.out.println(nomes[cont]);
        }
        System.out.println("------------------------------------------------");

        /*---*/

        //-> Escrevendo valores (primeiro uso do for-each)
        for (double valor : valores){
            System.out.println(valor);
        }
        System.out.println("------------------------------------------------");

        /*---*/

        //-> Escrevendo nomes e idades
        System.out.println(nomes[1] + " (" + idades[1] + " anos)" + " + " + nomes[2] + " (" + idades[2] + " anos) = " + nomes[0] + " (" + idades[0] + " anos)");
        System.out.println("------------------------------------------------");

        /*---*/

        //-> Escrevendo nomes, lendo salários e escrevendo salários
        Scanner scanner = new Scanner(System.in);

        for (int cont2 = 0; cont2 < nomes.length; cont2++){
            System.out.print("Digite o salário de " + nomes[cont2] + ": ");
            salarios [cont2] = scanner.nextDouble();
        }

        for (int cont2 = 0; cont2 < nomes.length; cont2++){
            System.out.printf("O salário de " + nomes[cont2] + " é: R$%.2f%n", salarios[cont2]);
        }
        System.out.println("------------------------------------------------");
    }
}
