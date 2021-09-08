/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Dell
 */
package Exercise4;
// Result return "Đỗ" if Mark > 20
public class Student {
    String ID, Name;
    double Mark;

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

    public Student(String ID, String Name, double Mark) {
        this.ID = ID;
        this.Name = Name;
        this.Mark = Mark;
    }

    public Student() {}
    
    public String Result(){
        String r = "";
        if(Mark >= 20) {
            r = "Đỗ";
        } else {
            r = "Trượt";
        }
        return r;
    };
}
