/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GKH;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Normie
 */
public class XLKH {

     Connection cn;

    public static Connection getCon() {
        Connection  cn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/dlkh", "root", "5574805a");
        } catch (ClassNotFoundException | SQLException e) {
        }
        return cn;
    }

    public ArrayList<Khachhang> getKH(String Diachi, boolean GT) {
        ArrayList<Khachhang> akh = new ArrayList<>();
        Connection con = getCon();
        String sql = "Select * from tbkhachhang where Diachi = ? and GT = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "Diachi");
            ps.setBoolean(2, true);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Khachhang kh = new Khachhang();
                kh.setDiachi(rs.getString("Diachi"));
                kh.setSoTK(rs.getInt("SoTK"));
                kh.setGT(rs.getBoolean("GT"));
                kh.setHoten(rs.getString("Hoten"));
                kh.setSodu(rs.getInt("Sodu"));
                akh.add(kh);

            }

        } catch (SQLException e) {
        }
        return akh;
    }
   public static void main(String[] args) {
        System.out.println("Check con: " + getCon());
      
   }
}
