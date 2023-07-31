package cash;

public class CurrencyConverter{

    private double dolar;
    private double real;
    private double iof;

    public double getDolar(){
        return dolar;
    }
    public void setDolar(double dolar){
        this.dolar = dolar;
    }
    public double getReal(){
        return real;
    }
    public void setReal(double real){
        this.real = real;
    }
    public double getIof(){
        return iof;
    }
    public void setIof(double iof){
        this.iof = iof;
    }
    public void setIof(){
        this.iof = 0.06;
    }
    public double result(){
        double valorConvertido = real * dolar;
        return valorConvertido + (valorConvertido * iof); // Adiciona o IOF ao valor convertido
    }
}