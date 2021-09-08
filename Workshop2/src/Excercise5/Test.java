/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excercise5;

import java.util.Scanner;

/**
 *
 * @author Normie
 */
public class Test {
    static int n =100;
    static int k;
    static Scanner s = new Scanner (System.in);
    static Teacher ls[] = new Teacher[n];
    static String ID;
    static String name;
    static String gender;
    static String address;
    static double grading;
    public static void Input(){
        System.out.print("Enter ID: ");
        ID = s.nextLine();
        System.out.print("Enter Name: ");
        name = s.nextLine();
        System.out.print("Enter Gender: ");
        gender = s.nextLine();
        System.out.print("Enter Address: ");
        address = s.nextLine();
        System.out.print("Enter Grading: ");
        grading = s.nextDouble();
    
    }
    public static void Output(){
        System.out.println("ID"+"\t"+"Name"+"\t"+"Gender"+"\t"+"Address"+"\t"+"Grading"+"\t"+"Salary");
        for (int i = 0; i < k; i++) {
            System.out.println(ls[i].getID()+"\t"+ls[i].getName()+"\t"+ls[i].getGender()+"\t"+ls[i].getAddress()+"\t"+ls[i].getGrading()+"\t"+ls[i].Salary());
            
        }
    }
    public static void Search(String address) {
        for (int i = 0; i < k; i++) {
            if(ls[i].getAddress().equals(address))
                System.out.println(ls[i].getID()+"\t"+ls[i].getName()+"\t"+ls[i].getGender()+"\t"+ls[i].getAddress()+"\t"+ls[i].getGrading()+"\t"+ls[i].Salary());
            
        }
        
    }
    
    public static void main(String[] args) {
        System.out.print("Enter k: ");
        k =s.nextInt();
        String b = s.nextLine();
        for (int i = 0; i < k; i++) {
            
            Input();
            System.out.println("-----------------");
               Teacher t =new Teacher(address,  grading,  name, ID,  gender);
               ls[i]=t;
        }
        Output();
        System.out.print("Enter search Address: ");
        String a = s.nextLine();
        String Address = s.nextLine();
        System.out.println("ID"+"\t"+"Name"+"\t"+"Gender"+"\t"+"Address"+"\t"+"Grading"+"\t"+"Salary");
        Search(Address);
    }
}
