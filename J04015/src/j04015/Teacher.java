/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j04015;

/**
 *
 * @author ADMIN
 */
public class Teacher {
    private String ID;
    private String name;
    private long salaryBase;

    public Teacher(String ID, String name, long salaryBase) {
        this.ID = ID;
        this.name = name;
        this.salaryBase = salaryBase;
    }
    private long allowance(){
        if(ID.charAt(0) == 'G')
            return 500000;
        if(ID.charAt(1) == 'P')
            return 900000;
        return 2000000;
    }
    private long salary(){
        return salaryBase*Byte.parseByte(ID.substring(2)) + allowance();
    }
    @Override
    public String toString() {
        return ID + " " + name + " " + Byte.parseByte(ID.substring(2)) + " " + allowance() + " " + salary();
    }
    
    
}
