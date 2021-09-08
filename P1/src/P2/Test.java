/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P2;

import java.util.Scanner;

/**
 *
 * @author Normie
 */
public class Test {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = s.nextInt();
        Book b[] = new Book[n];

        for (int i = 0; i < n; i++) {
            s.nextLine();
            System.out.print("Enter ID: ");
            String ID = s.nextLine();
            System.out.print("Enter Name: ");
            String Name = s.nextLine();
            System.out.print("Enter Publisher: ");
            String Publisher = s.nextLine();
            System.out.print("Enter Year: ");
            int Year = s.nextInt();
            System.out.print("Enter Price: ");
            double Price = s.nextDouble();
            Book t = new Book();
            t.setID(ID);
            t.setName(Name);
            t.setPrice(Price);
            t.setPublisher(Publisher);
            t.setYear(Year);
            b[i] = t;
        }
        System.out.println("Display list of Books: ");
        System.out.println("ID" + "\t" + "Name" + "\t" + "Publisher" + "\t" + "Year" + "\t" + "Price" + "\t" + "Discount");
        for (int i = 0; i < n; i++) {
            System.out.println(b[i].toString());
        }
        System.out.println("Display list of Books which their Year are greater than 2010: ");
        System.out.println("ID" + "\t" + "Name" + "\t" + "Publisher" + "\t" + "Year" + "\t" + "Price" + "\t" + "Discount");
        for (int i = 0; i < n; i++) {
            if (b[i].getYear() > 2010) {
                System.out.println(b[i].toString());
            }
        }
        System.out.println("Display list of Books which have largest price: ");
        System.out.println("ID" + "\t" + "Name" + "\t" + "Publisher" + "\t" + "Year" + "\t" + "Price" + "\t" + "Discount");
        double max = 0;
        for (int i = 0; i < n; i++) {
            if (b[i].getYear() > max) {
                max = b[i].getPrice();
            }
        }
        for (int i = 0; i < n; i++) {
            if (b[i].getYear() == max) {
                System.out.println(b[i].toString());;
            }
        }
        System.out.println("Sort all Books in the list ascendingly by Price:");
        System.out.println("ID" + "\t" + "Name" + "\t" + "Publisher" + "\t" + "Year" + "\t" + "Price" + "\t" + "Discount");
        Book bk = new Book();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (b[i].getPrice() > b[j].getPrice()) {
                    bk = b[j];
                    b[j] = b[i];
                    b[i] = bk;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(b[i].toString());
        }
    }
}
