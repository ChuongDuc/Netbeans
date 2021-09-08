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
public abstract class Person {
    String ID, Name, Gender;

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

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public Person(String ID, String Name, String Gender) {
        this.ID = ID;
        this.Name = Name;
        this.Gender = Gender;
    }

    public Person() {
    }
    public abstract String Result();
}
