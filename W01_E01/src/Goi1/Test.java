/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Goi1;

import java.util.*;

/**
 *
 * @author Normie
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Fan dt1 =new Fan("ab01",300);
        System.out.println("Enter Fan Code: "+ dt1.getCode());
        System.out.println("Enter Fan Price: "+ dt1.getPrice());
        Scanner scanner = new Scanner (System.in);
        System.out.println("1.TC = 1 - test getCode() \n2.TC = 2 - test setPrice()");
        System.out.print("Enter TC: ");
        int TC = scanner.nextInt();
        
        if (TC == 1){
            System.out.println("OUTPUT: ");
            System.out.println(dt1.getCode());
        }
        else{
             System.out.print("Enter new fan price: ");
            double a  = scanner.nextDouble();
            dt1.setPrice(a);
            System.out.println("OUTPUT: ");
            System.out.println(dt1.getPrice());
        }
        
    }
    
}
