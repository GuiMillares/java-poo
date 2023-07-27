package bank;

public class ContaBancaria {

    private double balance;

    public ContaBancaria(double balance) {
        this.balance = balance;
    }

    public void deposit(double value) {
        if (value > 0) {
            balance += value;
            System.out.println("Depósito realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public boolean withdraw(double value) {
        if (value > 0 && value <= balance) {
            balance -= value;
            System.out.println("Saque realizado com sucesso.");
            return true;
        } else {
            System.out.println("Saldo insuficiente para realizar o saque ou valor inválido para saque.");
            return false;
        }
    }

    public double getBalance() {
        return balance;
    }
}
