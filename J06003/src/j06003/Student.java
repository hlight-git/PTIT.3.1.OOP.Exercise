/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j06003;

/**
 *
 * @author ADMIN
 */
public class Student {
    private String id;
    private String name;
    private String phone;

    public Student(String id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + phone;
    }
    
    
}
