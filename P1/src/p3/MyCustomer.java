/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;
import java.util.ArrayList;
/**
 *
 * @author Normie
 */
public class MyCustomer implements ICustomer {
    ArrayList<Customer> ca = new ArrayList<>();

    @Override
    public void addCustomer(Customer c) {
        ca.add(c);
    };

    @Override
    public int getMin() {
       int m = ca.get(0).Age();
       for (int i = 0; i < ca.size(); i++) {
           if(ca.get(i).Age()<m)
               m = ca.get(i).Age();
       }
       return  m ;
    };

    @Override
    public void printMin() {
        System.out.println("The list of Customer by Min Age");
        System.out.println("ID\tName\tGender\tYear\tAddress\tAge");
        for (int i = 0; i < ca.size(); i++) {
            if (ca.get(i).Age() == getMin()) {
                System.out.println(ca.get(i).Display());
            }
        }
    };

    @Override
    public void print() {
        System.out.println("The list of students: ");
        System.out.println("ID\tName\tGender\tYear\tAddress\tAge");
        for (int i = 0; i < ca.size(); i++) {
             System.out.println(ca.get(i).Display());
    }
}
}
