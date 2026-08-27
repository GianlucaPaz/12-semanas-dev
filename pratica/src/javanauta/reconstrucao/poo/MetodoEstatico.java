package reconstrucao.poo;

import java.util.Scanner;

public class MetodoEstatico {

    //Reconstrução Javanauta - Métodos de Instância e Métodos Estáticos

    //Método3: Multiplica dos valores inseridos
    protected static int multiplicarValores() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("   - Digite dois números inteiros para serem multiplicados: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        return  a * b;
    }
}
