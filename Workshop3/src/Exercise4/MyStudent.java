/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise4;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class MyStudent implements IStudent {
    
    ArrayList<Student> plist = new ArrayList<>();
    
    @Override
    public void addStudent(Student s){
        plist.add(s);
    };  
    
    @Override
    public void findbyID(String s){
        System.out.println("The list of students by ID: ");
        for (int i = 0; i < plist.size(); i++) {
            if(plist.get(i).getID().equals(s)) {
                System.out.println("ID"  + "\t" + plist.get(i).getID() + "\t" + "Name" + "\t" + plist.get(i).getName() + "\t" + "Mark" 
            + "\t" + plist.get(i).getMark() + "\t" + "Result " + "\t" + plist.get(i).Result());
            }
        }
    };
    
    @Override
    public double getMax(){
        double m = 0;
        for (int i = 0; i < plist.size(); i++) {
            if(plist.get(i).getMark() > m) {
                m = plist.get(i).getMark();
            }
        }
        return m;
    };
    
    @Override
    public void print() {
        System.out.println("The list of students: ");
        for (int i = 0; i < plist.size(); i++) {
            System.out.println("ID"  + "\t" + plist.get(i).getID() + "\t" + "Name" + "\t" + plist.get(i).getName() + "\t" + "Mark" 
            + "\t" + plist.get(i).getMark() + "\t" + "Result " + "\t" + plist.get(i).Result());
        }
    };
    
    @Override
    public void printMax(){
        System.out.println("The list of Students by MAX");
        System.out.println("ID\tName\tMark\tResult");
        for (int i = 0; i < plist.size(); i++) {
            if (plist.get(i).getMark() == getMax()) {
                System.out.println(plist.get(i).getID() + "\t" + plist.get(i).getName() + "\t" + plist.get(i).getMark() + "\t" + plist.get(i).Result());
            }
        }
    };
}
