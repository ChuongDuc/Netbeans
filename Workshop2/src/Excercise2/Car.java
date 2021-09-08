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
public class Car {
    String Name;
    double Price;

//    public String getName() {
//        return Name;
//    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public Car() {
    }

    public Car(String Name, double Price) {
        this.Name = Name;
        this.Price = Price;
    }
    
    @Override
    public String toString()
    {
        return Name+"\t"+Price;
    }
}
