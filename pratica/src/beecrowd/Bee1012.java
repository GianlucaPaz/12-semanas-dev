import java.util.Scanner;

public class Bee1012 {
    public static void main(String[] args) {

        //Exercício BEE 1012 - Área

        Scanner scanner = new Scanner(System.in);

//        System.out.print("Digite três valores: ");
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();
        double pi = 3.14159;

        double areaTriangulo = (A * C) / 2;
        double areaCirculo = pi * Math.pow(C,2);
        double areaTrapezio = ((A + B) * C) / 2;
        double areaQuadrado = B * B;
        double areaRetangulo = A * B;


        System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
        System.out.printf("CIRCULO: %.3f%n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f%n", areaRetangulo);
    }
}
