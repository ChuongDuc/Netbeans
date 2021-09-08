/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

/**
 *
 * @author Normie
 */
public class Customer extends Person {
    int Year;
    String Address;

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public Customer(int Year, String Address, String ID, String Name, String Gender) {
        super(ID, Name, Gender);
        this.Year = Year;
        this.Address = Address;
    }

    public Customer() {
    }

    @Override
    public int Age(){
     return 2021- Year;
    }
    
    @Override
    public  String Display(){
        return ID + "\t" + Name + "\t" + Gender+ "\t" + Year+ "\t" + Address+ "\t" + Age();
    }
    
}
