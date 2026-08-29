package reconstrucao.poo.polimorfismo;

public class Principal {
    public static void main(String[] args) {

        //Reconstrução Javanauta - Polimorfismo

        //Chamada dos métodos polimórficos de compilação (Sobrecarga de Métodos)
        int resultadoInt = Calculadora.soma(6, 1);
        double resultadoDouble = Calculadora.soma(10.0, 4.0);
        Integer resultadoInteger = Calculadora.soma(11, 6, 4);

        System.out.println("==========================");
        System.out.printf("RESULTADOS: %d | %.1f | %d%n", resultadoInt, resultadoDouble, resultadoInteger);
        System.out.println("==========================");

        //Chamada dos métodos polimórficos de tempo de execução (Sobrescrita de Métodos)
        Aviao tecoTeco = new Aviao();

        tecoTeco.mover();
    }
}
