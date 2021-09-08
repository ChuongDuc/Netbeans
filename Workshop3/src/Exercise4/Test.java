package Exercise4;

import java.util.ArrayList;
import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        MyStudent mst = new MyStudent();
        System.out.print("Add how many students: ");
        int n = s.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.print("Input ID: ");
            s.nextLine();
            String id = s.nextLine();

            System.out.print("Input Name: ");
            String name = s.nextLine();

            System.out.print("Input Mark: ");
            double mark = s.nextDouble();
            
            Student st = new Student(id, name, mark);
            
            mst.plist.add(st);
        }
        mst.print();
        
        System.out.println("Type an ID to search: ");
        String ID = s.nextLine();
        mst.findbyID(ID);
        
    }
}
