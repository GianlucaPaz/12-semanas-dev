package reconstrucao.poo;

import javax.swing.*;

public class AulaObjetos {

    //Reconstrução Javanauta - Objetos

    //Atributos
    protected int quartos;
    protected int banheiros;
    protected int cozinha;
    protected String material;
    protected String cor;

    //Métodos
    protected void construir(){
        System.out.println("=========================");
        System.out.println("-> A casa foi construída:");
        System.out.println("   - Quartos: " + quartos);
        System.out.println("   - Banheiros: " + banheiros);
        System.out.println("   - Cozinha: " + cozinha);
        System.out.println("   - Material: " + material);
        System.out.println("=========================");
    }

    protected void pintar() {
        System.out.println("======================");
        System.out.println("-> A casa foi pintada:");
        System.out.println("   - Cor: " + cor);
        System.out.println("======================");
    }

    //Atribuindo a Classe AulaObjetos ao Objeto casa
    public static void main(String[] args) {

        AulaObjetos casa = new AulaObjetos();

        //Inicialização dos atributos
        casa.quartos = 5;
        casa.banheiros = 2;
        casa.cozinha = 1;
        casa.material = "Tijolo";
        casa.cor = "Azul";

        //Utilizando os métodos

        casa.construir();
        casa.pintar();
    }
}
