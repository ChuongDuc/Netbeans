/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student_Interface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Normie
 */
public class Process_Student implements IStudent {
    private  Connection cn;
    @Override
    public  Connection getCon() {
        cn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn =  DriverManager.getConnection("jdbc:mysql://localhost/db_student", "root", "5574805a");

        } catch (ClassNotFoundException | SQLException e) {
        }

        return cn;

    }

    @Override
    public boolean delStudent(String ClassID, double Mark) {
        Connection con = getCon();
        String sql = "delete from tbsudent where ClassID=? and Mark=?";
        try {
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, ClassID);
            ps.setDouble(2, Mark);
            ps.executeUpdate();
            con.close();
            return true;
        } catch (SQLException e) {
            return false;
        }
      }
    @Override
    public Student getStudent_byID(String ID){
    Connection con = getCon();
    Student st = new Student();
    String sql = "SELECT * FROM tbsudent WHERE ID =?";
        try {
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, ID);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
               
                st.setID(rs.getString("ID"));
                st.setName(rs.getString("Name"));
                st.setClassID(rs.getString("ClassID"));
                st.setGender(rs.getBoolean("Gender"));
                st.setMark(rs.getDouble("Mark"));
                

            }
        } catch (SQLException e) {
        }

        return st;
    
    }
    public static void main(String[] args) {
        Process_Student ps  = new Process_Student();
        System.out.println("Check con: " + ps.getCon());
    }
}
