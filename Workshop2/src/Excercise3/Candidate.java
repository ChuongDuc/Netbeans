/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excercise3;

/**
 *
 * @author Normie
 */
public class Candidate  extends Person {
    String classID;
    double mark;

    public String getClassID() {
        return classID;
    }

    public void setClassID(String classID) {
        this.classID = classID;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public Candidate(String classID, double mark, String name, String ID, String gender) {
        super(name, ID, gender);
        this.classID = classID;
        this.mark = mark;
    }

    public Candidate() {
    }

    @Override
        public  String Result(){
    
        String r="";
        if (mark > 8.5) r = "Pass";
        else r = "Slip";
        return r;
    }
    
    
}
