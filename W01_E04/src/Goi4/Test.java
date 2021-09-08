/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Goi4;

import java.util.Scanner;

/**
 *
 * @author Normie
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner a = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = a.nextInt();
        Pupil pp[]= new Pupil[n];
        for (int i = 0; i < n; i++) {
             System.out.println("Input "+ (i+1) + "th Pupil:");
             String s = a.nextLine();
             System.out.print("Enter ID: ");
             String ID = a.nextLine();
             System.out.print("Enter Name: ");
             String name = a.nextLine();
             System.out.print("Enter ClassID: ");
             String classID = a.nextLine();
             System.out.print("Enter Literature: ");
             double literature = a.nextDouble();
             System.out.print("Enter Math: ");
             double math = a.nextDouble();
             Pupil t = new Pupil( ID, name, classID,  literature,  math);
             pp[i]= t;
        }
        System.out.println("List of Pupil: ");
        System.out.println("ID"+"\t"+"Name"+"\t"+"ClassID"+"\t"+"Literature"+"\t"+"Math"+"\t"+"Result");
        for (int i = 0; i < n; i++) {
            System.out.println(pp[i].getID()+"\t"+pp[i].getName()+"\t"+pp[i].getClassID()+"\t"+pp[i].getLiterature()+"\t"+pp[i].getMath()+"\t"+pp[i].Result()); 
        }
        System.out.println("ID"+"\t"+"Name"+"\t"+"ClassID"+"\t"+"Literature"+"\t"+"Math"+"\t"+"Result");
        double max = pp[0].Result();
        for (int i = 0; i < n; i++) {
            if(pp[i].Result() > max)
            {
                max = pp[i].Result();
            }
        }
        for (int i = 0; i < n; i++) {
            if(pp[i].Result() == max)
            {
                 System.out.println(pp[i].getID()+"\t"+pp[i].getName()+"\t"+pp[i].getClassID()+"\t"+pp[i].getLiterature()+"\t"+pp[i].getMath()+"\t"+pp[i].Result());
            }
        }
    }
    
}
