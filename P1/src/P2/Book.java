/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P2;

/**
 *
 * @author Normie
 */
public class Book {
    String ID,Name,Publisher;
    int Year;
    double Price;

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

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String Publisher) {
        this.Publisher = Publisher;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

//    public Book(String ID, String Name, String Publisher, int Year, double Price) {
//        this.ID = ID;
//        this.Name = Name;
//        this.Publisher = Publisher;
//        this.Year = Year;
//        this.Price = Price;
//    }

    public Book() {
    }
    public double Discount(){
        if( Year < 2015 )
            return Price* 0.5;
        return Price;
    }
    public String toString(){
        return ID + "\t" + Name+ "\t" + Publisher + "\t" + Year + "\t" + Price + "\t" + Discount() ; 
    }
}
