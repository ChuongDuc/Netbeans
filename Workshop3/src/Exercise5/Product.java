/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise5;

/**
 *
 * @author Dell
 */
public class Product {
    String ID, Name;
    double Amount, Price;

    public Product(String ID, String Name, double Amount, double Price) {
        this.ID = ID;
        this.Name = Name;
        this.Amount = Amount;
        this.Price = Price;
    }

    public Product() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double Amount) {
        this.Amount = Amount;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }
    
    public double total() {
        return Price * Amount;
    }
}
