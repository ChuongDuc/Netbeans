/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student_Console;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Normie
 */
public class Process_Student implements IStudent {
    
    
    @Override
    public  Connection getCon() {
         Connection cn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/db_student", "root", "5574805a");

        } catch (ClassNotFoundException | SQLException e) {
        }

        return cn;
    }
    @Override
    public ArrayList<Student> getListStudent() {
        ArrayList<Student> ls = new ArrayList<>();
        Connection con = getCon();
        String sql = "Select * from tbsudent";
        try {
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Student st = new Student() {};
                st.setID(rs.getString("ID"));
                st.setName(rs.getString("Name"));
                st.setClassID(rs.getString("ClassID"));
                st.setGender(rs.getBoolean("Gender"));
                st.setMark(rs.getDouble("Mark"));
                ls.add(st);

            }
        } catch (SQLException e) {
        }

        return ls;
    }
    @Override
    public boolean insertStudent(String ID, String Name, String ClassID, boolean Gender, double Mark) {
        Connection cnt = getCon();
        String sql = "Insert into tbsudent(ID, Name, ClassID,Gender,   Mark)" + "values(?,?,?,?,?)";
        try {
            PreparedStatement ps = (PreparedStatement) cnt.prepareStatement(sql);
            ps.setString(1, ID);
            ps.setString(2, Name);
            ps.setString(3, ClassID);
            ps.setBoolean(4, Gender);
            ps.setDouble(5, Mark);
            ps.executeUpdate();
            cnt.close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
    @Override
        public boolean updateStudent(String ID, String Name, String ClassID, boolean Gender, double Mark) {
        Connection cn = getCon();
        String sql = "Update tbsudent " + "set Name= ?, Gender= ?, ClassID=?, Mark=? " + "where ID=?";
        System.out.print(sql);
        try {
            PreparedStatement ps = (PreparedStatement) cn.prepareStatement(sql);
            ps.setString(5, ID);
            ps.setString(1, Name);
            ps.setString(3, ClassID);
            ps.setBoolean(2, Gender);
            ps.setDouble(4, Mark);
            ps.executeUpdate();
            cn.close();
            return true;
        } catch (SQLException e) {
            return false;
        }

    }
        @Override
        public ArrayList<Student> getStudent_byClass(String ClassID) {
        ArrayList<Student> ls = new ArrayList<>();
        Connection con = getCon();
        String sql = "Select * from tbsudent where ClassID=?";
        try {
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, ClassID);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Student st = new Student() {};
                st.setID(rs.getString("ID"));
                st.setName(rs.getString("Name"));
                st.setClassID(rs.getString("ClassID"));
                st.setGender(rs.getBoolean("Gender"));
                st.setMark(rs.getDouble("Mark"));
                ls.add(st);

            }
        } catch (SQLException e) {
        }

        return ls;
    }
        @Override
        public boolean delStudent_byID(String ID) {
        Connection con = getCon();
        String sql = "delete from tbsudent where ID= ?";
        try {
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, ID);
            ps.executeUpdate();
            con.close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

}
