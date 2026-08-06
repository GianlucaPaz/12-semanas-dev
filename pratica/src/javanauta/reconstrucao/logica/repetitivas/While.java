package reconstrucao.logica.repetitivas;

public class While {
    public static void main(String[] args) {

        //Reconstrução Javanauta - While e Do-While

        //--> While + Switch Case
        System.out.println("------------");
        int cont = 1;
        while (cont <= 10) {

            switch (cont) {
                case 1:
                    System.out.println("Jesus");
                    break;
                case 2:
                    System.out.println("é");
                    break;
                case 3:
                    System.out.println("o");
                    break;
                case 4:
                    System.out.println("caminho");
                    break;
                case 5:
                    System.out.println("a");
                    break;
                case 6:
                    System.out.println("verdade");
                    break;
                case 7:
                    System.out.println("e");
                    break;
                case 8:
                    System.out.println("a");
                    break;
                case 9:
                    System.out.println("vida");
                    break;
            }
            cont++;
        }
        System.out.println("------------");

        //--> Do-While
        int cont2 = 1;

        do {
            System.out.println("Repetição " + cont2 + "!");
            cont2++;
        } while (cont2 < 10);
    }
}
