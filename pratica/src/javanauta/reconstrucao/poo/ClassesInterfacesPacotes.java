package reconstrucao.poo;

public class ClassesInterfacesPacotes implements InterfaceMatematica{

    //Reconstrução Javanauta - Classes, Interfaces e Pacotes

    //1) Implementação da interface 'InterfaceMatematica' (feito no topo do documento com o 'implements')

    //2) Implementação dos metodos da interface a esta classe (métodos da interface sinalizados com anotação @Override)

    //As instruções dos metodos são construídas aqui
    //Essas instruções podem ser de um jeito aqui nesta classe e diferentes em outra classe de acordo com a necessidade
    @Override
    public long somaInteira(long a, long b) {
        return a + b;
    }

    @Override
    public long subtracaoInteira(long a, long b) {
        return a - b;
    }

    //3) Uso dos métodos
    public static void main(String[] args) {

        ClassesInterfacesPacotes calculo = new ClassesInterfacesPacotes();

        long resultadoSoma = calculo.somaInteira(7, 10);
        long resutadoSubtracao = calculo.subtracaoInteira(77, 7);

        System.out.println("=============================");
        System.out.println("- Resultado da soma: " + resultadoSoma);
        System.out.println("- Resultado da subtração: " + resutadoSubtracao);
        System.out.println("=============================");
    }
}
