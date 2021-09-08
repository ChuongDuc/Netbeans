/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import java.util.*;

/**
 *
 * @author Normie
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = s.nextInt();
        Book bk[] = new Book[n];
        for (int i = 0; i < n; i++) {
            s.nextLine();
            System.out.print("Input ID: ");
            String ID = s.nextLine();
            System.out.print("Input Name: ");
            String Name = s.nextLine();
            System.out.print("Input Publisher: ");
            String Publisher = s.nextLine();
            System.out.print("Input Genre: ");
            String Genre = s.nextLine();
            System.out.print("Input Price: ");
            double Price = s.nextDouble();
            Book t = new Book(ID, Name, Publisher, Genre, Price);
            bk[i] = t;

        }
        System.out.println("Display list of Books: ");
        System.out.println("ID" + "\t" + "Name" + "\t" + "Publisher" + "\t" + "Genre" + "\t" + "Price" + "\t" + "Discount");
        for (int i = 0; i < n; i++) {
            System.out.println(bk[i].toString());

        }
        System.out.println("Display list of Books which their Genre are Tieu thuyet: ");
        System.out.println("ID" + "\t" + "Name" + "\t" + "Publisher" + "\t" + "Genre" + "\t" + "Price" + "\t" + "Discount");
        for (int i = 0; i < n; i++) {
            if ("Tieu thuyet".equals(bk[i].getGenre())) {
                System.out.println(bk[i].toString());
            }
        }
        System.out.println("Display list of Books which have smallest price: ");
        System.out.println("ID" + "\t" + "Name" + "\t" + "Publisher" + "\t" + "Genre" + "\t" + "Price" + "\t" + "Discount");
        double min = bk[0].getPrice();
        for (int i = 0; i < n; i++) {
            if (bk[i].getPrice() < min) {
                min = bk[i].getPrice();
            }
        }
        for (int i = 0; i < n; i++) {
            if (bk[i].getPrice() == min) {
                System.out.println(bk[i].toString());
            }
        }
        System.out.println("Sort all Books in the list ascendingly by Price:");
        System.out.println("ID" + "\t" + "Name" + "\t" + "Publisher" + "\t" + "Genre" + "\t" + "Price" + "\t" + "Discount");
        Book temp = new Book();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (bk[i].getPrice() > bk[j].getPrice()) {
                    temp = bk[j];
                    bk[j] = bk[i];
                    bk[i] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(bk[i].toString());
        }
    }

}
