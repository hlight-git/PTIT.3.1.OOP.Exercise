/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j03004;

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
        String standardizedString = new String();
        for(String s:tmp){
            if(s.length() > 0){
                standardizedString += s.toUpperCase().charAt(0) + s.substring(1) + " ";
            }
        }
        return standardizedString.substring(0, standardizedString.length()-1);
    }
}
