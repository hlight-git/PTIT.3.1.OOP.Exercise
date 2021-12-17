/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice1;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author ADMIN
 */
public class StringHandle {
    private String string;

    public StringHandle(String string) {
        this.string = string;
    }
    
    public void init(Scanner sc){
        string = sc.nextLine();
    }
    public int numOfWord(){
        StringTokenizer st = new StringTokenizer(string);
        return st.countTokens();
    }
    public int numOfSentence(){
        StringTokenizer st = new StringTokenizer(string, ".!?;");
        return st.countTokens();
    }
}
