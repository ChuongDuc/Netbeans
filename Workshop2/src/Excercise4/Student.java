/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excercise4;

/**
 *
 * @author Normie
 */
public class Student extends Person {
      String ClassID;
      double Mark;

    public String getClassID() {
        return ClassID;
    }

    public void setClassID(String ClassID) {
        this.ClassID = ClassID;
    }

    public double getMark() {
        return Mark;
    }

    public void setMark(double Mark) {
        this.Mark = Mark;
    }

    public Student(String ClassID, double Mark, String ID, String Name, String Gender) {
        super(ID, Name, Gender);
        this.ClassID = ClassID;
        this.Mark = Mark;
    }

    public Student(String ClassID, double Mark) {
        this.ClassID = ClassID;
        this.Mark = Mark;
    }

    

    public Student() {
    }
    
    @Override
    public  String Result(){
    
        String r;
        if (Mark > 5) r = "Pass";
        else r = "Slip";
        return r;
    
    }
      public String Display()
    {
        return ID +"\t"+ Name +"\t"+ Gender + "\t"+ ClassID+"\t"+ Mark + "\t"+ Result();
    }
    
    
    
}
