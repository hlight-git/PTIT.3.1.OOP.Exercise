/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j03010;

import java.util.HashMap;

/**
 *
 * @author ADMIN
 */
public class Person {
    private String badName;
    private String emailName;
    Person(String someBadName, HashMap <String, Integer> emails){
        badName = someBadName.toLowerCase();
        emailName = new String();
        //Standardize:
        String[] name = badName.split(" ");
        String tmp = new String();
        for(int i=name.length-1; i>=0; i--){
            if(name[i].length() > 0){
                if(emailName.isEmpty()){
                    emailName = name[i];
                }
                else{
                    tmp = name[i].charAt(0) + tmp;
                }
            }
        }
        emailName += tmp;
        if(emails.containsKey(emailName)){
            emails.put(emailName, emails.get(emailName) + 1);
            emailName += emails.get(emailName).toString();
        }
        else{
            emails.put(emailName, 1);
        }
    }

    public String getEmailName() {
        return emailName;
    }
    
}
