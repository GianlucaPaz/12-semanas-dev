public class ConversaoDeTipos {
    public static void main(String[] args) {

        //Reconstrução Javanauta - Conversão de tipos

        //--> Conversão entre números
        System.out.println("-------------------------------------------------------------------");
        System.out.println("--> Conversão de int para long (inteiros):");
        int numero1 = 10;
        long numero2 = numero1;
        System.out.println("    Antes: " + numero1);
        System.out.println("    Depois: " + numero2);
        System.out.println("-------------------------------------------------------------------");

        System.out.println("--> Conversão de long para int (inteiros):");
        long numero3 = 30L;
        int numero4 = (int)numero3;
        System.out.println("    Antes: " + numero3);
        System.out.println("    Depois: " + numero4);
        System.out.println("-------------------------------------------------------------------");

        System.out.println("--> Conversão de double para int (ponto flutuante e inteiro):");
        double numero5 = 50.5;
        int numero6 = (int)numero5;
        System.out.println("    Antes: " + numero5);
        System.out.println("    Depois: " + numero6);
        System.out.println("-------------------------------------------------------------------");

        //--> Conversão entre números e String
        System.out.println("--> Conversão de int (Integer) para String (MÉTODO DE INSTÂNCIA):");
        Integer numero7 = 70;
        String texto1 = numero7.toString();
        System.out.println("    Antes + 7 (Matemática): " + (numero7 + 7));
        System.out.println("    Depois + 7 (Concatenção): " + (texto1 + 7 ));
        System.out.println("-------------------------------------------------------------------");

        System.out.println("--> Conversão de long (Long) para String (MÉTODO DE INSTÂNCIA):");
        Long numero8 = 80L;
        String texto2 = numero8.toString();
        System.out.println("    Antes + 8 (Matemática): " + (numero8 + 8));
        System.out.println("    Depois + 8 (Concatenação): " + (texto2 + 8));
        System.out.println("-------------------------------------------------------------------");

        System.out.println("--> Conversão de double (Double) para String (MÉTODO DE INSTÂNCIA):");
        Double numero9 = 90.1;
        String texto3 = numero9.toString();
        System.out.println("    Antes + 9 (Matemática): " + (numero9 + 9));
        System.out.println("    Depois + 9 (Concatenação): " + (texto3 + 9));
        System.out.println("-------------------------------------------------------------------");

    }
}
