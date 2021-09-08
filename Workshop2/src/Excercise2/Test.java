/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excercise2;

import java.util.Scanner;

/**
 *
 * @author Normie
 */
public class Test {
    public static void main(String[] args) {
          Scanner a = new Scanner(System.in);
        System.out.println("Nhap n: ");
       int n = a.nextInt();
        VNCar vc[] = new VNCar[100];
        for (int i = 0 ; i <n; i ++)
        {
            String b = a.nextLine();
            System.out.print("Enter name car: ");
            String Name = a.nextLine();
            System.out.print("Enter price car: ");
            double Price = a.nextDouble();
            System.out.print("Enter series car: ");
            int Series = a.nextInt();
            VNCar s = new VNCar( Series , Name, Price);
            vc[i] = s;
        }
        System.out.println("Name"+"\t"+"Price"+"\t"+"Series");
         for (int i = 0; i < n ; i++)
       {
            System.out.println(vc[i].Name+"\t"+vc[i].getPrice()+"\t"+vc[i].getSeries());       
    }
    }
}
