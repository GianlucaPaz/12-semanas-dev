package reconstrucao.poo.polimorfismo;

public class Calculadora {

    //Reconstrução Javanauta - Polimorfismo

    //Métodos (Polimorfismo de Compilação - Sobrecarga de Métodos)
    public static int soma (int a, int b) {
        return a + b;
    }

    public static double soma (double a, double b) {
        return a + b;
    }

    public static Integer soma (Integer a, Integer b, Integer c) {
        return a + b + c;
    }
}
