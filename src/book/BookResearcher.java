package book;

import java.util.Scanner;

public class BookResearcher {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o ano do livro desejado: ");
        int ano = sc.nextInt();

        Book[] researcher = new Book[10];

        researcher[0] = new Book("Vidas Secas", 1938, "Graciliano Ramos");
        researcher[1] = new Book("O Senhor dos Aneis: A Sociedade do Anel", 1954, "J.R.R. Tolkien");
        researcher[2] = new Book("A Menina que Roubava Livros", 2005, "Markus Zusak");
        researcher[3] = new Book("O Sol e para todos", 1960, "Harper Lee");
        researcher[4] = new Book("O Pequeno Livro da Calma", 1960, "Paul Wilson");
        researcher[5] = new Book("Memorias Postumas de Bras Cubas", 1881, "Machado de Assis");
        researcher[6] = new Book("O Senhor dos Aneis: As Duas Torres", 1954, "J.R.R. Tolkien");
        researcher[7] = new Book("O Pequeno Principe", 1938, "Antoine de Saint-Exupery");
        researcher[8] = new Book("Marley & Eu: A Vida e o Amor ao Lado do Pior Cao do Mundo", 2005, "John Grogan");
        researcher[9] = new Book("O Primo Basilio", 1881, "Jose Maria de Eça de Queiros");
        
        System.out.println("Livros do ano " + ano + ":");

        boolean foundBook = false;

        for( Book livro : researcher){
            if(livro.getYear() == ano){
                System.out.println("\n- Titulo: " + livro.getTitle());
                System.out.println(" Autor: " + livro.getAuthor());
                foundBook = true;
            }
        }
        if (!foundBook){
            System.out.println("Nenhum livro encontrado para o ano " + ano);
        }
        sc.close();
    }
}
