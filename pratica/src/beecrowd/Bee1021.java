import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bee1021 {
    public static void main(String[] args) {

        //Exercício BEE 1021 - Notas e Moedas

        Scanner scanner = new Scanner(System.in);

//        System.out.print("Digite o valor monetário: ");
        double N = scanner.nextDouble();
        long centavos = Math.round(N * 100);

        List<Long> listaDeNotas = new ArrayList<>(List.of(10000L, 5000L, 2000L, 1000L, 500L, 200L));
        List<Integer> listaQtdNotas = new ArrayList<>();

        List<Long> listaDeMoedas = new ArrayList<>(List.of(100L, 50L, 25L, 10L, 5L, 1L));
        List<Integer> listaQtdMoedas = new ArrayList<>();

        int contN = 0;
        int contM = 0;
        int contListN = 0;
        int contListM = 0;

        //Contagem das notas
        for (int cont1 = 1; cont1 <= listaDeNotas.size(); cont1++) {
            if (centavos >= listaDeNotas.get(contListN)){
                for (int cont2 = 1; centavos >= listaDeNotas.get(contListN); cont2++) {
                    centavos = centavos - listaDeNotas.get(contListN);
                    contN = cont2;
                }
            }
            else {
                contN = 0;
            }

            listaQtdNotas.add(contN);
            contListN++;
        }

        //Contagem das moedas
        for (int cont1 = 1; cont1 <= listaDeMoedas.size(); cont1++) {
            if (centavos >= listaDeMoedas.get(contListM)){
                for (int cont2 = 1; centavos >= listaDeMoedas.get(contListM); cont2++) {
                    centavos = centavos - listaDeMoedas.get(contListM);
                    contM = cont2;
                }
            }
            else {
                contM = 0;
            }

            listaQtdMoedas.add(contM);
            contListM++;
        }

        System.out.println("NOTAS:");
        for (int cont = 0; cont < listaDeNotas.size(); cont++) {
            System.out.printf("%d nota(s) de R$ %.2f%n", listaQtdNotas.get(cont), listaDeNotas.get(cont) / 100.0);
        }
        System.out.println("MOEDAS:");
        for (int cont = 0; cont < listaDeMoedas.size(); cont++) {
            System.out.printf("%d moeda(s) de R$ %.2f%n", listaQtdMoedas.get(cont), listaDeMoedas.get(cont) / 100.0);
        }
    }
}
