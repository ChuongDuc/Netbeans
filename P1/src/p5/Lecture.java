/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p5;

/**
 *
 * @author Normie
 */
public class Lecture extends Person{
    String Department;
    double Salary;

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public Lecture(String Department, double Salary, String ID, String Name, String Gender) {
        super(ID, Name, Gender);
        this.Department = Department;
        this.Salary = Salary;
    }

    public Lecture() {
    }

}
