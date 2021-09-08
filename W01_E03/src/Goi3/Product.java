/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Goi3;

/**
 *
 * @author Normie
 */
public class Product {
    String ID,name,company,color;
    double price;

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

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price * 0.2;
    }

    public Product(String ID, String name, String company, String color, double price) {
        this.ID = ID;
        this.name = name;
        this.company = company;
        this.color = color;
        this.price = price;
    }

    public Product() {
    }
    public double discount(){
        return price* 0.2;
    }
}
