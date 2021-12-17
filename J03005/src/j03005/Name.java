/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j03005;

/**
 *
 * @author ADMIN
 */
public class Name {
    private String name;
    
    public Name(String name){
        this.name = name;
    }
    public String standardize(){
        String[] tmp = name.toLowerCase().split(" ");
        String head = new String();
        String tail = new String();
        for(String s:tmp){
            if(s.length() > 0){
                if(tail.length() > 0){
                    head += s.toUpperCase().charAt(0) + s.substring(1) + " ";
                }
                else{
                    tail = s.toUpperCase();
                }
            }
        }
        return head.substring(0, head.length()-1)+ ", " + tail;
    }
}
