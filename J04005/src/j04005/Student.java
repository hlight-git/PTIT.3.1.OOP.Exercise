/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j04005;

/**
 *
 * @author ADMIN
 */
public class Student {
    private String name;
    private String DOB;
    private float grade1, grade2, grade3;
    
    Student(String name, String DOB, float grade1, float grade2, float grade3){
        this.name = name;
        this.DOB = DOB;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    @Override
    public String toString() {
        return name + " " + DOB + " " + String.format("%.1f", grade1 + grade2 + grade3);
    }
    
    
}
