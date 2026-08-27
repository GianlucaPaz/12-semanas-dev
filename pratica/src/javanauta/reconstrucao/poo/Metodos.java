package reconstrucao.poo;

import exercicios.RevisaoLogicaExercicio4;
import exercicios.RevisaoLogicaExercicio5;

public class Metodos {

    //Reconstrução Javanauta - Modificadores de Acesso, Tipos de Retorno, Como nomear Métodos, Parâmetros de Métodos, Métodos de Instância e Métodos Estáticos

    //-> A Classe

    //Atributos
    private int a;
    private int b;
    private int c;

    //Métodos

    //Método1: Retorna a soma de 3 números inteiros
    private int somarValores() {
        return a + b + c;
    }

    //Método2: Converte o parâmetro para double
    private double converterParaDouble(int valor) {
        return valor;   // O Java converte para double automaticamente neste momento
    }

    /*==============================================================================================================*/

    //-> Suposta classe de teste

    public static void main(String[] args) {

        //-> Criação do Objeto calculo ao instanciar a classe Metodos
        Metodos calculo = new Metodos();

        //Atribuição das variáveis (atributos da classe)
        calculo.a = 1;
        calculo.b = 2;
        calculo.c = 4;

        //Chamada do Método1 (de instância)
        int resultado = calculo.somarValores();

        System.out.println("==================================================================");
        System.out.println("-> Método1 (de instância)");
        System.out.println("   - A soma dos valores de a, b e c é: " + resultado);
        System.out.println("==================================================================");

        //Chamada do Método2 (de instância)
        double valorConvertido = calculo.converterParaDouble(resultado);

        System.out.println("==================================================================");
        System.out.println("-> Método2 (de instância)");
        System.out.printf("   - Valor %d convertido para double é = %.2f%n", resultado, valorConvertido);
        System.out.println("==================================================================");

        //-> Chamada do Método3 (Estático) dentro print
        System.out.println("-> Método3 (estático)");
        System.out.println("   - A resposta da multiplicação é = " + MetodoEstatico.multiplicarValores());
    }
}
