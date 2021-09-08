/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

/**
 *
 * @author Normie
 */
public class Book {
    String ID, Name,Publisher,Genre;
    Double Price;

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

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String Genre) {
        this.Genre = Genre;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double Price) {
        this.Price = Price;
    }

    public Book(String ID, String Name, String Publisher, String Genre, Double Price) {
        this.ID = ID;
        this.Name = Name;
        this.Publisher = Publisher;
        this.Genre = Genre;
        this.Price = Price;
    }

    public Book() {
    }
    public double Discount(){
        if("Kim Dong".equals(Publisher))
           return Price *0.3;
        return Price;
    }
    public String toString()
    {
        return ID + "\t" + Name + "\t" + Publisher + "\t" + Genre + "\t" + Price + "\t" + Discount();
    }
}
