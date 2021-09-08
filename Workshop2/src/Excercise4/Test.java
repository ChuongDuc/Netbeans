/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excercise4;

import java.util.Scanner;

/**
 *
 * @author Normie
 */
public class Test {

    static final int n =100;
    static int k;
    static Student ls[] = new Student[n];
    static Scanner s= new Scanner(System.in);
    public static void Input()
    {
        System.out.print("Input k: ");
        k = s.nextInt();
        
        for (int i = 0; i < k; i++) 
        {
           String fake = s.nextLine();
           System.out.print("Enter ClassID: ");
           String ClassID = s.nextLine();
           System.out.print("Enter Mark: ");
           double Mark = s.nextDouble();
           String fake1 = s.nextLine();
           System.out.print("Enter ID: ");
           String ID = s.nextLine();
           System.out.print("Enter Name: ");
           String Name = s.nextLine();
           System.out.print("Enter Gender: ");
           String Gender = s.nextLine();
           
           Student std = new Student(ClassID, Mark, ID, Name, Gender);
           ls[i] = std;
        }
    }
    
    public static void Output()
    {
        System.out.println("ClassID" + "\t" + "Mark" + "\t" + "ID" + "\t" + "Name" + "\t" + "Gender" + "\t" + "Result");
        
        for (int i = 0; i < k; i++) {
            System.out.println(ls[i].Display() ); 
        } 
    }
     public static void Search(String ClassID)
     {
        
        System.out.println("ClassID" + "\t" +  "Mark" + "\t" + "ID" + "\t" + "Name" + "\t" + "Gender");
        for (int i = 0; i < k; i++) {
            if(ls[i].getClassID().equals(ClassID) )
            {
              System.out.println(ls[i].Display());   
            }
            
        }
         
     }
    

    public static void main(String[] args) {
       // goi phuong thuc input : Input();
       Input();
       Output();
       s.nextLine();
       System.out.print("Enter ClassID: ");
        String ClassID = s.nextLine();
       Search(ClassID);
}
}
