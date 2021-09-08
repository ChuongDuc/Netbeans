/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excercise6;

/**
 *
 * @author Normie
 */
public class Car extends Product {
    int year;
    double price;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Car(int year, double price, String ID, String name, String color) {
        super(ID, name, color);
        this.year = year;
        this.price = price;
    }

    public Car() {
    }

    @Override
    public double Discount(){
    if(year < 2007) 
        return price*0.1;
    return price;
    }
    
    
}
