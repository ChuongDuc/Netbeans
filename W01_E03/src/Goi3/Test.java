/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Goi3;

import java.util.Scanner;

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
        Scanner a   = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = a.nextInt();
        Product pd[]= new Product[100];
        for (int i = 0; i < n; i++) {
            System.out.println("Input "+ (i+1) + "th Product:");
            String b = a.nextLine();
            System.out.print("Enter ID: ");
            String ID  = a.nextLine();
            System.out.print("Enter Name: ");
            String name = a.nextLine();
            System.out.print("Enter Company: ");
            String company = a.nextLine();
            System.out.print("Enter Color: ");
            String color  = a.nextLine();
            System.out.print("Enter price: ");
            double price = a.nextDouble();
            Product t  = new Product(ID,  name,  company,  color,  price);
            pd[i] = t;
        }
        System.out.println("List of Product: ");
        System.out.println("ID"+"\t"+"Name"+"\t"+"Company"+"\t"+"Color"+"\t"+"Price"+"\t"+"Discout");
        for (int i = 0; i < n; i++) {
            System.out.println(pd[i].getID()+"\t"+pd[i].getName()+"\t"+pd[i].getCompany()+"\t"+pd[i].getColor()+"\t"+pd[i].getPrice()+"\t"+pd[i].discount());
        }
        System.out.println("Product which theỉ color are Red or Blue: ");
        System.out.println("ID"+"\t"+"Name"+"\t"+"Company"+"\t"+"Color"+"\t"+"Price"+"\t"+"Discount");
        for (int i = 0; i < n; i++) {
            if("RED".equals(pd[i].getColor()) || "BLUE".equals(pd[i].getColor()) )
            {
                 System.out.println(pd[i].getID()+"\t"+pd[i].getName()+"\t"+pd[i].getCompany()+"\t"+pd[i].getColor()+"\t"+pd[i].getPrice()+"\t"+pd[i].discount());
            }            
        }
        
    }
    
}
