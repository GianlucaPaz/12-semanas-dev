package reconstrucao.poo.polimorfismo;

public class Aviao extends Veiculo{

    //Reconstrução Javanauta - Polimorfismo

    //Métodos Classe Filha (Polimorfismo de Tempo de Execução - Sobrescrita de Métodos)
    @Override
    public void mover () {
        System.out.println("O avião está voando!");
    }
}
