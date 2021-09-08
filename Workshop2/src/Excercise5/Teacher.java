/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excercise5;

/**
 *
 * @author Normie
 */
public class Teacher extends Person {
    String address;
    double grading;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getGrading() {
        return grading;
    }

    public void setGrading(double grading) {
        this.grading = grading;
    }

    public Teacher(String address, double grading, String name, String ID, String gender) {
        super(name, ID, gender);
        this.address = address;
        this.grading = grading;
    }

    public Teacher() {
    }
    
    @Override
    public double Salary(){
     return 1500000*grading;
    }
}
