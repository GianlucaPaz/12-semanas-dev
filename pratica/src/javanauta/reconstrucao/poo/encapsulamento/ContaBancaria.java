package reconstrucao.poo.encapsulamento;

public class ContaBancaria {

    //Reconstrução Javanauta - Encapsulamento

    //1) Atributos
    private String titular;
    private double saldo;

    //2) Métodos

    //2.1) Métodos Getter (retornam os valores dos atributos da classe)

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    //2.2) Métodos Setter (modificam os valores dos atributos da classe)

    public void setTitular(String titular) {
        this.titular = titular;     //this.titular aponta para o atributo da classe e titular aponta para o parâmetro do método
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;         //this.saldo aponta para o atributo da classe e saldo aponta para o parâmetro do método
    }

    //2.3) Métodos Construtores (permitem inicializar os atributos da classe através dos parâmetros da criação do objeto)

    //Método Construtor sem parâmetros (cria o objeto sem atribuir valor aos atributos)
    public ContaBancaria() {

    }

    //Método Construtor com parâmetros específicos (cria o objeto atribuindo valor apenas aos atributos inicialmente necessários)
    public ContaBancaria(String titular) {
        this.titular = titular;
    }

    //Método Construtor com todos os parâmetros (cria o objeto atribuindo valor a todos os atributos)
    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
}
