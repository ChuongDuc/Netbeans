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
public abstract class Product {
    String ID,name,color;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Product(String ID, String name, String color) {
        this.ID = ID;
        this.name = name;
        this.color = color;
    }

    public Product() {
    }
    public abstract double Discount();
    
}
