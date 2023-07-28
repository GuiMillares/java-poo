package bank;

import java.util.Scanner;
import java.util.Random;

public class CashMachine {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        double balance = rand.nextDouble() * 10000; //Criar um saldo aleatório entre 0 q 10.000
        System.out.printf("Seu saldo e: R$%.2f\n", balance);

        System.out.print("Digite D para deposito e S para saque: ");
        String opcao = sc.next();

        if(opcao.equalsIgnoreCase("D")){
            System.out.print("Digite o valor do depósito: ");
            double depositValue = sc.nextDouble();

            ContaBancaria account = new ContaBancaria(balance);
            account.deposit(depositValue);
            balance = account.getBalance();

            System.out.printf("Seu novo saldo e: R$%.2f\n", balance);
        }else if(opcao.equalsIgnoreCase("S")){
            System.out.print("Digite o valor do saque: ");
            double withdrawValue = sc.nextDouble();

            ContaBancaria account = new ContaBancaria(balance);
            if(account.withdraw(withdrawValue)){
                balance = account.getBalance();
                System.out.printf("Seu novo saldo e: R$%.2f\n", balance);
            }else{
                System.out.println("Saldo insuficiente para realizar o saque.");
            }
        } else{
            System.out.println("Opcao invalida. Digite D para deposito ou S para saque. ");
        }
        sc.close();
    }
}
