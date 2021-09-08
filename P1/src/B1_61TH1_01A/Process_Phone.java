/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B1_61TH1_01A;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Normie
 */
public class Process_Phone {

    static Connection cn;

    public static Connection getCon() {
        cn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/db_phone", "root", "5574805a");
        } catch (ClassNotFoundException | SQLException e) {
        }
        return cn;

    }

    public boolean insertPhone(String ID, String Name, String Company, double Price, double Amount) {
        Connection cnt = getCon();
        String sql = "Insert into tb_phone(ID, Name, Company , Price,  Amount)" + "values(?,?,?,?,?)";
        try {
            PreparedStatement ps = (PreparedStatement) cnt.prepareStatement(sql);
            ps.setString(1, ID);
            ps.setString(2, Name);
            ps.setString(3, Company);
            ps.setDouble(4, Price);
            ps.setDouble(5, Amount);
            ps.executeUpdate();
            cnt.close();
            return true;
        } catch (SQLException e) {
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println("Check con " + getCon());
    }

}
