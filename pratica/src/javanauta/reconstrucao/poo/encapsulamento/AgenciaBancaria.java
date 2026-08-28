package reconstrucao.poo.encapsulamento;

public class AgenciaBancaria {
    public static void main(String[] args) {

        //Reconstrução Javanauta - Encapsulamento

        //Criação do objeto ContaBancaria através do método construtor (com parâmetros específicos)
        ContaBancaria conta = new ContaBancaria("Gianluca");

        //Verificação do atributo titular através do método getter
        System.out.println("========================================================");
        System.out.println("- O nome do titular da conta é: " + conta.getTitular());

        //Verificação do atributo saldo através do método getter
        System.out.printf("- O saldo na conta: R$ %.2f%n", conta.getSaldo());
        System.out.println("========================================================");

        //Modificação do atributo titular através do  método setter
        conta.setTitular("Gianluca Paz");
        System.out.println("========================================================");
        System.out.println("- Nome do titular da conta atualizado para: " + conta.getTitular());

        //Modificação do atributo saldo através do método setter
        conta.setSaldo(conta.getSaldo() + 5000.00);     //ou conta.setSaldo(5000.00)
        System.out.printf("- Saldo da conta atualizado para: R$ %.2f%n", conta.getSaldo());
        System.out.println("========================================================");
    }
}
