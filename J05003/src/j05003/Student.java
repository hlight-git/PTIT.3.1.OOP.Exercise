/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j05003;

/**
 *
 * @author ADMIN
 */
public class Student {
    private Byte ID;
    private String name;
    private String grade;
    private String DOB;
    private float GPA;

    public Student(byte ID, String name, String grade, String DOB, float GPA) {
        this.ID = ID;
        this.name = name;
        this.grade = grade;
        this.DOB = DOB;
        this.GPA = GPA;
    }
    
    public String StandardizedDOB(){
        String[] res = DOB.split("/");
        for(byte i=0; i<2; i++){
            if (res[i].length() == 1)
                res[i] = "0" + res[i];
        }
        return res[0] + "/" + res[1] + "/" + res[2];
    }
    public String StandardizedID(){
        if(ID < 10) return "B20DCCN00" + ID;
        if(ID < 100)    return "B20DCCN0" + ID;
        return "B20DCCN" + ID;
    }

    @Override
    public String toString() {
        return StandardizedID() + " " + name + " " + grade + " " + StandardizedDOB() + " " + String.format("%.2f", GPA);
    }
}
