package functionary;

public class Functionary {
    
    private String name;
    private double grossSalary;
    private double tax;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getGrossSalary(){
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary){
        this.grossSalary = grossSalary;
    }

    public double gettax(){
        return tax;
    }

    public void settax(double tax){
        this.tax = tax;
    }

    public Functionary(String name, double grossSalary, double tax){
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }

    public double netSalary(){
        return grossSalary - tax;
    } 
    
    public void increaseSalary(double percentage){
        double increaseAmount = (grossSalary * percentage) / 100;
        grossSalary += increaseAmount;
    }

    public String toString() {
        return "Functionary: " + name + ", R$ " + String.format("%.2f", netSalary());
    }

}
