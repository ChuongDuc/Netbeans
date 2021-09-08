/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excercise1;

import java.util.Scanner;

/**
 *
 * @author Normie
 */
public class Test {
    static int n  = 100;    
    static int k ;
    static Scanner a = new Scanner(System.in);
    static ColorFan ls[] = new ColorFan[n];
    static String code;
    static double price;
    static int series;
    public static void Input(){
        
            String b  = a.nextLine();
            System.out.print("Enter Code: ");
            code = a.nextLine();
            System.out.print("Enter Price: ");
            price = a.nextDouble();
            System.out.print("Enter series: ");
            series = a.nextInt();
     
    }
    public static void Output(){
        System.out.println("Code"+"\t"+"Price"+"\t"+"Series");
        for (int i = 0; i < k; i++) {
            System.out.println(ls[i].toString());
        }
    }
    public static void Search(String s){
        for (int i = 0; i < k; i++) {
            if(ls[i].getCode().equals(s))
                System.out.println(ls[i].toString());
            
        }
    
    }
   
      public static void main(String[] args) {
      System.out.print("Input k: ");
      k = a.nextInt();
      for (int i = 0; i < k; i++) {
            Input();
            System.out.println("---------------------");
            ColorFan  t = new ColorFan (series,  code,  price);
            ls[i] = t;
        }
        Output();
        System.out.print("Enter search Code: ");
        String t = a.nextLine();
        String s = a.nextLine();
        System.out.println("Code"+"\t"+"Price"+"\t"+"Series");
        Search(s);
      }
}
