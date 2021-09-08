/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

import java.util.Scanner;

/**
 *
 * @author Normie
 */
public class Test {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        MyCustomer mc = new MyCustomer();
        System.out.print("Enter n: ");
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            s.nextLine();
            System.out.print("Input ID: ");
            String ID = s.nextLine();
            System.out.print("Input Name: ");
            String Name = s.nextLine();
            System.out.print("Input Year: ");
            int Year = s.nextInt();
            s.nextLine();
            System.out.print("Input Address: ");
            String Address = s.nextLine();
            System.out.print("Input Gender: ");
            String Gender = s.nextLine();
            Customer ct = new Customer(Year, Address, ID, Name, Gender);

            mc.ca.add(ct);
        }
        mc.print();
        mc.printMin();

    }
}
