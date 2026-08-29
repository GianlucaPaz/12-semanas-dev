package reconstrucao.poo.heranca;

public class Animal {

    //Reconstrução Javanauta - Herança

    //1) Atributos da classe pai =====================================================

    private String nome;
    private String cor;
    private String personalidade;
    private long idade;


    //2) Métodos da classe pai =======================================================

    //2.1) Métodos Construtores ======================================================
    public Animal() {
    }

    public Animal(String nome, long idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Animal(String nome, String cor, String personalidade, long idade) {
        this.nome = nome;
        this.cor = cor;
        this.personalidade = personalidade;
        this.idade = idade;
    }

    //2.2 Métodos Getter ============================================================

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public String getPersonalidade() {
        return personalidade;
    }

    public long getIdade() {
        return idade;
    }

    //2.3) Métodos Setter ============================================================

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPersonalidade(String personalidade) {
        this.personalidade = personalidade;
    }

    public void setIdade(long idade) {
        this.idade = idade;
    }

    //2.4 Métodos de ação ===========================================================
    public void acordar() {
        System.out.println("Acordou!");
    }

    public void comer() {
        System.out.println("Comeu!");
    }

    public void dormir() {
        System.out.println("Dormiu!");
    }
}
