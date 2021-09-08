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
public abstract class Person {
    String name, ID , gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Person() {
    }

    public Person(String name, String ID, String gender) {
        this.name = name;
        this.ID = ID;
        this.gender = gender;
    }
    public abstract double Salary();
    
}
