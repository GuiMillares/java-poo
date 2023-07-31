package cash;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        CurrencyConverter conversor = new CurrencyConverter(); 

        Scanner sc = new Scanner(System.in);

        System.out.printf("What is the dollar price? U$");
        double dolar = sc.nextDouble();
        System.out.printf("How many dolars will be bought? R$");
        double quantidadeDolar = sc.nextDouble();

        conversor.setDolar(dolar);
        conversor.setReal(quantidadeDolar);

        // Antes de chamar o método result(), você precisa definir o IOF, caso contrário, o valor será 0.
        conversor.setIof(0.06);

        double resultado = conversor.result();
        System.out.printf("Amount to be paid in reais: R$%.2f", resultado);

        sc.close();
    }
}
