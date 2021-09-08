/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Add how many product: ");
        int n = sc.nextInt();
        MyProduct pd = new MyProduct();
        
        for (int i = 0; i < n; i++) {
            System.out.print("Input ID: ");
            sc.nextLine();
            String id = sc.nextLine();
            
            System.out.print("Input Name: ");
            String name = sc.nextLine();
            
            System.out.print("Input Amount: ");
            double amount = sc.nextDouble();
            
            System.out.print("Input Price: ");
            double price = sc.nextDouble();
            
            Product mp = new Product(id,name,amount,price);
            pd.addProduct(mp);
        }
        
        System.out.println("The list of products: ");
        pd.print();
        pd.printMin();
        System.out.print("Enter a name to search: ");
        sc.nextLine();
        String searchTerm = sc.nextLine();
        pd.findbyName(searchTerm);
    }
}
