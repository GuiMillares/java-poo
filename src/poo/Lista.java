package poo;

import java.text.DecimalFormat;

public class Lista {
    public static void main(String[] args){

        // Criando o array para os produtos

        Produto[] produtos = new Produto[5];

        // Criando a formatação do preço
        DecimalFormat df = new DecimalFormat("#,##0.00");
        df.setMinimumFractionDigits(2);


        produtos[0] = new Produto("Fones de ouvido Bluetooth", 150.00, 20);
        produtos[1] = new Produto("Camiseta estampada", 35.00, 50);
        produtos[2] = new Produto("Mochila resistente à água", 80.00, 10);
        produtos[3] = new Produto("Notebook ultrafino", 1500.00, 9);
        produtos[4] = new Produto("Smartphone Android", 900.00, 6);

        // Utilizando o for para mostrar o total de cada produto do array

        for(int i = 0; i < produtos.length; i++){
            System.out.println("\nProduto: " + produtos[i].getName());
            System.out.printf("Preço: R$" + df.format(produtos[i].getPrice()));
            System.out.println("\nQuantidade: " + produtos[i].getQuant());

            double totalProduto = produtos[i].getTotal();
            System.out.println("Total: R$" + df.format(totalProduto));
        }
        
    }
}
