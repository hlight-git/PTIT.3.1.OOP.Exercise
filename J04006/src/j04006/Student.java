/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j04006;

/**
 *
 * @author ADMIN
 */
public class Student {
    private String name;
    private String grade;
    private String DOB;
    private float GPA;

    public Student(String name, String grade, String DOB, float GPA) {
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
    

    @Override
    public String toString() {
        return "B20DCCN001 " + name + " " + grade + " " + StandardizedDOB() + " " + String.format("%.2f", GPA);
    }
}
