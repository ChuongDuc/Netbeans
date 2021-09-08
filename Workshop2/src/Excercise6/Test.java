/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excercise6;

import java.util.Scanner;

/**
 *
 * @author Normie
 */
public class Test {
    static int n = 100;
    static int k;
    static Scanner s = new Scanner(System.in);
    static Car ls[]= new Car[n];
    static String ID;
    static String name;
    static String color;
    static int year;
    static double price;
    public static void  Input(){
        System.out.print("Enter ID: ");
        ID = s.nextLine();
        System.out.print("Enter Name: ");
        name = s.nextLine();
        System.out.print("Enter Color: ");
        color = s.nextLine();
        System.out.print("Enter Year: ");
        year = s.nextInt();
        System.out.print("Enter Price: ");
        price = s.nextDouble();
    
    }
    public static void Output(){
        System.out.println("ID"+"\t"+"Name"+"\t"+"Color"+"\t"+"Year"+"\t"+"Price"+"\t"+"Discount");
        for (int i = 0; i < k; i++) {
            System.out.println(ls[i].getID()+"\t"+ls[i].getName()+"\t"+ls[i].getColor()+"\t"+ls[i].getYear()+"\t"+ls[i].getPrice()+"\t"+ls[i].Discount());
            
        }
    }
    public static void Search(String color){
        for (int i = 0; i < k; i++) {
            if(ls[i].getColor().equals(color))
                System.out.println(ls[i].getID()+"\t"+ls[i].getName()+"\t"+ls[i].getColor()+"\t"+ls[i].getYear()+"\t"+ls[i].getPrice()+"\t"+ls[i].Discount());  
        }
    
    }
    public static void main(String[] args) {
        System.out.print("Enter k: ");
        k = s.nextInt();
        for (int i = 0; i < k; i++) {
            String b = s.nextLine();
            Input();
            System.out.println("--------------------------");
            Car t = new Car( year,  price, ID, name, color);
            ls[i] = t;
            
        }
        Output();
        System.out.print("Enter search Color: ");
        String a = s.nextLine();
        String Color = s.nextLine();
        System.out.println("ID"+"\t"+"Name"+"\t"+"Color"+"\t"+"Year"+"\t"+"Price"+"\t"+"Discount");
        Search(Color);
    }
}
