package reconstrucao.poo.heranca;

public class Principal {
    public static void main(String[] args) {

        //Reconstrução Javanauta - Herança

        //-> 1) Gato

        //Métodos da classe Gato.java =========================================================
        Gato gatoTigrao = new Gato("Tigrão", 2);    //metodo construtor

        gatoTigrao.setCor("Cinza");             //metodo set
        gatoTigrao.setPersonalidade("Arisco");  //metodo set

        System.out.println("----------------------------");
        System.out.println("-> Animal: Gato");
        System.out.println("----------------------------");
        System.out.println("Nome: " + gatoTigrao.getNome());                    //metodo get
        System.out.println("Cor: " + gatoTigrao.getCor());                      //metodo get
        System.out.println("Personalidade: " + gatoTigrao.getPersonalidade());  //metodo get
        System.out.println("Idade: " + gatoTigrao.getIdade());                  //metodo get
        System.out.print(gatoTigrao.getNome() + " ");                           //metodo get

        gatoTigrao.miar();

        //Métodos herdados da classe pai (Animal.java) ========================================
        gatoTigrao.acordar();
        gatoTigrao.comer();

        System.out.println();

        /*====================================================================================*/

        //-> 2) Cavalo

        //Métodos da classe Cavalo.java ========================================================
        Cavalo cavaloAquiles = new Cavalo("Aquiles", 7);    //metodo construtor

        cavaloAquiles.setCor("Preto");             //metodo set
        cavaloAquiles.setPersonalidade("Leal");  //metodo set

        System.out.println("----------------------------");
        System.out.println("-> Animal: Cavalo");
        System.out.println("----------------------------");
        System.out.println("Nome: " + cavaloAquiles.getNome());                    //metodo get
        System.out.println("Cor: " + cavaloAquiles.getCor());                      //metodo get
        System.out.println("Personalidade: " + cavaloAquiles.getPersonalidade());  //metodo get
        System.out.println("Idade: " + cavaloAquiles.getIdade());                  //metodo get
        System.out.print(cavaloAquiles.getNome() + " ");                           //metodo get

        cavaloAquiles.relinchar();

        //Métodos herdados da classe pai (Animal.java) ========================================
        cavaloAquiles.comer();
        cavaloAquiles.dormir();
    }
}
