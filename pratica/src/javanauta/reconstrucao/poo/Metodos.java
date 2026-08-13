package reconstrucao.poo;

import exercicios.RevisaoLogicaExercicio4;
import exercicios.RevisaoLogicaExercicio5;

public class Metodos {

    //Reconstrução Javanauta - Modificadores de Acesso, Tipos de Retorno e Como nomear Métodos

    //-> Exemplo com tipo de retorno int

    protected int a;
    protected int b;
    protected int c;


    protected int somarValores() {
        return a + b + c;
    }

    public static void main(String[] args) {
        Metodos somatorioDeValores = new Metodos();

        somatorioDeValores.a = 1;
        somatorioDeValores.b = 2;
        somatorioDeValores.c = 4;

        int resultado = somatorioDeValores.somarValores();
        System.out.println("====================================");
        System.out.println("A soma dos valores de a, b e c é: " + resultado);
        System.out.println("====================================");
    }
}
