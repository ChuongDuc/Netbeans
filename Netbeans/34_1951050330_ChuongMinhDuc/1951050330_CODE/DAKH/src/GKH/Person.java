/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GKH;

/**
 *
 * @author Normie
 */
public abstract class Person {
    int SoTK;
    String Hoten;
    boolean GT;

    public int getSoTK() {
        return SoTK;
    }

    public void setSoTK(int SoTK) {
        this.SoTK = SoTK;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public boolean isGT() {
        return GT;
    }

    public void setGT(boolean GT) {
        this.GT = GT;
    }

    public Person() {
    }

    public Person(int SoTK, String Hoten, boolean GT) {
        this.SoTK = SoTK;
        this.Hoten = Hoten;
        this.GT = GT;
    }
    
    public  String  KhuyenMai(){
        if(GT == false)
            return "Khuyến mại";
        else
            return "";
    }
}
