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
import java.util.*;
public class Test {

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) {
        // TODO code application logic here
        Book dt2 = new Book ("Tivi",123);
        System.out.println("Enter Name: "+ dt2.getName());
        System.out.println("Enter Price: "+ dt2.getPrice());
        Scanner scanner = new Scanner (System.in);
        System.out.println("1.Test getName() \n2.Test getPrice()");
        System.out.print("Enter TC (1 or 2): ");
        int TC = scanner.nextInt();
        if (TC == 1){
            System.out.println("OUTPUT: ");
            System.out.println(""+dt2.getName().charAt(0)+dt2.getName().charAt(1)+dt2.getName().charAt(2));
           // System.out.println(dt2.substring(0,3));
        }
        else
        {       
            System.out.print("Enter new price: ");
            double a  = scanner.nextDouble();
            dt2.setPrice(a);
            System.out.println("OUTPUT: ");
            System.out.println(dt2.getPrice()*0.9);
        }
    }
    
}
