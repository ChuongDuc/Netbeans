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
public class Fan {
    String code;
    double price;

    public String getCode() {
        return code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Fan() {
    }

    public Fan(String code, double price) {
        this.code = code;
        this.price = price;
    }
    @Override
    public String toString(){
        return code +"\t" + price;
    }
}
