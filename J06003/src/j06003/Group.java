/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j06003;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class Group {
    private String topic;
    private List<Student> members;

    public Group() {
        members = new ArrayList<>();
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
    
    public void add(Student s){
        members.add(s);
    }
    
    public void display(){
        for(Student stu:members){
            System.out.println(stu);
        }
        System.out.println("Bai tap dang ky: " + topic);
    }
}
