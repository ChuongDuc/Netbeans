/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

/**
 *
 * @author Normie
 */
public class Process_Pillow {
    private static Connection cn;

    public static Connection getCon() {
        cn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/db_student", "root", "12345678");

        } catch (ClassNotFoundException | SQLException e) {
        }

        return cn;

    }
    public boolean deletePillow(String Color, double Price){
      Connection con = getCon();
        String sql = "delete from tbsudent where Color=? and Price=?";
        try {
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, Color);
            ps.setDouble(2, Price);
            ps.executeUpdate();
            con.close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    
    }
    public static void main(String[] args) {
        System.out.println("Check con: " + getCon());
    }
}
