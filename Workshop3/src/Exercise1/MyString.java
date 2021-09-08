/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise1;

/**
 *
 * @author Dell
 */
public class MyString implements  IString {
    @Override
    public int f1(String st){
        int s = 0;
        // Do something here...
        for (int i = 0; i < st.length(); i++) {
            if(Character.isDigit(st.charAt(i))) {
               s = s + Integer.parseInt(st.charAt(i) + "");
            }
        }
        
        return s;
    };
    
    @Override
    public String f2(String st){
        String s = "";
        
        for (int i = 0; i < st.length(); i++) {
            if(Character.isDigit(st.charAt(i)) && Integer.parseInt(st.charAt(i) + "") < 9) {
                s = s + (Integer.parseInt(st.charAt(i) + "") + 1);
            } else {
                s = s + st.charAt(i);
            }
        }
        
        return s;
    };
}
