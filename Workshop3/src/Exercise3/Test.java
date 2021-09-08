/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Add how many fans: ");
        int n = sc.nextInt();
        List<Fan> lt = new ArrayList<Fan>();
        MyFan mf = new MyFan();
        for (int i = 0; i < n; i++) {
            System.out.print("Fan code: ");
            sc.nextLine();
            String code = sc.nextLine();
            System.out.print("Fan price: ");
            double price = sc.nextDouble();

            Fan f = new Fan(code, price);
            lt.add(f);
        }
        System.out.print("Enter TC(1-f1; 2-f2; 3-f3): ");
        int tc = sc.nextInt();
        if(tc == 1) {
            System.out.println("The list befor running f1: ");
            for (int i = 0; i < lt.size(); i++) {
                System.out.println(lt.get(i).getCode() + "\t" + lt.get(i).getPrice());
            }
            System.out.print("Enter given Fan code: ");
            sc.nextLine();
            String xCode = sc.nextLine();
            System.out.println("OUTPUT: ");
            mf.f1(lt,xCode);
            
        } else if(tc == 2) {
            System.out.println("The list befor running f2:");
            for (int i = 0; i < lt.size(); i++) {
                System.out.println(lt.get(i).getCode() + "\t" + lt.get(i).getPrice());
            }
            System.out.print("Enter given Fan price: ");
            sc.nextLine();
            double xPrice = sc.nextDouble();
            System.out.println("OUTPUT: ");
            mf.f2(lt, xPrice);
        } else {
            System.out.println("The list befor running f3:");
            for (int i = 0; i < lt.size(); i++) {
                System.out.println(lt.get(i).getCode() + "\t" + lt.get(i).getPrice());
            }
            System.out.println("OUTPUT: ");
            mf.f3(lt);
        }
    }
}
