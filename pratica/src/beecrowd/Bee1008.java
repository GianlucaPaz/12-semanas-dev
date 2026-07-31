import java.util.Scanner;

public class Bee1008 {
    public static void main(String[] args) {

        //Exercício BEE 1008 - Salário

        Scanner scanner = new Scanner(System.in);

//        System.out.print("Digite o número do funcionário: ");
        int numeroFuncionario = scanner.nextInt();
//        System.out.print("Digite o número de horas trabalhadas: ");
        int horasTrabalhadas = scanner.nextInt();
//        System.out.print("Digite o valor que recebe por hora: ");
        double dinheiroPorHora = scanner.nextDouble();

        double SALARY = horasTrabalhadas * dinheiroPorHora;

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$ " + "%.2f%n",SALARY);
    }
}
