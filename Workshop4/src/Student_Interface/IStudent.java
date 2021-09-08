/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student_Interface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Normie
 */
public interface IStudent {
    
    public  Connection getCon() ;
    public boolean delStudent(String ClassID, double Mark); 
    public Student  getStudent_byID(String ID);
}
