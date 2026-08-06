package reconstrucao.logica.condicionais;

import java.util.Scanner;

public class EstruturaIfElse {
    public static void main(String[] args) {

        //Reconstrução Javanauta - If e Else

        //Faixa etária
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("---------------------------------------------------------");
        if (idade < 12) {
            System.out.println("Você é uma criança de " + idade + " anos de idade.");
        }
        else if (idade >= 12 && idade < 18) {
            System.out.println("Você é um adolescente de " + idade + " anos de idade.");
        }
        else if (idade >= 18 && idade < 60) {
            System.out.println("Você é um adulto de " + idade + " anos de idade.");
        }
        else {
            System.out.println("Você é um idoso de " + idade + " anos de idade.");
        }

        System.out.println("---------------------------------------------------------");

        //Saldo na conta
        double saldo = 200;
        System.out.print("Digite o valor do lanche: ");
        double valorLanche = scanner.nextDouble();

        if (valorLanche < 200) {
            System.out.printf("Compra aprovada! Restam R$ %.2f na sua conta.%n", (saldo - valorLanche));
        }
        else if (valorLanche == 200) {
            System.out.println("Compra aprovada! [ATENÇÃO]: Sua conta está zerada!");
        }
        else {
            System.out.println("Compra negada! Você possui apenas R$" + saldo + " na conta.");
        }
    }
}
