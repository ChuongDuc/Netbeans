/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Normie
 */
public class Process_Lecture {
    private static Connection cn;

    public static Connection getCon() {
        cn = null;//kiểm tra xem kết nối cơ sở dữ liệu chưa
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//nạp Driver
            cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/db_lecture", "root", "5574805a");//Chuỗi kết nối

        } catch (ClassNotFoundException | SQLException e) {
        }

        return cn;

    }
     public boolean updateLecture(String ID, String Name, boolean Gender, String Department,double Salary) {
        Connection cn = getCon();
        String sql = "Update tblecture " + "set Name= ?, Gender= ?, Department=?, Salary=? " + "where ID=?";
        System.out.print(sql);
        try {
            PreparedStatement ps = (PreparedStatement) cn.prepareStatement(sql);
            ps.setString(5, ID);
            ps.setString(1, Name);
            ps.setString(3, Department);
            ps.setBoolean(2, Gender);
             ps.setDouble(4, Salary);
            ps.executeUpdate();
            cn.close();
            return true;
        } catch (SQLException e) {
            return false;
        }

    }
    
    public static void main(String[] args) {
        System.out.println("Check con: " + getCon());
    }
}
