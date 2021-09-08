/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise2;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyString mst = new MyString();
        
        System.out.println("1. Test f1()");
        System.out.println("2. Test f2()");
        System.out.print("Enter TC (1 or 2): ");
        int tc = sc.nextInt();
        System.out.println("Enter a string: ");
        sc.nextLine();
        String str = sc.nextLine();
        
        if(tc == 1) {
            System.out.println("OUTPUT: ");
            System.out.println("Enter a string 1");
            String s1 = sc.nextLine();
            System.out.println("Enter a string 2");
            String s2 = sc.nextLine();
            System.out.println(mst.f1(str, s1, s2));
        } else {
            System.out.println("OUTPUT: ");
            System.out.println("Enter a string 1");
            String s1 = sc.nextLine();
            System.out.println(mst.f2(str, s1));
        }
        
    }
}
