/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise3;

//import java.util.Collections;
import java.util.*;

/**
 *
 * @author Dell
 */
public class MyFan implements IFan {
    @Override
    public void f1(List<Fan> t, String xCode) {
        for (int i = 0; i < t.size(); i++) {
            if(t.get(i).code.startsWith(xCode)) {
                System.out.println(t.get(i).getCode()+ "\t" + (t.get(i).getPrice())*1.1);
            }
            else
                System.out.println(t.get(i).getCode()+ "\t" + t.get(i).getPrice());
        }
    };
    
    @Override
    public void f2(List<Fan> t, double xPrice) {
        int count = 0;
        for (int i = 0; i < t.size(); i++) {
            if(t.get(i).price <= xPrice) {
                count++;
            }
        }
        System.out.println(count);
    };
    
    @Override
    public void f3(List<Fan> t) {
         for (int i = 0; i < t.size(); i++) {
            Collections.sort(t, (a, b) -> a.getCode().compareTo(b.getCode()));
            if (t.get(i).getPrice() == t.get(i).getPrice()) {
                t.sort(((o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice())));
            }
        }
        for (int i = 0; i < t.size(); i++) {
            System.out.println(t.get(i).getCode() + "\t" + t.get(i).getPrice());
        }
    };
}
