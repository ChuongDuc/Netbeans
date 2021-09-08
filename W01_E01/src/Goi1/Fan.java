/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Goi1;

/**
 *
 * @author Normie
 */
// 3.1 declare a class
public class Fan {
    
    //3.2 declare properties
    String code;
    double price;

    public String getCode() {
        return code.toUpperCase();
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    //3.3 declare Contructors 

    public Fan(String code, double price) {
        this.code = code;
        this.price = price;
    }

    public Fan() {
    }
    
    //3.4 declare Methods
    
    
    
    
    
}
