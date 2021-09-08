/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student_Console;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Normie
 */
public class Test {
    static Process_Student ps = new  Process_Student();
    static Scanner s = new Scanner(System.in);
    public static void displayStudent(String ClassID) {
        System.out.println("ID\tName\tGender\tClassID\tMark\tRank");
        ArrayList<Student> lst = ps.getStudent_byClass(ClassID);
        String Gender;
        for (int i = 0; i < lst.size(); i++) {
            if(lst.get(i).isGender())
                Gender  = "Nam";
            else Gender="Nữ";
            System.out.println(lst.get(i).getID()+"\t"+lst.get(i).getName()+"\t"+Gender+"\t"+lst.get(i).getClassID()+"\t"+lst.get(i).getMark()+"\t"+lst.get(i).rank());
            
        }
    }
    public static void DelStudent(String ID){
    if (ps.delStudent_byID(ID)) {
                System.out.println("Xóa thành công");
            } else {
                System.out.println("Xóa không thành công");
            }
    }
    public static void InsertStudent(String ID, String Name, String ClassID, boolean Gender, double Mark){
    if (ps.insertStudent(ID, Name, ClassID, Gender, Mark)) {
             System.out.println("Thêm thành công");
            
        } else
             System.out.println("Thêm không thành công");
    
    
    }
    public  static void UpdateStudent(String ID, String Name, String ClassID, boolean Gender, double Mark){
     if(ps.updateStudent(ID, Name, ClassID, Gender, Mark)){
            System.out.println("Cập nhật thành công");
        
        }
        else{
            System.out.println("Cập nhật không thành công");
        }
    
    }
    
    public static void main(String[] args) {
        System.out.print("Input ClassID: ");
        String ClassID  = s.nextLine();
        displayStudent(ClassID);
        System.out.println("Delete Sudent:");
        System.out.print("Input ID: ");
        String ID  = s.nextLine();
        DelStudent(ID);    
        System.out.println("Insert Student:");
        System.out.print("Input ClassID: ");
        String ClassID1  = s.nextLine();
        System.out.print("Input ID: ");
        String ID1  = s.nextLine();
        boolean gender;
        System.out.print("Input Gender: ");
        String Gender  = s.nextLine();
        if("Nam".equals(Gender))
            gender = true;
        else
            gender = false;
        System.out.print("Input Name: ");
        String Name  = s.nextLine();
        System.out.print("Input Mark: ");
        double Mark  = s.nextDouble();
        InsertStudent(ID1, Name, ClassID1, gender, Mark);
        System.out.println("Update Student:");
        s.nextLine();
        System.out.print("Input ClassID: ");
        String ClassID2  = s.nextLine();
        System.out.print("Input ID: ");
        String ID2  = s.nextLine();
        boolean gender2;
        System.out.print("Input Gender: ");
        String Gender1  = s.nextLine();
        if("Nam".equals(Gender1))
            gender2 = true;
        else
            gender2 = false;
        System.out.print("Input Name: ");
        String Name1  = s.nextLine();
        System.out.print("Input Mark: ");
        double Mark1  = s.nextDouble();
        UpdateStudent(ID2, Name1, ClassID2, gender2, Mark1);
        
    }
}
