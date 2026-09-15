package fase1.tarefa3;

public class Item {

    //Atributos
    private String nome;
    private String categoria;
    private double valor;

    //Métodos

    public Item(String nome, String categoria, double valor){
        this.nome = nome;
        this.categoria = categoria;
        this.valor = valor;
    }

    public String getNome(){
        return nome;
    }

    public String getCategoria(){
        return categoria;
    }

    public double getValor(){
        return valor;
    }
}
