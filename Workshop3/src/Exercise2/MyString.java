/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise2;

/**
 *
 * @author Dell
 */
public class MyString implements IString{
    
    
    @Override
    public String f1(String str, String s1, String s2) {
        return str.replace(s1, s2);
    }
    
    @Override
    public String f2(String str, String s) {
        String pr;
        if(str.contains(s))
            pr = str;
        else 
            pr = str+" "+s;
        return pr;
    }
}
