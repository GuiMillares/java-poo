package poo;

public class Produto{

    private String name;
    private double price;
    private int quant;


    public double getTotal(){
       return price * quant;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getQuant(){
        return quant;
    }

    public void setQuant(int quant){
        this.quant = quant;
    }

    public Produto(String name, double price, int quant){
        this.name = name;
        this.price = price;
        this.quant = quant;
    }

}