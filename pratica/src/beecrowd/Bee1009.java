import java.util.Scanner;

public class Bee1009 {
    public static void main(String[] args) {

        //Exercício BEE 1009 - Salário com Bônus

        Scanner scanner = new Scanner(System.in);

//        System.out.print("Digite o nome do vendedor: ");
        String nomeVendedor = scanner.nextLine();
//        System.out.print("Digite o salário fixo: ");
        double salarioFixo = scanner.nextDouble();
//        System.out.print("Digite o total de vendas efetuadas no mês (em dinheiro): ");
        double vendasMes = scanner.nextDouble();

        double TOTAL = salarioFixo + vendasMes * 0.15;

        System.out.printf("TOTAL = R$ " + "%.2f%n",TOTAL);
    }
}
