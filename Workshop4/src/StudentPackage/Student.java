/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentPackage;

/**
 *
 * @author Normie
 */
public class Student {
    String ClassID,ID,Name;
    double Mark;
    boolean Gender;

    public String getClassID() {
        return ClassID;
    }

    public void setClassID(String ClassID) {
        this.ClassID = ClassID;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getMark() {
        return Mark;
    }

    public void setMark(double Mark) {
        this.Mark = Mark;
    }

    public boolean isGender() {
        return Gender;
    }

    public void setGender(boolean Gender) {
        this.Gender = Gender;
    }

    public Student(String ClassID, String ID, String Name, double Mark, boolean Gender) {
        this.ClassID = ClassID;
        this.ID = ID;
        this.Name = Name;
        this.Mark = Mark;
        this.Gender = Gender;
    }

    public Student() {
    }
    public String rank(){
        if(Mark >=9)
            return "Xuất sắc";
        else if(Mark <9 && Mark >= 8)
            return "Giỏi";
        else if(Mark <8 && Mark >= 7)
            return "Khá";
        else if(Mark <7 && Mark >= 5)
            return "Trung bình";
        else 
            return "Kém";
    }
    
}
