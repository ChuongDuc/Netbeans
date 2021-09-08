/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Goi5;

/**
 *
 * @author Normie
 */
public class Teacher {
    String ID,name,gender,address;
    double grading;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

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

    public Teacher(String ID, String name, String gender, String address, double grading) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.grading = grading;
    }

    public Teacher() {
    }
    public double Salary(){
    double l = 1500000 * grading;
    return l;
    }
    
}
