/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GKH;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Normie
 */
public class Test_findKH {

    /**
     * @param args the command line arguments
     */
    static XLKH ps = new  XLKH();
    static Scanner s = new Scanner(System.in);
    public static void dogetKH(String Diachi, boolean GT){
        System.out.println("Diachi\tSoTK\tGT\tHoten\tSodu");
        ArrayList<Khachhang> lkh = ps.getKH(Diachi, GT);
        String GiT;
        for (int i = 0; i < lkh.size(); i++) {
            if(lkh.get(i).isGT())
                GiT  = "Nam";
            else GiT ="Nữ";
            System.out.println(lkh.get(i).getDiachi()+"\t");
      
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    
}
