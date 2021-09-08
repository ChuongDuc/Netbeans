package StudentPackage;

//import java.sql.Connection;
import java.util.ArrayList;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.*;

/**
 *
 * @author Normie
 */
public class Process_Student {

    private static Connection cn;

    public static Connection getCon() {
        cn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//Nạp Driver
            cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/db_student", "root", "5574805a");

        } catch (ClassNotFoundException | SQLException e) {
        }

        return cn;

    }

    public ArrayList<Student> getStudent_byClass(String ClassID) {
        ArrayList<Student> ls = new ArrayList<>();
        Connection con = getCon();
        String sql = "Select * from tbsudent where ClassID=?";
        try {
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);//tạo truy vấn
            ps.setString(1, ClassID);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Student st = new Student();
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
    public ArrayList<Student> getStudent_byClassGender(String ClassID,boolean Gender) {
        ArrayList<Student> ls = new ArrayList<>();
        Connection con = getCon();
        String sql = "Select * from tbsudent where ClassID=? and Gender=?";
        try {
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, ClassID);
            ps.setBoolean(2, Gender);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Student st = new Student();
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
     public ArrayList<Student> getStudent_byID(String ID) {
        ArrayList<Student> ls = new ArrayList<>();
        Connection con = getCon();
        String sql = "SELECT * FROM tbsudent WHERE ID =?";
        try {
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, ID);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Student st = new Student();
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

    public ArrayList<Student> getListStudent() {
        ArrayList<Student> ls = new ArrayList<>();
        Connection con = getCon();
        String sql = "Select * from tbsudent";
        try {
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Student st = new Student();
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


    public static void main(String[] args) {
        System.out.println("Check con: " + getCon());
    }

    //thêm sinh viên
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

}
