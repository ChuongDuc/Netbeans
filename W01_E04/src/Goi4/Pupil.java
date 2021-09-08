/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Goi4;

/**
 *
 * @author Normie
 */
public class Pupil {
    String ID ,name,classID;
    double literature, math;

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

    public String getClassID() {
        return classID;
    }

    public void setClassID(String classID) {
        this.classID = classID;
    }

    public double getLiterature() {
        return literature;
    }

    public void setLiterature(double literature) {
        this.literature = literature;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public Pupil(String ID, String name, String classID, double literature, double math) {
        this.ID = ID;
        this.name = name;
        this.classID = classID;
        this.literature = literature;
        this.math = math;
    }

    public Pupil() {
    }
    public double Result(){
        return (literature+math)/2;
    }
    
}
