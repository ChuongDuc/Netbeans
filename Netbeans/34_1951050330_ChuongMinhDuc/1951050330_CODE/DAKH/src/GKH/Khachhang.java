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
public class Khachhang extends Person {
    int Sodu;
    String Diachi;

    public int getSodu() {
        return Sodu;
    }

    public void setSodu(int Sodu) {
        this.Sodu = Sodu;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }


    public Khachhang(int Sodu, String Diachi, int SoTK, String Hoten, boolean GT) {
        super(SoTK, Hoten, GT);
        this.Sodu = Sodu;
        this.Diachi = Diachi;
    }

    public Khachhang() {
    }
    @Override
    public  String  KhuyenMai(){
        if(GT == false)
            return "Khuyến mại";
        else
            return "";
    }
 
}
