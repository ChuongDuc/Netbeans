/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Goi6;

import java.util.Scanner;

/**
 *
 * @author Normie
 */
public class Test {
    static int n = 100;
    static int k;
    static Car cr[]= new Car[n];
    static Scanner s = new Scanner(System.in);
    public static void Input(){
        System.out.print("Input k: ");
        k = s.nextInt();
        for (int i = 0; i < k; i++) {
            String b= s.nextLine();
            System.out.print("Enter ID: ");
            String ID = s.nextLine();
            System.out.print("Enter Name: ");
            String Name = s.nextLine();
            System.out.print("Enter Country: ");
            String Country = s.nextLine();
            System.out.print("Enter Color: ");
            String Color = s.nextLine();
            System.out.print("Enter Price: ");
            double Price = s.nextInt();
            Car car= new Car( ID,  Name,  Country,  Color,  Price);
            cr[i]=car;
            
        }   
    }
    public static void Ouput(){
        System.out.println("ID" +"\t" +"Name"+"\t"+ "Country" + "\t" +"Color"+"\t" + "Price"+"\t" +"Discount");
        for (int i = 0; i < k; i++) {
            if("red".equals(cr[i].getColor()))
                System.out.println(cr[i].Display2());  
            else
                System.out.println(cr[i].Display1());  
        }
    }
    public static void Count(){
    int count = 0;
        for (int i = 0; i < k ; i++)
        {
            if(cr[i].getPrice()< cr[0].getPrice())
            {
                count++;
            }
        }
        System.out.println("Number of Car have price less than price of first Car: " + count);
    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Input();
        Ouput();
        Count();
    }
}
