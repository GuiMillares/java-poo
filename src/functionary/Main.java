package functionary;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.next();

        System.out.printf("Gross Salary: R$");
        double grossSalary = sc.nextDouble();

        System.out.printf("Tax: R$");
        double tax = sc.nextDouble();

        Functionary employee = new Functionary(name, grossSalary, tax);

        System.out.println(employee);

        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println("Update data: " + employee);
    }
}
