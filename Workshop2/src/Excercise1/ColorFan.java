/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excercise1;

/**
 *
 * @author Normie
 */
public class ColorFan extends Fan{
    int series;

    public ColorFan(int series, String code, double price) {
        super(code, price);
        this.series = series;
    }

    public ColorFan() {
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }
    
    @Override
    public double getPrice() {
        if(series < 300)
           return price* 1.1 ;
        return price;
    }
        
     @Override
    public String toString(){
        return   code +"\t" + getPrice() +"\t"+ series;
    }
}
