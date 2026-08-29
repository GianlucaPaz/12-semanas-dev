package reconstrucao.poo.heranca;

public class Cavalo extends Animal {

    //Reconstrução Javanauta - Herança

    //1) Atributos ===================================================================

    /* Herdados da classe pai (Animal.java) garantidos pelo uso do extends */


    //2) Métodos =====================================================================

    //2.1) Métodos Construtores ======================================================
    public Cavalo() {
        super(); // Repassa os valores para o construtor Animal()
    }

    public Cavalo(String nome, long idade) {
        super(nome, idade); // Repassa os valores para o construtor Animal(String nome, long idade)
    }

    public Cavalo(String nome, String cor, String personalidade, long idade) {
        super(nome, cor, personalidade, idade); // Repassa os valores para o construtor Animal(String nome, String cor, String personalidade, long idade)
    }


    //2.2 Métodos Getter ============================================================

    /* Herdados da classe pai (Animal.java) garantidos pelo uso do extends */


    //2.3) Métodos Setter ============================================================

    /* Herdados da classe pai (Animal.java) garantidos pelo uso do extends */


    //2.4) Métodos de ação ===========================================================

    public void relinchar() {
        System.out.println("Relinchou!");
    }

    //-> O super é utilizado para: Chamar um método da classe pai

    public void comer(){
        super.comer();                              // Vai na classe pai, executa ela e imprime "Comeu!"
        System.out.println("Trotou de alegria e");    // Adiciona um comportamento extra
    }
}
