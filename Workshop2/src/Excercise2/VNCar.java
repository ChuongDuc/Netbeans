/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excercise2;

/**
 *
 * @author Normie
 */
public class VNCar extends  Car{
     int series;

    public VNCar(int series, String Name, double Price) {
        super(Name, Price);
        this.series = series;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public VNCar() {
    }
    
    @Override
    public String toString()
    {
        return Name + "\t" + Price + "\t" +series;
    }
    public double getSaleSeries(){
        double inc = 0;
       if (series < 300)
           inc = series *0.1;
       double price1 = Price + inc;
       return price1;
    
    }
    
}
