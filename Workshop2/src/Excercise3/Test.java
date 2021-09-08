/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excercise3;

import java.util.Scanner;

/**
 *
 * @author Normie
 */
public class Test {
    static int n = 100;
    static  int k;
    static Scanner s = new Scanner(System.in);
    static Candidate ls[] = new Candidate[n];
    static String classID;
    static double mark;
    static String name;
    static  String ID;
    static String gender;
    public static void Input(){
        System.out.print("Enter ClassID: ");
        classID= s.nextLine();
        System.out.print("Enter Mark: ");
        mark= s.nextDouble();
        System.out.print("Enter Name: ");
        String a = s.nextLine();
        name= s.nextLine();
        System.out.print("Enter ID: ");
        ID= s.nextLine();
        System.out.print("Enter Gender: ");
        gender= s.nextLine();
    }
    public static void Output(){
        System.out.println("ClassID"+"\t"+"Mark"+"\t"+"Name"+"\t"+"ID"+"\t"+"Gender"+"\t"+"Result");
        for (int i = 0; i < k; i++) {
            System.out.println(ls[i].getClassID()+"\t"+ls[i].getMark()+"\t"+ls[i].getName()+"\t"+ls[i].getID()+"\t"+ls[i].getGender());
        }
    }
    public  static void Search(String Name){
        for (int i = 0; i < k; i++) {
            if(ls[i].getName().equals(Name))
                System.out.println(ls[i].getClassID()+"\t"+ls[i].getMark()+"\t"+ls[i].getName()+"\t"+ls[i].getID()+"\t"+ls[i].getGender()+"\t"+ls[i].Result());
        }
    }
    
    public static void main(String[] args) {
        System.out.print("Enter k: ");
        k = s.nextInt();
        String b= s.nextLine();
        for (int i = 0; i < k; i++) {
               Input();
               System.out.println("-----------------");
               Candidate t =new Candidate(classID, mark, name, ID,  gender);
               ls[i]=t;
        }
        Output();
        System.out.print("Enter search Name: ");
        String Name = s.nextLine();
        System.out.println("ClassID"+"\t"+"Mark"+"\t"+"Name"+"\t"+"ID"+"\t"+"Gender"+"\t"+"Result");
        Search(Name);
    }
}
