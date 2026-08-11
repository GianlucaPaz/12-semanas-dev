package reconstrucao.logica.repetitivas;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapTreeMap {
    public static void main(String[] args) {

        //Reconstrução Javanauta - HashMap e TreeMap

        //Reconstrução com HashMap -------------------------------------------------------------------------------------

        //-> 1) Inicialização
        HashMap<String, Integer> idadePessoas = new HashMap<>();

        idadePessoas.put("Gianluca", 28);
        idadePessoas.put("Daniel", 15);
        idadePessoas.put("Davi", 1);

        //-> 2) Metodo .get(): pega os valores do HasMap através da chave
        System.out.println("-------------------------------------------------------------------");
        System.out.printf("2) Gianluca tem a idade de %d anos!%n", idadePessoas.get("Gianluca"));
        System.out.println("-------------------------------------------------------------------");

        //-> 3) Metodo .keySet(): Pega as chaves do HashMap
        System.out.println("3) Idade das pessoas (.keySet()):");
        for (String nome : idadePessoas.keySet()) {
            System.out.println("   - " + nome + " tem " + idadePessoas.get(nome));
        }
        System.out.println("-------------------------------------------------------------------");

        //-> 4) Metodo .entrySet() + .getKey e .getValue: Pega as chaves e os valores do HashMap
        System.out.println("4) Nomes e idades das pessoas (.entrySet() + .getKey e .getValue):");
        for (Map.Entry<String, Integer> idade : idadePessoas.entrySet()) {
            System.out.println("   - " + idade.getKey() + ": " + idade.getValue());
        }
        System.out.println("-------------------------------------------------------------------");

        //-> 5) Metodo .remove: Remove a informação (chave e valor) do HashMap através da chave
        System.out.println("5) Remove a informação da pessoa (.remove):");

        idadePessoas.remove("Davi"); //Informações do Davi removidas

        for (String nome : idadePessoas.keySet()) {
            System.out.printf("   - %s: %d%n", nome, idadePessoas.get(nome));
        }
        System.out.println("-------------------------------------------------------------------");


        //Reconstrução com TreeMap -------------------------------------------------------------------------------------

        //-> 6) Inicialização
        TreeMap<String, String> sobrenomeNomes = new TreeMap<>();

        sobrenomeNomes.put("Gianluca", "Paz");
        sobrenomeNomes.put("Daniel", "Ross");
        sobrenomeNomes.put("Davi", "Nascimento");

        //-> 7) Metodo .get(): pega os valores (sobrenomes) do TreeMap através das chaves (nomes)
        System.out.println("-------------------------------------------------------------------");
        System.out.println("7) O sobrenome de Gianluca é: " + sobrenomeNomes.get("Gianluca"));
        System.out.println("-------------------------------------------------------------------");

        //-> 8) Metodo .keySet(): Pega as chaves do TreeMap
        System.out.println("8) Nome e Sobrenome das pessoas:");
        for (String nome : sobrenomeNomes.keySet()) {
            System.out.printf("   - Nome: %s | Sobrenome: %s%n", nome, sobrenomeNomes.get(nome));
        }
        System.out.println("-------------------------------------------------------------------");

        //-> 9) Metodo .entrySet() + .getKey e .getValue: Pega as chaves e os valores do TreeMap
        System.out.println("9) Nome e Sobrenome das pessoas:");

        for (Map.Entry<String, String> nome : sobrenomeNomes.entrySet())  {
            System.out.printf("   - O nome é %s e o sobrenome é %s!%n", nome.getKey(), nome.getValue());
        }
        System.out.println("-------------------------------------------------------------------");

        //-> 10) Metodo .remove: Remove a informação (chave e valor) do TreeMap através da chave
        System.out.println("10) Remove iformação do TreeMap:");

        sobrenomeNomes.remove("Gianluca");

        for (String nome : sobrenomeNomes.keySet()) {
            System.out.printf("   - %s %s%n", nome, sobrenomeNomes.get(nome));
        }
        System.out.println("-------------------------------------------------------------------");
    }
}
