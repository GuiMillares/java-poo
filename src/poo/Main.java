package poo;

public class Main {
    public static void main(String[] args){
      
        //Criando o array para armazenar os dados das 5 pessoas
        Pessoa[] pessoas = new Pessoa[5];
    
        // Definindo os dados para cada pessoa  
    
        pessoas[0] = new Pessoa("Gui Spykes", 19, "Jabaquara");
        pessoas[1] = new Pessoa("Mizael", 23, "Diadema");
        pessoas[2] = new Pessoa("Victor Braia", 22, "Diadema");
        pessoas[3] = new Pessoa("Lucas", 20, "Diadema");
        pessoas[4] = new Pessoa("Natan", 21, "Diadema");
        
        // Exemplo de acesso aos dados da primeira pessoa
        System.out.println("Nome: " + pessoas[0].getName());
        System.out.println("Idade: " + pessoas[0].getAge());
        System.out.println("Cidade: " + pessoas[0].getCity());

        System.out.println("\nNome: " + pessoas[1].getName());
        System.out.println("Idade: " + pessoas[1].getAge());
        System.out.println("Cidade: " + pessoas[1].getCity());

        System.out.println("\nNome: " + pessoas[2].getName());
        System.out.println("Idade: " + pessoas[2].getAge());
        System.out.println("Cidade: " + pessoas[2].getCity());

        System.out.println("\nNome: " + pessoas[3].getName());
        System.out.println("Idade: " + pessoas[3].getAge());
        System.out.println("Cidade: " + pessoas[3].getCity());
        
        System.out.println("\nNome: " + pessoas[4].getName());
        System.out.println("Idade: " + pessoas[4].getAge());
        System.out.println("Cidade: " + pessoas[4].getCity());
    
    }
}
