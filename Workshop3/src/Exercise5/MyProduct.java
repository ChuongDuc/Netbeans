/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise5;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class MyProduct implements IProduct {
    ArrayList<Product> plist = new ArrayList<>();
    
    @Override
    public void addProduct(Product p) {
        plist.add(p);
    }
    
    @Override 
    public void findbyName(String name) {
        System.out.println("ID" + "\t" + "Name" + "\t" + "Price" + "\t");
        for (int i = 0; i < plist.size(); i++) {
            if(plist.get(i).getName().equals(name)) {
                System.out.println(plist.get(i).getID() + "\t" + plist.get(i).getName() + "\t" + plist.get(i).getPrice() + "\t");
            }
        }
    } 
    
    @Override
    public double getMin() {
       double min = 0;
       
        for (int i = 0; i < plist.size(); i++) {
            if(plist.get(i).getPrice() <= min) {
                min = plist.get(i).getPrice();
            }
        }
       return min;
    }
    
    @Override 
    public void print() {
        System.out.println("ID" + "\t" + "Name" + "\t" + "Price" + "\t");
        for (int i = 0; i < plist.size(); i++) {
            System.out.println(plist.get(i).getID() + "\t" + plist.get(i).getName() + "\t" + plist.get(i).getPrice());
        }
    } 
    
    @Override 
    public void printMin() {
        System.out.println("The list of products with the smallest total");
        System.out.println("ID" + "\t" + "Name" + "\t" + "Price" + "\t"+ "Total" + "\t");
        for (int i = 0; i < plist.size(); i++) {
            double min = plist.get(0).total();
            if(min > plist.get(i).total()) {
                min = plist.get(i).getPrice();
                System.out.println(plist.get(i).getID() + "\t" + plist.get(i).getName() + "\t" + plist.get(i).getPrice()
            + "\t" + min);
            }
        }
    } 
}
