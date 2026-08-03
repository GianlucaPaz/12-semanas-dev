package reconstrucao;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        //Reconstrução Javanauta - Operador Ternário

        //Tem ou não tem dinheiro
        boolean temDinheiro = true;
        boolean semDinheiro = false;

        String mensagem = (temDinheiro) ? "Pode comprar!" : "Não pode comprar";
        System.out.println(mensagem);

        String mensagem2 = (semDinheiro) ? "Pode comprar!" : "Não pode comprar!";
        System.out.println(mensagem2);

        System.out.println("-----------------------------------------------------------------");

        //Tempo com chuva ou sem chuva
        Scanner scanner = new Scanner(System.in);
        System.out.print("Está chovendo? (digite 'true' para sim e 'false' para não): ");
        boolean estaChovendo = scanner.nextBoolean();

        String mensagem3 = (estaChovendo) ? "Está chovendo! Leve um guarda chuva!" : "Não está chovendo! O céu está azul!";
        System.out.println(mensagem3);
    }
}
