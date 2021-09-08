/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student_Console;

import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author Normie
 */
public interface IStudent {
    public Connection getCon();
    public boolean updateStudent(String ID, String Name, String ClassID, boolean Gender, double Mark);
    public ArrayList<Student> getListStudent();
    public boolean insertStudent(String ID, String Name, String ClassID, boolean Gender, double Mark);
    public ArrayList<Student> getStudent_byClass(String ClassID);
    public boolean delStudent_byID(String ID);
}
