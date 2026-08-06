package reconstrucao.logica.condicionais;

public class OperadoresLogicos {
    public static void main(String[] args) {

        //Reconstrução Javanauta - Operadores Lógicos

        //E lógico: && (AND)
        boolean x = true;
        boolean y = false;

        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("1) As variáveis x (true) e y (false) são verdadeiras ?");
        System.out.print("Resposta: ");
        System.out.println(x && y);
        System.out.println("----------------------------------------------------------------------------------");

        //Ou lógico: || (OR)
        System.out.println("2) A variável x (true) ou a variável y (false) é verdadeira ?");
        System.out.print("Respostas: ");
        System.out.println(x || y);
        System.out.println("----------------------------------------------------------------------------------");

        //Negação lógica: ! (NOT)
        System.out.println("3) O inverso da variável x (false) é verdadeiro ?");
        System.out.print("Resposta: ");
        System.out.println(!x);
        System.out.println("----------------------------------------------------------------------------------");

        System.out.println("4) O inverso da variável y (true) é verdadeiro ?");
        System.out.print("Resposta: ");
        System.out.println(!y);
        System.out.println("----------------------------------------------------------------------------------");

        //[Negação lógica: ! (NOT)] + [E lógico: && (AND)]
        System.out.println("5) O inverso da variável x (false) e o inverso da variável y (true) são verdadeiros ?");
        System.out.print("Resposta: ");
        System.out.println(!x && !y);
        System.out.println("----------------------------------------------------------------------------------");

        //[Negação lógica: ! (NOT)] + [Ou lógico: || (OR)]
        System.out.println("6) O inverso da variável x (false) ou o inverso da variável y (true) é verdadeiro ?");
        System.out.print("Resposta: ");
        System.out.println(!x || !y);
        System.out.println("----------------------------------------------------------------------------------");
    }
}
